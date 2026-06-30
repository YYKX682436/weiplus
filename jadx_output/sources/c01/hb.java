package c01;

/* loaded from: classes11.dex */
public class hb {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f37237a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.e8 f37238b;

    public hb(l75.k0 k0Var, com.tencent.mm.storage.e8 e8Var) {
        this.f37237a = k0Var;
        this.f37238b = e8Var;
    }

    public android.database.Cursor a(java.lang.String str, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        com.tencent.mm.storage.e8 e8Var = this.f37238b;
        sb6.append(((com.tencent.mm.storage.k4) e8Var).I("@all.contact.android", "", list));
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(" and (username in (select chatroomname from chatroom where ");
        if (arrayList2 != null && arrayList2.size() != 0) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                stringBuffer.append("chatroomname != '" + ((java.lang.String) it.next()) + "' and ");
            }
        }
        stringBuffer.append("(memberlist like '%" + str + "%'");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            stringBuffer.append(" or memberlist like '%" + ((java.lang.String) it6.next()) + "%'");
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            java.util.Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                stringBuffer.append(" or chatroomname = '" + ((java.lang.String) it7.next()) + "'");
            }
        }
        stringBuffer.append(")))");
        sb6.append(stringBuffer.toString());
        e8Var.getClass();
        sb6.append(" order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        return this.f37237a.B(sb6.toString(), null);
    }

    public android.database.Cursor b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, boolean z17, boolean z18, boolean z19) {
        return c(str, str2, str3, list, z17, z18, z19, 1, null);
    }

    public final android.database.Cursor c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, boolean z17, boolean z18, boolean z19, int i17, java.util.List list2) {
        java.lang.String str4 = i17 == 2 ? "select 2, *,rowid from rcontact " : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str4);
        com.tencent.mm.storage.e8 e8Var = this.f37238b;
        sb6.append(((com.tencent.mm.storage.k4) e8Var).I(str2, str3, list));
        sb6.append(((com.tencent.mm.storage.k4) e8Var).T(str));
        e8Var.getClass();
        sb6.append(" order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        java.lang.String sb7 = sb6.toString();
        l75.k0 k0Var = this.f37237a;
        android.database.Cursor B = k0Var.B(sb7, null);
        if (z17) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str4);
            sb8.append(((com.tencent.mm.storage.k4) e8Var).F(list, z18));
            sb8.append(((com.tencent.mm.storage.k4) e8Var).T(str));
            ((com.tencent.mm.storage.k4) e8Var).getClass();
            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
            sb8.append(" order by case when verifyFlag & 8 != 0 then 0 else 1 end , showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
            B = new android.database.MergeCursor(new android.database.Cursor[]{B, k0Var.B(sb8.toString(), null)});
        }
        android.database.Cursor cursor = B;
        if (!z19) {
            return cursor;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (cursor.moveToNext()) {
            java.lang.String string = cursor.getString(cursor.getColumnIndex(dm.i4.COL_USERNAME));
            if (com.tencent.mm.storage.z3.R4(string)) {
                arrayList2.add(string);
            } else {
                arrayList.add(string);
            }
        }
        if (list2 != null && list2.size() != 0) {
            arrayList.addAll(list2);
        }
        return arrayList.size() != 0 ? new android.database.MergeCursor(new android.database.Cursor[]{cursor, a(str, arrayList, arrayList2, null, list)}) : cursor;
    }
}

package c01;

/* loaded from: classes11.dex */
public class ib {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f37260a;

    public ib(l75.k0 k0Var, com.tencent.mm.storage.l8 l8Var) {
        this.f37260a = k0Var;
    }

    public android.database.Cursor a(java.lang.String str, java.util.List list, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = (str2 == null || str2.length() <= 0) ? " " : " and rconversation.username = rcontact.username ";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select 1,unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rcontact.nickname from rconversation,rcontact  where rconversation.username = rcontact.username");
        sb6.append(str4);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str5 = "";
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        if (list == null || list.size() <= 0) {
            str3 = "";
        } else {
            java.util.Iterator it = list.iterator();
            str3 = "";
            while (it.hasNext()) {
                str3 = str3 + " and rconversation.username != '" + ((java.lang.String) it.next()) + "'";
            }
        }
        java.lang.String str6 = sb7 + str3;
        l75.k0 k0Var = this.f37260a;
        if (str2 != null && str2.length() > 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str6);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l75.e0 e0Var = com.tencent.mm.contact.s.G2;
            android.database.Cursor f17 = k0Var.f("select username from rcontact where (username like '%" + str2 + "%' or nickname like '%" + str2 + "%' or alias like '%" + str2 + "%' or pyInitial like '%" + str2 + "%' or quanPin like '%" + str2 + "%' or conRemark like '%" + str2 + "%' )and username not like '%@%' and type & 32=0 ", null, 2);
            while (f17.moveToNext()) {
                java.lang.String string = f17.getString(f17.getColumnIndex(dm.i4.COL_USERNAME));
                if (!string.endsWith("@chatroom")) {
                    arrayList.add(string);
                }
            }
            f17.close();
            if (arrayList.size() != 0) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(" ( rconversation.username in ( select chatroomname from chatroom where ");
                stringBuffer.append("memberlist like '%" + str2 + "%'");
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    stringBuffer.append(" or memberlist like '%" + ((java.lang.String) it6.next()) + "%'");
                }
                stringBuffer.append("))");
                str5 = "" + stringBuffer.toString() + " or ";
            }
            sb8.append(" and ( rconversation.username like '%" + str2 + "%' or " + str5 + "rconversation.content like '%" + str2 + "%' or rcontact.nickname like '%" + str2 + "%' or rcontact.alias like '%" + str2 + "%' or rcontact.pyInitial like '%" + str2 + "%' or rcontact.quanPin like '%" + str2 + "%' or rcontact.conRemark like '%" + str2 + "%'  ) ");
            str6 = sb8.toString();
        }
        return k0Var.B(((str6 + " order by ") + "rconversation.username like '%@chatroom' asc, ") + "flag desc, conversationTime desc", null);
    }
}

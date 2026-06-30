package b82;

/* loaded from: classes4.dex */
public class e extends l75.n0 implements o72.v4 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f99846d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99847e;

    static {
        l75.n0.m145250x3fdc6f77(o72.a3.f424842x, "FavSearchInfo");
    }

    public e(l75.k0 k0Var) {
        super(k0Var, o72.a3.f424842x, "FavSearchInfo", null);
        this.f99846d = k0Var;
    }

    @Override // o72.v4
    public dm.p3 F(long j17) {
        o72.a3 a3Var = null;
        android.database.Cursor f17 = this.f99846d.f("select * from FavSearchInfo where localId = " + j17, null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            a3Var = new o72.a3();
            a3Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return a3Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x024d. Please report as an issue. */
    @Override // o72.v4
    public java.util.List I7(java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.lang.String str;
        if (o25.x.b(list3)) {
            arrayList = ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Ai();
            if (arrayList.size() == 0) {
                return new java.util.ArrayList();
            }
        } else {
            arrayList = null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.String str2 = " 1=1 ";
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                str2 = str2 + " and content like '%" + ((java.lang.String) it.next()) + "%'";
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            java.lang.String str3 = str2 + " and (";
            for (int i17 = 0; i17 < list2.size(); i17++) {
                java.lang.String str4 = (java.lang.String) list2.get(i17);
                str3 = i17 == 0 ? str3 + "tagContent like '%" + str4 + "%'" : str3 + " or tagContent like '%" + str4 + "%'";
            }
            str2 = str3 + ")";
        }
        java.lang.String str5 = "select localId from FavSearchInfo where " + str2;
        int i18 = 10;
        int i19 = 1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list3)) {
            arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = list3.iterator();
            while (it6.hasNext()) {
                switch (((java.lang.Integer) it6.next()).intValue()) {
                    case 1:
                        arrayList2.add(1);
                        break;
                    case 2:
                        arrayList2.add(2);
                        break;
                    case 3:
                        arrayList2.add(3);
                        break;
                    case 4:
                        arrayList2.add(4);
                        break;
                    case 5:
                        arrayList2.add(5);
                        if (!this.f99847e) {
                            arrayList2.add(34);
                        }
                        arrayList2.add(24);
                        break;
                    case 6:
                        arrayList2.add(6);
                        break;
                    case 7:
                        arrayList2.add(7);
                        arrayList2.add(21);
                        arrayList2.add(32);
                        arrayList2.add(33);
                        break;
                    case 8:
                        arrayList2.add(8);
                        break;
                    case 9:
                        arrayList2.add(9);
                        break;
                    case 10:
                        arrayList2.add(10);
                        break;
                    case 11:
                        arrayList2.add(11);
                        break;
                    case 12:
                        arrayList2.add(12);
                        break;
                    case 13:
                        arrayList2.add(13);
                        break;
                    case 14:
                        arrayList2.add(15);
                        break;
                    case 15:
                        arrayList2.add(16);
                        break;
                    case 16:
                        arrayList2.add(17);
                        break;
                    case 17:
                        arrayList2.add(14);
                        break;
                    case 18:
                        arrayList2.add(18);
                        break;
                    case 19:
                        arrayList2.add(19);
                        break;
                    case 20:
                        arrayList2.add(20);
                        break;
                    case 21:
                        arrayList2.add(2);
                        arrayList2.add(4);
                        arrayList2.add(16);
                        break;
                    case 23:
                        arrayList2.add(32);
                        arrayList2.add(33);
                        break;
                }
            }
        } else {
            arrayList2 = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list3)) {
            arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = list3.iterator();
            while (it7.hasNext()) {
                switch (((java.lang.Integer) it7.next()).intValue()) {
                    case 1:
                        arrayList3.add(java.lang.Integer.valueOf(i19));
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 2:
                        arrayList3.add(2);
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 3:
                        arrayList3.add(3);
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 4:
                        arrayList3.add(4);
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 5:
                        arrayList3.add(5);
                        if (!this.f99847e) {
                            arrayList3.add(22);
                        }
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 6:
                        arrayList3.add(6);
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 7:
                        arrayList3.add(7);
                        arrayList3.add(29);
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 8:
                        arrayList3.add(8);
                        arrayList3.add(10130);
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 9:
                        arrayList3.add(9);
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 10:
                        arrayList3.add(java.lang.Integer.valueOf(i18));
                        i18 = 10;
                        i19 = 1;
                        break;
                    case 11:
                        arrayList3.add(11);
                        i19 = 1;
                        break;
                    case 12:
                        arrayList3.add(12);
                        i19 = 1;
                        break;
                    case 13:
                        arrayList3.add(13);
                        i19 = 1;
                        break;
                    case 14:
                        arrayList3.add(14);
                        i19 = 1;
                        break;
                    case 15:
                        arrayList3.add(15);
                        i19 = 1;
                        break;
                    case 16:
                        arrayList3.add(16);
                        i19 = 1;
                        break;
                    case 17:
                        arrayList3.add(17);
                        i19 = 1;
                        break;
                    case 19:
                        arrayList3.add(19);
                        i19 = 1;
                        break;
                    case 20:
                        arrayList3.add(22);
                        i19 = 1;
                        break;
                    case 21:
                        arrayList3.add(2);
                        arrayList3.add(4);
                        i19 = 1;
                        break;
                }
            }
        } else {
            arrayList3 = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList3)) {
            java.lang.String str6 = str5 + " and (";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
                java.lang.String str7 = str6 + "type = " + arrayList2.get(0);
                for (int i27 = 1; i27 < arrayList2.size(); i27++) {
                    str7 = str7 + " or type = " + ((java.lang.Integer) arrayList2.get(i27)).intValue();
                }
                str6 = str7;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList3)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
                    str6 = str6 + " or ";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str6);
                sb6.append("subtype & ");
                int intValue = ((java.lang.Integer) arrayList3.get(0)).intValue();
                l75.e0 e0Var = o72.a3.f424842x;
                sb6.append(1 << intValue);
                sb6.append(" != 0");
                java.lang.String sb7 = sb6.toString();
                for (int i28 = 1; i28 < arrayList3.size(); i28++) {
                    sb7 = sb7 + " or subtype & " + (1 << ((java.lang.Integer) arrayList3.get(i28)).intValue()) + " != 0";
                }
                str6 = sb7;
            }
            str5 = str6 + ")";
        }
        if (arrayList == null || arrayList.size() <= 0) {
            str = str5 + " order by time desc";
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" and (");
            for (int i29 = 0; i29 < arrayList.size(); i29++) {
                if (i29 != arrayList.size() - 1) {
                    sb8.append("FavSearchInfo.localId = '");
                    sb8.append(arrayList.get(i29));
                    sb8.append("' OR ");
                } else {
                    sb8.append("FavSearchInfo.localId = '");
                    sb8.append(arrayList.get(i29));
                    sb8.append("' ");
                }
            }
            sb8.append(")order by case FavSearchInfo.localId ");
            for (int i37 = 0; i37 < arrayList.size(); i37++) {
                sb8.append(" when '");
                sb8.append(arrayList.get(i37));
                sb8.append("' then ");
                sb8.append(i37);
            }
            sb8.append(" end");
            str = str5 + sb8.toString();
        }
        android.database.Cursor f17 = this.f99846d.f(str, null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                arrayList4.add(java.lang.Long.valueOf(f17.getLong(0)));
            }
            f17.close();
        }
        return arrayList4;
    }

    @Override // o72.v4
    public boolean J5(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        android.database.Cursor f17 = this.f99846d.f("select count(localId) from FavSearchInfo where tagContent like '%" + str + "%'", null, 2);
        int i17 = (f17 == null || !f17.moveToFirst()) ? 0 : f17.getInt(0);
        if (f17 != null) {
            f17.close();
        }
        return i17 > 0;
    }

    @Override // o72.v4
    public /* bridge */ /* synthetic */ boolean Md(dm.p3 p3Var) {
        return super.mo880xb970c2b9(p3Var);
    }

    @Override // o72.v4
    public java.util.List V7() {
        android.database.Cursor E = this.f99846d.E("FavSearchInfo", new java.lang.String[]{dm.i4.f66867x2a5c95c7}, "tagContent!=?", new java.lang.String[]{""}, null, null, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (E.moveToNext()) {
            arrayList.add(java.lang.Long.valueOf(E.getLong(0)));
        }
        E.close();
        return arrayList;
    }

    @Override // o72.v4
    public void m3(long j17) {
        this.f99846d.A("FavSearchInfo", "delete from FavSearchInfo where localId = " + j17);
    }

    @Override // o72.v4
    public /* bridge */ /* synthetic */ boolean q7(dm.p3 p3Var, java.lang.String[] strArr) {
        return super.mo9952xce0038c9(p3Var, strArr);
    }
}

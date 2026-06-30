package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g8 f166161a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g8();

    public final boolean a(java.lang.String appId, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l.class);
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i();
        iVar.f66577x28d45f97 = appId;
        iVar.f66578x119cf7dc = i18;
        if (!lVar.get(iVar, new java.lang.String[0])) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k.f157151e;
            iVar.f66579x1dbcfc4b = -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j jVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k.f157151e;
        int i19 = iVar.f66579x1dbcfc4b;
        jVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k[] m49357xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k.m49357xcee59d22();
        int length = m49357xcee59d22.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length) {
                kVar = null;
                break;
            }
            kVar = m49357xcee59d22[i27];
            if (kVar.f157154d == i19) {
                break;
            }
            i27++;
        }
        if (kVar == null) {
            kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k.f157152f;
        }
        int ordinal = kVar.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final java.util.Map b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553, java.lang.String appId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11829x68027553, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.List list = c11829x68027553.f158985o;
        boolean z18 = true;
        boolean z19 = list == null || list.isEmpty();
        int[] iArr = qq5.a.f447527a;
        if (!z19) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap(c11829x68027553.f158985o.size());
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f : c11829x68027553.f158985o) {
                if (z17) {
                    java.util.List list2 = c11830xcf46aa1f.f159004n;
                    if (!(list2 == null || list2.isEmpty())) {
                        java.util.List wxaWidgetInfoList = c11830xcf46aa1f.f159004n;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxaWidgetInfoList, "wxaWidgetInfoList");
                        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc5 : kz5.n0.F0(wxaWidgetInfoList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f8())) {
                            if (kz5.z.F(iArr, c11831x52cc1bc5.f159007d)) {
                                break;
                            }
                        }
                        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    java.util.List list3 = c11830xcf46aa1f.f159002i;
                    if (list3 == null || list3.isEmpty()) {
                        c11831x52cc1bc5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5();
                        c11831x52cc1bc5.f159007d = 4;
                        c11831x52cc1bc5.f159008e = c11830xcf46aa1f.f158998e;
                    } else {
                        c11831x52cc1bc5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5();
                        c11831x52cc1bc5.f159008e = c11830xcf46aa1f.f159003m;
                        c11831x52cc1bc5.f159007d = 13;
                        c11831x52cc1bc5.f159010g = new java.util.LinkedList(c11830xcf46aa1f.f159002i);
                    }
                } else {
                    c11831x52cc1bc5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5();
                    c11831x52cc1bc5.f159007d = 4;
                    c11831x52cc1bc5.f159008e = c11830xcf46aa1f.f158998e;
                }
                arrayMap.put(c11830xcf46aa1f.f158997d, c11831x52cc1bc5);
            }
            return arrayMap;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc52 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5();
            c11831x52cc1bc52.f159007d = 0;
            c11831x52cc1bc52.f159008e = c11829x68027553.f158980g;
            android.util.ArrayMap arrayMap2 = new android.util.ArrayMap();
            arrayMap2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, c11831x52cc1bc52);
            return arrayMap2;
        }
        java.util.List list4 = c11829x68027553.f158990t;
        if (list4 == null || list4.isEmpty()) {
            java.util.List list5 = c11829x68027553.f158983m;
            if (list5 != null && !list5.isEmpty()) {
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc53 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5();
                c11831x52cc1bc53.f159007d = 0;
                c11831x52cc1bc53.f159008e = c11829x68027553.f158980g;
                android.util.ArrayMap arrayMap3 = new android.util.ArrayMap();
                arrayMap3.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, c11831x52cc1bc53);
                return arrayMap3;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc54 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5();
            c11831x52cc1bc54.f159008e = c11829x68027553.f158989s;
            c11831x52cc1bc54.f159007d = 12;
            c11831x52cc1bc54.f159010g = new java.util.LinkedList(c11829x68027553.f158983m);
            android.util.ArrayMap arrayMap4 = new android.util.ArrayMap();
            arrayMap4.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, c11831x52cc1bc54);
            return arrayMap4;
        }
        java.util.List widgetInfoList = c11829x68027553.f158990t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(widgetInfoList, "widgetInfoList");
        for (java.lang.Object obj : kz5.n0.F0(widgetInfoList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.e8())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc55 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5) obj;
            if (kz5.z.F(iArr, c11831x52cc1bc55.f159007d)) {
                java.util.List list6 = c11831x52cc1bc55.f159010g;
                if (list6 != null && !list6.isEmpty()) {
                    z18 = false;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils", "WxaVersionInfo.pickAppropriateWidgetInfoList appId(" + appId + ") module(FALSE) split_plugin(TRUE) widgetInfo.wxaPluginCodeInfo isNullOrEmpty");
                    c11831x52cc1bc55.f159010g = c11829x68027553.f158983m;
                }
                android.util.ArrayMap arrayMap5 = new android.util.ArrayMap();
                arrayMap5.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, obj);
                return arrayMap5;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

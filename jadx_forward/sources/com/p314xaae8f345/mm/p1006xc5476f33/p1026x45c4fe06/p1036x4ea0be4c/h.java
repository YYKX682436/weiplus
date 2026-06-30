package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static long f158369a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n f158370b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n();

    public static void a(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var) {
        if (map == null || map.isEmpty() || u1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataInternal, no starAppMap or no callback");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            r45.yc ycVar = new r45.yc();
            ycVar.f472488d = (java.lang.String) entry.getKey();
            ycVar.f472492h = (java.lang.String) entry.getValue();
            ycVar.f472489e = 1;
            if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t1.class) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11728x88582d32 c11728x88582d32 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t1.class)).get(ycVar.f472488d);
                if (c11728x88582d32 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11728x88582d32.f158329e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataInternal, app(%s) token is empty", ycVar.f472488d);
                } else {
                    ycVar.f472491g = c11728x88582d32.f158329e;
                }
            }
            linkedList.add(ycVar);
        }
        b(1, linkedList, null, u1Var);
    }

    public static void b(int i17, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var) {
        if (list == null || list.isEmpty() || u1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, requestList or callback is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, size:%d", java.lang.Integer.valueOf(list.size()));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.cd7 cd7Var = new r45.cd7();
        cd7Var.f453024d.addAll(list);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1733;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/fetchdata";
        lVar.f152197a = cd7Var;
        lVar.f152198b = new r45.dd7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.f(i17, o0Var, currentTimeMillis, u1Var, cd7Var));
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c6;
        if (c11809xbc286be4 != null && (c11825xb74ac8c6 = c11809xbc286be4.R) != null) {
            if (c11825xb74ac8c6.f158961z && c11825xb74ac8c6.A) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3 || !i81.j.a(c11809xbc286be4)) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPreFetchWithLocation, app(%s_v%d) is ad, can not pre fetch data with location");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPreFetchWithLocation, app(%s_v%d) can not pre fetch data with location", c11809xbc286be4.f128811x, java.lang.Integer.valueOf(c11809xbc286be4.f158814g));
        }
        return false;
    }

    public static nm5.b d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = null;
        } else {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf > 0) {
                java.lang.String substring = str.substring(0, lastIndexOf);
                r1 = lastIndexOf < str.length() + (-1) ? str.substring(lastIndexOf + 1) : null;
                str = substring;
            }
        }
        return nm5.j.c(str, r1);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, app(%s) pre fetch data start, path:%s, query:%s, scene:%d", str2, str3, str4, java.lang.Integer.valueOf(i17));
        r45.yc ycVar = new r45.yc();
        ycVar.f472492h = str;
        ycVar.f472488d = str2;
        ycVar.f472489e = 0;
        r45.lb5 lb5Var = new r45.lb5();
        ycVar.f472490f = lb5Var;
        lb5Var.set(2, java.lang.Integer.valueOf(i17));
        k91.v5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(str2, new java.lang.String[0]);
        java.lang.String str6 = (n17 == null || n17.w0() == null) ? "" : n17.w0().f158978e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "customVersionOfRun:%s, custom_version:%s", str5, str6);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            str5 = str6 == null ? "" : str6;
        }
        ycVar.f472490f.set(3, str5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "appid:%s, custom_version:%s", str, str5);
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t1.class) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11728x88582d32 c11728x88582d32 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t1.class)).get(str2);
            if (c11728x88582d32 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11728x88582d32.f158329e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, token is empty, appid:%s", str);
            } else {
                ycVar.f472491g = c11728x88582d32.f158329e;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            ycVar.f472490f.set(0, str3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            ycVar.f472490f.set(1, str4);
        }
        if (gVar != null) {
            o0Var.f158407j = 1;
            ycVar.f472490f.set(4, java.lang.Double.valueOf(gVar.f158367a));
            ycVar.f472490f.set(5, java.lang.Double.valueOf(gVar.f158368b));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, longitude:%f, latitude:%f", java.lang.Float.valueOf(gVar.f158367a), java.lang.Float.valueOf(gVar.f158368b));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ycVar);
        b(0, linkedList, o0Var, u1Var);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public abstract class v0 {
    public static void a(java.lang.String str, int i17, int i18, long j17, boolean z17) {
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            b17 = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        int d17 = d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13537, 1000, "", "", str, 0, 0, 0, "", b17, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Integer.valueOf(d17));
    }

    public static void b(java.lang.String str, int i17, int i18, java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = (com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) it.next();
            linkedList.add(u46.l.k(new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(i18 + 1), java.lang.String.valueOf(c4582x424c344.m40327x4182ad1()), java.lang.String.valueOf(c4582x424c344.m40329x79249bdb()), java.lang.String.valueOf(c4582x424c344.m40329x79249bdb())}, ","));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(14369, linkedList);
    }

    public static void c(int i17, java.lang.String str, int i18, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = 13533;
        objArr[1] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = java.lang.Integer.valueOf(i18);
        objArr[4] = str2;
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str3;
        objArr[7] = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, appid %s, appversion %d, appidlist %snearbyAppIdCount %s, nearbyAppIdList %s  sceneNote %s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[8];
        objArr2[0] = java.lang.Integer.valueOf(i17);
        objArr2[1] = str != null ? str : "";
        objArr2[2] = java.lang.Integer.valueOf(i18);
        objArr2[3] = str2;
        objArr2[4] = java.lang.Integer.valueOf(i19);
        objArr2[5] = str3;
        objArr2[6] = 0;
        objArr2[7] = str4;
        g0Var.d(13533, objArr2);
    }

    public static int d(java.lang.String str) {
        int indexOf;
        if ("@LibraryAppId".equals(str)) {
            return 0;
        }
        if (!android.text.TextUtils.isEmpty(str) && (indexOf = str.indexOf(36)) >= 0) {
            str = str.substring(0, indexOf);
        }
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w0.b(str, -1);
        if (b17 < 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                k91.v5 k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().k1(str, "appInfo");
                if (k17 != null) {
                    b17 = k17.u0().f387162d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w0.a(str, b17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = attrs!");
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = b18 == null ? null : b18.u0();
                if (u07 != null) {
                    b17 = u07.f128817z;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w0.a(str, b17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandReporterManager", "getServiceTypeForReport null = initConfig! appServiceType:%s", java.lang.Integer.valueOf(b17));
                }
            }
        }
        return b17 + 1000;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:6|(1:73)(1:10)|11|(1:13)|14|15|16|17|(1:19)(1:69)|(1:21)(1:68)|(1:23)(1:67)|24|(6:26|(1:30)|31|(1:33)(1:65)|34|35)|66|39|(1:41)(1:64)|42|(11:58|59|60|45|46|(1:48)|49|50|(1:52)|53|54)|44|45|46|(0)|49|50|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandReporterManager", "innerMenuClickReport, get runtime by %s, e = %s", r25, r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, long r29, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(java.lang.String, java.lang.String, int, java.lang.String, long, int, int):void");
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7033xa441dce4 c7033xa441dce4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7033xa441dce4();
        c7033xa441dce4.f143487d = c7033xa441dce4.b("appid", str, true);
        c7033xa441dce4.f143488e = c7033xa441dce4.b("pagePath", str2, true);
        c7033xa441dce4.f143489f = c7033xa441dce4.b("sessionBuffer", str3, true);
        c7033xa441dce4.f143490g = i17;
        c7033xa441dce4.f143491h = i18;
        c7033xa441dce4.k();
    }

    public static void g(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.d(str);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandReporterManager", "statObject is Null!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.e(str);
        int i18 = e17 == null ? 0 : e17.f387385r.f156932d + 1;
        int d18 = d(str);
        java.lang.String str3 = d17.f169324g;
        java.lang.String str4 = "";
        java.lang.String str5 = str3 == null ? "" : str3;
        if (d17.f169323f == 0) {
            d17.f169323f = 1000;
        }
        long i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        try {
            str4 = fp.s0.b(str2 == null ? "" : str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandReporterManager", "reportBackHome, encode page path error!, appId = %s", str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandReporterManager", e18, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18189, str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d18), java.lang.Long.valueOf(i19), java.lang.Integer.valueOf(d17.f169323f), str5, str4, java.lang.Integer.valueOf(i17));
    }

    public static void h(int i17, java.lang.String str) {
        java.util.List xi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).xi(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (xi6 == null) {
            xi6 = java.util.Collections.emptyList();
        }
        java.util.List subList = xi6.subList(0, java.lang.Math.min(20, xi6.size()));
        for (int i18 = 0; i18 < subList.size(); i18++) {
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) subList.get(i18)).f157895e);
            if (i18 != subList.size() - 1) {
                sb6.append("#");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] scene=" + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] appIdStr=" + ((java.lang.Object) sb6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandReporterManager", "[reportEnterMyWxaList] sceneNote=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13800, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).mo49831x7444f759()), sb6.toString(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }

    public static void i(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        j(str, i17, i18, i19, i27, i28);
    }

    public static void j(java.lang.String str, int i17, int i18, long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f169357a.b(14369, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 + 1), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
    }

    public static void k(java.lang.String str, int i17, int i18, int i19) {
        l(str, i17, i18, i19, "");
    }

    public static void l(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7121x748eb997 c7121x748eb997 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7121x748eb997();
        c7121x748eb997.f144408g = c7121x748eb997.b("AppId", str, true);
        c7121x748eb997.f144405d = i17;
        c7121x748eb997.f144406e = i18;
        c7121x748eb997.f144407f = i19;
        if (str2 == null) {
            str2 = "";
        }
        c7121x748eb997.f144409h = c7121x748eb997.b("ActionNote", str2, true);
        c7121x748eb997.k();
    }

    public static void m(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        int i19;
        int i27;
        int i28;
        java.lang.String str3;
        int i29;
        int i37;
        if ("@LibraryAppId".equals(str)) {
            return;
        }
        int i38 = 0;
        str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            i19 = i18;
            i27 = 0;
            i28 = 1000;
            str3 = "";
            i29 = 0;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.d(str);
            if (d17 != null) {
                int i39 = d17.f169323f;
                r3 = i39 != 0 ? i39 : 1000;
                java.lang.String str4 = d17.f169324g;
                str2 = str4 != null ? str4 : "";
                i37 = d17.f169325h;
            } else {
                i37 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.e(str);
            if (e17 != null && e17.f387385r != null) {
                i38 = e17.f387385r.f33456x1c82a56c;
            }
            int i47 = (i18 != 0 || e17 == null || e17.f387385r == null) ? i18 : e17.f387385r.f156932d + 1;
            i28 = d(str);
            i19 = i47;
            java.lang.String str5 = str2;
            i29 = i37;
            i27 = i38;
            str3 = str5;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(13541, java.lang.Integer.valueOf(r3), str3, str, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i17), 3, "", java.lang.Integer.valueOf(i28));
        if (!"wxb6d22f922f37b35a".equals(str) || i19 > 1) {
            return;
        }
        g0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.z.f33965x366c91de, i17);
    }
}

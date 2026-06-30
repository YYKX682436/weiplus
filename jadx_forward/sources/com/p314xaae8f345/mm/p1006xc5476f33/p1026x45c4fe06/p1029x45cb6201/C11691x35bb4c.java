package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.u$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class C11691x35bb4c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w {
    public final pq5.g a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u cgi) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5 x5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s5.f166673a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r5 r5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r5.f166636b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
        r45.os3 D = cgi.D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "getRequest(...)");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f(D));
        sb6.append(" intercepted");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb6.toString());
        r45.jf jfVar = new r45.jf();
        java.util.LinkedList linkedList = jfVar.f459308d;
        linkedList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.g(cgi));
        r45.le3 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.g(cgi);
        g17.f460905i = true;
        linkedList.add(g17);
        int i18 = cgi.D().f464027u;
        jfVar.f459309e = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "CgiBatchGetPkgDownloadInfo scene:%d", java.lang.Integer.valueOf(i18));
        if (cgi.D().f464018i > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
            java.lang.String str3 = cgi.D().f464014e;
            java.lang.String str4 = cgi.D().f464019m;
            int i19 = cgi.D().f464017h;
            java.lang.String str5 = "";
            if (i19 == 0) {
                str = "";
            } else if (i19 == 6) {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379;
            } else if (i19 == 12) {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f;
            } else if (i19 == 13) {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str4) + "$__WITHOUT_PLUGINCODE__";
            } else if (i19 == 22) {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169;
            } else if (i19 != 23) {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str4);
            } else {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str4) + "$__WITHOUT_MULTI_PLUGINCODE__";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str3);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str5 = "$" + str;
                }
                sb7.append(str5);
                str2 = sb7.toString();
            } else {
                str2 = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 L = Di.L(str2, cgi.D().f464018i, 0, "pkgPath");
            java.lang.String str6 = L != null ? L.f67183x55b471cc : null;
            int f17 = com.p314xaae8f345.mm.vfs.w6.j(str6) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8.f(str6) : -1;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
            r45.os3 D2 = cgi.D();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D2, "getRequest(...)");
            sb8.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f(D2));
            sb8.append(", intercepted, oldPkg.innerVersion=");
            sb8.append(f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb8.toString());
            if (f17 == 0) {
                r45.le3 g18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.g(cgi);
                r45.jc4 jc4Var = new r45.jc4();
                g18.f460901e = jc4Var;
                jc4Var.f459231d = cgi.D().f464018i;
                linkedList.add(g18);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(697, 20);
            }
        }
        r45.y50 y50Var = new r45.y50();
        y50Var.f472332f = 1;
        jfVar.f459310f = y50Var;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t(jfVar, null).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w5(cgi));
    }
}

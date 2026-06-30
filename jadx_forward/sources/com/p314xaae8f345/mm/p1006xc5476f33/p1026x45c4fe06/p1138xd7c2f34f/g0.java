package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class g0 {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f.equals(r1 != null ? r1.f158854d : "") != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 r5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 r6) {
        /*
            r0 = 1
            if (r5 == 0) goto L32
            java.lang.String r1 = r5.f158811d
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto L32
            com.tencent.mm.plugin.appbrand.task.u0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C()
            java.lang.String r2 = r5.f158811d
            boolean r1 = r1.z(r2)
            if (r1 != 0) goto L32
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting r1 = r5.R
            boolean r1 = r1.f158961z
            if (r1 == 0) goto L1f
            r1 = r0
            goto L33
        L1f:
            java.lang.String r1 = r5.f128811x
            int r2 = r5.f158814g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler"
            java.lang.String r3 = "checkNeedPreFetchData, app(%s_v%d) can not pre fetch data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r1)
        L32:
            r1 = 0
        L33:
            if (r1 == 0) goto L41
            ku5.u0 r1 = ku5.t0.f394148d
            com.tencent.mm.plugin.appbrand.launching.c0 r2 = new com.tencent.mm.plugin.appbrand.launching.c0
            r2.<init>(r5, r6)
            ku5.t0 r1 = (ku5.t0) r1
            r1.a(r2)
        L41:
            ku5.u0 r1 = ku5.t0.f394148d
            com.tencent.mm.plugin.appbrand.launching.e0 r2 = new com.tencent.mm.plugin.appbrand.launching.e0
            r2.<init>(r5)
            ku5.t0 r1 = (ku5.t0) r1
            r1.g(r2)
            gm0.m r1 = gm0.j1.b()
            int r1 = r1.h()
            r5.f128812x0 = r1
            java.lang.String r1 = c01.z1.r()
            r5.f128815y0 = r1
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams r1 = r5.f128804d2
            java.lang.String r2 = ""
            if (r1 != 0) goto L65
            r1 = r2
            goto L67
        L65:
            java.lang.String r1 = r1.f158854d
        L67:
            java.lang.String r3 = "subpackage"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L7f
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams r1 = r5.f128804d2
            if (r1 != 0) goto L75
            goto L77
        L75:
            java.lang.String r2 = r1.f158854d
        L77:
            java.lang.String r1 = "page"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L87
        L7f:
            java.lang.String r1 = r5.F1
            int r1 = k01.d.a(r1)
            r5.G1 = r1
        L87:
            com.tencent.mm.plugin.appbrand.appusage.f3 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj()
            java.lang.String r2 = r5.f128811x
            int r3 = r5.f158814g
            boolean r1 = r1.s0(r2, r3)
            com.tencent.mm.plugin.appbrand.appusage.w2 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.cj()
            java.lang.String r3 = r5.f128811x
            int r4 = r5.f158814g
            boolean r2 = r2.z0(r3, r4)
            if (r2 == 0) goto La4
            r6.f169325h = r0
            goto Lad
        La4:
            if (r1 == 0) goto Laa
            r1 = 2
            r6.f169325h = r1
            goto Lad
        Laa:
            r1 = 3
            r6.f169325h = r1
        Lad:
            ku5.u0 r6 = ku5.t0.f394148d
            com.tencent.mm.plugin.appbrand.launching.f0 r1 = new com.tencent.mm.plugin.appbrand.launching.f0
            r1.<init>(r5)
            ku5.t0 r6 = (ku5.t0) r6
            r6.a(r1)
            boolean r6 = r5.k()
            if (r6 == 0) goto Lcb
            r6 = 0
            r5.f158830j2 = r6
            int r6 = r5.K1
            if (r6 != r0) goto Lda
            java.lang.String r6 = "portrait"
            r5.f158815h = r6
            goto Lda
        Lcb:
            com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor r6 = new com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor
            r6.<init>()
            r5.f158830j2 = r6
            java.lang.String r5 = r5.f158811d
            java.lang.String r5 = ri1.q.a(r5)
            r6.f168766d = r5
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g0.a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject):void");
    }
}

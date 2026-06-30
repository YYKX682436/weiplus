package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f169393a;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f169393a = o6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6744x1247e50b a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto Lc
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.u0()
            if (r1 == 0) goto Lc
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r1.L1
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 == 0) goto La4
            boolean r2 = r1.c()
            if (r2 != 0) goto L17
            goto La4
        L17:
            com.tencent.mm.autogen.mmdata.rpt.MiniProgramHalfScreenActionReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.MiniProgramHalfScreenActionReportStruct
            r2.<init>()
            k91.x2 r1 = r1.D
            k91.x2 r3 = k91.x2.f387350e
            r4 = 1
            if (r1 != r3) goto L25
            r1 = r4
            goto L26
        L25:
            r1 = 2
        L26:
            r2.f140762e = r1
            java.lang.String r1 = "embedWxa"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r1.L1
            java.lang.String r3 = "halfScreenConfig"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            boolean r3 = r1.c()
            r5 = 0
            if (r3 == 0) goto L47
            k91.x2 r3 = k91.x2.f387350e
            k91.x2 r1 = r1.D
            if (r1 != r3) goto L47
            r1 = r4
            goto L48
        L47:
            r1 = r5
        L48:
            if (r1 == 0) goto L55
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r1.L1
            boolean r1 = r1.P
            if (r1 == 0) goto L55
            r5 = r4
        L55:
            r2.f140763f = r5
            com.tencent.mm.plugin.appbrand.hc r1 = r7.f156329e
            if (r1 == 0) goto L60
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.i(r7)
            goto L61
        L60:
            r1 = r0
        L61:
            if (r1 == 0) goto L66
            java.lang.String r3 = r1.f156336n
            goto L67
        L66:
            r3 = r0
        L67:
            java.lang.String r5 = "FromAppId"
            java.lang.String r3 = r2.b(r5, r3, r4)
            r2.f140765h = r3
            if (r1 == 0) goto L76
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r1.u0()
            goto L77
        L76:
            r1 = r0
        L77:
            boolean r3 = r1 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1
            if (r3 == 0) goto L7e
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) r1
            goto L7f
        L7e:
            r1 = r0
        L7f:
            if (r1 == 0) goto L83
            java.lang.String r0 = r1.f128809v
        L83:
            java.lang.String r1 = "FromSessionId"
            java.lang.String r0 = r2.b(r1, r0, r4)
            r2.f140766i = r0
            java.lang.String r0 = r7.f156336n
            java.lang.String r1 = "TargetAppId"
            java.lang.String r0 = r2.b(r1, r0, r4)
            r2.f140767j = r0
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = r7.u0()
            java.lang.String r7 = r7.f128809v
            java.lang.String r0 = "TargetSessionId"
            java.lang.String r7 = r2.b(r0, r7, r4)
            r2.f140768k = r7
            return r2
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.h2.a(com.tencent.mm.plugin.appbrand.o6):com.tencent.mm.autogen.mmdata.rpt.MiniProgramHalfScreenActionReportStruct");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.m1 expandScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expandScene, "expandScene");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6744x1247e50b a17 = a(this.f169393a);
        if (a17 != null) {
            a17.f140761d = 1;
            a17.f140764g = expandScene.f169454d;
            a17.k();
        }
    }
}

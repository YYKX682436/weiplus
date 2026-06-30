package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class cc implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gc {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f158706a;

    /* renamed from: b, reason: collision with root package name */
    public int f158707b;

    public cc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initialConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialConfig, "initialConfig");
        this.f158706a = initialConfig;
        this.f158707b = initialConfig.f128802b2.f169323f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gc
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        this.f158706a = newConfig;
        int i17 = newConfig.f128802b2.f169323f;
        if (1038 != i17) {
            this.f158707b = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #0 {all -> 0x00be, blocks: (B:6:0x0013, B:9:0x001d, B:12:0x003b, B:14:0x0041, B:20:0x004f, B:23:0x0075, B:26:0x007e), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #0 {all -> 0x00be, blocks: (B:6:0x0013, B:9:0x001d, B:12:0x003b, B:14:0x0041, B:20:0x004f, B:23:0x0075, B:26:0x007e), top: B:5:0x0013 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "shouldRelaunch return "
            java.lang.String r1 = "shouldRelaunch return true appId["
            java.lang.String r2 = "shouldRelaunch return false. appId["
            java.lang.String r3 = "newConfig"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r3)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r7.f158706a
            boolean r3 = r3.f158825e2
            if (r3 != 0) goto L13
            r8 = 0
            return r8
        L13:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = r8.f128802b2     // Catch: java.lang.Throwable -> Lbe
            int r3 = r3.f169323f     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "MicroMsg.AppBrandRuntimeWC.FakeNativeRuntimeAutoReLaunchLogic"
            r5 = 1038(0x40e, float:1.455E-42)
            if (r5 != r3) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.f158706a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r1.f158811d     // Catch: java.lang.Throwable -> Lbe
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = "], reason=1038 back from other MiniProgram"
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbe
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lbe
            r7.a(r8)
            return r0
        L3b:
            java.lang.String r2 = r8.f158816i     // Catch: java.lang.Throwable -> Lbe
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L4a
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto L48
            goto L4a
        L48:
            r2 = r3
            goto L4b
        L4a:
            r2 = r5
        L4b:
            r6 = 93
            if (r2 != 0) goto L75
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.f158706a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r1.f158811d     // Catch: java.lang.Throwable -> Lbe
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = "] enterPath["
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r8.f158816i     // Catch: java.lang.Throwable -> Lbe
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            r0.append(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbe
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lbe
            r7.a(r8)
            return r0
        L75:
            int r1 = r7.f158707b     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r8.f128802b2     // Catch: java.lang.Throwable -> Lbe
            int r2 = r2.f169323f     // Catch: java.lang.Throwable -> Lbe
            if (r1 == r2) goto L7e
            r3 = r5
        L7e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lbe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lbe
            r3.append(r2)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = " appId["
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r7.f158706a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.f158811d     // Catch: java.lang.Throwable -> Lbe
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "] mLastAcceptableScene["
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            int r0 = r7.f158707b     // Catch: java.lang.Throwable -> Lbe
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "] newScene["
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r8.f128802b2     // Catch: java.lang.Throwable -> Lbe
            int r0 = r0.f169323f     // Catch: java.lang.Throwable -> Lbe
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            r3.append(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lbe
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: java.lang.Throwable -> Lbe
            r7.a(r8)
            return r1
        Lbe:
            r0 = move-exception
            r7.a(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.cc.b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):java.lang.Boolean");
    }
}

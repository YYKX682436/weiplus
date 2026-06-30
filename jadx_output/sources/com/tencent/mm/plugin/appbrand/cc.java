package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class cc implements com.tencent.mm.plugin.appbrand.gc {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f77173a;

    /* renamed from: b, reason: collision with root package name */
    public int f77174b;

    public cc(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initialConfig) {
        kotlin.jvm.internal.o.g(initialConfig, "initialConfig");
        this.f77173a = initialConfig;
        this.f77174b = initialConfig.f47269b2.f87790f;
    }

    @Override // com.tencent.mm.plugin.appbrand.gc
    public void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        this.f77173a = newConfig;
        int i17 = newConfig.f47269b2.f87790f;
        if (1038 != i17) {
            this.f77174b = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #0 {all -> 0x00be, blocks: (B:6:0x0013, B:9:0x001d, B:12:0x003b, B:14:0x0041, B:20:0x004f, B:23:0x0075, B:26:0x007e), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #0 {all -> 0x00be, blocks: (B:6:0x0013, B:9:0x001d, B:12:0x003b, B:14:0x0041, B:20:0x004f, B:23:0x0075, B:26:0x007e), top: B:5:0x0013 }] */
    @Override // com.tencent.mm.plugin.appbrand.gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r8) {
        /*
            r7 = this;
            java.lang.String r0 = "shouldRelaunch return "
            java.lang.String r1 = "shouldRelaunch return true appId["
            java.lang.String r2 = "shouldRelaunch return false. appId["
            java.lang.String r3 = "newConfig"
            kotlin.jvm.internal.o.g(r8, r3)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r7.f77173a
            boolean r3 = r3.f77292e2
            if (r3 != 0) goto L13
            r8 = 0
            return r8
        L13:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = r8.f47269b2     // Catch: java.lang.Throwable -> Lbe
            int r3 = r3.f87790f     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "MicroMsg.AppBrandRuntimeWC.FakeNativeRuntimeAutoReLaunchLogic"
            r5 = 1038(0x40e, float:1.455E-42)
            if (r5 != r3) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.f77173a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r1.f77278d     // Catch: java.lang.Throwable -> Lbe
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = "], reason=1038 back from other MiniProgram"
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mars.xlog.Log.i(r4, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lbe
            r7.a(r8)
            return r0
        L3b:
            java.lang.String r2 = r8.f77283i     // Catch: java.lang.Throwable -> Lbe
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
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r7.f77173a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r1.f77278d     // Catch: java.lang.Throwable -> Lbe
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = "] enterPath["
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r8.f77283i     // Catch: java.lang.Throwable -> Lbe
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbe
            r0.append(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mars.xlog.Log.i(r4, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lbe
            r7.a(r8)
            return r0
        L75:
            int r1 = r7.f77174b     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r8.f47269b2     // Catch: java.lang.Throwable -> Lbe
            int r2 = r2.f87790f     // Catch: java.lang.Throwable -> Lbe
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
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r7.f77173a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.f77278d     // Catch: java.lang.Throwable -> Lbe
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "] mLastAcceptableScene["
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            int r0 = r7.f77174b     // Catch: java.lang.Throwable -> Lbe
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "] newScene["
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r8.f47269b2     // Catch: java.lang.Throwable -> Lbe
            int r0 = r0.f87790f     // Catch: java.lang.Throwable -> Lbe
            r3.append(r0)     // Catch: java.lang.Throwable -> Lbe
            r3.append(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mars.xlog.Log.i(r4, r0)     // Catch: java.lang.Throwable -> Lbe
            r7.a(r8)
            return r1
        Lbe:
            r0 = move-exception
            r7.a(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.cc.b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):java.lang.Boolean");
    }
}

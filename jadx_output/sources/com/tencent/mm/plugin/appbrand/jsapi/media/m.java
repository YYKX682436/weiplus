package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class m implements com.tencent.mm.plugin.appbrand.jsapi.media.w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.m f81931a = new com.tencent.mm.plugin.appbrand.jsapi.media.m();

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.w1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.mm.plugin.appbrand.jsapi.l r5, com.tencent.mm.plugin.appbrand.w0 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "appPauseType"
            kotlin.jvm.internal.o.g(r6, r0)
            com.tencent.mm.plugin.appbrand.w0 r0 = com.tencent.mm.plugin.appbrand.w0.LAUNCH_NATIVE_PAGE
            r1 = 1
            r2 = 0
            if (r0 == r6) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L60
            com.tencent.mm.plugin.appbrand.w0 r0 = com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM
            if (r0 == r6) goto L16
        L14:
            r6 = r2
            goto L5d
        L16:
            boolean r6 = r5 instanceof com.tencent.mm.plugin.appbrand.y
            r0 = 0
            if (r6 == 0) goto L1e
            com.tencent.mm.plugin.appbrand.y r5 = (com.tencent.mm.plugin.appbrand.y) r5
            goto L1f
        L1e:
            r5 = r0
        L1f:
            if (r5 == 0) goto L30
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r5.getRuntime()
            if (r5 == 0) goto L30
            com.tencent.mm.plugin.appbrand.hc r5 = r5.f74796e
            if (r5 == 0) goto L30
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r5.getActiveRuntime()
            goto L31
        L30:
            r5 = r0
        L31:
            boolean r6 = r5 instanceof com.tencent.mm.plugin.appbrand.o6
            if (r6 == 0) goto L38
            r0 = r5
            com.tencent.mm.plugin.appbrand.o6 r0 = (com.tencent.mm.plugin.appbrand.o6) r0
        L38:
            java.lang.String r5 = "MicroMsg.AppBrand.AutoPauseIfNotOpenNativeStrategyWC"
            if (r0 != 0) goto L42
            java.lang.String r6 = "isLaunchFakeNative, activeRuntime is null"
            com.tencent.mars.xlog.Log.i(r5, r6)
            goto L14
        L42:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r0.u0()
            if (r6 == 0) goto L4b
            boolean r6 = r6.f77292e2
            goto L4c
        L4b:
            r6 = r2
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "isLaunchFakeNative, isActiveRuntimeFakeNative: "
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r5, r0)
        L5d:
            if (r6 != 0) goto L60
            goto L61
        L60:
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.media.m.a(com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.w0):boolean");
    }

    public java.lang.String toString() {
        return "AutoPauseIfNotOpenNativeStrategyWC";
    }
}

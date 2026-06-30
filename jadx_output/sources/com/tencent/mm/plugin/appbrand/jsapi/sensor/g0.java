package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class g0 implements com.tencent.mm.plugin.appbrand.jsapi.sensor.a {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f83005d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f83006e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f83007f;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.a
    public boolean Pe() {
        if (f83007f == null) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            f83007f = bool;
            com.tencent.mars.xlog.Log.i("MicroMsg.SensorJsEventControllerWx", "disableDispatchJsApi:%b", bool);
        }
        return f83007f.booleanValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.a
    public boolean W4() {
        if (f83005d == null) {
            f83005d = java.lang.Boolean.TRUE;
            com.tencent.mars.xlog.Log.i("MicroMsg.SensorJsEventControllerWx", "ignorePublishFrequencyLimit: true");
        }
        return f83005d.booleanValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.a
    public int e0() {
        return 5;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.a
    public boolean n6() {
        if (f83006e == null) {
            f83006e = java.lang.Boolean.TRUE;
            com.tencent.mars.xlog.Log.i("MicroMsg.SensorJsEventControllerWx", "useNewDeviceMotionStrategy: true");
        }
        return f83006e.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[RETURN] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sa(com.tencent.mm.plugin.appbrand.jsapi.l r5, com.tencent.mm.plugin.appbrand.jsapi.n5 r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L46
            boolean r1 = r5.isRunning()
            if (r1 == 0) goto L46
            if (r6 != 0) goto Lc
            goto L46
        Lc:
            boolean r1 = r5 instanceof com.tencent.mm.plugin.appbrand.jsapi.d0
            java.lang.String r2 = "MicroMsg.SensorJsEventControllerWx"
            if (r1 != 0) goto L18
            java.lang.String r5 = "hasPermission AppBrandComponentWithExtra"
            com.tencent.mars.xlog.Log.e(r2, r5)
            goto L46
        L18:
            r1 = r5
            com.tencent.mm.plugin.appbrand.jsapi.d0 r1 = (com.tencent.mm.plugin.appbrand.jsapi.d0) r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r1.getRuntime()
            if (r3 != 0) goto L27
            java.lang.String r5 = "runtime is null, return"
            com.tencent.mars.xlog.Log.e(r2, r5)
            goto L46
        L27:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r1.getRuntime()
            boolean r3 = r3 instanceof com.tencent.mm.plugin.appbrand.o6
            if (r3 != 0) goto L35
            java.lang.String r5 = "hasPermission not AppBrandRuntimeWC"
            com.tencent.mars.xlog.Log.e(r2, r5)
            goto L46
        L35:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.o6 r1 = (com.tencent.mm.plugin.appbrand.o6) r1
            si1.g r1 = r1.X1
            java.lang.Class r6 = r6.getClass()
            boolean r5 = r1.a(r5, r6)
            goto L47
        L46:
            r5 = r0
        L47:
            if (r5 == 0) goto L4b
            r5 = 1
            return r5
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.sensor.g0.sa(com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.n5):boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.a
    public int ua() {
        return 20;
    }
}

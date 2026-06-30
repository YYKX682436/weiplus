package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes7.dex */
public class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f164538d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f164539e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f164540f;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a
    public boolean Pe() {
        if (f164540f == null) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            f164540f = bool;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SensorJsEventControllerWx", "disableDispatchJsApi:%b", bool);
        }
        return f164540f.booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a
    public boolean W4() {
        if (f164538d == null) {
            f164538d = java.lang.Boolean.TRUE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SensorJsEventControllerWx", "ignorePublishFrequencyLimit: true");
        }
        return f164538d.booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a
    public int e0() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a
    public boolean n6() {
        if (f164539e == null) {
            f164539e = java.lang.Boolean.TRUE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SensorJsEventControllerWx", "useNewDeviceMotionStrategy: true");
        }
        return f164539e.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[RETURN] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sa(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L46
            boolean r1 = r5.mo50262x39e05d35()
            if (r1 == 0) goto L46
            if (r6 != 0) goto Lc
            goto L46
        Lc:
            boolean r1 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
            java.lang.String r2 = "MicroMsg.SensorJsEventControllerWx"
            if (r1 != 0) goto L18
            java.lang.String r5 = "hasPermission AppBrandComponentWithExtra"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r5)
            goto L46
        L18:
            r1 = r5
            com.tencent.mm.plugin.appbrand.jsapi.d0 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r1.mo32091x9a3f0ba2()
            if (r3 != 0) goto L27
            java.lang.String r5 = "runtime is null, return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r5)
            goto L46
        L27:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r1.mo32091x9a3f0ba2()
            boolean r3 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6
            if (r3 != 0) goto L35
            java.lang.String r5 = "hasPermission not AppBrandRuntimeWC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r5)
            goto L46
        L35:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.mo32091x9a3f0ba2()
            com.tencent.mm.plugin.appbrand.o6 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) r1
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.g0.sa(com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.n5):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a
    public int ua() {
        return 20;
    }
}

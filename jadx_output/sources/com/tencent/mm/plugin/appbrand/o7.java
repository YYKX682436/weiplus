package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class o7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction f86236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.n7 f86237e;

    public o7(com.tencent.mm.plugin.appbrand.n7 n7Var, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction appBrandLaunchErrorAction) {
        this.f86237e = n7Var;
        this.f86236d = appBrandLaunchErrorAction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3 != false) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction r0 = r5.f86236d
            if (r0 == 0) goto L33
            com.tencent.mm.plugin.appbrand.n7 r1 = r5.f86237e
            com.tencent.mm.plugin.appbrand.o6 r1 = r1.f86038h
            android.app.Activity r2 = r1.r0()
            r0.getClass()
            if (r2 == 0) goto L1d
            boolean r3 = r2.isFinishing()
            if (r3 != 0) goto L1d
            boolean r3 = r2.isDestroyed()
            if (r3 == 0) goto L1f
        L1d:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
        L1f:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r1.u0()
            com.tencent.luggage.sdk.launching.p r3 = r3.W1
            com.tencent.luggage.sdk.launching.p[] r4 = com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.f84339f
            boolean r3 = u46.a.b(r4, r3)
            if (r3 == 0) goto L2e
            goto L33
        L2e:
            java.lang.String r3 = "handleSync"
            r0.a(r2, r1, r3)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.o7.run():void");
    }
}

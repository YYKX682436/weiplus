package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f85445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.p f85446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f85447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction f85448g;

    public z(com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction appBrandLaunchErrorAction, android.app.Activity activity, com.tencent.luggage.sdk.launching.p pVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f85448g = appBrandLaunchErrorAction;
        this.f85445d = activity;
        this.f85446e = pVar;
        this.f85447f = o6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            android.app.Activity r0 = r4.f85445d
            if (r0 == 0) goto L10
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L10
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L12
        L10:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
        L12:
            com.tencent.luggage.sdk.launching.p[] r1 = com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.f84339f
            com.tencent.luggage.sdk.launching.p r2 = r4.f85446e
            boolean r1 = u46.a.b(r1, r2)
            if (r1 == 0) goto L1d
            return
        L1d:
            com.tencent.mm.plugin.appbrand.o6 r1 = r4.f85447f
            java.lang.String r2 = "handleAsync"
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction r3 = r4.f85448g
            r3.a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.z.run():void");
    }
}

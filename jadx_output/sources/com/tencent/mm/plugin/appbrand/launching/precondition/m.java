package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f85013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f85014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.f f85015f;

    public m(com.tencent.mm.plugin.appbrand.launching.precondition.f fVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, java.lang.Runnable runnable) {
        this.f85015f = fVar;
        this.f85013d = appBrandInitConfigWC;
        this.f85014e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.launching.precondition.f fVar = this.f85015f;
        android.app.Activity a17 = q75.a.a(fVar.f84980c.f84957f.getBaseContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "Teen mode auth skipped: no valid Activity context available");
            fVar.f84980c.f84957f.e(null, null);
        } else {
            com.tencent.mm.plugin.appbrand.launching.teenmode.k.d(fVar.f84980c.f84955d.f84901d);
            com.tencent.mm.plugin.appbrand.launching.teenmode.l.f85202a.b(a17, this.f85013d, new com.tencent.mm.plugin.appbrand.launching.precondition.l(this));
        }
    }
}

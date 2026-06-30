package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class k0 implements k91.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f76495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f76496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f76497c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.l0 f76498d;

    public k0(com.tencent.mm.plugin.appbrand.appusage.l0 l0Var, boolean z17, java.lang.Long l17, java.lang.Runnable runnable) {
        this.f76498d = l0Var;
        this.f76495a = z17;
        this.f76496b = l17;
        this.f76497c = runnable;
    }

    @Override // k91.e5
    public void a() {
        if (this.f76495a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "ljd doNotify db");
            this.f76498d.doNotify("batch", 3, this.f76496b);
            java.lang.Runnable runnable = this.f76497c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}

package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class a1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.e f76379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f76380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.c1 f76381f;

    public a1(com.tencent.mm.plugin.appbrand.appusage.c1 c1Var, i11.e eVar, java.lang.Runnable runnable) {
        this.f76381f = c1Var;
        this.f76379d = eVar;
        this.f76380e = runnable;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "stop getLocation ");
        ((i11.h) this.f76379d).m(this);
        this.f76381f.f76403i = null;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "getLocation fail");
            synchronized (this.f76381f) {
                this.f76381f.f76400f = false;
            }
            this.f76380e.run();
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f, altitude:%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19));
        com.tencent.mm.plugin.appbrand.appusage.c1 c1Var = this.f76381f;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo appBrandLocationInfo = c1Var.f76398d;
        appBrandLocationInfo.f76347d = f18;
        appBrandLocationInfo.f76348e = f17;
        appBrandLocationInfo.f76349f = i17;
        appBrandLocationInfo.f76350g = d17;
        appBrandLocationInfo.f76351h = d18;
        appBrandLocationInfo.f76352i = d19;
        i11.e eVar = this.f76379d;
        appBrandLocationInfo.f76353m = ((i11.h) eVar).f287099h;
        c1Var.f76399e = ((i11.h) eVar).h();
        com.tencent.mm.plugin.appbrand.appusage.j0.f76479m.f76346i = this.f76381f.f76398d;
        ik1.h0.a().removeCallbacks(this.f76381f.f76401g);
        if (this.f76381f.f76400f) {
            this.f76380e.run();
        }
        synchronized (this.f76381f) {
            this.f76381f.f76400f = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "save Location to temp cache");
        return false;
    }
}

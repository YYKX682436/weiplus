package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.a2 f86789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f86790e;

    public j5(com.tencent.mm.plugin.appbrand.page.d5 d5Var, gf.a2 a2Var, com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl) {
        this.f86789d = a2Var;
        this.f86790e = appServiceSkylineExtensionImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        gf.a2 a2Var = this.f86789d;
        df.w1 t17 = a2Var.t();
        if (t17 != null ? t17.f229595v : false) {
            return;
        }
        a2Var.u(this.f86790e);
    }
}

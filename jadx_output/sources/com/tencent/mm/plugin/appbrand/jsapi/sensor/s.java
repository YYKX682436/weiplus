package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.f4 f83042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.t f83043e;

    public s(com.tencent.mm.plugin.appbrand.jsapi.sensor.t tVar, com.tencent.mm.plugin.appbrand.utils.f4 f4Var) {
        this.f83043e = tVar;
        this.f83042d = f4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 a17 = com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.a(this.f83043e.f83044a, false);
        if (a17 != null) {
            com.tencent.mm.plugin.appbrand.utils.f4 f4Var = this.f83042d;
            a17.f82987e = f4Var;
            if (a17.f82983a) {
                com.tencent.mm.plugin.appbrand.utils.f4 f4Var2 = a17.f82988f;
                com.tencent.mm.plugin.appbrand.utils.f4 f4Var3 = com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE;
                com.tencent.mm.plugin.appbrand.utils.f4 f4Var4 = com.tencent.mm.plugin.appbrand.utils.f4.REVERSE_LANDSCAPE;
                if (f4Var2 == f4Var3 || f4Var2 == f4Var4) {
                    if (f4Var == f4Var4 || f4Var == f4Var3) {
                        a17.d(f4Var);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OrientationConfigListenerHelper", "onFourOrientationsChange mAppid:" + a17.f82984b + "; mOrientation:" + f4Var.name());
                    }
                }
            }
        }
    }
}

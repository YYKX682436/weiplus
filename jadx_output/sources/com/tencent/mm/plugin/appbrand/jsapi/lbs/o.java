package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.appbrand.jsapi.lbs.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 f81470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81471b;

    public o(com.tencent.mm.plugin.appbrand.jsapi.lbs.q qVar, com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f81470a = k1Var;
        this.f81471b = e9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.i1
    public void a(java.lang.String str) {
        char c17;
        int hashCode = str.hashCode();
        if (hashCode == -1562453447) {
            if (str.equals("StateNotListening")) {
                c17 = 1;
            }
            c17 = 65535;
        } else if (hashCode != -1514425717) {
            if (hashCode == 1073716042 && str.equals("StateListening")) {
                c17 = 0;
            }
            c17 = 65535;
        } else {
            if (str.equals("StateSuspend")) {
                c17 = 2;
            }
            c17 = 65535;
        }
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81471b;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var = this.f81470a;
        if (c17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "STATE_LISTENING, start blink");
            com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = k1Var.f81449v;
            if (c1Var != null) {
                c1Var.a(e9Var.t3());
                return;
            }
            return;
        }
        if (c17 != 1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "STATE_NOT_LISTENING, stop blink");
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var2 = k1Var.f81449v;
        if (c1Var2 != null) {
            c1Var2.b(e9Var.t3());
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class s implements com.tencent.mm.plugin.appbrand.jsapi.lbs.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 f81479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81480b;

    public s(com.tencent.mm.plugin.appbrand.jsapi.lbs.u uVar, com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f81479a = k1Var;
        this.f81480b = e9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.i1
    public void a(java.lang.String str) {
        char c17;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = this.f81479a.f81449v;
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
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81480b;
        if (c17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "STATE_LISTENING, start blink");
            if (c1Var != null) {
                c1Var.a(e9Var.t3());
                return;
            }
            return;
        }
        if (c17 != 1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "STATE_NOT_LISTENING, stop blink");
        if (c1Var != null) {
            c1Var.b(e9Var.t3());
        }
    }
}

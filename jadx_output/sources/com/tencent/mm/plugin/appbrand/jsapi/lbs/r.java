package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class r extends com.tencent.mm.plugin.appbrand.jsapi.lbs.u {
    private static final int CTRL_INDEX = 340;
    private static final java.lang.String NAME = "enableLocationUpdate";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.u, com.tencent.mm.plugin.appbrand.jsapi.lbs.l, com.tencent.mm.plugin.appbrand.jsapi.lbs.b
    /* renamed from: G */
    public void D(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        super.D(e9Var, jSONObject, i17);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81451h;
        if (j1Var == null || j1Var.f81441q) {
            return;
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.t.a(e9Var, 2, 2, false);
    }
}

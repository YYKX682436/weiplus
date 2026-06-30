package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.lbs.k {
    private static final int CTRL_INDEX = 587;
    private static final java.lang.String NAME = "disableLocationUpdate";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.k, com.tencent.mm.plugin.appbrand.jsapi.lbs.i, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        super.A(e9Var, jSONObject, i17);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81423g;
        if (j1Var == null || !j1Var.f81441q) {
            return;
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.t.a(e9Var, 2, 2, false);
    }
}

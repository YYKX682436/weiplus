package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class n9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 247;
    public static final java.lang.String NAME = "openDeliveryList";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f82381g = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/bizmall/expressentry";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        java.lang.String optString = jSONObject.optString("query");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail"));
            return;
        }
        java.lang.String str = f82381g + optString;
        com.tencent.mm.plugin.appbrand.jsapi.q1 q1Var = new com.tencent.mm.plugin.appbrand.jsapi.q1();
        q1Var.f82849b = true;
        q1Var.f82848a = true;
        q1Var.f82850c = e9Var;
        android.content.Context f147807d = e9Var.getF147807d();
        if (f147807d == null) {
            e9Var.a(i17, o("fail"));
        } else {
            ((com.tencent.mm.plugin.appbrand.jsapi.r1) e9Var.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).N(f147807d, str, "", q1Var);
            e9Var.a(i17, o("ok"));
        }
    }
}

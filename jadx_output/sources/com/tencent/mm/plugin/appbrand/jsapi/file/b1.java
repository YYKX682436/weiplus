package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class b1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "loadLibFiles";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e;
        org.json.JSONArray optJSONArray;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (v5Var == null || (f147808e = v5Var.getF147808e()) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = v5Var.x();
        jz5.f0 f0Var = null;
        f0Var = null;
        if (x17 != null) {
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("paths")) != null) {
                cf.f.b(optJSONArray, new com.tencent.mm.plugin.appbrand.jsapi.file.a1(optJSONArray, x17, f147808e, v5Var, i17, this));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                v5Var.a(i17, o("fail:invalid data"));
                return;
            }
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        v5Var.a(i17, u(str, jSONObject2));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}

package ab1;

/* loaded from: classes.dex */
public final class x extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "showAddressPickerView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        android.app.Activity a17 = q75.a.a(env.getF147807d());
        if (a17 == null) {
            env.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        org.json.JSONArray optJSONArray = data.optJSONArray("current");
        if (optJSONArray != null) {
            arrayList = new java.util.ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                arrayList.add(optJSONArray.optString(i18, "undefined"));
            }
        } else {
            arrayList = null;
        }
        try {
            ab1.f fVar = (ab1.f) i95.n0.c(ab1.f.class);
            ab1.c a18 = ab1.c.f2709e.a(data.optString("mode"));
            if (a18 == null) {
                a18 = ab1.c.f2712h;
            }
            ((ab1.l) fVar).Ai(a17, new com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest(a18, arrayList, true), new ab1.v(env, i17, this), new ab1.w(env, i17, this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowAddressPickerView", "invoke appId:" + env.getAppId() + ", callbackId:" + i17 + ", get exception:" + e17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail ");
            sb6.append(e17);
            env.a(i17, o(sb6.toString()));
        }
    }
}

package bg1;

/* loaded from: classes7.dex */
public class q implements zf.d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.extendplugin.b f19902a;

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.l m17;
        if (n5Var != null) {
            if (!n5Var.k().equalsIgnoreCase("onXWebLivePusherEvent") && !n5Var.k().equalsIgnoreCase("onXWebLivePusherNetStatus")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.tencent.mm.plugin.appbrand.jsapi.n5 r17 = n5Var.r(jSONObject.toString());
            com.tencent.mm.plugin.appbrand.extendplugin.b bVar = this.f19902a;
            if (bVar == null || (m17 = bVar.m()) == null) {
                return;
            }
            if (m17 instanceof com.tencent.mm.plugin.appbrand.e9) {
                ((com.tencent.mm.plugin.appbrand.e9) m17).i(r17, null);
            } else if (m17 instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                ((com.tencent.mm.plugin.appbrand.page.v5) m17).i(r17, null);
            } else {
                m17.i(r17, null);
            }
        }
    }

    public void b(int i17, jc1.d dVar, int i18, java.lang.String str, java.util.HashMap hashMap) {
        bg1.n nVar = new bg1.n(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("viewId", i17);
            jSONObject.put("errno", dVar.f298903a);
            jSONObject.put("errCode", i18);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("errMsg", str);
            if (hashMap != null && !hashMap.isEmpty()) {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(hashMap));
            }
            a(nVar, jSONObject);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherError fail", e17);
        }
    }
}

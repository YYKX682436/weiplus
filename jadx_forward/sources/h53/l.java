package h53;

/* loaded from: classes8.dex */
public class l {
    @android.webkit.JavascriptInterface
    /* renamed from: error */
    public void m132899x5c4d208(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameV8JsInterface", "js console error : %s", str);
    }

    @android.webkit.JavascriptInterface
    public void log(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameV8JsInterface", "js console log : %s", str);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: postMessage */
    public void m132900x58d00b47(java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("pageId");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("params");
            sd.u0 u0Var = (sd.u0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264162d.get(optString);
            if (u0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameV8JsInterface", "page is null, pageId : %s", optString);
                return;
            }
            java.lang.String format = java.lang.String.format("javascript:WxGameJsCoreBridge.invokeEvent(%s)", optJSONObject.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameV8JsInterface", "postMessage, js = %s", format);
            u0Var.f488188i.f488166i.mo32260x738236e6(format, null);
        } catch (org.json.JSONException unused) {
        }
    }
}

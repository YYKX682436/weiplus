package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/h4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenWeAppProfile", "openWeAppProfile %s", jSONObject);
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("searchId", "");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiOpenWeAppProfile", e17, me1.c.f72883x24728b, new java.lang.Object[0]);
                this.f224976f.a(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                return;
            }
        } else {
            optString = null;
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("docId", "") : null;
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0)) : null;
        java.lang.Integer valueOf2 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("fromScene", 0)) : null;
        java.lang.Integer valueOf3 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("type", 0)) : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("weAppUsername", "") : null;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 8);
        bundle.putString("stat_search_id", optString);
        java.lang.String str2 = optString + ':' + optString2 + ':' + valueOf + ':' + valueOf3;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_username", optString3);
        intent.putExtra("key_can_swipe_back", true);
        intent.putExtra("key_from_scene", valueOf2);
        intent.putExtra("key_scene_note", str2);
        intent.putExtra("_stat_obj", bundle);
        j45.l.j(c(), "appbrand", ".ui.AppBrandProfileUI", intent, null);
        this.f224976f.b(kz5.b1.e(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "ok")));
    }
}

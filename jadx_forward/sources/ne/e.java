package ne;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne/e;", "Lcom/tencent/mm/plugin/appbrand/jsapi/g0;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f418012d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONArray f418013e;

    public e(ze.n rt6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f418012d = rt6;
    }

    public final int a(java.lang.String pluginId) {
        org.json.JSONArray optJSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7;
        boolean z17 = true;
        if (pluginId == null || pluginId.length() == 0) {
            return 0;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = this.f418012d.E0();
        if (E0 != null && (c11667xc7e59dd6 = E0.f387385r) != null && (c11670x2ef26cc7 = c11667xc7e59dd6.f156937i) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginId, "pluginId");
            android.util.ArrayMap arrayMap = c11670x2ef26cc7.f156940e;
            if (arrayMap == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSecondaryMap");
                throw null;
            }
            java.util.LinkedList linkedList = (java.util.LinkedList) arrayMap.get(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.lb(pluginId));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 = linkedList != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) kz5.n0.Z(linkedList) : null;
            if (c11669x3195c847 != null) {
                return c11669x3195c847.mo49191x1c82a56c();
            }
        }
        if (this.f418013e == null) {
            java.lang.String str = this.f418012d.u0().N.f158988r;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                optJSONArray = new org.json.JSONArray();
            } else {
                try {
                    optJSONArray = new org.json.JSONObject(str).optJSONArray("call_plugin_info");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optJSONArray);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimePluginInfoConfig", "getPluginInnerVersion(appId:" + pluginId + ") parse call_plugin_info get exception:" + e17);
                    return 0;
                }
            }
            this.f418013e = optJSONArray;
        }
        org.json.JSONArray jSONArray = this.f418013e;
        if (jSONArray == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("call_plugin_info");
            throw null;
        }
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONArray jSONArray2 = this.f418013e;
            if (jSONArray2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("call_plugin_info");
                throw null;
            }
            org.json.JSONObject optJSONObject = jSONArray2.optJSONObject(i17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pluginId, optJSONObject.optString("plugin_id"))) {
                return optJSONObject.optInt("inner_version");
            }
        }
        return 0;
    }
}

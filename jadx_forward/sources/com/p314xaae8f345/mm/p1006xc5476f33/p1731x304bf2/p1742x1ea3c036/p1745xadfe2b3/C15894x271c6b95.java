package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3;

/* renamed from: com.tencent.mm.plugin.game.luggage.liteapp.LiteLuggageGameJsRuntimeImpl */
/* loaded from: classes.dex */
public class C15894x271c6b95 extends h53.p {
    private static final java.lang.String TAG = "LiteLuggageGameJsRuntimeImpl";

    /* renamed from: mCallbackHandler */
    nw4.e f36931xe0431718;

    public C15894x271c6b95(android.content.Context context) {
        super(context);
    }

    @Override // h53.p, od.p
    /* renamed from: evaluateJavascript */
    public void mo32260x738236e6(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        org.json.JSONObject optJSONObject;
        try {
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(str).optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            new org.json.JSONObject();
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) == null) {
                return;
            }
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            java.util.HashMap hashMap = new java.util.HashMap();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, optJSONObject.get(next));
            }
            this.f36931xe0431718.e(java.lang.String.valueOf(optJSONObject2.optLong("liteCallbackId", 0L)), optJSONObject2.optString("error", ""), hashMap);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "JSONException", new java.lang.Object[0]);
        }
    }

    public C15894x271c6b95(android.content.Context context, nw4.e eVar) {
        super(context);
        this.f36931xe0431718 = eVar;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes7.dex */
public class y implements qf.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264222a;

    public y(java.lang.String str) {
        this.f264222a = "";
        this.f264222a = str;
    }

    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        try {
            android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse("application/javascript", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, new java.io.ByteArrayInputStream((ik1.f.e("LuggageBridge.js") + this.f264222a).getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
            hashMap.put("Pragma", "no-cache");
            hashMap.put("Expires", "0");
            webResourceResponse.setResponseHeaders(hashMap);
            return webResourceResponse;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.LuggageMMJsBridgeResourceProvider", "", e17);
            return null;
        }
    }

    @Override // qf.c
    public java.lang.String b() {
        return "weixin://bridge.js";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState */
/* loaded from: classes.dex */
public class C16201xcbb38761 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static long f225015g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f225016h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f225017i;

    static {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f225016h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                if (c5675xda3892c3.f136001g.f89350a != 3) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16201xcbb38761.f225015g = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16201xcbb38761.f225017i.mo48814x2efc64();
                mo48814x2efc64();
                return false;
            }
        };
        f225017i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.2
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = c5722xb16ab0f4;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16201xcbb38761.f225015g == 0) {
                    return false;
                }
                java.lang.String str = c5722xb16ab0f42.f136045g.f88573f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetBackgroundAudioState", "backgroundAudioListener callback in, state:%s", str);
                am.jk jkVar = c5722xb16ab0f42.f136045g;
                boolean z17 = jkVar.f88574g;
                int i17 = (int) (jkVar.f88572e / 1000);
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetBackgroundAudioState", "is not from QQMusicPlayer, don't callback!");
                    return false;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("state", str);
                    jSONObject.put("duration", i17);
                    b21.r rVar = jkVar.f88570c;
                    if (rVar != null) {
                        jSONObject.put("src", rVar.f98885n);
                        jSONObject.put("srcId", jkVar.f88570c.E);
                    }
                    jSONObject.put("errCode", jkVar.f88578k);
                    jSONObject.put("errMsg", android.text.TextUtils.isEmpty(jkVar.f88579l) ? "" : jkVar.f88579l);
                    b21.r b17 = b21.m.b();
                    if (b17 != null) {
                        java.lang.String wi6 = ((yg0.m4) ((zg0.m3) i95.n0.c(zg0.m3.class))).wi(b17.f98879e);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                            jSONObject.put("audioId", wi6);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16201xcbb38761.f225015g, "onBackgroundAudioStateChange", jSONObject);
                    return false;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetBackgroundAudioState", e17.getMessage());
                    return false;
                }
            }
        };
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        b21.r b17 = b21.m.b();
        b21.o a17 = b21.m.a();
        if (b17 == null || a17 == null || a17.f98872c == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("paused", 1);
            this.f224976f.b(hashMap);
            return;
        }
        if (!android.text.TextUtils.isEmpty(b17.f98891t) && !str.equals(b17.f98891t)) {
            this.f224976f.a("appId is different");
            return;
        }
        int i17 = a17.f98870a;
        int i18 = a17.f98871b;
        if ("stop".equals(a17.f98874e) || i17 < 0 || i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetBackgroundAudioState", "return parameter is invalid");
            this.f224976f.a("fail");
            return;
        }
        f225015g = this.f224975e.f380557a;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = f225016h;
        abstractC20980x9b9ad01d.mo48814x2efc64();
        abstractC20980x9b9ad01d.mo48813x58998cd();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = f225017i;
        abstractC20980x9b9ad01d2.mo48814x2efc64();
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        int i19 = i17 / 1000;
        int i27 = i18 / 1000;
        int i28 = a17.f98872c;
        int i29 = i19 > 0 ? (a17.f98873d * i19) / 100 : 0;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("duration", java.lang.Integer.valueOf(i19));
        hashMap2.put("currentTime", java.lang.Integer.valueOf(i27));
        hashMap2.put("paused", java.lang.Integer.valueOf(i28 == 1 ? 0 : 1));
        hashMap2.put("src", b17.f98885n);
        hashMap2.put("buffered", java.lang.Integer.valueOf(i29));
        hashMap2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, b17.f98881g);
        hashMap2.put("epname", b17.f98883i);
        hashMap2.put("singer", b17.f98882h);
        hashMap2.put("coverImgUrl", b17.f98884m);
        hashMap2.put("isLive", 0);
        hashMap2.put("startTime", java.lang.Integer.valueOf(b17.D / 1000));
        hashMap2.put("srcId", b17.E);
        java.lang.String str2 = b17.F;
        if (str2 == null) {
            str2 = "";
        }
        hashMap2.put("protocol", str2);
        hashMap2.put("webUrl", b17.f98887p);
        hashMap2.put("playState", a17.f98874e);
        hashMap2.put("songLyric", b17.f98888q);
        hashMap2.put("playbackRate", java.lang.Double.valueOf(b17.K));
        this.f224976f.b(hashMap2);
    }
}

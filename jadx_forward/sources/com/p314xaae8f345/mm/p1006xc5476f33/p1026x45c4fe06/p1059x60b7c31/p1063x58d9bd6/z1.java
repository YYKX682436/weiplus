package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class z1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160850d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f160851e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160852f;

    /* renamed from: g, reason: collision with root package name */
    public int f160853g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f160854h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f160855i;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f160855i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask$1
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa32 = c5175x3ee93aa3;
                java.lang.String str = c5175x3ee93aa32.f135523g.f88253e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.z1 z1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.z1.this;
                boolean equals = z1Var.f160851e.equals(str);
                am.g0 g0Var = c5175x3ee93aa32.f135523g;
                if (!equals) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "appId is not equals preAppId, don't send any event, appId:%s, eventAppId:%s, action:%d", z1Var.f160851e, str, java.lang.Integer.valueOf(g0Var.f88249a));
                    return false;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String str2 = g0Var.f88252d;
                z1Var.f160854h = g0Var.f88251c;
                hashMap.put("state", str2);
                hashMap.put("audioId", z1Var.f160854h);
                int i17 = g0Var.f88249a;
                z1Var.f160853g = i17;
                if (i17 == 4) {
                    hashMap.put("errMsg", g0Var.f88255g);
                    hashMap.put("errCode", java.lang.Integer.valueOf(g0Var.f88254f));
                } else if (i17 == 11) {
                    hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
                z1Var.f160852f = new org.json.JSONObject(hashMap).toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = z1Var.f160850d;
                if (lVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "AudioListenerTask action:%d, retJson:%s", java.lang.Integer.valueOf(z1Var.f160853g), z1Var.f160852f);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z1Var.f160852f)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiSetAudioState", "jsonResult is null, err");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a2();
                        gb1.a a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d.INSTANCE.a(z1Var.f160851e);
                        if (a17 == null || a17.a(z1Var.f160854h) == null) {
                            a2Var.p(lVar2);
                            a2Var.r(z1Var.f160852f);
                            a2Var.m();
                        } else {
                            a2Var.p(lVar2);
                            a2Var.r(z1Var.f160852f);
                            a2Var.n(a17.a(z1Var.f160854h));
                        }
                    }
                }
                return true;
            }
        };
        this.f160850d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u
    public void a() {
        jh1.a.c(this.f160851e);
        java.lang.String str = this.f160851e;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f160855i;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AppBrandAudioClientService", "appId is empty");
            return;
        }
        if (abstractC20980x9b9ad01d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AppBrandAudioClientService", "listener is null");
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) jh1.a.f381326b;
        if (hashMap.containsKey(str)) {
            jh1.a.c(str);
        }
        hashMap.put(str, abstractC20980x9b9ad01d);
        java.util.ArrayList arrayList = jh1.a.f381327c;
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }
}

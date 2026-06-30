package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class z1 extends com.tencent.mm.plugin.appbrand.jsapi.audio.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79317d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f79318e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f79319f;

    /* renamed from: g, reason: collision with root package name */
    public int f79320g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f79321h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f79322i;

    public z1(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f79322i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AudioPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask$1
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent) {
                com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent2 = audioPlayerEvent;
                java.lang.String str = audioPlayerEvent2.f53990g.f6720e;
                com.tencent.mm.plugin.appbrand.jsapi.audio.z1 z1Var = com.tencent.mm.plugin.appbrand.jsapi.audio.z1.this;
                boolean equals = z1Var.f79318e.equals(str);
                am.g0 g0Var = audioPlayerEvent2.f53990g;
                if (!equals) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "appId is not equals preAppId, don't send any event, appId:%s, eventAppId:%s, action:%d", z1Var.f79318e, str, java.lang.Integer.valueOf(g0Var.f6716a));
                    return false;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String str2 = g0Var.f6719d;
                z1Var.f79321h = g0Var.f6718c;
                hashMap.put("state", str2);
                hashMap.put("audioId", z1Var.f79321h);
                int i17 = g0Var.f6716a;
                z1Var.f79320g = i17;
                if (i17 == 4) {
                    hashMap.put("errMsg", g0Var.f6722g);
                    hashMap.put("errCode", java.lang.Integer.valueOf(g0Var.f6721f));
                } else if (i17 == 11) {
                    hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
                z1Var.f79319f = new org.json.JSONObject(hashMap).toString();
                com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = z1Var.f79317d;
                if (lVar2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "AudioListenerTask action:%d, retJson:%s", java.lang.Integer.valueOf(z1Var.f79320g), z1Var.f79319f);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(z1Var.f79319f)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiSetAudioState", "jsonResult is null, err");
                    } else {
                        com.tencent.mm.plugin.appbrand.jsapi.audio.a2 a2Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.a2();
                        gb1.a a17 = com.tencent.mm.plugin.appbrand.jsapi.audio.d.INSTANCE.a(z1Var.f79318e);
                        if (a17 == null || a17.a(z1Var.f79321h) == null) {
                            a2Var.p(lVar2);
                            a2Var.r(z1Var.f79319f);
                            a2Var.m();
                        } else {
                            a2Var.p(lVar2);
                            a2Var.r(z1Var.f79319f);
                            a2Var.n(a17.a(z1Var.f79321h));
                        }
                    }
                }
                return true;
            }
        };
        this.f79317d = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.u
    public void a() {
        jh1.a.c(this.f79318e);
        java.lang.String str = this.f79318e;
        com.tencent.mm.sdk.event.IListener iListener = this.f79322i;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AppBrandAudioClientService", "appId is empty");
            return;
        }
        if (iListener == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AppBrandAudioClientService", "listener is null");
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) jh1.a.f299793b;
        if (hashMap.containsKey(str)) {
            jh1.a.c(str);
        }
        hashMap.put(str, iListener);
        java.util.ArrayList arrayList = jh1.a.f299794c;
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        iListener.alive();
    }
}

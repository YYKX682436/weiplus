package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class JsApiOperateMusicPlayer$OperateMusicPlayer extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.d1();

    /* renamed from: f, reason: collision with root package name */
    public c01.l2 f79038f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f79039g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79040h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f79041i;

    /* renamed from: m, reason: collision with root package name */
    public final int f79042m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f79043n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f79044o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f79046q;

    /* renamed from: r, reason: collision with root package name */
    public int f79047r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f79048s;

    /* renamed from: p, reason: collision with root package name */
    public boolean f79045p = false;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f79049t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer.6
        {
            this.__eventId = -1155728636;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "callback in(action : %s)", java.lang.Integer.valueOf(musicPlayerEvent2.f54512g.f7036b));
            am.jk jkVar = musicPlayerEvent2.f54512g;
            b21.r rVar = jkVar.f7037c;
            if (rVar == null) {
                return false;
            }
            java.lang.String str = rVar.f17352n;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("dataUrl", str);
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer = com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer.this;
            jsApiOperateMusicPlayer$OperateMusicPlayer.f79046q = jSONObject;
            jsApiOperateMusicPlayer$OperateMusicPlayer.f79047r = jkVar.f7036b;
            jsApiOperateMusicPlayer$OperateMusicPlayer.c();
            return false;
        }
    };

    public JsApiOperateMusicPlayer$OperateMusicPlayer(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f79040h = k0Var;
        this.f79041i = e9Var;
        this.f79042m = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79043n = parcel.readString();
        this.f79044o = parcel.readString();
        this.f79045p = parcel.readByte() != 0;
        this.f79046q = parcel.readString();
        this.f79047r = parcel.readInt();
        this.f79048s = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79043n);
        parcel.writeString(this.f79044o);
        parcel.writeByte(this.f79045p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f79046q);
        parcel.writeInt(this.f79047r);
        parcel.writeString(this.f79048s);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "runInClientProcess(action : %s)", java.lang.Integer.valueOf(this.f79047r));
        if (this.f79045p) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail");
            if (android.text.TextUtils.isEmpty(this.f79048s)) {
                str2 = "";
            } else {
                str2 = ":" + this.f79048s;
            }
            sb6.append(str2);
            str = sb6.toString();
        } else {
            str = "ok";
        }
        java.lang.String o17 = this.f79040h.o(str);
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f79041i;
        e9Var.a(this.f79042m, o17);
        int i17 = this.f79047r;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPlay in");
            com.tencent.mm.plugin.appbrand.jsapi.audio.x0 x0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.x0(null);
            x0Var.u(e9Var);
            x0Var.f82374f = this.f79046q;
            x0Var.m();
            this.f79038f.i("Music#isPlaying", java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.appbrand.x0.a(e9Var.getAppId(), this.f79039g);
            return;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicResume in");
            this.f79038f.i("Music#isPlaying", java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.appbrand.x0.a(e9Var.getAppId(), this.f79039g);
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicStop in");
            com.tencent.mm.plugin.appbrand.jsapi.audio.v0 v0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.v0(null);
            v0Var.u(e9Var);
            v0Var.f82374f = this.f79046q;
            v0Var.m();
        } else {
            if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPause in");
                com.tencent.mm.plugin.appbrand.jsapi.audio.w0 w0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.w0(null);
                w0Var.u(e9Var);
                w0Var.f82374f = this.f79046q;
                w0Var.m();
                this.f79038f.i("Music#isPlaying", java.lang.Boolean.FALSE);
                com.tencent.mm.plugin.appbrand.x0.e(e9Var.getAppId(), this.f79039g);
                return;
            }
            if (i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicError in");
                e9Var.g("onMusicError", this.f79046q);
                this.f79038f.i("Music#isPlaying", java.lang.Boolean.FALSE);
                com.tencent.mm.plugin.appbrand.x0.e(e9Var.getAppId(), this.f79039g);
                return;
            }
            if (i17 != 7) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicEnd in");
        this.f79038f.i("Music#isPlaying", java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.appbrand.x0.e(e9Var.getAppId(), this.f79039g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f79043n);
            java.lang.String optString = jSONObject.optString("operationType");
            java.lang.String optString2 = jSONObject.optString("dataUrl");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                this.f79047r = -1;
                this.f79045p = true;
                this.f79048s = "operationType is null or nil";
                c();
                return;
            }
            com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
            if (!hVar.b(this.f79044o, optString)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "appid not match cannot operate");
                this.f79047r = -1;
                this.f79045p = true;
                this.f79048s = "appid not match cannot operate";
                c();
                return;
            }
            if (b21.m.d() && !b21.m.c() && optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                b21.r b17 = b21.m.b();
                if (b17 == null || !(com.tencent.mm.sdk.platformtools.t8.K0(optString2) || optString2.equals(b17.f17352n))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "data url has changed ,restart play");
                } else if (hVar.b(this.f79044o, "resume")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "same appid %s, change play to resume", this.f79044o);
                    optString = "resume";
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "not same not same appid ,restart play");
                }
            }
            if (optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                java.lang.String optString3 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                java.lang.String optString4 = jSONObject.optString("singer");
                java.lang.String optString5 = jSONObject.optString("epname");
                java.lang.String optString6 = jSONObject.optString("coverImgUrl");
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                    this.f79047r = -1;
                    this.f79045p = true;
                    this.f79048s = "dataUrl is null or nil";
                    c();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s", optString3, optString4, optString5, optString6, optString2, optString2, optString2);
                b21.m.j();
                java.lang.String str = hVar.f85761a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", str, this.f79044o);
                    hVar.d(str);
                }
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.audio.y0(this, optString2, optString6, optString3, optString4, optString2, optString2, optString5), 500L);
                return;
            }
            if (optString.equalsIgnoreCase("resume")) {
                java.lang.String str2 = hVar.f85761a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", str2, this.f79044o);
                    hVar.d(str2);
                }
                hVar.a(this.f79049t, this.f79044o);
                hVar.f85761a = this.f79044o;
                b21.r b18 = b21.m.b();
                if (b18 != null) {
                    hVar.f85762b = b18.f17346e;
                }
                if (b21.n.c()) {
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.audio.z0(this), 500L);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "resume fail");
                this.f79047r = -1;
                this.f79045p = true;
                this.f79048s = "resume play fail";
                c();
                return;
            }
            if (optString.equalsIgnoreCase("pause")) {
                if (b21.n.b()) {
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.audio.a1(this), 500L);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "pause fail");
                this.f79047r = -1;
                this.f79045p = true;
                this.f79048s = "pause play fail";
                c();
                return;
            }
            if (optString.equalsIgnoreCase("seek")) {
                if (b21.m.h(com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.sdk.platformtools.t8.f1(jSONObject.optString("position")), -1) * 1000)) {
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.audio.b1(this), 500L);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "seek fail");
                this.f79047r = -1;
                this.f79045p = true;
                this.f79048s = "seek fail";
                c();
                return;
            }
            if (!optString.equalsIgnoreCase("stop")) {
                this.f79047r = -1;
                this.f79045p = true;
                c();
            } else {
                if (b21.n.d()) {
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.audio.c1(this), 500L);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateMusicPlayer", "stop fail");
                this.f79047r = -1;
                this.f79045p = false;
                this.f79048s = "stop play fail";
                c();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateMusicPlayer", e17.toString());
            this.f79047r = -1;
            this.f79045p = true;
            this.f79048s = "data is null";
            c();
        }
    }

    public JsApiOperateMusicPlayer$OperateMusicPlayer(android.os.Parcel parcel) {
        v(parcel);
    }
}

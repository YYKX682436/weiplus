package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
public class JsApiOperateBackgroundAudio$OperateBackgroundAudioTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.o0();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79031f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79032g;

    /* renamed from: h, reason: collision with root package name */
    public int f79033h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79034i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79035m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79036n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f79037o = "";

    public JsApiOperateBackgroundAudio$OperateBackgroundAudioTask(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79031f = fVar;
        this.f79032g = lVar;
        this.f79033h = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79034i = parcel.readString();
        this.f79035m = parcel.readString();
        this.f79036n = parcel.readInt() == 1;
        this.f79037o = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79034i);
        parcel.writeString(this.f79035m);
        parcel.writeInt(this.f79036n ? 1 : 0);
        parcel.writeString(this.f79037o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79032g;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "service is null, don't callback");
            return;
        }
        boolean z17 = this.f79036n;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f79031f;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio fail:%s", this.f79037o);
            lVar.a(this.f79033h, k0Var.o("fail:" + this.f79037o));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio ok");
            lVar.a(this.f79033h, k0Var.o("ok"));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "runInMainProcess");
        com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
        java.lang.String str = hVar.f85761a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(this.f79034i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f79034i);
            this.f79036n = true;
            this.f79037o = "appid not match cannot operate";
            c();
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f79035m);
            java.lang.String optString = jSONObject.optString("operationType");
            double optDouble = jSONObject.optDouble("currentTime", -1.0d);
            if (android.text.TextUtils.isEmpty(optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is null");
                this.f79036n = true;
                this.f79037o = "operationType is null";
                c();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType;%s, currentTime:%f", optString, java.lang.Double.valueOf(optDouble));
            this.f79036n = false;
            if (optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                b21.r rVar = hVar.f85763c;
                if (rVar == null) {
                    rVar = b21.m.b();
                }
                if (rVar != null) {
                    hVar.f85762b = rVar.f17346e;
                }
                if (b21.n.c()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "play music ok");
                } else if (b21.m.c()) {
                    this.f79036n = true;
                    this.f79037o = "music is playing, don't play again";
                } else if (rVar == null || !this.f79034i.equals(rVar.f17358t)) {
                    this.f79036n = true;
                    this.f79037o = "play music fail";
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "startPlayMusic play music ok, appId is same!");
                    b21.m.i(rVar);
                }
            } else if (optString.equalsIgnoreCase("pause")) {
                if (b21.n.b()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "pause music ok");
                } else {
                    this.f79036n = true;
                    this.f79037o = "pause music fail";
                }
            } else if (optString.equalsIgnoreCase("seek")) {
                if (optDouble < 0.0d) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "currentTime is invalid!");
                    this.f79036n = true;
                    this.f79037o = "currentTime is invalid";
                } else if (b21.m.h((int) (optDouble * 1000.0d))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "seek music ok");
                } else {
                    this.f79036n = true;
                    this.f79037o = "seek music fail";
                }
            } else if (!optString.equalsIgnoreCase("stop")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is invalid");
                this.f79036n = true;
                this.f79037o = "operationType is invalid";
            } else if (b21.n.d()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "stop music ok");
            } else {
                this.f79036n = true;
                this.f79037o = "stop music fail";
            }
            if (this.f79036n) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", this.f79037o);
            }
            c();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "new json exists exception, data is invalid, jsonStr:%s", this.f79035m);
            this.f79036n = true;
            this.f79037o = "parser data fail, data is invalid";
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "exception:%s" + e17.getMessage());
            c();
        }
    }

    public JsApiOperateBackgroundAudio$OperateBackgroundAudioTask(android.os.Parcel parcel) {
        v(parcel);
    }
}

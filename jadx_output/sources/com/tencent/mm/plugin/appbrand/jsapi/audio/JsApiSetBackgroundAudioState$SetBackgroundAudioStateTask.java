package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
public class JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask.a();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79075f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79076g;

    /* renamed from: h, reason: collision with root package name */
    public int f79077h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79078i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79079m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f79080n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f79081o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f79082p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f79083q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f79084r = null;

    /* loaded from: classes11.dex */
    public class a implements android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask[] newArray(int i17) {
            return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask[i17];
        }
    }

    public JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79075f = fVar;
        this.f79076g = lVar;
        this.f79077h = i17;
    }

    public java.lang.String B(java.lang.String str) {
        return lp0.b.D() + "/image/" + str.hashCode();
    }

    public int C() {
        return 11;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79078i = parcel.readString();
        this.f79080n = parcel.readString();
        this.f79081o = parcel.readInt() == 1;
        this.f79082p = parcel.readString();
        this.f79079m = parcel.readString();
        this.f79083q = parcel.readString();
        this.f79084r = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79078i);
        parcel.writeString(this.f79080n);
        parcel.writeInt(this.f79081o ? 1 : 0);
        parcel.writeString(this.f79082p);
        parcel.writeString(this.f79079m);
        parcel.writeString(this.f79083q);
        parcel.writeString(this.f79084r);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79076g;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "service is null, don't callback");
            return;
        }
        boolean z17 = this.f79081o;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f79075f;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState fail:%s", this.f79082p);
            lVar.a(this.f79077h, k0Var.o("fail:" + this.f79082p));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
            lVar.a(this.f79077h, k0Var.o("ok"));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f79080n);
            java.lang.String optString = jSONObject.optString("src");
            java.lang.String optString2 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String optString3 = jSONObject.optString("epname");
            java.lang.String optString4 = jSONObject.optString("singer");
            java.lang.String optString5 = jSONObject.optString("coverImgUrl");
            java.lang.String optString6 = jSONObject.optString("webUrl");
            java.lang.String optString7 = jSONObject.optString("protocol");
            double optDouble = jSONObject.optDouble("startTime", 0.0d);
            java.lang.String optString8 = jSONObject.optString("songLyric");
            double optDouble2 = jSONObject.optDouble("playbackRate", 1.0d);
            double optDouble3 = jSONObject.optDouble("volume", 1.0d);
            java.lang.String optString9 = jSONObject.optString("operationType");
            if (!android.text.TextUtils.isEmpty(optString9)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "come from onStickyBannerChanged pause or lifeCycleListener onDestroy");
                java.lang.String str = com.tencent.mm.plugin.appbrand.media.music.f.f85760a.f85761a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(this.f79078i)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f79078i);
                    return;
                }
                this.f79081o = false;
                if (optString9.equalsIgnoreCase("pause")) {
                    if (b21.n.b()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "pause music ok");
                        return;
                    } else {
                        this.f79081o = true;
                        this.f79082p = "pause music fail";
                    }
                } else if (optString9.equalsIgnoreCase("stop")) {
                    if (b21.n.d()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "stop music ok");
                        return;
                    } else {
                        this.f79081o = true;
                        this.f79082p = "stop music fail";
                    }
                }
                c();
                return;
            }
            if (android.text.TextUtils.isEmpty(optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "src is null");
                this.f79081o = true;
                this.f79082p = "src is null";
                c();
                return;
            }
            if (optString8 != null && optString8.length() > 32768) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric is large than 32KB");
                this.f79081o = true;
                this.f79082p = "songLyric is large than 32KB";
                c();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "src;%s, title:%s, epname:%s, singer:%s, coverImgUrl:%s, protocol:%s, webUrl:%s, startTime:%f, localPath:%s, playbackRate:%f", optString, optString2, optString3, optString4, optString5, optString7, optString6, java.lang.Double.valueOf(optDouble), this.f79079m, java.lang.Double.valueOf(optDouble2));
            double d17 = (optDouble2 < 0.5d || optDouble2 > 2.0d) ? 1.0d : optDouble2;
            java.lang.String str2 = optString5 == null ? "" : optString5;
            if (android.text.TextUtils.isEmpty(optString8)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric:%s", optString8);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append((this.f79078i + optString + str2).hashCode());
            b21.r a17 = b21.s.a(C(), str2, optString2, optString4, optString6, optString, optString, sb6.toString(), lp0.b.D(), B(str2), optString3, this.f79078i);
            a17.D = (int) (1000.0d * optDouble);
            a17.F = optString7;
            a17.f17355q = optString8;
            a17.K = d17;
            if (this.f79079m.startsWith("file://")) {
                a17.f17357s = this.f79079m;
            }
            a17.R = this.f79083q;
            a17.S = this.f79084r;
            a17.L = (float) optDouble3;
            com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
            hVar.f85762b = a17.f17346e;
            hVar.f85763c = a17;
            hVar.f85764d = null;
            if (a17.b(b21.m.b()) && b21.m.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "The same music is playing");
                b21.m.k(a17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "play the music");
                b21.m.i(a17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess startPlayMusic");
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
            this.f79081o = false;
            c();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "new json exists exception, data is invalid");
            this.f79081o = true;
            this.f79082p = "parser data fail, data is invalid";
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "exception:%s" + e17.getMessage());
            c();
        }
    }

    public JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask(android.os.Parcel parcel) {
        v(parcel);
    }
}

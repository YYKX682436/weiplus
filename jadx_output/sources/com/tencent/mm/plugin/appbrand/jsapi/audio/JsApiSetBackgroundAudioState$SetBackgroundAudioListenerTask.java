package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.a();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f79062f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79063g;

    /* renamed from: h, reason: collision with root package name */
    public int f79064h;

    /* renamed from: i, reason: collision with root package name */
    public int f79065i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79066m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f79067n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f79068o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f79069p;

    /* renamed from: q, reason: collision with root package name */
    public int f79070q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f79071r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f79072s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f79073t = false;

    /* loaded from: classes7.dex */
    public final class MainProcessMusicPlayerEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> {
        public MainProcessMusicPlayerEventListener() {
            super(com.tencent.mm.app.a0.f53288d);
        }

        @Override // com.tencent.mm.sdk.event.IListener
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "musicPlayerListener callback action : %d", java.lang.Integer.valueOf(musicPlayerEvent.f54512g.f7036b));
            java.util.HashMap hashMap = new java.util.HashMap();
            am.jk jkVar = musicPlayerEvent.f54512g;
            java.lang.String str = jkVar.f7040f;
            int i17 = jkVar.f7036b;
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask = com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.this;
            if (i17 == 10) {
                java.lang.String str2 = jkVar.f7044j;
                if (str2.equals(jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79068o)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "appId is same, don't send ON_PREEMPTED event");
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "send ON_PREEMPTED event, sender appId:%s,  receive appId:%s", str2, jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79068o);
                hashMap.put("state", str);
                jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79069p = new org.json.JSONObject(hashMap).toString();
                jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79070q = jkVar.f7036b;
                jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.c();
                return true;
            }
            b21.r rVar = jkVar.f7037c;
            if (rVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "wrapper is null");
                return false;
            }
            if (!jkVar.f7041g) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "is not from QQMusicPlayer, don't callback!");
                return false;
            }
            if (i17 == 2 && jkVar.f7043i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "isSwitchMusicIng, don't callback!");
                return false;
            }
            java.lang.String str3 = com.tencent.mm.plugin.appbrand.media.music.f.f85760a.f85761a;
            if (!jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79068o.equals(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "appId is not equals preAppId, don't send any event, appId:%s, preAppId:%s", jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79068o, str3);
                return false;
            }
            hashMap.put("src", rVar.f17352n);
            hashMap.put("state", str);
            hashMap.put("errCode", java.lang.Integer.valueOf(jkVar.f7045k));
            hashMap.put("errMsg", !android.text.TextUtils.isEmpty(jkVar.f7046l) ? jkVar.f7046l : "");
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79069p = new org.json.JSONObject(hashMap).toString();
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79070q = jkVar.f7036b;
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.c();
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public class a implements android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask[] newArray(int i17) {
            return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask[i17];
        }
    }

    public JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79063g = lVar;
        this.f79064h = i17;
    }

    public void E(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79068o = parcel.readString();
        this.f79069p = parcel.readString();
        this.f79070q = parcel.readInt();
        this.f79065i = parcel.readInt();
        this.f79066m = parcel.readString();
        this.f79067n = parcel.readString();
        this.f79071r = parcel.readInt() == 1;
        this.f79072s = parcel.readInt();
        this.f79073t = parcel.readByte() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79068o);
        parcel.writeString(this.f79069p);
        parcel.writeInt(this.f79070q);
        parcel.writeInt(this.f79065i);
        parcel.writeString(this.f79066m);
        parcel.writeString(this.f79067n);
        parcel.writeInt(this.f79071r ? 1 : 0);
        parcel.writeInt(this.f79072s);
        parcel.writeByte(this.f79073t ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        if (this.f79063g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "service is null, don't callback");
            return;
        }
        E(this.f79070q);
        int i17 = this.f79070q;
        boolean z17 = true;
        if (i17 == 0 || i17 == 1) {
            com.tencent.mm.plugin.appbrand.x0.a(this.f79068o, this.f79062f);
            com.tencent.mm.plugin.appbrand.media.music.d.f85757c.f85759b = this.f79068o;
        } else if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) {
            com.tencent.mm.plugin.appbrand.x0.e(this.f79068o, this.f79062f);
        } else {
            if (i17 == 13) {
                com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79063g;
                com.tencent.mm.plugin.appbrand.jsapi.audio.m0 m0Var = com.tencent.mm.plugin.appbrand.jsapi.audio.m0.f79249i;
                synchronized (com.tencent.mm.plugin.appbrand.jsapi.audio.m0.class) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioPrev");
                    com.tencent.mm.plugin.appbrand.jsapi.audio.m0 m0Var2 = com.tencent.mm.plugin.appbrand.jsapi.audio.m0.f79249i;
                    m0Var2.p(lVar);
                    m0Var2.m();
                }
                return;
            }
            if (i17 == 14) {
                com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.f79063g;
                com.tencent.mm.plugin.appbrand.jsapi.audio.l0 l0Var = com.tencent.mm.plugin.appbrand.jsapi.audio.l0.f79248i;
                synchronized (com.tencent.mm.plugin.appbrand.jsapi.audio.l0.class) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioNext");
                    com.tencent.mm.plugin.appbrand.jsapi.audio.l0 l0Var2 = com.tencent.mm.plugin.appbrand.jsapi.audio.l0.f79248i;
                    l0Var2.p(lVar2);
                    l0Var2.m();
                }
                return;
            }
        }
        int i18 = this.f79070q;
        if (1 == i18) {
            com.tencent.mm.plugin.appbrand.media.music.d.f85757c.b(i18);
        } else {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInClientProcess callback action:%d, retJson:%s", java.lang.Integer.valueOf(this.f79070q), this.f79069p);
        com.tencent.mm.plugin.appbrand.jsapi.audio.n0 n0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.n0();
        n0Var.p(this.f79063g);
        n0Var.r(this.f79069p);
        n0Var.m();
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.appbrand.media.music.d.f85757c.b(this.f79070q);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInMainProcess");
        if (this.f79073t) {
            com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
            java.lang.String str = this.f79068o;
            int i17 = this.f79072s;
            java.util.HashMap hashMap = hVar.f85769i;
            com.tencent.mm.sdk.event.IListener iListener = (com.tencent.mm.sdk.event.IListener) hashMap.get(str);
            if (iListener == null || i17 != iListener.hashCode()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicPlayerManager", "remove listener for appid: %s, hash: %d", str, java.lang.Integer.valueOf(i17));
            hashMap.remove(str);
            iListener.dead();
            return;
        }
        if (this.f79071r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "send Preempted Event");
            this.f79071r = false;
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
            am.jk jkVar = musicPlayerEvent.f54512g;
            jkVar.f7036b = 10;
            jkVar.f7040f = "preempted";
            jkVar.f7044j = this.f79068o;
            jkVar.f7041g = true;
            musicPlayerEvent.e();
        }
        com.tencent.mm.plugin.appbrand.media.music.h hVar2 = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
        java.lang.String str2 = hVar2.f85761a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "remove listener preAppid is %s, appid is %s", str2, this.f79068o);
            hVar2.d(str2);
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.MainProcessMusicPlayerEventListener mainProcessMusicPlayerEventListener = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.MainProcessMusicPlayerEventListener();
        this.f79072s = mainProcessMusicPlayerEventListener.hashCode();
        hVar2.a(mainProcessMusicPlayerEventListener, this.f79068o);
        java.lang.String str3 = this.f79068o;
        int i18 = this.f79065i;
        java.lang.String str4 = this.f79066m;
        java.lang.String str5 = this.f79067n;
        hVar2.f85761a = str3;
        hVar2.f85766f = i18;
        hVar2.f85767g = str4;
        hVar2.f85768h = str5;
    }

    public JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask(android.os.Parcel parcel) {
        v(parcel);
    }
}

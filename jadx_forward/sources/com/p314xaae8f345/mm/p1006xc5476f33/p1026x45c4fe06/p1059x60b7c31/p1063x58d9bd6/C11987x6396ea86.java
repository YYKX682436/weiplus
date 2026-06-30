package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask */
/* loaded from: classes11.dex */
public class C11987x6396ea86 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86> f33768x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86.a();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160608f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160609g;

    /* renamed from: h, reason: collision with root package name */
    public int f160610h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160611i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160612m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160613n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160614o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160615p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160616q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160617r = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask$a */
    /* loaded from: classes11.dex */
    public class a implements android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86[] newArray(int i17) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86[i17];
        }
    }

    public C11987x6396ea86(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160608f = fVar;
        this.f160609g = lVar;
        this.f160610h = i17;
    }

    public java.lang.String B(java.lang.String str) {
        return lp0.b.D() + "/image/" + str.hashCode();
    }

    public int C() {
        return 11;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160611i = parcel.readString();
        this.f160613n = parcel.readString();
        this.f160614o = parcel.readInt() == 1;
        this.f160615p = parcel.readString();
        this.f160612m = parcel.readString();
        this.f160616q = parcel.readString();
        this.f160617r = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160611i);
        parcel.writeString(this.f160613n);
        parcel.writeInt(this.f160614o ? 1 : 0);
        parcel.writeString(this.f160615p);
        parcel.writeString(this.f160612m);
        parcel.writeString(this.f160616q);
        parcel.writeString(this.f160617r);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160609g;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "service is null, don't callback");
            return;
        }
        boolean z17 = this.f160614o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160608f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState fail:%s", this.f160615p);
            lVar.a(this.f160610h, k0Var.o("fail:" + this.f160615p));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
            lVar.a(this.f160610h, k0Var.o("ok"));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f160613n);
            java.lang.String optString = jSONObject.optString("src");
            java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "come from onStickyBannerChanged pause or lifeCycleListener onDestroy");
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a.f167294a;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(this.f160611i)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f160611i);
                    return;
                }
                this.f160614o = false;
                if (optString9.equalsIgnoreCase("pause")) {
                    if (b21.n.b()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "pause music ok");
                        return;
                    } else {
                        this.f160614o = true;
                        this.f160615p = "pause music fail";
                    }
                } else if (optString9.equalsIgnoreCase("stop")) {
                    if (b21.n.d()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "stop music ok");
                        return;
                    } else {
                        this.f160614o = true;
                        this.f160615p = "stop music fail";
                    }
                }
                c();
                return;
            }
            if (android.text.TextUtils.isEmpty(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "src is null");
                this.f160614o = true;
                this.f160615p = "src is null";
                c();
                return;
            }
            if (optString8 != null && optString8.length() > 32768) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric is large than 32KB");
                this.f160614o = true;
                this.f160615p = "songLyric is large than 32KB";
                c();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "src;%s, title:%s, epname:%s, singer:%s, coverImgUrl:%s, protocol:%s, webUrl:%s, startTime:%f, localPath:%s, playbackRate:%f", optString, optString2, optString3, optString4, optString5, optString7, optString6, java.lang.Double.valueOf(optDouble), this.f160612m, java.lang.Double.valueOf(optDouble2));
            double d17 = (optDouble2 < 0.5d || optDouble2 > 2.0d) ? 1.0d : optDouble2;
            java.lang.String str2 = optString5 == null ? "" : optString5;
            if (android.text.TextUtils.isEmpty(optString8)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric is empty");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric:%s", optString8);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append((this.f160611i + optString + str2).hashCode());
            b21.r a17 = b21.s.a(C(), str2, optString2, optString4, optString6, optString, optString, sb6.toString(), lp0.b.D(), B(str2), optString3, this.f160611i);
            a17.D = (int) (1000.0d * optDouble);
            a17.F = optString7;
            a17.f98888q = optString8;
            a17.K = d17;
            if (this.f160612m.startsWith("file://")) {
                a17.f98890s = this.f160612m;
            }
            a17.R = this.f160616q;
            a17.S = this.f160617r;
            a17.L = (float) optDouble3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a;
            hVar.f167295b = a17.f98879e;
            hVar.f167296c = a17;
            hVar.f167297d = null;
            if (a17.b(b21.m.b()) && b21.m.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "The same music is playing");
                b21.m.k(a17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "play the music");
                b21.m.i(a17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess startPlayMusic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
            this.f160614o = false;
            c();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "new json exists exception, data is invalid");
            this.f160614o = true;
            this.f160615p = "parser data fail, data is invalid";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "exception:%s" + e17.getMessage());
            c();
        }
    }

    public C11987x6396ea86(android.os.Parcel parcel) {
        v(parcel);
    }
}

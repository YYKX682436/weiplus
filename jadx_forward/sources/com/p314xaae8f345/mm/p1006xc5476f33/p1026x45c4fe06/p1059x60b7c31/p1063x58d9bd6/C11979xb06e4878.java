package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask */
/* loaded from: classes11.dex */
public class C11979xb06e4878 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11979xb06e4878> f33763x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.o0();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160564f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160565g;

    /* renamed from: h, reason: collision with root package name */
    public int f160566h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160567i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160568m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160569n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160570o = "";

    public C11979xb06e4878(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160564f = fVar;
        this.f160565g = lVar;
        this.f160566h = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160567i = parcel.readString();
        this.f160568m = parcel.readString();
        this.f160569n = parcel.readInt() == 1;
        this.f160570o = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160567i);
        parcel.writeString(this.f160568m);
        parcel.writeInt(this.f160569n ? 1 : 0);
        parcel.writeString(this.f160570o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160565g;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "service is null, don't callback");
            return;
        }
        boolean z17 = this.f160569n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160564f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio fail:%s", this.f160570o);
            lVar.a(this.f160566h, k0Var.o("fail:" + this.f160570o));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio ok");
            lVar.a(this.f160566h, k0Var.o("ok"));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "runInMainProcess");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a;
        java.lang.String str = hVar.f167294a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(this.f160567i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f160567i);
            this.f160569n = true;
            this.f160570o = "appid not match cannot operate";
            c();
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f160568m);
            java.lang.String optString = jSONObject.optString("operationType");
            double optDouble = jSONObject.optDouble("currentTime", -1.0d);
            if (android.text.TextUtils.isEmpty(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is null");
                this.f160569n = true;
                this.f160570o = "operationType is null";
                c();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType;%s, currentTime:%f", optString, java.lang.Double.valueOf(optDouble));
            this.f160569n = false;
            if (optString.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                b21.r rVar = hVar.f167296c;
                if (rVar == null) {
                    rVar = b21.m.b();
                }
                if (rVar != null) {
                    hVar.f167295b = rVar.f98879e;
                }
                if (b21.n.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "play music ok");
                } else if (b21.m.c()) {
                    this.f160569n = true;
                    this.f160570o = "music is playing, don't play again";
                } else if (rVar == null || !this.f160567i.equals(rVar.f98891t)) {
                    this.f160569n = true;
                    this.f160570o = "play music fail";
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "startPlayMusic play music ok, appId is same!");
                    b21.m.i(rVar);
                }
            } else if (optString.equalsIgnoreCase("pause")) {
                if (b21.n.b()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "pause music ok");
                } else {
                    this.f160569n = true;
                    this.f160570o = "pause music fail";
                }
            } else if (optString.equalsIgnoreCase("seek")) {
                if (optDouble < 0.0d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "currentTime is invalid!");
                    this.f160569n = true;
                    this.f160570o = "currentTime is invalid";
                } else if (b21.m.h((int) (optDouble * 1000.0d))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "seek music ok");
                } else {
                    this.f160569n = true;
                    this.f160570o = "seek music fail";
                }
            } else if (!optString.equalsIgnoreCase("stop")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is invalid");
                this.f160569n = true;
                this.f160570o = "operationType is invalid";
            } else if (b21.n.d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "stop music ok");
            } else {
                this.f160569n = true;
                this.f160570o = "stop music fail";
            }
            if (this.f160569n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", this.f160570o);
            }
            c();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "new json exists exception, data is invalid, jsonStr:%s", this.f160568m);
            this.f160569n = true;
            this.f160570o = "parser data fail, data is invalid";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "exception:%s" + e17.getMessage());
            c();
        }
    }

    public C11979xb06e4878(android.os.Parcel parcel) {
        v(parcel);
    }
}

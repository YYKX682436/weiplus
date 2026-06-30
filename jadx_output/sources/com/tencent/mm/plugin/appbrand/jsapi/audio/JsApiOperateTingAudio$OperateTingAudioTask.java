package com.tencent.mm.plugin.appbrand.jsapi.audio;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 72\u00020\u0001:\u00018B)\b\u0016\u0012\f\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u000102\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b4\u00105B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b4\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0015\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 ¨\u00069"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateTingAudio$OperateTingAudioTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "parcel", org.chromium.base.BaseSwitches.V, "dest", "", "flags", "writeToParcel", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "g", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "G", "()Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "M", "(Lcom/tencent/mm/plugin/appbrand/jsapi/l;)V", "service", "h", "I", "C", "()I", "(I)V", "callbackId", "", "i", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "H", "(Ljava/lang/String;)V", "appId", "m", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "K", "jsonStr", "", "n", "Z", "D", "()Z", "J", "(Z)V", "error", "o", "F", "L", "mErrorMsg", "Lcom/tencent/mm/plugin/appbrand/jsapi/f;", "jsApi", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/f;Lcom/tencent/mm/plugin/appbrand/jsapi/l;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/audio/q1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class JsApiOperateTingAudio$OperateTingAudioTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final com.tencent.mm.plugin.appbrand.jsapi.audio.q1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.q1(null);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79052f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.appbrand.jsapi.l service;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int callbackId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public java.lang.String appId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public java.lang.String jsonStr;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean error;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.lang.String mErrorMsg;

    public JsApiOperateTingAudio$OperateTingAudioTask(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.mErrorMsg = "";
        this.f79052f = fVar;
        this.service = lVar;
        this.callbackId = i17;
    }

    /* renamed from: B, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: C, reason: from getter */
    public final int getCallbackId() {
        return this.callbackId;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    /* renamed from: E, reason: from getter */
    public final java.lang.String getJsonStr() {
        return this.jsonStr;
    }

    /* renamed from: F, reason: from getter */
    public final java.lang.String getMErrorMsg() {
        return this.mErrorMsg;
    }

    /* renamed from: G, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.jsapi.l getService() {
        return this.service;
    }

    public final void H(java.lang.String str) {
        this.appId = str;
    }

    public final void I(int i17) {
        this.callbackId = i17;
    }

    public final void J(boolean z17) {
        this.error = z17;
    }

    public final void K(java.lang.String str) {
        this.jsonStr = str;
    }

    public final void L(java.lang.String str) {
        this.mErrorMsg = str;
    }

    public final void M(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.service = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.appId = parcel.readString();
        this.jsonStr = parcel.readString();
        this.error = parcel.readInt() == 1;
        this.mErrorMsg = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.appId);
        dest.writeString(this.jsonStr);
        dest.writeInt(this.error ? 1 : 0);
        dest.writeString(this.mErrorMsg);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.String str;
        java.lang.String str2;
        if (this.service == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", "service is null, don't callback");
            return;
        }
        boolean z17 = this.error;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f79052f;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", "operateTingAudio fail:%s", this.mErrorMsg);
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.service;
            kotlin.jvm.internal.o.d(lVar);
            int i17 = this.callbackId;
            kotlin.jvm.internal.o.d(k0Var);
            str = android.text.TextUtils.isEmpty(null) ? "fail:" + this.mErrorMsg : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, k0Var.u(str2, jSONObject));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "operateTingAudio ok");
            com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.service;
            kotlin.jvm.internal.o.d(lVar2);
            int i18 = this.callbackId;
            kotlin.jvm.internal.o.d(k0Var);
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar2.a(i18, k0Var.u(str2, jSONObject2));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
        java.lang.String str = hVar.f85761a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "runInMainProcess appId = " + this.appId + "， preAppId = " + str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !kotlin.jvm.internal.o.b(str, this.appId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.appId);
            this.error = true;
            this.mErrorMsg = "appid not match cannot operate";
            c();
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.jsonStr);
            java.lang.String optString = jSONObject.optString("operationType");
            double optDouble = jSONObject.optDouble("currentTime", -1.0d);
            if (android.text.TextUtils.isEmpty(optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", "operationType is null");
                this.error = true;
                this.mErrorMsg = "operationType is null";
                c();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "operateTingAudio operationType:%s, currentTime:%f", optString, java.lang.Double.valueOf(optDouble));
            this.error = false;
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            if (r26.i0.p(optString, com.tencent.tav.core.AssetExtension.SCENE_PLAY, true)) {
                java.lang.Object obj = hVar.f85764d;
                bw5.lp0 lp0Var = obj instanceof bw5.lp0 ? (bw5.lp0) obj : null;
                if (lp0Var == null) {
                    lp0Var = ((rk4.z8) g9Var).uj();
                }
                if (lp0Var != null) {
                    hVar.f85762b = lp0Var.b();
                }
                rk4.z8 z8Var = (rk4.z8) g9Var;
                if (z8Var.wj()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "play music ok");
                } else if (z8Var.fj()) {
                    this.error = true;
                    this.mErrorMsg = "music is playing, don't play again";
                } else if (lp0Var == null || !kotlin.jvm.internal.o.b(this.appId, rk4.j5.a(lp0Var))) {
                    this.error = true;
                    this.mErrorMsg = "play music fail";
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "startPlayMusic play music ok, appId is same!");
                    z8Var.qj("wxa", lp0Var, new il4.e(null, 0, 2601, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null));
                }
                if (!this.error) {
                    pm0.v.X(com.tencent.mm.plugin.appbrand.jsapi.audio.r1.f79272d);
                }
            } else if (r26.i0.p(optString, "pause", true)) {
                ((rk4.z8) g9Var).pj();
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "pause music ok");
            } else if (r26.i0.p(optString, "seek", true)) {
                if (optDouble < 0.0d) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", "currentTime is invalid!");
                    this.error = true;
                    this.mErrorMsg = "currentTime is invalid";
                } else {
                    if (((rk4.z8) g9Var).xj((long) (optDouble * 1000))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "seek music ok");
                    } else {
                        this.error = true;
                        this.mErrorMsg = "seek music fail";
                    }
                }
            } else if (r26.i0.p(optString, "stop", true)) {
                if (((rk4.z8) g9Var).zj()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "stop music ok");
                    pm0.v.X(com.tencent.mm.plugin.appbrand.jsapi.audio.s1.f79277d);
                } else {
                    this.error = true;
                    this.mErrorMsg = "stop music fail";
                }
            } else if (r26.i0.p(optString, "playRate", true)) {
                double optDouble2 = jSONObject.optDouble("playRate");
                if (optDouble2 < 0.5d || optDouble2 > 2.0d) {
                    optDouble2 = 1.0d;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "operateTingAudio updatePlayRate: " + optDouble2);
                ((rk4.z8) g9Var).yj((float) optDouble2);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", "operationType is invalid");
                this.error = true;
                this.mErrorMsg = "operationType is invalid";
            }
            if (this.error) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", this.mErrorMsg);
            }
            c();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", "new json exists exception, data is invalid, jsonStr:%s", this.jsonStr);
            this.error = true;
            this.mErrorMsg = "parser data fail, data is invalid";
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateTingAudio", "exception:%s" + e17.getMessage());
            c();
        }
    }

    public JsApiOperateTingAudio$OperateTingAudioTask(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.mErrorMsg = "";
        v(parcel);
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
class JsApiPausePlayVoice$PausePlayVoice extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.x1();

    private JsApiPausePlayVoice$PausePlayVoice() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.audio.w1(this));
    }
}

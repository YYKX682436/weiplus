package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
class JsApiStopPlayVoice$StopPlayVoice extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.g3();

    private JsApiStopPlayVoice$StopPlayVoice() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.audio.f3(this));
    }
}

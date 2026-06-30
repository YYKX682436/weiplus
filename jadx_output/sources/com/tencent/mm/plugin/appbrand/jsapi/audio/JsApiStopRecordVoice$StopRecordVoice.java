package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
class JsApiStopRecordVoice$StopRecordVoice extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice$StopRecordVoice> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.k3();

    private JsApiStopRecordVoice$StopRecordVoice() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.audio.j3(this));
    }
}

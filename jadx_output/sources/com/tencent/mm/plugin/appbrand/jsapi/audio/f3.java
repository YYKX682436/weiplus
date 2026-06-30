package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes8.dex */
public class f3 implements java.lang.Runnable {
    public f3(com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice jsApiStopPlayVoice$StopPlayVoice) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtPlayerEvent extPlayerEvent = new com.tencent.mm.autogen.events.ExtPlayerEvent();
        extPlayerEvent.f54204g.f7324a = 2;
        extPlayerEvent.e();
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes12.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice f79284d;

    public t2(com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice jsApiStartPlayVoice$StartPlayVoice) {
        this.f79284d = jsApiStartPlayVoice$StartPlayVoice;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f79284d.f79117m;
        com.tencent.mm.plugin.appbrand.jsapi.audio.r2 r2Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.r2(this);
        com.tencent.mm.plugin.appbrand.jsapi.audio.s2 s2Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.s2(this);
        com.tencent.mm.autogen.events.ExtPlayerEvent extPlayerEvent = new com.tencent.mm.autogen.events.ExtPlayerEvent();
        am.m8 m8Var = extPlayerEvent.f54204g;
        m8Var.f7324a = 1;
        m8Var.f7325b = str;
        m8Var.f7326c = true;
        m8Var.f7327d = true;
        m8Var.f7328e = r2Var;
        m8Var.f7329f = s2Var;
        extPlayerEvent.e();
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes12.dex */
public class r2 implements com.tencent.mm.modelbase.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.t2 f79273d;

    public r2(com.tencent.mm.plugin.appbrand.jsapi.audio.t2 t2Var) {
        this.f79273d = t2Var;
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice jsApiStartPlayVoice$StartPlayVoice = this.f79273d.f79284d;
        jsApiStartPlayVoice$StartPlayVoice.f79118n = false;
        jsApiStartPlayVoice$StartPlayVoice.c();
    }
}

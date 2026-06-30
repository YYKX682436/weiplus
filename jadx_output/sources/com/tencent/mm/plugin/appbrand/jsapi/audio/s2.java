package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes12.dex */
public class s2 implements com.tencent.mm.modelbase.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.t2 f79278d;

    public s2(com.tencent.mm.plugin.appbrand.jsapi.audio.t2 t2Var) {
        this.f79278d = t2Var;
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice jsApiStartPlayVoice$StartPlayVoice = this.f79278d.f79284d;
        jsApiStartPlayVoice$StartPlayVoice.f79118n = true;
        jsApiStartPlayVoice$StartPlayVoice.c();
    }
}

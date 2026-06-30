package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class p2 implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f79265d;

    public p2(com.tencent.mm.plugin.appbrand.jsapi.audio.v2 v2Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f79265d = v5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.jsapi.audio.v2.f79291h)) {
            new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice().d();
            com.tencent.mm.plugin.appbrand.jsapi.audio.v2.f79291h = null;
        }
        this.f79265d.O(this);
    }
}

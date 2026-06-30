package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class k3 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81889d;

    public k3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f81889d = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia, onResume, remove listener");
        com.tencent.mm.plugin.appbrand.jsapi.media.z3.f82166h = false;
        com.tencent.mm.plugin.appbrand.x0.e(this.f81889d.getAppId(), this);
    }
}

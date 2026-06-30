package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class q2 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f79267d;

    public q2(com.tencent.mm.plugin.appbrand.jsapi.audio.v2 v2Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f79267d = v5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.appbrand.jsapi.audio.v2.f79291h)) {
            new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice().d();
            com.tencent.mm.plugin.appbrand.jsapi.audio.v2.f79291h = null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f79267d;
        v5Var.K(this);
        c01.l2 e17 = c01.n2.d().e("JsApi@" + v5Var.hashCode());
        if (e17 != null) {
            e17.h();
        }
    }
}

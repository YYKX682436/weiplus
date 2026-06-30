package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.plugin.appbrand.jsruntime.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j f88736d;

    public p(com.tencent.mm.plugin.appbrand.service.j jVar) {
        this.f88736d = jVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.service.j jVar = this.f88736d;
        com.tencent.mm.mnxnet.WeXNetJSBinding weXNetJSBinding = jVar.K;
        if (weXNetJSBinding != null) {
            weXNetJSBinding.destroy();
        }
        jVar.K = null;
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public final class s extends com.tencent.mm.plugin.appbrand.jsapi.advertise.r {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.advertise.r
    public void C(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.advertise.r
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.advertise.r
    public void F(com.tencent.mm.plugin.appbrand.jsapi.l service, android.content.Intent intent, int i17) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(intent, "intent");
        j45.l.j(service.getContext(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
        service.a(i17, o("ok"));
    }
}

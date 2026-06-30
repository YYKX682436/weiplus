package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.page.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a f86456a;

    public c(com.tencent.mm.plugin.appbrand.page.a aVar) {
        this.f86456a = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.gb
    public void a(com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView appBrandPageFullScreenView) {
        com.tencent.mm.plugin.appbrand.page.a aVar = this.f86456a;
        if (((com.tencent.luggage.sdk.jsapi.component.b) aVar.F()).w1() == null) {
            com.tencent.mars.xlog.Log.e("Luggage.AbstractMPPageViewRenderer", "FullScreenViewAttach getContainerPage is null, check time sequence, err, appId[%s], url[%s]", aVar.H(), aVar.f86375m);
        } else {
            ((com.tencent.luggage.sdk.jsapi.component.b) aVar.F()).w1().i((com.tencent.mm.plugin.appbrand.page.v5) aVar.F(), appBrandPageFullScreenView);
        }
    }
}

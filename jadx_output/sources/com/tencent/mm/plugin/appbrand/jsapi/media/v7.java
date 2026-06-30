package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f82109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(yz5.a aVar) {
        super(0);
        this.f82109d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f82109d.invoke();
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAudioFocusComponent", "runtimeProvider, hostComponent is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 V0 = lVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) lVar : lVar instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) lVar).V0() : null;
        if (V0 != null) {
            return V0.getRuntime();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAudioFocusComponent", "runtimeProvider, pageView is null");
        return null;
    }
}

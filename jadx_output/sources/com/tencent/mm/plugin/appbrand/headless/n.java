package com.tencent.mm.plugin.appbrand.headless;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/n;", "Lcom/tencent/mm/plugin/appbrand/page/n7;", "Lcom/tencent/mm/plugin/appbrand/headless/m;", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, "<init>", "(Lcom/tencent/mm/plugin/appbrand/headless/m;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class n extends com.tencent.mm.plugin.appbrand.page.n7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.appbrand.headless.m page) {
        super(com.tencent.mm.plugin.appbrand.headless.o.class);
        kotlin.jvm.internal.o.g(page, "page");
        com.tencent.mm.plugin.appbrand.page.ud decorWidgetFactory = page.getPageContainer().getDecorWidgetFactory();
        this.X = decorWidgetFactory == null ? new com.tencent.mm.plugin.appbrand.page.td() : decorWidgetFactory;
        this.W = page;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }
}

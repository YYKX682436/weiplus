package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class m extends com.tencent.mm.plugin.appbrand.page.s8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, com.tencent.mm.plugin.appbrand.page.i3 pageContainer) {
        super(context, pageContainer);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageContainer, "pageContainer");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.s8, com.tencent.mm.plugin.appbrand.page.w2
    public void C(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HeadlessPage", "loadUrl appId:" + getAppId() + " url:" + str + ", type:" + wdVar);
        super.C(j17, str, wdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.s8, com.tencent.mm.plugin.appbrand.page.w2
    public android.view.View p() {
        com.tencent.mm.plugin.appbrand.headless.n nVar = new com.tencent.mm.plugin.appbrand.headless.n(this);
        nVar.s2();
        nVar.f2(getContext(), getRuntime());
        nVar.W = this;
        java.lang.String currentUrl = getCurrentUrl();
        nVar.D = nf.z.a(currentUrl);
        nVar.E = currentUrl;
        this.W = nVar;
        android.view.View contentView = nVar.getContentView();
        kotlin.jvm.internal.o.d(contentView);
        return contentView;
    }
}

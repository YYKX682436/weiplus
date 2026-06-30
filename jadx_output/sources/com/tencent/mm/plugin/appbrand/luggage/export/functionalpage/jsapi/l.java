package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.m f85617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.m mVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, java.lang.String str) {
        super(1);
        this.f85617d = mVar;
        this.f85618e = wechatNativeExtraDataInvokeFunctionalPage;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity it = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.k(this.f85617d, this.f85618e, it));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://jiazhang.qq.com/wap/family/dist/main/index.html?_wv=1&source=h5_wx_sdk#/Index");
        intent.putExtra("forceHideShare", true);
        j45.l.o(it, "webview", ".ui.tools.WebViewUI", intent, cf.b.a(it), true);
        it.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        return jz5.f0.f302826a;
    }
}

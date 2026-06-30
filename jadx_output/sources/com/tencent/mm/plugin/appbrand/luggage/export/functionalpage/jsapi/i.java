package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.j f85611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.WxaExposedParams f85613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.j jVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams) {
        super(1);
        this.f85611d = jVar;
        this.f85612e = wechatNativeExtraDataInvokeFunctionalPage;
        this.f85613f = wxaExposedParams;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity it = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.h(this.f85611d, this.f85612e, it));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, it.getString(com.tencent.mm.R.string.f490254ph));
        intent.putExtra("rawUrl", com.tencent.mm.plugin.appbrand.v9.a(this.f85613f));
        intent.putExtra("forceHideShare", true);
        j45.l.o(it, "webview", ".ui.tools.WebViewUI", intent, cf.b.a(it), true);
        it.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        return jz5.f0.f302826a;
    }
}

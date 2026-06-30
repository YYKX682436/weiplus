package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.g f85601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f85603f;

    public e(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.g gVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f85601d = gVar;
        this.f85602e = wechatNativeExtraDataInvokeFunctionalPage;
        this.f85603f = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b.a(this.f85601d, this.f85602e, this.f85603f, null, 4, null);
        this.f85603f.finish();
    }
}

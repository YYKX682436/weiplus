package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class k implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.m f85614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f85616f;

    public k(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.m mVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f85614d = mVar;
        this.f85615e = wechatNativeExtraDataInvokeFunctionalPage;
        this.f85616f = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b.a(this.f85614d, this.f85615e, this.f85616f, null, 4, null);
        this.f85616f.finish();
    }
}

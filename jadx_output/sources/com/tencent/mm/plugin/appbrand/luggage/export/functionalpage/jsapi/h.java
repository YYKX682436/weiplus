package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.j f85608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f85610f;

    public h(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.j jVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f85608d = jVar;
        this.f85609e = wechatNativeExtraDataInvokeFunctionalPage;
        this.f85610f = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b.a(this.f85608d, this.f85609e, this.f85610f, null, 4, null);
        this.f85610f.finish();
    }
}

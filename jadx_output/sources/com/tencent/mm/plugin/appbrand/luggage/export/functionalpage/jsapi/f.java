package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f85605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.g f85606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, l81.b1 b1Var, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.g gVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage) {
        super(1);
        this.f85604d = str;
        this.f85605e = b1Var;
        this.f85606f = gVar;
        this.f85607g = wechatNativeExtraDataInvokeFunctionalPage;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity it = (com.tencent.mm.ui.MMActivity) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.g gVar = this.f85606f;
        it.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.e(gVar, this.f85607g, it));
        java.lang.String str = this.f85604d;
        java.lang.String str2 = this.f85605e.f317041s.f77323e;
        k91.z5 z5Var = new k91.z5();
        z5Var.f305866d = str;
        com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.U6(it, str, 9, 1236, str2, false, z5Var.a(), null, null, cf.b.a(gVar));
        it.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        return jz5.f0.f302826a;
    }
}

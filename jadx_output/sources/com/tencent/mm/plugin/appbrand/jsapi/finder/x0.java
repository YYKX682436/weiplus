package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopTask f81229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult f81231g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopTask jsApiShareFinderShop$ShareFinderShopTask, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult jsApiShareFinderShop$ShareFinderShopResult, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f81229e = jsApiShareFinderShop$ShareFinderShopTask;
        this.f81230f = str;
        this.f81231g = jsApiShareFinderShop$ShareFinderShopResult;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.x0(this.f81229e, this.f81230f, this.f81231g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.finder.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activityContext;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f81228d;
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopTask jsApiShareFinderShop$ShareFinderShopTask = this.f81229e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            activityContext = jsApiShareFinderShop$ShareFinderShopTask.getActivityContext();
            kotlin.jvm.internal.o.f(activityContext, "access$getActivityContext(...)");
            this.f81228d = 1;
            ((c61.l7) b6Var).getClass();
            obj = com.tencent.mm.plugin.finder.assist.n7.f102406a.v(activityContext, this.f81230f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult jsApiShareFinderShop$ShareFinderShopResult = this.f81231g;
        jsApiShareFinderShop$ShareFinderShopResult.f81181d = (java.lang.String) obj;
        jsApiShareFinderShop$ShareFinderShopTask.finishProcess(jsApiShareFinderShop$ShareFinderShopResult);
        return jz5.f0.f302826a;
    }
}

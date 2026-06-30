package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f88508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.n1 f88509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f88510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.appbrand.screenshot.n1 n1Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88509e = n1Var;
        this.f88510f = appBrandRuntime;
        this.f88511g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.screenshot.l1(this.f88509e, this.f88510f, this.f88511g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.screenshot.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f88508d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f88508d = 1;
            obj = com.tencent.mm.plugin.appbrand.screenshot.n1.c(this.f88509e, this.f88510f, this.f88511g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo appBrandScreenshotInfo = (com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (appBrandScreenshotInfo == null) {
            return f0Var;
        }
        uk0.a.c(appBrandScreenshotInfo, com.tencent.mm.plugin.appbrand.screenshot.k1.f88504d, null, 4, null);
        return f0Var;
    }
}

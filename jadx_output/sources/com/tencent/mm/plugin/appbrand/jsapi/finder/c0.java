package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask f81191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f81192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask, r45.br2 br2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f81191e = jsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask;
        this.f81192f = br2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.c0(this.f81191e, this.f81192f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.finder.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activityContext;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f81190d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.b6 b6Var = (zy2.b6) c17;
            activityContext = this.f81191e.getActivityContext();
            kotlin.jvm.internal.o.f(activityContext, "access$getActivityContext(...)");
            r45.br2 br2Var = this.f81192f;
            this.f81190d = 1;
            if (zy2.b6.b9(b6Var, activityContext, br2Var, null, null, false, false, this, 60, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

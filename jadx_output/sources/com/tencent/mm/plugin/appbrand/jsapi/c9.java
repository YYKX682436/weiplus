package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class c9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f80161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.e9 f80162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f80163f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.plugin.appbrand.jsapi.e9 e9Var, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80162e = e9Var;
        this.f80163f = recordConfigProvider;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.c9(this.f80162e, this.f80163f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.c9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activityContext;
        boolean isProcessTerminated;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f80161d;
        com.tencent.mm.plugin.appbrand.jsapi.e9 e9Var = this.f80162e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ut3.f.f431176c.f431177a = new com.tencent.mm.plugin.appbrand.jsapi.b9(e9Var);
            qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
            activityContext = e9Var.getActivityContext();
            kotlin.jvm.internal.o.f(activityContext, "access$getActivityContext(...)");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider = this.f80163f;
            kotlin.jvm.internal.o.f(provider, "$provider");
            this.f80161d = 1;
            if (((pc0.e2) c1Var).wi(activityContext, provider, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        isProcessTerminated = e9Var.isProcessTerminated();
        if (!isProcessTerminated) {
            e9Var.finishProcess(e9Var.getMResult());
        }
        return jz5.f0.f302826a;
    }
}

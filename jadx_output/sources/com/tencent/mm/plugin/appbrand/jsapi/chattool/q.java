package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80435d;

    /* renamed from: e, reason: collision with root package name */
    public int f80436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f80437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.t f80438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80437f = c0Var;
        this.f80438g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chattool.q(this.f80437f, this.f80438g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chattool.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f80436e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.c0 c0Var2 = this.f80437f;
            this.f80435d = c0Var2;
            this.f80436e = 1;
            java.lang.Object j17 = this.f80438g.j(false, this);
            if (j17 == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            obj = j17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f80435d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c0Var.f310112d = obj != null;
        return jz5.f0.f302826a;
    }
}

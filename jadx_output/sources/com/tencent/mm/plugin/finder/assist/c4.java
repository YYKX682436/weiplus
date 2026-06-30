package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes5.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f102054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f102055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.t f102056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f102057h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(java.lang.StringBuilder sb6, kotlin.jvm.internal.f0 f0Var, zy2.t tVar, java.lang.Integer num, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f102054e = sb6;
        this.f102055f = f0Var;
        this.f102056g = tVar;
        this.f102057h = num;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.assist.c4(this.f102054e, this.f102055f, this.f102056g, this.f102057h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.assist.c4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f102053d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.assist.b4 b4Var = new com.tencent.mm.plugin.finder.assist.b4(this.f102054e, this.f102055f, this.f102056g, this.f102057h, null);
            this.f102053d = 1;
            if (kotlinx.coroutines.l.g(g3Var, b4Var, this) == aVar) {
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

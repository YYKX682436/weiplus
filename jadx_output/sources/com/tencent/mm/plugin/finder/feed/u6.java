package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u6 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f109140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f109141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f109142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(com.tencent.mm.plugin.finder.feed.a7 a7Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f109141e = a7Var;
        this.f109142f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.u6(this.f109141e, this.f109142f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((com.tencent.mm.plugin.finder.feed.u6) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f109140d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.feed.t6 t6Var = new com.tencent.mm.plugin.finder.feed.t6(this.f109141e, this.f109142f, null);
            this.f109140d = 1;
            obj = kotlinx.coroutines.l.g(g3Var, t6Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

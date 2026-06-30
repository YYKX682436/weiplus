package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class n7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108211d = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.model.n7(this.f108211d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.model.n7 n7Var = (com.tencent.mm.plugin.finder.feed.model.n7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.model.s7 s7Var = new com.tencent.mm.plugin.finder.feed.model.s7(4, -1, "");
        s7Var.setPullType(2);
        this.f108211d.onFetchDone(s7Var);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class o7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f108227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx3.j f108228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(java.util.List list, rx3.j jVar, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108227d = list;
        this.f108228e = jVar;
        this.f108229f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.model.o7(this.f108227d, this.f108228e, this.f108229f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.model.o7 o7Var = (com.tencent.mm.plugin.finder.feed.model.o7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.model.s7 s7Var = new com.tencent.mm.plugin.finder.feed.model.s7(0, 0, "");
        s7Var.setIncrementList(this.f108227d);
        s7Var.setHasMore(this.f108228e.f401034b);
        s7Var.setPullType(2);
        this.f108229f.onFetchDone(s7Var);
        return jz5.f0.f302826a;
    }
}

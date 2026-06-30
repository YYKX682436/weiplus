package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f107119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(so2.u1 u1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f107119d = u1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.jl(this.f107119d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.jl jlVar = (com.tencent.mm.plugin.finder.feed.jl) create((r45.av2) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jlVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete see later success:");
        so2.u1 u1Var = this.f107119d;
        sb6.append(u1Var.getItemId());
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", sb6.toString());
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.il(u1Var));
        return jz5.f0.f302826a;
    }
}

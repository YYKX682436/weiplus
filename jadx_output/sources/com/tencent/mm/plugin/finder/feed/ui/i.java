package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent f110133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent finderAccountManagent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110133d = finderAccountManagent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.i(this.f110133d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.i iVar = (com.tencent.mm.plugin.finder.feed.ui.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.ui.f fVar = com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent.f109198g;
        this.f110133d.V6(true);
        return jz5.f0.f302826a;
    }
}

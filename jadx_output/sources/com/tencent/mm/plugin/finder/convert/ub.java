package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ub extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f104694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f104695e = qeVar;
        this.f104696f = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.ub(this.f104695e, this.f104696f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.ub) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f104694d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f104694d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f104695e.f104357J;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (finderLinearLayoutManager == null) {
            return f0Var;
        }
        finderLinearLayoutManager.W(this.f104696f.getAdapterPosition());
        return f0Var;
    }
}

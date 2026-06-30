package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class r8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f108298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108299e = finderTimelineFeedLoader;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.model.r8(this.f108299e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.model.r8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f108298d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f108298d = 1;
            if (kotlinx.coroutines.g4.a(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.ref.WeakReference weakReference = this.f108299e.f107654m;
        java.lang.Object layoutManager = (weakReference == null || (recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference.get()) == null) ? null : recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (finderLinearLayoutManager == null) {
            return f0Var;
        }
        finderLinearLayoutManager.W(finderLinearLayoutManager.y());
        return f0Var;
    }
}

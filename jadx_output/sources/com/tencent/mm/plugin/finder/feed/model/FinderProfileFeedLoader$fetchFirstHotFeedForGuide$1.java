package com.tencent.mm.plugin.finder.feed.model;

@qz5.f(c = "com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1", f = "FinderProfileFeedLoader.kt", l = {}, m = "invokeSuspend")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1 extends qz5.l implements yz5.p {
    final /* synthetic */ yz5.l $callback;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1(com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader, yz5.l lVar, kotlin.coroutines.Continuation<? super com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1> continuation) {
        super(2, continuation);
        this.this$0 = finderProfileFeedLoader;
        this.$callback = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation<jz5.f0> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1 finderProfileFeedLoader$fetchFirstHotFeedForGuide$1 = new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1(this.this$0, this.$callback, continuation);
        finderProfileFeedLoader$fetchFirstHotFeedForGuide$1.L$0 = obj;
        return finderProfileFeedLoader$fetchFirstHotFeedForGuide$1;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        bs2.b0 b0Var;
        db2.c3 c3Var;
        java.util.LinkedList list;
        java.util.List list2 = kz5.p0.f313996d;
        pz5.a aVar = pz5.a.f359186d;
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) a17).R6(4);
            java.util.List S0 = (R6 == null || (b0Var = R6.f23925s) == null || (c3Var = b0Var.f23806b) == null || (list = c3Var.getList(1)) == null) ? list2 : kz5.n0.S0(list);
            com.tencent.mars.xlog.Log.i(this.this$0.getF123427d(), "fetchFirstHotFeedForGuide: cached feeds size=" + S0.size());
            list2 = this.this$0.buildProfilePrefetchBackupItems(S0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.this$0.getF123427d(), th6, "fetchFirstHotFeedForGuide build backup error", new java.lang.Object[0]);
        }
        this.this$0.runProfileFinderStreamCgi(list2, this.$callback);
        return jz5.f0.f302826a;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation<? super jz5.f0> continuation) {
        return ((com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$fetchFirstHotFeedForGuide$1) create(y0Var, continuation)).invokeSuspend(jz5.f0.f302826a);
    }
}

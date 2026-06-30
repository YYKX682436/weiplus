package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class x9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f110727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f110728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI) {
        super(2, continuation);
        this.f110727d = hVar;
        this.f110728e = finderLiveHistoryUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.x9(this.f110727d, continuation, this.f110728e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.x9 x9Var = (com.tencent.mm.plugin.finder.feed.ui.x9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.t61 t61Var = (r45.t61) ((xg2.i) this.f110727d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadMoreData success total_count=");
        sb6.append(t61Var.getInteger(6));
        sb6.append(" live_info.size=");
        java.util.LinkedList list = t61Var.getList(1);
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        sb6.append(" continue_flag=");
        sb6.append(t61Var.getInteger(3));
        com.tencent.mars.xlog.Log.i("FinderLiveHistoryUI", sb6.toString());
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI = this.f110728e;
        java.util.List list2 = finderLiveHistoryUI.f109375y;
        java.util.LinkedList list3 = t61Var.getList(1);
        kotlin.jvm.internal.o.f(list3, "getLive_info(...)");
        ((java.util.ArrayList) list2).addAll(list3);
        com.tencent.mm.plugin.finder.feed.ui.v9 v9Var = finderLiveHistoryUI.B;
        if (v9Var != null) {
            v9Var.notifyItemRangeInserted(((java.util.ArrayList) finderLiveHistoryUI.f109375y).size() - t61Var.getList(1).size(), t61Var.getList(1).size());
        }
        finderLiveHistoryUI.f109374x = t61Var.getByteString(2);
        if (t61Var.getInteger(3) == 1) {
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = finderLiveHistoryUI.f109376z;
            if (finderRefreshLayout != null) {
                finderRefreshLayout.e(true);
            }
        } else {
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout2 = finderLiveHistoryUI.f109376z;
            if (finderRefreshLayout2 != null) {
                finderRefreshLayout2.f();
            }
        }
        return jz5.f0.f302826a;
    }
}

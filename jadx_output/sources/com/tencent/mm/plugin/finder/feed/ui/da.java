package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class da extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f109938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f109939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI) {
        super(2, continuation);
        this.f109938d = hVar;
        this.f109939e = finderLiveHistoryUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.da(this.f109938d, continuation, this.f109939e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.da daVar = (com.tencent.mm.plugin.finder.feed.ui.da) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        daVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.t61 t61Var = (r45.t61) ((xg2.i) this.f109938d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#refreshData success total_count=");
        sb6.append(t61Var.getInteger(6));
        sb6.append(" live_info.size=");
        java.util.LinkedList list = t61Var.getList(1);
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        sb6.append(" continue_flag=");
        sb6.append(t61Var.getInteger(3));
        com.tencent.mars.xlog.Log.i("FinderLiveHistoryUI", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI = this.f109939e;
        sb7.append(finderLiveHistoryUI.getResources().getString(com.tencent.mm.R.string.e_s));
        sb7.append('(');
        sb7.append(t61Var.getInteger(6));
        sb7.append(')');
        finderLiveHistoryUI.setMMTitle(sb7.toString());
        ((java.util.ArrayList) finderLiveHistoryUI.f109375y).clear();
        java.util.List list2 = finderLiveHistoryUI.f109375y;
        java.util.LinkedList list3 = t61Var.getList(1);
        kotlin.jvm.internal.o.f(list3, "getLive_info(...)");
        ((java.util.ArrayList) list2).addAll(list3);
        finderLiveHistoryUI.f109374x = t61Var.getByteString(2);
        com.tencent.mm.plugin.finder.feed.ui.v9 v9Var = finderLiveHistoryUI.B;
        if (v9Var != null) {
            v9Var.notifyDataSetChanged();
        }
        if (t61Var.getInteger(3) == 1) {
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = finderLiveHistoryUI.f109376z;
            if (finderRefreshLayout != null) {
                finderRefreshLayout.i(true);
            }
        } else {
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout2 = finderLiveHistoryUI.f109376z;
            if (finderRefreshLayout2 != null) {
                finderRefreshLayout2.k();
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.dj f106393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(com.tencent.mm.plugin.finder.feed.dj djVar) {
        super(1);
        this.f106393d = djVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.finder.feed.dj djVar = this.f106393d;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = djVar.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView");
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.k3 p07 = finderRecyclerView.p0(((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w());
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        android.view.View view = p07 != null ? p07.itemView : null;
        if (((com.tencent.mm.feature.finder.live.v4) w0Var).kk(view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null)) {
            s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
            android.view.KeyEvent.Callback callback = p07 != null ? p07.itemView : null;
            boolean Jk = ((com.tencent.mm.feature.finder.live.v4) w0Var2).Jk(ev6, callback instanceof android.view.ViewGroup ? (android.view.ViewGroup) callback : null);
            if ((ev6.getAction() == 0 && Jk) || djVar.f106573w) {
                int action = ev6.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            finderRecyclerView.requestDisallowInterceptTouchEvent(Jk);
                        } else if (action != 3) {
                            finderRecyclerView.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    finderRecyclerView.requestDisallowInterceptTouchEvent(false);
                    djVar.f106573w = false;
                } else {
                    djVar.f106573w = true;
                    finderRecyclerView.requestDisallowInterceptTouchEvent(true);
                }
            } else {
                finderRecyclerView.requestDisallowInterceptTouchEvent(false);
            }
        }
        return java.lang.Boolean.FALSE;
    }
}

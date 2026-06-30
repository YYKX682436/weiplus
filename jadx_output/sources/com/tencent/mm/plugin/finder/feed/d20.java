package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class d20 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f106537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.j20 f106538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.finder.feed.j20 j20Var) {
        super(1);
        this.f106537d = mMActivity;
        this.f106538e = j20Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.ui.MMActivity activity = this.f106537d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) ((nr2.l) pf5.z.f353948a.a(activity).a(nr2.l.class)).P6().findViewById(com.tencent.mm.R.id.l3n);
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) (appBarLayout != null ? appBarLayout.getLayoutParams() : null);
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = (com.google.android.material.appbar.AppBarLayout.Behavior) (cVar != null ? cVar.f11006a : null);
        com.tencent.mm.plugin.finder.feed.j20 j20Var = this.f106538e;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = j20Var.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView");
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = j20Var.f106570t;
        boolean z17 = baseFeedLoader != null && (baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader) && linearLayoutManager.t() != -1 && (baseFeedLoader.getDataListJustForAdapter().get(linearLayoutManager.t()) instanceof nr2.a);
        if ((ev6.getAction() == 0 && z17) || j20Var.f107072J) {
            float y17 = ev6.getY() - j20Var.K;
            j20Var.K = ev6.getY();
            int action = ev6.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            finderRecyclerView.requestDisallowInterceptTouchEvent(false);
                        }
                    } else if (y17 < 0.0f) {
                        finderRecyclerView.requestDisallowInterceptTouchEvent(true);
                    } else {
                        if ((behavior != null ? behavior.y() : 0) < 0) {
                            finderRecyclerView.requestDisallowInterceptTouchEvent(true);
                        } else {
                            finderRecyclerView.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
                finderRecyclerView.requestDisallowInterceptTouchEvent(false);
                finderRecyclerView.f1();
                finderRecyclerView.post(new com.tencent.mm.plugin.finder.feed.c20(finderRecyclerView, linearLayoutManager));
                j20Var.f107072J = false;
            } else {
                j20Var.f107072J = true;
                finderRecyclerView.requestDisallowInterceptTouchEvent(true);
            }
        } else {
            finderRecyclerView.requestDisallowInterceptTouchEvent(false);
        }
        return java.lang.Boolean.FALSE;
    }
}

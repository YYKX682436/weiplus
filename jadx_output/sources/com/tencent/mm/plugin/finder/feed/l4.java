package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class l4 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107274d;

    public l4(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f107274d = a7Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int intValue;
        int intValue2;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f107274d;
        a7Var.getClass();
        if (intent == null || i18 != 0) {
            yw2.a0 a0Var = a7Var.f106216o;
            if (a0Var != null) {
                a0Var.t();
                return;
            }
            return;
        }
        long j17 = 0;
        long longExtra = intent.getLongExtra("lastSentCommentIdKey", 0L);
        long longExtra2 = intent.getLongExtra("lastSentCommentRootIdKey", 0L);
        long longExtra3 = intent.getLongExtra("lastViewedCommentIdKey", 0L);
        a7Var.f106213l1 = longExtra3;
        com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
        if (longExtra3 != 0) {
            if (longExtra3 != 0) {
                yw2.a0 a0Var2 = a7Var.f106216o;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a0Var2 == null || (recyclerView = a0Var2.k().getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                java.lang.Integer valueOf = linearLayoutManager != null ? java.lang.Integer.valueOf(linearLayoutManager.w()) : null;
                java.lang.Integer valueOf2 = linearLayoutManager != null ? java.lang.Integer.valueOf(linearLayoutManager.y()) : null;
                if (valueOf != null && valueOf2 != null && valueOf.intValue() <= valueOf2.intValue() && kz5.c0.g(yVar.f108469d).m(valueOf.intValue())) {
                    java.util.ArrayList arrayList = yVar.f108469d;
                    if (kz5.c0.g(arrayList).m(valueOf2.intValue()) && (intValue = valueOf.intValue()) <= (intValue2 = valueOf2.intValue())) {
                        while (true) {
                            so2.y0 y0Var = (so2.y0) kz5.n0.a0(arrayList, intValue);
                            if (!(y0Var != null && y0Var.getItemId() == longExtra3)) {
                                if (intValue == intValue2) {
                                    break;
                                } else {
                                    intValue++;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                yw2.a0 a0Var3 = a7Var.f106216o;
                if (a0Var3 != null) {
                    com.tencent.mm.plugin.finder.feed.u6 u6Var = new com.tencent.mm.plugin.finder.feed.u6(a7Var, longExtra3, null);
                    com.tencent.mm.plugin.finder.feed.x6 x6Var = new com.tencent.mm.plugin.finder.feed.x6(a7Var, longExtra3);
                    if (a0Var3.D == null) {
                        android.view.ViewParent parent = a0Var3.s().getParent();
                        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout ? (androidx.coordinatorlayout.widget.CoordinatorLayout) parent : null;
                        if (coordinatorLayout == null) {
                            com.tencent.mars.xlog.Log.e("Finder.TimelineDrawerBuilder", "父布局不是CoordinatorLayout，无法插入定位标！！");
                        } else {
                            com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = new com.tencent.mm.plugin.finder.view.FinderJumpAnchorView(a0Var3.l());
                            coordinatorLayout.addView(finderJumpAnchorView);
                            android.view.ViewGroup.LayoutParams layoutParams = finderJumpAnchorView.getLayoutParams();
                            androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
                            if (cVar != null) {
                                cVar.f11008c = 85;
                            }
                            com.tencent.mm.ui.kk.d(finderJumpAnchorView, (int) a0Var3.l().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
                            java.lang.String string = a0Var3.l().getString(com.tencent.mm.R.string.nk7);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            finderJumpAnchorView.setTitle(string);
                            finderJumpAnchorView.setOnClickListener(new yw2.x(a0Var3, x6Var));
                            com.tencent.mm.plugin.finder.view.FinderJumpAnchorView.c(finderJumpAnchorView, null, 1, null);
                            kotlinx.coroutines.y0 a17 = v65.m.a(coordinatorLayout);
                            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                            kotlinx.coroutines.l.d(a17, kotlinx.coroutines.internal.b0.f310484a, null, new yw2.y(u6Var, a0Var3, finderJumpAnchorView, null), 2, null);
                            a0Var3.D = finderJumpAnchorView;
                        }
                    }
                }
            }
            if (longExtra != j17 || longExtra2 == j17) {
            }
            int e17 = yVar.e(longExtra);
            if (e17 == -1) {
                a7Var.w0(longExtra);
                return;
            } else if (yVar.e(longExtra2) == -1) {
                a7Var.w0(longExtra);
                return;
            } else {
                a7Var.A0(e17);
                return;
            }
        }
        yw2.a0 a0Var4 = a7Var.f106216o;
        if (a0Var4 != null) {
            a0Var4.t();
        }
        j17 = 0;
        if (longExtra != j17) {
        }
    }
}

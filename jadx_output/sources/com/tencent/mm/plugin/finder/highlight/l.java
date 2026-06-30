package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public class l implements com.tencent.mm.plugin.finder.highlight.i, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.highlight.p f111443d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer f111444e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f111445f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f111446g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f111447h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f111448i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f111449m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f111450n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f111451o;

    public l(com.tencent.mm.plugin.finder.highlight.p presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f111443d = presenter;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        float f18 = f17 * 2.5f;
        float f19 = f18 < 0.0f ? 0.0f : f18;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        float f27 = 0.0f < f18 ? f18 : 0.0f;
        android.content.Context context = this.f111451o;
        if (context == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        int b17 = i65.a.b(context, 16);
        android.content.Context context2 = this.f111451o;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        int b18 = i65.a.b(context2, 4);
        android.view.View view = this.f111446g;
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLine");
            throw null;
        }
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLine");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (b18 + (f27 * (b17 - b18)));
        view.setLayoutParams(layoutParams);
        android.view.View view2 = this.f111448i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("headerArrow");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        this.f111443d.getClass();
        com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer = this.f111444e;
        if (finderLiveHighlightDrawer == null) {
            kotlin.jvm.internal.o.o("highlightDrawer");
            throw null;
        }
        finderLiveHighlightDrawer.t(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = g().getRecyclerView();
        androidx.recyclerview.widget.w2 w2Var = this.f111450n;
        if (w2Var != null) {
            recyclerView.V0(w2Var);
        } else {
            kotlin.jvm.internal.o.o("scrollListener");
            throw null;
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.finder.highlight.p pVar = this.f111443d;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            pVar.getClass();
            return;
        }
        if (this.f111444e == null) {
            kotlin.jvm.internal.o.o("highlightDrawer");
            throw null;
        }
        pVar.getClass();
        pVar.f111457d = this;
        g().H(null);
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout g() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f111449m;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }
}

package jn2;

/* loaded from: classes5.dex */
public final class e0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.f0 f382121d;

    public e0(jn2.f0 f0Var) {
        this.f382121d = f0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i18 > 0) {
            jn2.f0 f0Var = this.f382121d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = f0Var.f382135h.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                int y17 = c1162x665295de.y();
                jn2.c1 c1Var = f0Var.f382133f;
                if (c1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
                    throw null;
                }
                int mo1894x7e414b06 = c1Var.mo1894x7e414b06();
                if (f0Var.f382144t > 0 && mo1894x7e414b06 != 0 && y17 >= mo1894x7e414b06 - 1 && !f0Var.f382142r && (y0Var = f0Var.f382132e) != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.a0(f0Var, null), 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

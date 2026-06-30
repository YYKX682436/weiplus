package mx2;

/* loaded from: classes2.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 f414021d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041) {
        this.f414021d = c15401xb8016041;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        if (i17 != 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = this.f414021d;
        if (!c15401xb8016041.f213857v) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (c15401xb8016041.i()) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        ym5.o1 indicator = c15401xb8016041.getIndicator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f c15407x15c8ab5f = indicator instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f) indicator : null;
        if (c15407x15c8ab5f != null) {
            android.animation.ValueAnimator valueAnimator = c15407x15c8ab5f.f213900n;
            if (valueAnimator != null && valueAnimator.isPaused()) {
                long m62762xfed12dba = c15407x15c8ab5f.m62762xfed12dba();
                android.animation.ValueAnimator valueAnimator2 = c15407x15c8ab5f.f213900n;
                if (valueAnimator2 != null) {
                    valueAnimator2.resume();
                }
                c15401xb8016041.f();
                c15401xb8016041.l(m62762xfed12dba);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            }
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = c15401xb8016041.f213859x;
        if (!(r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a())) {
            c15401xb8016041.l(c15401xb8016041.f213849n);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$init$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

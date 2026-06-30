package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes13.dex */
public final class yr extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15374xd3ebae5 f214949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 f214950e;

    public yr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15374xd3ebae5 c15374xd3ebae5, p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 y1Var) {
        this.f214949d = c15374xd3ebae5;
        this.f214950e = y1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, int i17) {
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15374xd3ebae5 c15374xd3ebae5 = this.f214949d;
        if (i17 == 0) {
            c15374xd3ebae5.f213095s = false;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = rv6.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            android.view.View f17 = this.f214950e.f(c1162x665295de);
            int m8032xa86cd69f = f17 != null ? c1162x665295de.m8032xa86cd69f(f17) : -1;
            if (m8032xa86cd69f != -1 && (i18 = c15374xd3ebae5.f213088i) > 0) {
                int f18 = e06.p.f(m8032xa86cd69f, 0, i18 - 1);
                c15374xd3ebae5.f213089m = f18;
                int d17 = c15374xd3ebae5.d(f18);
                boolean z17 = !(((float) d17) == c15374xd3ebae5.f213091o);
                float f19 = f18;
                boolean z18 = !(c15374xd3ebae5.f213090n == f19);
                if (z17 || z18) {
                    if (z17) {
                        c15374xd3ebae5.b(d17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.as(c15374xd3ebae5, f18));
                    } else {
                        c15374xd3ebae5.a(f19);
                    }
                }
            }
        } else if (i17 == 1) {
            c15374xd3ebae5.f213095s = true;
            android.animation.ValueAnimator valueAnimator = c15374xd3ebae5.f213093q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c15374xd3ebae5.f213093q = null;
            android.animation.ValueAnimator valueAnimator2 = c15374xd3ebae5.f213094r;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            c15374xd3ebae5.f213094r = null;
        } else if (i17 == 2) {
            c15374xd3ebae5.f213095s = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, int i17, int i18) {
        float f17;
        int height;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15374xd3ebae5 c15374xd3ebae5 = this.f214949d;
        if (!c15374xd3ebae5.f213095s) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = rv6.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int w17 = c1162x665295de.w();
        if (w17 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(w17);
        if (mo7935xa188593e == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        if (c1162x665295de.H() == 0) {
            f17 = -mo7935xa188593e.getLeft();
            height = mo7935xa188593e.getWidth();
        } else {
            f17 = -mo7935xa188593e.getTop();
            height = mo7935xa188593e.getHeight();
        }
        float f18 = height;
        float e17 = f18 > 0.0f ? w17 + e06.p.e(f17 / f18, 0.0f, 1.0f) : w17;
        if (c15374xd3ebae5.f213088i > 0) {
            float e18 = e06.p.e(e17, 0.0f, r11 - 1);
            c15374xd3ebae5.f213090n = e18;
            int f19 = e06.p.f((int) (e18 + 0.5f), 0, c15374xd3ebae5.f213088i - 1);
            c15374xd3ebae5.f213089m = f19;
            int d17 = c15374xd3ebae5.d(f19);
            if (d17 != c15374xd3ebae5.f213092p) {
                c15374xd3ebae5.b(d17, null);
            } else {
                c15374xd3ebae5.invalidate();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/PageIndicatorView$attachToRecyclerView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

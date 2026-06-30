package l94;

/* loaded from: classes4.dex */
public final class x implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public float f398935d;

    /* renamed from: e, reason: collision with root package name */
    public float f398936e;

    /* renamed from: f, reason: collision with root package name */
    public long f398937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f398938g;

    /* renamed from: h, reason: collision with root package name */
    public final int f398939h = c44.b.a(10);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l94.b0 f398940i;

    public x(l94.b0 b0Var) {
        this.f398940i = b0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int actionMasked = e17.getActionMasked();
        l94.b0 b0Var = this.f398940i;
        if (actionMasked == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            b0Var.f398856i = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            b0Var.p();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            android.animation.ValueAnimator valueAnimator = b0Var.f398857j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f398935d = e17.getX();
            this.f398936e = e17.getY();
            this.f398938g = true;
            this.f398937f = java.lang.System.currentTimeMillis();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = rv6.getLayoutManager();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 c17827xd9ca7419 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419) layoutManager : null;
            int n17 = c17827xd9ca7419 != null ? c17827xd9ca7419.n() : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            b0Var.f398864q = n17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        } else {
            int actionMasked2 = e17.getActionMasked();
            int i17 = this.f398939h;
            if (actionMasked2 == 2) {
                float abs = java.lang.Math.abs(e17.getX() - this.f398935d);
                float abs2 = java.lang.Math.abs(e17.getY() - this.f398936e);
                float f17 = i17;
                if (abs > f17 || abs2 > f17) {
                    this.f398938g = false;
                }
            } else if (e17.getActionMasked() == 1 || e17.getActionMasked() == 3) {
                if (rv6.mo7958x54496c8e() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    b0Var.f398856i = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    float n18 = l94.b0.n(b0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    b0Var.o(n18);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                }
                if (this.f398938g && e17.getAction() == 1) {
                    float abs3 = java.lang.Math.abs(e17.getX() - this.f398935d);
                    float abs4 = java.lang.Math.abs(e17.getY() - this.f398936e);
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f398937f;
                    float f18 = i17;
                    if (abs3 < f18 && abs4 < f18 && currentTimeMillis < 200) {
                        rv6.performClick();
                    }
                }
                this.f398938g = false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRequestDisallowInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestDisallowInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
    }
}

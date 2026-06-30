package qt2;

/* loaded from: classes2.dex */
public class e extends qt2.j {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f448093r;

    /* renamed from: s, reason: collision with root package name */
    public r45.jt2 f448094s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f448095t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f448096u;

    /* renamed from: v, reason: collision with root package name */
    public int f448097v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f448098w;

    /* renamed from: x, reason: collision with root package name */
    public float f448099x;

    /* renamed from: y, reason: collision with root package name */
    public final int f448100y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f448093r = "FinderFirstFeedRecommendTipUIC";
        this.f448098w = true;
        this.f448099x = -1.0f;
        this.f448100y = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // qt2.j
    public int Q6() {
        return com.p314xaae8f345.mm.R.id.g6p;
    }

    @Override // qt2.j
    public void S6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        android.widget.TextView textView;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        r45.jt2 jt2Var = this.f448094s;
        if (jt2Var != null) {
            android.view.View view = this.f448121e;
            cy1.a aVar = null;
            android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9p) : null;
            android.view.View view2 = this.f448121e;
            android.widget.ImageView imageView2 = view2 != null ? (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a9r) : null;
            android.view.View view3 = this.f448121e;
            android.widget.ImageView imageView3 = view3 != null ? (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.a9t) : null;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            java.util.LinkedList m75941xfb821914 = jt2Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFriend_like_users(...)");
            int i17 = 0;
            for (java.lang.Object obj : m75941xfb821914) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.g53 g53Var = (r45.g53) obj;
                android.widget.ImageView imageView4 = i17 != 0 ? i17 != 1 ? i17 != 2 ? null : imageView3 : imageView2 : imageView;
                if (imageView4 != null) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.l().c(new mn2.n(g53Var.m75945x2fec8307(2), null, 2, null), imageView4, g1Var.h(mn2.f1.f411493n));
                    imageView4.setVisibility(0);
                }
                i17 = i18;
            }
            android.view.View view4 = this.f448121e;
            if (view4 != null && (textView = (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.g6q)) != null) {
                java.lang.String m75945x2fec8307 = jt2Var.m75945x2fec8307(1);
                str = "";
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    ht2.y0 y0Var = (ht2.y0) i95.n0.c(ht2.y0.class);
                    java.lang.String m75945x2fec83072 = jt2Var.m75945x2fec8307(1);
                    str = y0Var.mj(m75945x2fec83072 != null ? m75945x2fec83072 : "", (int) textView.getTextSize(), true);
                }
                textView.setText(str);
            }
            android.view.View view5 = this.f448121e;
            if (view5 != null) {
                view5.setOnClickListener(new qt2.a(this));
            }
            android.view.View view6 = this.f448121e;
            if (view6 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view6, "bottom_recommendation");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view6, 40, 25496);
                cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar2.Ai(view6, new qt2.b(this));
                aVar = aVar2;
            }
            if (aVar != null) {
                return;
            }
        }
        android.view.View view7 = this.f448121e;
        if (view7 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "initContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "initContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // qt2.j
    public void V6(float f17) {
        if (this.f448098w) {
            android.view.View view = this.f448121e;
            if (view != null && view.getVisibility() == 0) {
                android.view.View view2 = this.f448121e;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/share/FinderFirstFeedRecommendTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Z6();
                this.f448098w = false;
            }
        }
    }

    @Override // qt2.j
    public boolean X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W3).mo141623x754a37bb()).r()).intValue() == 1 || ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f120759d || ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209222f3).mo141623x754a37bb()).r()).intValue() != 0 || ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209146b3).mo141623x754a37bb()).r()).intValue() != 1 || this.f448094s == null) ? false : true;
    }

    @Override // qt2.j
    public void Y6() {
        android.view.View view;
        if (this.f448122f || T6() || (view = this.f448121e) == null) {
            return;
        }
        this.f448096u = new qt2.d(this, view);
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f448096u);
        }
    }

    public final void Z6() {
        int i17 = this.f448097v;
        if (i17 <= 0) {
            i17 = i65.a.b(m80379x76847179(), 170);
        }
        qt2.j.P6(this, i17, 260L, 0.0f, 4, null);
    }

    @Override // qt2.j
    /* renamed from: getIndex */
    public int mo160883x7498cf1c() {
        qt2.u uVar;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        if (m158358x197d1fc6 == null || (uVar = (qt2.u) pf5.z.f435481a.b(m158358x197d1fc6).e(qt2.u.class)) == null) {
            return 0;
        }
        return uVar.f448147g;
    }

    @Override // qt2.j
    /* renamed from: getTag */
    public java.lang.String mo160882xb5887064() {
        return this.f448093r;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.View view = this.f448121e;
        if (view != null) {
            view.removeCallbacks(this.f448095t);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f448093r = "FinderFirstFeedRecommendTipUIC";
        this.f448098w = true;
        this.f448099x = -1.0f;
        this.f448100y = android.view.ViewConfiguration.getTouchSlop();
    }
}

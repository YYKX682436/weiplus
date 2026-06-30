package qt2;

/* loaded from: classes2.dex */
public abstract class j extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f448120d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f448121e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f448122f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f448123g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f448124h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f448125i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f448126m;

    /* renamed from: n, reason: collision with root package name */
    public float f448127n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f448128o;

    /* renamed from: p, reason: collision with root package name */
    public int f448129p;

    /* renamed from: q, reason: collision with root package name */
    public int f448130q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f448120d = "FinderShareGuideBaseUIC";
        this.f448127n = 1.0f;
        this.f448129p = -1;
        this.f448130q = -1;
    }

    public static /* synthetic */ void P6(qt2.j jVar, int i17, long j17, float f17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissLayout");
        }
        if ((i18 & 4) != 0) {
            f17 = 0.0f;
        }
        jVar.O6(i17, j17, f17);
    }

    public void O6(int i17, long j17, float f17) {
        android.view.View view;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationYBy2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationYBy3;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator animate4;
        android.view.ViewPropertyAnimator translationYBy4;
        android.view.ViewPropertyAnimator duration4;
        android.view.ViewPropertyAnimator animate5;
        android.view.ViewPropertyAnimator translationYBy5;
        android.view.ViewPropertyAnimator duration5;
        android.view.ViewPropertyAnimator animate6;
        android.view.ViewPropertyAnimator translationYBy6;
        android.view.ViewPropertyAnimator duration6;
        android.view.ViewPropertyAnimator listener2;
        android.view.View view2;
        android.view.View findViewById;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        float f18 = i17;
        boolean z17 = false;
        if (this.f448130q != 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
            android.view.View view7 = null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4 != null ? c1163xf1deaba4.p0(mo160883x7498cf1c()) : null;
            android.view.View findViewById2 = (p07 == null || (view6 = p07.f3639x46306858) == null) ? null : view6.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
            android.view.View findViewById3 = (p07 == null || (view5 = p07.f3639x46306858) == null) ? null : view5.findViewById(com.p314xaae8f345.mm.R.id.g1y);
            android.view.View findViewById4 = (p07 == null || (view4 = p07.f3639x46306858) == null) ? null : view4.findViewById(com.p314xaae8f345.mm.R.id.dq6);
            android.widget.ImageView imageView = (p07 == null || (view3 = p07.f3639x46306858) == null) ? null : (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.r2o);
            if (p07 != null && (view2 = p07.f3639x46306858) != null && (findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.tcv)) != null) {
                findViewById.setTag(java.lang.Boolean.FALSE);
                view7 = findViewById;
            }
            if (findViewById2 != null && (animate6 = findViewById2.animate()) != null && (translationYBy6 = animate6.translationYBy(f18)) != null && (duration6 = translationYBy6.setDuration(j17)) != null && (listener2 = duration6.setListener(new qt2.g(this))) != null) {
                listener2.start();
            }
            float f19 = f17 > 0.0f ? f17 + f18 : f18;
            if (findViewById3 != null && (animate5 = findViewById3.animate()) != null && (translationYBy5 = animate5.translationYBy(f19)) != null && (duration5 = translationYBy5.setDuration(j17)) != null) {
                duration5.start();
            }
            if (view7 != null && (animate4 = view7.animate()) != null && (translationYBy4 = animate4.translationYBy(f19)) != null && (duration4 = translationYBy4.setDuration(j17)) != null) {
                duration4.start();
            }
            if (findViewById4 != null && (animate3 = findViewById4.animate()) != null && (translationYBy3 = animate3.translationYBy(f19)) != null && (duration3 = translationYBy3.setDuration(j17)) != null) {
                duration3.start();
            }
            if (imageView != null && (animate2 = imageView.animate()) != null && (translationYBy2 = animate2.translationYBy(f19)) != null && (duration2 = translationYBy2.setDuration(j17)) != null && (listener = duration2.setListener(new qt2.h(this, p07))) != null) {
                listener.start();
            }
            this.f448130q = 0;
        }
        android.view.View view8 = this.f448121e;
        if (view8 != null && view8.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17 || (view = this.f448121e) == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (translationYBy = alpha.translationYBy(f18)) == null || (duration = translationYBy.setDuration(j17)) == null) {
            return;
        }
        duration.start();
    }

    public abstract int Q6();

    public void R6(java.util.List feeds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        this.f448128o = feeds;
    }

    public void S6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f448123g = recyclerView;
        recyclerView.i(new qt2.f(this));
        int Q6 = Q6();
        if (Q6 <= 0) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        android.view.View view = (c1163xf1deaba4 == null || (p07 = c1163xf1deaba4.p0(mo160883x7498cf1c())) == null) ? null : p07.f3639x46306858;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(Q6) : null;
        this.f448121e = viewStub != null ? viewStub.inflate() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = view != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) view.findViewById(com.p314xaae8f345.mm.R.id.e_k) : null;
        this.f448124h = c15196x85976f5f;
        if (c15196x85976f5f == null) {
            if (view != null) {
            }
            if (view != null) {
            }
        }
        this.f448125i = (android.view.ViewGroup) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
        this.f448126m = view != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) view.findViewById(com.p314xaae8f345.mm.R.id.ghd) : null;
    }

    public final boolean T6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return ((qt2.u) pf5.z.f435481a.a(activity).a(qt2.u.class)).f448149i;
    }

    public void U6() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4 = this.f448121e;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        android.view.View view5 = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4 != null ? c1163xf1deaba4.p0(mo160883x7498cf1c()) : null;
        android.view.View findViewById = (p07 == null || (view3 = p07.f3639x46306858) == null) ? null : view3.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
        android.view.View findViewById2 = (p07 == null || (view2 = p07.f3639x46306858) == null) ? null : view2.findViewById(com.p314xaae8f345.mm.R.id.g1y);
        if (p07 != null && (view = p07.f3639x46306858) != null) {
            view5 = view.findViewById(com.p314xaae8f345.mm.R.id.dq6);
        }
        if (findViewById != null) {
            findViewById.setTranslationY(0.0f);
        }
        if (findViewById2 != null) {
            findViewById2.setTranslationY(0.0f);
        }
        if (view5 == null) {
            return;
        }
        view5.setTranslationY(0.0f);
    }

    public void V6(float f17) {
        android.view.View view = this.f448121e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void W6(float f17, long j17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationYBy2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationYBy3;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator animate4;
        android.view.ViewPropertyAnimator translationYBy4;
        android.view.ViewPropertyAnimator duration4;
        android.view.ViewPropertyAnimator translationYBy5;
        android.view.ViewPropertyAnimator duration5;
        android.view.View view;
        android.view.View findViewById;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        android.view.View view6 = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4 != null ? c1163xf1deaba4.p0(mo160883x7498cf1c()) : null;
        android.view.View findViewById2 = (p07 == null || (view5 = p07.f3639x46306858) == null) ? null : view5.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
        android.view.View findViewById3 = (p07 == null || (view4 = p07.f3639x46306858) == null) ? null : view4.findViewById(com.p314xaae8f345.mm.R.id.g1y);
        android.view.View findViewById4 = (p07 == null || (view3 = p07.f3639x46306858) == null) ? null : view3.findViewById(com.p314xaae8f345.mm.R.id.dq6);
        android.widget.ImageView imageView = (p07 == null || (view2 = p07.f3639x46306858) == null) ? null : (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.r2o);
        if (p07 != null && (view = p07.f3639x46306858) != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.tcv)) != null) {
            findViewById.setTag(java.lang.Boolean.TRUE);
            view6 = findViewById;
        }
        if (findViewById2 != null) {
            findViewById2.setTranslationY(findViewById2.getTranslationY() + f17);
            android.view.ViewPropertyAnimator animate5 = findViewById2.animate();
            if (animate5 != null && (translationYBy5 = animate5.translationYBy(-f17)) != null && (duration5 = translationYBy5.setDuration(j17)) != null) {
                duration5.start();
            }
        }
        if (findViewById3 != null && (animate4 = findViewById3.animate()) != null && (translationYBy4 = animate4.translationYBy(-f17)) != null && (duration4 = translationYBy4.setDuration(j17)) != null) {
            duration4.start();
        }
        if (findViewById4 != null && (animate3 = findViewById4.animate()) != null && (translationYBy3 = animate3.translationYBy(-f17)) != null && (duration3 = translationYBy3.setDuration(j17)) != null) {
            duration3.start();
        }
        if (view6 != null && (animate2 = view6.animate()) != null && (translationYBy2 = animate2.translationYBy(-f17)) != null && (duration2 = translationYBy2.setDuration(j17)) != null) {
            duration2.start();
        }
        if (imageView != null && (animate = imageView.animate()) != null && (translationYBy = animate.translationYBy(-f17)) != null && (duration = translationYBy.setDuration(j17)) != null && (listener = duration.setListener(new qt2.i(this, p07))) != null) {
            listener.start();
        }
        this.f448130q = 1;
    }

    public abstract boolean X6();

    public void Y6() {
    }

    /* renamed from: getIndex */
    public int mo160883x7498cf1c() {
        return 0;
    }

    /* renamed from: getTag */
    public java.lang.String mo160882xb5887064() {
        return this.f448120d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f448120d = "FinderShareGuideBaseUIC";
        this.f448127n = 1.0f;
        this.f448129p = -1;
        this.f448130q = -1;
    }
}

package qt2;

/* loaded from: classes2.dex */
public final class h0 extends qt2.f0 {
    public final int A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 B;
    public boolean C;
    public boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.A = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        this.D = true;
    }

    @Override // qt2.j
    public void O6(int i17, long j17, float f17) {
        android.view.animation.LinearInterpolator linearInterpolator;
        android.view.View view = this.f448121e;
        if (view != null && view.getVisibility() == 8) {
            return;
        }
        int i18 = -i17;
        if (this.C) {
            i18 += com.p314xaae8f345.mm.ui.bh.a(m158354x19263085()).f278669b;
            linearInterpolator = null;
        } else {
            linearInterpolator = new android.view.animation.LinearInterpolator();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.b1(0, i18, linearInterpolator);
        }
        android.view.View view2 = this.f448121e;
        if (view2 != null) {
            view2.removeCallbacks(this.f448107t);
        }
        android.view.View view3 = this.f448121e;
        if (view3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.D) {
            g7("setupCallbacks");
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f448123g;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.postDelayed(new qt2.g0(this), 260L);
            }
        }
        this.f448111x = false;
    }

    @Override // qt2.f0, qt2.j
    public int Q6() {
        return com.p314xaae8f345.mm.R.id.mcg;
    }

    @Override // qt2.f0, qt2.j
    public void S6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        android.view.View view = this.f448121e;
        if (view != null) {
            view.setPadding(0, 0, 0, this.A);
        }
        android.view.View view2 = this.f448121e;
        if (view2 != null) {
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d4d);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 m7955x6392d05b = c1163xf1deaba4 != null ? c1163xf1deaba4.m7955x6392d05b() : null;
        this.B = m7955x6392d05b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6) m7955x6392d05b : null;
    }

    @Override // qt2.j
    public void W6(float f17, long j17) {
        if (!g7("destroyCallbacks")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var = this.B;
            if (o6Var != null) {
                o6Var.b(null);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.m7968x9a6969cf(null);
            }
            this.D = false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f448123g;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.b1(0, c7(), new android.view.animation.LinearInterpolator());
        }
    }

    @Override // qt2.f0, qt2.j
    public boolean X6() {
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W3).mo141623x754a37bb()).r()).intValue() != 1 && !((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f120759d && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209222f3).mo141623x754a37bb()).r()).intValue() == 0 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209165c3).mo141623x754a37bb()).r()).intValue() == 1 && hc2.e.a() && ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D1().r()).booleanValue();
    }

    @Override // qt2.f0
    public boolean Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Me).mo141623x754a37bb()).r()).booleanValue();
    }

    @Override // qt2.f0
    public void b7(android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15180x393a0b2f m61264xe34baebb;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.View view = this.f448121e;
        if (view != null && view.getVisibility() == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
            android.view.View view2 = (c1163xf1deaba4 == null || (p07 = c1163xf1deaba4.p0(0)) == null) ? null : p07.f3639x46306858;
            android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.r8c) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = view2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) view2.findViewById(com.p314xaae8f345.mm.R.id.ghd) : null;
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                this.f448112y = event.getY();
                return;
            }
            if (actionMasked == 1) {
                float y17 = event.getY() - this.f448112y;
                if (y17 <= 0.0f || y17 <= this.f448113z) {
                    if (!(findViewById != null && f7(findViewById, event))) {
                        return;
                    }
                }
                a7();
                return;
            }
            if (actionMasked != 2) {
                if (actionMasked == 5 && event.getPointerCount() >= 2) {
                    a7();
                    return;
                }
                return;
            }
            if (findViewById != null && f7(findViewById, event)) {
                if ((c15178x4303ff90 == null || (m61264xe34baebb = c15178x4303ff90.m61264xe34baebb()) == null || !m61264xe34baebb.isHorizontalEvent) ? false : true) {
                    a7();
                }
            }
        }
    }

    @Override // qt2.f0
    public void d7() {
        this.C = true;
        qt2.j.P6(this, c7(), 260L, 0.0f, 4, null);
    }

    public final boolean f7(android.view.View view, android.view.MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX < iArr[0] || rawX > r3 + view.getWidth()) {
            return false;
        }
        int i17 = iArr[1];
        return rawY >= ((float) i17) && rawY <= ((float) (i17 + view.getHeight()));
    }

    public final boolean g7(java.lang.String str) {
        java.lang.Class superclass;
        java.lang.Class superclass2;
        java.lang.reflect.Method declaredMethod;
        try {
            if (this.B != null && (superclass = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6.class.getSuperclass()) != null && (superclass2 = superclass.getSuperclass()) != null && (declaredMethod = superclass2.getDeclaredMethod(str, new java.lang.Class[0])) != null) {
                declaredMethod.setAccessible(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var = this.B;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(o6Var, "null cannot be cast to non-null type androidx.recyclerview.widget.SnapHelper");
                declaredMethod.invoke(o6Var, new java.lang.Object[0]);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareGuideScrollTipUIC", e17.getMessage());
            return false;
        }
    }

    @Override // qt2.j
    /* renamed from: getIndex */
    public int mo160883x7498cf1c() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.A = m158354x19263085().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        this.D = true;
    }
}

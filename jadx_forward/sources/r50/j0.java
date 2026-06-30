package r50;

/* loaded from: classes5.dex */
public final class j0 extends wm3.a implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474118d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f474119e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f474120f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f474121g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f474122h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f474123i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f474124m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f474125n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f474126o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f474127p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f474128q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f474129r;

    /* renamed from: s, reason: collision with root package name */
    public int f474130s;

    /* renamed from: t, reason: collision with root package name */
    public int f474131t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f474118d = jz5.h.b(r50.r.f474143d);
        this.f474119e = jz5.h.b(new r50.s(this));
        this.f474120f = jz5.h.b(new r50.v(activity, this));
        this.f474124m = jz5.h.b(new r50.i(activity));
        this.f474125n = jz5.h.b(new r50.q(activity));
        this.f474126o = jz5.h.b(new r50.y(activity));
        this.f474127p = jz5.h.b(new r50.h0(this));
        this.f474128q = jz5.h.b(new r50.i0(this));
        this.f474129r = jz5.h.b(new r50.x(this));
    }

    public final void T6(int i17, yz5.a aVar) {
        int measuredHeight = W6().g().getMeasuredHeight();
        em.b W6 = W6();
        if (W6.f335619i == null) {
            W6.f335619i = (android.widget.LinearLayout) W6.f335611a.findViewById(com.p314xaae8f345.mm.R.id.sl6);
        }
        int measuredHeight2 = W6.f335619i.getMeasuredHeight();
        int i18 = i17 == 0 ? 0 : (i17 - measuredHeight) - measuredHeight2;
        int i19 = i18 < 0 ? 0 : i18;
        if (i18 != i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeBottomLayoutHeight: clamp emptyLayoutHeight raw:%d -> final:%d, height:%d, todo:%d, bottom:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(measuredHeight), java.lang.Integer.valueOf(measuredHeight2));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeBottomLayoutHeight " + i17 + " emptyLayoutHeight:" + i19);
        em.b W62 = W6();
        if (W62.f335616f == null) {
            W62.f335616f = (android.widget.LinearLayout) W62.f335611a.findViewById(com.p314xaae8f345.mm.R.id.dfl);
        }
        android.view.ViewGroup.LayoutParams layoutParams = W62.f335616f.getLayoutParams();
        if (layoutParams != null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(layoutParams.height, i19);
            ofInt.addUpdateListener(new r50.j(layoutParams, this));
            ofInt.addListener(new r50.n(this, i17));
            int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(m158354x19263085());
            long j17 = g17 > 0 ? (((g17 - measuredHeight2) - measuredHeight) / g17) * 175 : 0L;
            long h17 = e06.p.h(j17, 0L, 175L);
            if (j17 != h17 || g17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeBottomLayoutHeight: adjust animDuration raw:%d -> final:%d, kbHeight:%d, todo:%d, bottom:%d, height:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(h17), java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(measuredHeight), java.lang.Integer.valueOf(measuredHeight2), java.lang.Integer.valueOf(i17));
            }
            ofInt.setDuration(h17);
            ofInt.start();
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = W6().d().getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(layoutParams3.rightMargin, i17 == 0 ? ((java.lang.Number) ((jz5.n) this.f474126o).mo141623x754a37bb()).intValue() : !V6() ? ((java.lang.Number) ((jz5.n) this.f474125n).mo141623x754a37bb()).intValue() : 0);
            ofInt2.addUpdateListener(new r50.k(layoutParams3, this));
            ofInt2.addListener(new r50.l(ofInt2, aVar));
            ofInt2.setDuration(150L);
            ofInt2.start();
        }
        if (!V6()) {
            int intValue = i17 != 0 ? ((java.lang.Number) ((jz5.n) this.f474128q).mo141623x754a37bb()).intValue() : 0;
            android.view.ViewGroup.LayoutParams layoutParams4 = W6().i().getLayoutParams();
            if (layoutParams4 != null) {
                android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(layoutParams4.width, intValue);
                ofInt3.addUpdateListener(new r50.m(layoutParams4, this));
                ofInt3.setDuration(150L);
                ofInt3.start();
            }
        }
        gl5.d1 d1Var = (gl5.d1) ((jz5.n) this.f474119e).mo141623x754a37bb();
        if (d1Var != null) {
            d1Var.h(i17);
        }
    }

    public final void U6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeInputMode from:" + this.f474131t + " to:" + i17);
        int i18 = this.f474131t;
        jz5.g gVar = this.f474124m;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 == 2) {
                    if (i17 == 0) {
                        W6().e().clearFocus();
                        m174141x36654fab();
                        X6();
                        W6().f().setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
                        W6().e().clearFocus();
                        T6(0, null);
                    } else if (i17 == 1) {
                        W6().e().requestFocus();
                        X6();
                        m161890x7b383410();
                        W6().f().setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
                    }
                }
            } else if (i17 == 0) {
                W6().e().clearFocus();
                m174141x36654fab();
                X6();
                W6().f().setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
                T6(0, null);
            } else if (i17 != 1 && i17 == 2) {
                W6().e().requestFocus();
                m174141x36654fab();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f474121g;
                if (abstractC19636xc6b37291 != null) {
                    abstractC19636xc6b37291.i();
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f474121g;
                if (abstractC19636xc6b372912 != null) {
                    abstractC19636xc6b372912.setVisibility(0);
                }
                W6().f().setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
                T6(com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(m158354x19263085()) + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), null);
            }
        } else if (i17 != 0) {
            if (i17 == 1) {
                W6().e().requestFocus();
                X6();
                m161890x7b383410();
                W6().f().setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
                int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(m158354x19263085());
                int i19 = this.f474130s;
                if (i19 <= g17 * 1.5f) {
                    g17 = i19;
                }
                T6(g17 + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), new r50.p(this));
            } else if (i17 == 2) {
                W6().e().requestFocus();
                m174141x36654fab();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = this.f474121g;
                if (abstractC19636xc6b372913 != null) {
                    abstractC19636xc6b372913.i();
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372914 = this.f474121g;
                if (abstractC19636xc6b372914 != null) {
                    abstractC19636xc6b372914.setVisibility(0);
                }
                W6().f().setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
                T6(com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(m158354x19263085()) + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), new r50.o(this));
            }
        }
        this.f474131t = i17;
    }

    public final boolean V6() {
        return ((java.lang.Boolean) ((jz5.n) this.f474118d).mo141623x754a37bb()).booleanValue();
    }

    public final em.b W6() {
        return (em.b) ((jz5.n) this.f474127p).mo141623x754a37bb();
    }

    public final void X6() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f474121g;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.h();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f474121g;
        if (abstractC19636xc6b372912 != null) {
            abstractC19636xc6b372912.postDelayed(new r50.t(this), 250L);
        }
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "startObserveKeyboard: keyboardHeightProviderStarted=" + this.f474122h);
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f474120f).mo141623x754a37bb()).f();
        this.f474122h = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        if (this.f474131t == 0) {
            return false;
        }
        U6(0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new r50.g0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f474120f).mo141623x754a37bb()).f291933e = null;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f474121g;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.l();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f474121g;
        if (abstractC19636xc6b372912 != null) {
            abstractC19636xc6b372912.a();
        }
        ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
        com.p314xaae8f345.mm.ui.i1.b();
        x90.m mVar = (x90.m) ((ct.f3) i95.n0.c(ct.f3.class));
        a31.m mVar2 = mVar.f534152d;
        if (mVar2 != null) {
            mVar2.c();
        }
        mVar.f534152d = null;
        b31.l.f99146a.a();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "stopObserveKeyboard: keyboardHeightProviderStarted=" + this.f474122h);
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f474120f).mo141623x754a37bb()).d();
        this.f474122h = false;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f474121g;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.h();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        Y6();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f474121g;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.i();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        U6(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        if (z17) {
            Y6();
        }
    }

    /* renamed from: showVKB */
    public void m161890x7b383410() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "showVKB");
        java.lang.Object systemService = m80379x76847179().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(W6().e(), 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        int max = i17 == 0 ? 0 : java.lang.Math.max(com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.h(m158354x19263085(), i17, 0), i17);
        this.f474130s = max;
        boolean z18 = max > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "onKeyboardHeightChanged() called with: height:" + i17 + " keyboardHeight:" + this.f474130s + ", isResized:" + z17 + " isKeyboardShow:" + z18 + " inputMode:" + this.f474131t);
        if (z18) {
            U6(1);
        } else if (this.f474131t != 2) {
            U6(0);
        }
    }
}

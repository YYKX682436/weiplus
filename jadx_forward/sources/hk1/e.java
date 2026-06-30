package hk1;

/* loaded from: classes7.dex */
public final class e extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f363406h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f363407d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb f363408e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f363409f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f363410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f363407d = "MicroMsg.AppBrandActivityContainerView";
    }

    /* renamed from: getRuntime */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 m133669x9a3f0ba2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = m133670x99ea56ff().mo48805xd384d23c();
        if (mo48805xd384d23c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo48805xd384d23c;
        }
        return null;
    }

    public final void a(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.ViewGroup viewGroup = this.f363409f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (layoutParams != null) {
            android.view.ViewGroup viewGroup2 = this.f363409f;
            if (viewGroup2 != null) {
                viewGroup2.addView(view, layoutParams);
                return;
            }
            return;
        }
        android.view.ViewGroup viewGroup3 = this.f363409f;
        if (viewGroup3 != null) {
            viewGroup3.addView(view);
        }
    }

    public final void b(android.view.ViewGroup container, android.view.ViewGroup.LayoutParams layoutParams) {
        android.app.Activity r07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        android.view.ViewGroup viewGroup = this.f363409f;
        if (viewGroup != null) {
            removeView(viewGroup);
        }
        this.f363409f = container;
        container.setOnClickListener(hk1.b.f363403d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 m133669x9a3f0ba2 = m133669x9a3f0ba2();
        if (m133669x9a3f0ba2 != null && (r07 = m133669x9a3f0ba2.r0()) != null && (this.f363409f instanceof mi1.h)) {
            vj5.n b17 = vj5.n.b(r07);
            android.view.ViewGroup viewGroup2 = this.f363409f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewGroup2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarContainerLayout");
            b17.d((mi1.h) viewGroup2);
        }
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        }
        addView(this.f363409f, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f363408e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(this);
            if (d17 != null && d17.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 m133669x9a3f0ba2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (view != null && (m133669x9a3f0ba2 = m133669x9a3f0ba2()) != null && (l0Var = m133669x9a3f0ba2.H2) != null) {
            l0Var.j(canvas, view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.o.f172742d);
        }
        return super.drawChild(canvas, view, j17);
    }

    /* renamed from: getRuntimeContainer */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb m133670x99ea56ff() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = this.f363408e;
        if (c11529x5d7a34bb != null) {
            return c11529x5d7a34bb;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("runtimeContainer");
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (this.f363408e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 m133669x9a3f0ba2 = m133669x9a3f0ba2();
            boolean z17 = false;
            if (m133669x9a3f0ba2 != null && (l0Var = m133669x9a3f0ba2.H2) != null && (f0Var = l0Var.f172731d) != null && f0Var.a0(ev6)) {
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        try {
            super.onLayout(z17, i17, i18, i19, i27);
            android.view.View view = this.f363410g;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view != null ? view.getParent() : null, this) || this.f363409f == null) {
                return;
            }
            android.view.View view2 = this.f363410g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            int left = view2.getLeft();
            android.view.View view3 = this.f363410g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
            int top = view3.getTop();
            android.view.View view4 = this.f363410g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            int right = view4.getRight();
            android.view.ViewGroup viewGroup = this.f363409f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            android.view.ViewGroup viewGroup2 = this.f363409f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
            viewGroup.layout(left, top - viewGroup2.getMeasuredHeight(), right, top);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f363407d, e17, "", "");
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f363408e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 m133669x9a3f0ba2 = m133669x9a3f0ba2();
            boolean z17 = false;
            if (m133669x9a3f0ba2 != null && (l0Var = m133669x9a3f0ba2.H2) != null && (f0Var = l0Var.f172731d) != null && f0Var.U(event)) {
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    /* renamed from: setExternalHeaderAnchor */
    public final void m133671x7dc6fe8f(android.view.View view) {
        this.f363410g = view;
    }

    /* renamed from: setExternalHeaderVisibility */
    public final void m133672xef2521ec(int i17) {
        android.view.ViewGroup viewGroup = this.f363409f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(i17);
    }

    /* renamed from: setExternalHeaderVisibilityWithAnimation */
    public final void m133673xa6696d2(int i17) {
        if (i17 != 0) {
            android.view.ViewGroup viewGroup = this.f363409f;
            if (viewGroup != null && viewGroup.getVisibility() == 8) {
                return;
            }
            android.view.ViewGroup viewGroup2 = this.f363409f;
            if (viewGroup2 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewGroup2.getTag(), java.lang.Boolean.TRUE) : false) {
                return;
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f363409f, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            ofFloat.addListener(new hk1.d(this));
            ofFloat.start();
            return;
        }
        android.view.ViewGroup viewGroup3 = this.f363409f;
        if (viewGroup3 != null && viewGroup3.getVisibility() == 0) {
            return;
        }
        android.view.ViewGroup viewGroup4 = this.f363409f;
        if (viewGroup4 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewGroup4.getTag(), java.lang.Boolean.TRUE) : false) {
            return;
        }
        android.view.ViewGroup viewGroup5 = this.f363409f;
        if (viewGroup5 != null) {
            viewGroup5.setVisibility(0);
        }
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f363409f, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(100L);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat2.addListener(new hk1.c(this));
        ofFloat2.start();
    }

    /* renamed from: setRuntimeContainer */
    public final void m133674x3de6ec0b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11529x5d7a34bb, "<set-?>");
        this.f363408e = c11529x5d7a34bb;
    }
}

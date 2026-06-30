package mi1;

/* loaded from: classes7.dex */
public final class l extends xi1.c implements al1.g, android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f408137d;

    /* renamed from: e, reason: collision with root package name */
    public int f408138e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f408139f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f408140g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f408141h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mi1.v f408142i;

    public l(mi1.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        this.f408142i = vVar;
        this.f408137d = page;
        this.f408138e = -1;
        this.f408140g = jz5.h.b(new mi1.k(this));
        page.w(new mi1.j(vVar, this));
        page.r1().m2217x2f33e7ef(this);
    }

    @Override // al1.g
    public void d(android.view.View.OnClickListener onClickListener) {
        this.f408139f = onClickListener;
        if (this.f408141h) {
            mi1.i iVar = this.f408142i.f408237c;
            if (iVar != null) {
                iVar.m147352x4dad334a(onClickListener);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
        }
    }

    @Override // al1.g
    public void e(android.view.View.OnClickListener onClickListener) {
        jz5.g gVar = this.f408140g;
        mi1.l2 l2Var = (mi1.l2) ((jz5.n) gVar).mo141623x754a37bb();
        l2Var.f408147d = onClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = this.f408137d.t3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t37, "getRuntime(...)");
        l2Var.f408148e = t37;
        if (this.f408141h) {
            mi1.i iVar = this.f408142i.f408237c;
            if (iVar != null) {
                iVar.m147353x39261f4((mi1.l2) ((jz5.n) gVar).mo141623x754a37bb());
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
        }
    }

    @Override // al1.i0
    public boolean h(boolean z17, al1.h0 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return ((mi1.o) this.f408142i.f408241g.mo141623x754a37bb()).h(z17, reason);
    }

    @Override // al1.g
    public void k(int i17) {
        this.f408138e = i17;
        if (this.f408141h) {
            mi1.i iVar = this.f408142i.f408237c;
            if (iVar != null) {
                iVar.m147354x23320e34(i17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
        }
    }

    @Override // al1.g
    public void n(int i17) {
        q();
    }

    @Override // xi1.c
    public void o() {
        mi1.v vVar = this.f408142i;
        mi1.u0 u0Var = vVar.f408243i;
        if (u0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blinkWrapper");
            throw null;
        }
        android.animation.Animator animator = u0Var.f408230f;
        if (animator != null) {
            animator.pause();
        }
        vVar.c().setVisibility(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandCapsuleBarManager", "onEnterFullscreen");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (this.f408141h) {
            if (i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) {
                return;
            }
            q();
        }
    }

    @Override // xi1.c
    public void p() {
        mi1.v vVar = this.f408142i;
        mi1.u0 u0Var = vVar.f408243i;
        if (u0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blinkWrapper");
            throw null;
        }
        android.animation.Animator animator = u0Var.f408230f;
        if (animator != null) {
            animator.resume();
        }
        vVar.c().setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandCapsuleBarManager", "onExitFullscreen");
    }

    public final void q() {
        int visibility;
        android.view.ViewGroup.LayoutParams layoutParams;
        mi1.v vVar = this.f408142i;
        mi1.i iVar = vVar.f408237c;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
            throw null;
        }
        boolean isLaidOut = iVar.m147347xbe6f1d74().isLaidOut();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f408137d;
        if (isLaidOut) {
            v5Var.r1().m2209x716f693c().m52134x81bbe4b4(iVar.m147347xbe6f1d74().getMeasuredWidth());
            v5Var.r1().m2209x716f693c().m52133x9bf1b7f9(iVar.m147347xbe6f1d74().getMeasuredHeight());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c = v5Var.r1().m2209x716f693c();
        if (m2209x716f693c != null && (layoutParams = m2209x716f693c.getLayoutParams()) != null) {
            android.view.View m147347xbe6f1d74 = iVar.m147347xbe6f1d74();
            vVar.getClass();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new android.widget.FrameLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new android.widget.FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 21;
            layoutParams2.width = -2;
            m147347xbe6f1d74.setLayoutParams(layoutParams2);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = v5Var.r1().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i17 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        android.view.ViewGroup.LayoutParams layoutParams4 = iVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams5 = (android.widget.FrameLayout.LayoutParams) layoutParams4;
        layoutParams5.topMargin = i17;
        layoutParams5.gravity = 5;
        android.view.ViewGroup.LayoutParams layoutParams6 = iVar.getLayoutParams();
        if (layoutParams6 != null && layoutParams6.height != v5Var.r1().getMeasuredHeight()) {
            al1.b r17 = v5Var.r1();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(r17)) {
                layoutParams6.height = v5Var.r1().getMeasuredHeight();
            }
        }
        iVar.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c2 = v5Var.r1().m2209x716f693c();
        if (m2209x716f693c2 == null || iVar.getVisibility() == (visibility = m2209x716f693c2.getVisibility())) {
            return;
        }
        iVar.setVisibility(visibility);
    }

    public final void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c;
        this.f408141h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f408137d;
        xi1.m C1 = v5Var.C1();
        if (C1 != null) {
            C1.f(this);
        }
        mi1.i iVar = this.f408142i.f408237c;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
            throw null;
        }
        iVar.removeOnLayoutChangeListener(this);
        al1.b r17 = v5Var.r1();
        android.view.ViewParent parent = (r17 == null || (m2209x716f693c = r17.m2209x716f693c()) == null) ? null : m2209x716f693c.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        al1.b r18 = v5Var.r1();
        if (r18 != null) {
            r18.removeOnLayoutChangeListener(this);
        }
    }
}

package bg2;

/* loaded from: classes2.dex */
public final class a5 extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101451e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f101452f;

    /* renamed from: g, reason: collision with root package name */
    public bg2.r4 f101453g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101454h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101451e = "LiveConvertToastController";
        this.f101452f = jz5.h.b(new bg2.x4(this));
    }

    public static final java.lang.Object Y6(bg2.a5 a5Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17;
        a5Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        bg2.r4 r4Var = a5Var.f101453g;
        java.lang.String str = a5Var.f101451e;
        if (r4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[toastViewOut] curToastView, return");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        } else {
            android.view.ViewGroup Z6 = a5Var.Z6();
            if (Z6 != null) {
                bg2.r4 r4Var2 = a5Var.f101453g;
                i17 = Z6.indexOfChild(r4Var2 != null ? r4Var2.f101990a : null);
            } else {
                i17 = -1;
            }
            if (i17 >= 0) {
                bg2.r4 r4Var3 = a5Var.f101453g;
                if (r4Var3 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[toastViewOut] view:");
                    android.view.View view = r4Var3.f101990a;
                    sb6.append(view);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                    android.view.animation.AnimationSet animationSet = r4Var3.f101992c;
                    if (animationSet.hasStarted()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[toastViewOut] view:" + view + " has started out anim.");
                    } else {
                        animationSet.setAnimationListener(new bg2.v4(a5Var, r4Var3, z17, new bg2.z4(nVar)));
                        view.startAnimation(animationSet);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[toastViewOut] root not contains, return");
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // tc2.c
    public void P6() {
        b7();
    }

    @Override // tc2.c
    public void Q6() {
        d7();
        c7();
    }

    @Override // tc2.c
    public void U6() {
        d7();
        b7();
    }

    @Override // tc2.c
    public void X6() {
        b7();
    }

    public final android.view.ViewGroup Z6() {
        return (android.view.ViewGroup) ((jz5.n) this.f101452f).mo141623x754a37bb();
    }

    public final boolean a7(android.view.View view) {
        android.view.animation.AnimationSet animationSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        bg2.r4 r4Var = this.f101453g;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4Var != null ? r4Var.f101990a : null, view)) {
            return false;
        }
        bg2.r4 r4Var2 = this.f101453g;
        return (r4Var2 == null || (animationSet = r4Var2.f101992c) == null) ? false : animationSet.hasStarted();
    }

    public final void b7() {
        android.view.ViewGroup Z6 = Z6();
        if (Z6 != null) {
            Z6.removeAllViews();
        }
        this.f101453g = null;
        android.view.ViewGroup Z62 = Z6();
        if (Z62 != null) {
            Z62.setVisibility(8);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101454h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f101454h = null;
    }

    public final void c7() {
        d7();
        bg2.r4 r4Var = this.f101453g;
        java.lang.String str = this.f101451e;
        jz5.f0 f0Var = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
        if (r4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[resumeCountDown] curToastView:" + r4Var.f101990a + ", duration:" + r4Var.f101993d);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f498674d.f498680g;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                r2Var = p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new bg2.w4(r4Var, this, null), 2, null);
            }
            this.f101454h = r2Var;
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[resumeCountDown] curToastView is null, return");
        }
    }

    public final void d7() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101454h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    public final void e7(bg2.r4 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f498674d.f498680g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new bg2.y4(this, config, null), 2, null);
        }
    }
}

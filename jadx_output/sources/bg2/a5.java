package bg2;

/* loaded from: classes2.dex */
public final class a5 extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f19918e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f19919f;

    /* renamed from: g, reason: collision with root package name */
    public bg2.r4 f19920g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f19921h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f19918e = "LiveConvertToastController";
        this.f19919f = jz5.h.b(new bg2.x4(this));
    }

    public static final java.lang.Object Y6(bg2.a5 a5Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        int i17;
        a5Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        bg2.r4 r4Var = a5Var.f19920g;
        java.lang.String str = a5Var.f19918e;
        if (r4Var == null) {
            com.tencent.mars.xlog.Log.i(str, "[toastViewOut] curToastView, return");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        } else {
            android.view.ViewGroup Z6 = a5Var.Z6();
            if (Z6 != null) {
                bg2.r4 r4Var2 = a5Var.f19920g;
                i17 = Z6.indexOfChild(r4Var2 != null ? r4Var2.f20457a : null);
            } else {
                i17 = -1;
            }
            if (i17 >= 0) {
                bg2.r4 r4Var3 = a5Var.f19920g;
                if (r4Var3 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[toastViewOut] view:");
                    android.view.View view = r4Var3.f20457a;
                    sb6.append(view);
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                    android.view.animation.AnimationSet animationSet = r4Var3.f20459c;
                    if (animationSet.hasStarted()) {
                        com.tencent.mars.xlog.Log.i(str, "[toastViewOut] view:" + view + " has started out anim.");
                    } else {
                        animationSet.setAnimationListener(new bg2.v4(a5Var, r4Var3, z17, new bg2.z4(nVar)));
                        view.startAnimation(animationSet);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "[toastViewOut] root not contains, return");
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
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
        return (android.view.ViewGroup) ((jz5.n) this.f19919f).getValue();
    }

    public final boolean a7(android.view.View view) {
        android.view.animation.AnimationSet animationSet;
        kotlin.jvm.internal.o.g(view, "view");
        bg2.r4 r4Var = this.f19920g;
        if (!kotlin.jvm.internal.o.b(r4Var != null ? r4Var.f20457a : null, view)) {
            return false;
        }
        bg2.r4 r4Var2 = this.f19920g;
        return (r4Var2 == null || (animationSet = r4Var2.f20459c) == null) ? false : animationSet.hasStarted();
    }

    public final void b7() {
        android.view.ViewGroup Z6 = Z6();
        if (Z6 != null) {
            Z6.removeAllViews();
        }
        this.f19920g = null;
        android.view.ViewGroup Z62 = Z6();
        if (Z62 != null) {
            Z62.setVisibility(8);
        }
        kotlinx.coroutines.r2 r2Var = this.f19921h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f19921h = null;
    }

    public final void c7() {
        d7();
        bg2.r4 r4Var = this.f19920g;
        java.lang.String str = this.f19918e;
        jz5.f0 f0Var = null;
        kotlinx.coroutines.r2 r2Var = null;
        if (r4Var != null) {
            com.tencent.mars.xlog.Log.i(str, "[resumeCountDown] curToastView:" + r4Var.f20457a + ", duration:" + r4Var.f20460d);
            kotlinx.coroutines.y0 y0Var = this.f417141d.f417147g;
            if (y0Var != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                r2Var = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new bg2.w4(r4Var, this, null), 2, null);
            }
            this.f19921h = r2Var;
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "[resumeCountDown] curToastView is null, return");
        }
    }

    public final void d7() {
        kotlinx.coroutines.r2 r2Var = this.f19921h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    public final void e7(bg2.r4 config) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlinx.coroutines.y0 y0Var = this.f417141d.f417147g;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new bg2.y4(this, config, null), 2, null);
        }
    }
}

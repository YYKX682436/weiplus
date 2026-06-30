package sj3;

/* loaded from: classes14.dex */
public final class n3 {
    public n3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final void b(java.lang.String fileMd5, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileMd5, "fileMd5");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
        i4Var.getClass();
        i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s3(i4Var, fileMd5));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
        if (Ri.f231716x1 == null) {
            Ri.f231716x1 = new p012xc85e97e9.p093xedfae76a.j0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c3();
        Ri.f231706p1 = c3Var;
        c3Var.f231436c = java.lang.System.currentTimeMillis();
        Ri.f231706p1.f231434a = fileMd5;
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z0(Ri);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(z0Var, 3000L, "delayChecking");
        Ri.f231716x1.mo7808x76db6cb1(Ri.f231706p1);
    }

    public final int c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        int dimensionPixelSize = identifier > 0 ? android.content.res.Resources.getSystem().getDimensionPixelSize(identifier) : 0;
        int g17 = com.p314xaae8f345.mm.ui.bl.g(context);
        return (g17 == 0 || g17 >= dimensionPixelSize) ? dimensionPixelSize : g17;
    }

    public final void d(android.app.Activity activity, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (z17) {
            activity.getWindow().clearFlags(1024);
            activity.getWindow().addFlags(134217728);
        } else {
            activity.getWindow().setFlags(1024, 1024);
            activity.getWindow().clearFlags(134217728);
        }
    }
}

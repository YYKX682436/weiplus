package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class r3 implements nf.y {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f90545b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.utils.r3.class, "forceIsFoldableDevice", "getForceIsFoldableDevice()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.r3 f90544a = new com.tencent.mm.plugin.appbrand.utils.r3();

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f90546c = new nf.r(java.lang.Boolean.FALSE);

    @Override // nf.y
    public boolean a() {
        return com.tencent.mm.ui.bk.v();
    }

    @Override // nf.y
    public int b(int i17) {
        return com.tencent.mm.ui.bk.d(i17);
    }

    @Override // nf.y
    public int c(android.content.Context context) {
        return com.tencent.mm.ui.bk.p(context);
    }

    @Override // nf.y
    public int d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            return a06.d.b(r5.getDimensionPixelSize(r5.getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID)) * (j65.f.f() / context.getApplicationContext().getResources().getDisplayMetrics().density));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageUIUtilsBridge", "getStableStatusBarHeight e=" + th6);
            return 0;
        }
    }

    @Override // nf.y
    public boolean e() {
        if (!com.tencent.mm.ui.bk.Q()) {
            if (!((java.lang.Boolean) f90546c.b(this, f90545b[0])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // nf.y
    public boolean f() {
        return com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.U();
    }

    @Override // nf.y
    public void g(android.text.TextPaint textPaint) {
        com.tencent.mm.ui.bk.s0(textPaint);
    }

    @Override // nf.y
    public boolean h(android.content.Context context) {
        return com.tencent.mm.ui.bk.u(context, false);
    }

    @Override // nf.y
    public boolean i(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
        if (b17 == null || b17.u0() == null) {
            return com.tencent.mm.ui.bk.C();
        }
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = b17.u0().L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        if (halfScreenConfig.c() && halfScreenConfig.f77361h) {
            return false;
        }
        return com.tencent.mm.ui.bk.C();
    }

    @Override // nf.y
    public boolean isDarkMode() {
        return com.tencent.mm.ui.bk.C();
    }
}

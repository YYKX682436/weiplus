package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class r3 implements nf.y {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f172078b = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r3.class, "forceIsFoldableDevice", "getForceIsFoldableDevice()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r3 f172077a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r3();

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f172079c = new nf.r(java.lang.Boolean.FALSE);

    @Override // nf.y
    public boolean a() {
        return com.p314xaae8f345.mm.ui.bk.v();
    }

    @Override // nf.y
    public int b(int i17) {
        return com.p314xaae8f345.mm.ui.bk.d(i17);
    }

    @Override // nf.y
    public int c(android.content.Context context) {
        return com.p314xaae8f345.mm.ui.bk.p(context);
    }

    @Override // nf.y
    public int d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            return a06.d.b(r5.getDimensionPixelSize(r5.getIdentifier("status_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) * (j65.f.f() / context.getApplicationContext().getResources().getDisplayMetrics().density));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageUIUtilsBridge", "getStableStatusBarHeight e=" + th6);
            return 0;
        }
    }

    @Override // nf.y
    public boolean e() {
        if (!com.p314xaae8f345.mm.ui.bk.Q()) {
            if (!((java.lang.Boolean) f172079c.b(this, f172078b[0])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // nf.y
    public boolean f() {
        return com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.U();
    }

    @Override // nf.y
    public void g(android.text.TextPaint textPaint) {
        com.p314xaae8f345.mm.ui.bk.s0(textPaint);
    }

    @Override // nf.y
    public boolean h(android.content.Context context) {
        return com.p314xaae8f345.mm.ui.bk.u(context, false);
    }

    @Override // nf.y
    public boolean i(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
        if (b17 == null || b17.u0() == null) {
            return com.p314xaae8f345.mm.ui.bk.C();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = b17.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        if (halfScreenConfig.c() && halfScreenConfig.f158894h) {
            return false;
        }
        return com.p314xaae8f345.mm.ui.bk.C();
    }

    @Override // nf.y
    /* renamed from: isDarkMode */
    public boolean mo53144x387a9983() {
        return com.p314xaae8f345.mm.ui.bk.C();
    }
}

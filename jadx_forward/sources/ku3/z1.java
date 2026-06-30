package ku3;

/* loaded from: classes3.dex */
public final class z1 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f394026d;

    /* renamed from: e, reason: collision with root package name */
    public final zt3.a f394027e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f394028f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f394029g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f394030h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f394031i;

    /* renamed from: m, reason: collision with root package name */
    public st3.q f394032m;

    /* renamed from: n, reason: collision with root package name */
    public int f394033n;

    /* renamed from: o, reason: collision with root package name */
    public int f394034o;

    /* renamed from: p, reason: collision with root package name */
    public int f394035p;

    public z1(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        this.f394026d = parent;
        this.f394027e = kitContext;
        this.f394028f = jz5.h.b(new ku3.s1(this));
        this.f394029g = jz5.h.b(new ku3.v1(this));
        this.f394030h = jz5.h.b(new ku3.q1(this));
        this.f394031i = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public static final void a(ku3.z1 z1Var, bs0.f ratioType, float f17) {
        jz5.l lVar;
        jz5.l lVar2;
        z1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ratioType, "ratioType");
        st3.q qVar = z1Var.f394032m;
        int i17 = qVar == null ? -1 : ku3.p1.f393892a[qVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInBottomCase >> " + ratioType);
                int ordinal = ratioType.ordinal();
                if (ordinal != 0) {
                    android.view.ViewGroup viewGroup = z1Var.f394026d;
                    if (ordinal != 1) {
                        int i18 = st3.p.f494100g;
                        int i19 = st3.p.f494095b;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInBottomCase >> " + i18 + ", " + i19);
                        if (i19 <= i18) {
                            int a17 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 30);
                            z1Var.f394034o = 4;
                            z1Var.f394035p = a17;
                            lVar2 = new jz5.l(java.lang.Integer.valueOf(a17 - z1Var.f394033n), java.lang.Integer.valueOf(a17));
                        } else {
                            int i27 = (st3.p.f494099f - i18) - st3.p.f494096c;
                            com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 136);
                            i65.a.b(viewGroup.getContext(), 4);
                            z1Var.f394034o = 4;
                            z1Var.f394035p = i27;
                            lVar = new jz5.l(java.lang.Integer.valueOf(i27 - z1Var.f394033n), java.lang.Integer.valueOf(i27));
                        }
                    } else {
                        int i28 = (int) ((st3.p.f494100g * 4) / 3.0f);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInBottomCase >> " + i28);
                        int i29 = (st3.p.f494099f - i28) - st3.p.f494096c;
                        com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 136);
                        i65.a.b(viewGroup.getContext(), 4);
                        z1Var.f394034o = 4;
                        z1Var.f394035p = i29;
                        lVar = new jz5.l(java.lang.Integer.valueOf(i29 - z1Var.f394033n), java.lang.Integer.valueOf(i29));
                    }
                } else {
                    z1Var.f394034o = 3;
                    z1Var.f394035p = z1Var.f394033n;
                    lVar2 = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f394033n));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInCenterCase >> " + ratioType);
                int ordinal2 = ratioType.ordinal();
                if (ordinal2 == 0) {
                    z1Var.f394034o = 2;
                    z1Var.f394035p = z1Var.f394033n;
                    lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f394033n));
                } else if (ordinal2 != 1) {
                    int i37 = st3.p.f494100g;
                    int i38 = st3.p.f494095b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInCenterCase >> " + i37 + ", " + i38);
                    if (i38 <= i37) {
                        z1Var.f394034o = 4;
                        z1Var.f394035p = z1Var.f394033n;
                        lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f394033n));
                    } else {
                        int a18 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 88) + ((i38 - i37) / 2);
                        z1Var.f394034o = 4;
                        z1Var.f394035p = a18;
                        lVar = new jz5.l(java.lang.Integer.valueOf(a18 - z1Var.f394033n), java.lang.Integer.valueOf(a18));
                    }
                } else {
                    z1Var.f394034o = 4;
                    z1Var.f394035p = z1Var.f394033n;
                    lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f394033n));
                }
            }
            lVar2 = lVar;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInTopCase >> " + ratioType);
            int ordinal3 = ratioType.ordinal();
            if (ordinal3 == 0) {
                z1Var.f394034o = 1;
                z1Var.f394035p = z1Var.f394033n;
                lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f394033n));
            } else if (ordinal3 != 1) {
                int i39 = st3.p.f494100g;
                int i47 = st3.p.f494095b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInTopCase >> " + i39 + ", " + i47);
                if (i47 <= i39) {
                    int a19 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 30);
                    z1Var.f394034o = 4;
                    z1Var.f394035p = a19;
                    lVar2 = new jz5.l(java.lang.Integer.valueOf(a19), java.lang.Integer.valueOf(a19));
                } else {
                    int a27 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 88) + ((i47 - i39) / 2);
                    z1Var.f394034o = 4;
                    z1Var.f394035p = a27;
                    lVar = new jz5.l(java.lang.Integer.valueOf(a27), java.lang.Integer.valueOf(a27));
                }
            } else {
                float f18 = (st3.p.f494100g * 4) / 3.0f;
                int i48 = st3.p.f494095b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "getLayoutTopMarginAndShaderTranslationInTopCase >> " + f18 + ", " + i48);
                if (i48 <= f18) {
                    z1Var.f394034o = 1;
                    z1Var.f394035p = z1Var.f394033n;
                    lVar = new jz5.l(0, java.lang.Integer.valueOf(z1Var.f394033n));
                } else {
                    int a28 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 30);
                    z1Var.f394034o = 4;
                    z1Var.f394035p = a28;
                    lVar2 = new jz5.l(java.lang.Integer.valueOf(a28), java.lang.Integer.valueOf(a28));
                }
            }
            lVar2 = lVar;
        }
        int intValue = ((java.lang.Number) lVar2.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar2.f384367e).intValue();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(z1Var.c(), "scaleY", f17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(z1Var.c(), "translationY", intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "doFrameAni >> " + f17 + ' ' + intValue + ' ' + intValue2);
        z1Var.c().setPivotY(0.0f);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.addListener(new ku3.r1(z1Var, intValue2));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public static final float b(ku3.z1 z1Var, int i17) {
        z1Var.getClass();
        return (i17 != 2 ? i17 != 3 ? 1.0f : 1.7777778f : 1.3333334f) / 1.7777778f;
    }

    public final android.widget.ImageView c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f394028f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        p3325xe03a0797.p3326xc267989b.z0.e(this.f394031i, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        this.f394027e.R6(new ku3.u1(this));
    }
}

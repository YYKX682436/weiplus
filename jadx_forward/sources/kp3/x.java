package kp3;

/* loaded from: classes14.dex */
public final class x extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f392581d;

    /* renamed from: e, reason: collision with root package name */
    public final jp3.s f392582e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d f392583f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 f392584g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Size f392585h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f392586i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f392587m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f392588n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f392589o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f392590p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f392591q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f392592r;

    /* renamed from: s, reason: collision with root package name */
    public float f392593s;

    /* renamed from: t, reason: collision with root package name */
    public float f392594t;

    /* renamed from: u, reason: collision with root package name */
    public double f392595u;

    /* renamed from: v, reason: collision with root package name */
    public double f392596v;

    /* renamed from: w, reason: collision with root package name */
    public long f392597w;

    /* renamed from: x, reason: collision with root package name */
    public long f392598x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f392581d = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c).mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.x0("PalmPrintVideoRecord")));
        this.f392582e = new jp3.s();
        this.f392586i = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f392587m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f392588n = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public static final void O6(kp3.x xVar, int i17, java.lang.String str) {
        if (xVar.f392587m.compareAndSet(false, true)) {
            p3325xe03a0797.p3326xc267989b.l.d(xVar.f392581d, null, null, new kp3.i(xVar, i17, str, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PalmPrintCameraSettingUIC", "[handleTimeout] ignore. isVerifyHadResult is true.");
        }
    }

    public static final void P6(kp3.x xVar) {
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d c27879x64e6240d = xVar.f392583f;
        if (c27879x64e6240d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[onRegisterTipSuccess] error, ytRegister is null!");
            jp3.g.f382533a.i(xVar.m158354x19263085(), 80012, "ERR_PALM_SDK_VERIFY", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onRegisterTipSuccess]");
        if (xVar.f392587m.compareAndSet(false, true)) {
            p3325xe03a0797.p3326xc267989b.l.d(xVar.f392581d, null, null, new kp3.n(xVar, c27879x64e6240d, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PalmPrintCameraSettingUIC", "[onRegisterTipSuccess] ignore, isVerifyHadResult is true!");
        }
    }

    public final void Q6(int i17) {
        android.view.View decorView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[startPalmTimer] type: " + i17 + "  (1:focus、2：process、3：record)");
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f392590p;
                if (b4Var == null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new kp3.u(this), false);
                    this.f392590p = b4Var2;
                    b4Var2.c(60000L, 60000L);
                    return;
                } else {
                    if (b4Var != null) {
                        b4Var.d();
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f392590p;
                    if (b4Var3 != null) {
                        b4Var3.c(60000L, 60000L);
                        return;
                    }
                    return;
                }
            }
            if (i17 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[startTimer]： unknown type");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var4 = this.f392591q;
            if (b4Var4 == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var5 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new kp3.v(this), false);
                this.f392591q = b4Var5;
                b4Var5.c(30000L, 30000L);
                return;
            } else {
                if (b4Var4 != null) {
                    b4Var4.d();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var6 = this.f392591q;
                if (b4Var6 != null) {
                    b4Var6.c(30000L, 30000L);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(m80379x76847179());
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = a17.f278668a;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        int i18 = a17.f278669b;
        f0Var2.f391649d = i18;
        if (f0Var.f391649d <= 0 || i18 <= 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.Window window = m158354x19263085().getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            f0Var.f391649d = rect.right - rect.left;
            f0Var2.f391649d = rect.bottom - rect.top;
        }
        if (this.f392585h != null) {
            this.f392595u = f0Var.f391649d / r10.getWidth();
            this.f392596v = f0Var2.f391649d / r10.getHeight();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[startTimer] screenWidth： " + f0Var.f391649d + ", screenHeight ：" + f0Var2.f391649d + " , xRatio: " + this.f392595u + " , yRatio : " + this.f392596v);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var7 = this.f392589o;
        if (b4Var7 == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var8 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new kp3.t(this, f0Var, f0Var2), true);
            this.f392589o = b4Var8;
            b4Var8.c(500L, 2500L);
        } else {
            if (b4Var7 != null) {
                b4Var7.d();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var9 = this.f392589o;
            if (b4Var9 != null) {
                b4Var9.c(500L, 2500L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(int r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kp3.x.R6(int, java.lang.String, java.lang.String):void");
    }

    public final void S6() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f392590p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f392591q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f392589o;
        if (b4Var3 != null) {
            b4Var3.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onDestroy]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = this.f392584g;
        if (c17013x966ea0d1 != null) {
            c17013x966ea0d1.e();
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f392581d, null, 1, null);
        S6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onPause]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = this.f392584g;
        if (c17013x966ea0d1 != null) {
            c17013x966ea0d1.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onResume]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = this.f392584g;
        if (c17013x966ea0d1 != null) {
            c17013x966ea0d1.h();
        }
    }
}

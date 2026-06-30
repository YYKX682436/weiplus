package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.NewChattingTabUI */
/* loaded from: classes11.dex */
public class C21427xe5bb8a3 implements com.p314xaae8f345.mm.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f278547a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.n8 f278548b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 f278549c;

    /* renamed from: d, reason: collision with root package name */
    public int f278550d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.MessageQueue.IdleHandler f278551e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba f278552f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f278553g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278554h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f278555i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f278556j;

    /* renamed from: mChattingUIProxy */
    private com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab f39391x6a280707;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b f278560n;

    /* renamed from: p, reason: collision with root package name */
    public long f278562p;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f278564r;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.Animation f278566t;

    /* renamed from: v, reason: collision with root package name */
    public android.view.animation.Animation f278568v;

    /* renamed from: k, reason: collision with root package name */
    public boolean f278557k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f278558l = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f278559m = new com.p314xaae8f345.mm.ui.pf(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean[] f278561o = {null};

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.dg f278563q = new com.p314xaae8f345.mm.ui.dg(this, null);

    /* renamed from: s, reason: collision with root package name */
    public boolean f278565s = false;

    /* renamed from: mStartChattingRunnable */
    java.lang.Runnable f39392xeac1d598 = new com.p314xaae8f345.mm.ui.xf(this);

    /* renamed from: u, reason: collision with root package name */
    public final db5.x8 f278567u = new com.p314xaae8f345.mm.ui.ag(this);

    public C21427xe5bb8a3(com.p314xaae8f345.mm.ui.n8 n8Var) {
        this.f278548b = n8Var;
    }

    public static void b(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        c21427xe5bb8a3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[doJobOnChattingAnimStart] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c21427xe5bb8a3.f278562p));
        c21427xe5bb8a3.f278558l = true;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = c21427xe5bb8a3.f278549c;
        if (c22559x35245a10 != null) {
            c22559x35245a10.setTranslationX(0.0f);
            c21427xe5bb8a3.f278549c.e();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = c21427xe5bb8a3.f278560n;
            if (abstractC21611x7536149b == null || !abstractC21611x7536149b.m78668x4e2d2008()) {
                return;
            }
            c21427xe5bb8a3.f278560n.m78658x28280f95().m81450x8e764904(false);
        }
    }

    public static void c(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        c21427xe5bb8a3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[doJobOnChattingAnimEnd]");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
        c21427xe5bb8a3.f278558l = false;
        if (c21427xe5bb8a3.f278549c != null) {
            ((ku5.t0) ku5.t0.f394148d).D(new com.p314xaae8f345.mm.ui.of(c21427xe5bb8a3));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = c21427xe5bb8a3.f278560n;
            if (abstractC21611x7536149b == null || !abstractC21611x7536149b.m78668x4e2d2008()) {
                return;
            }
            c21427xe5bb8a3.f278560n.m78658x28280f95().m81450x8e764904(true);
        }
    }

    public static void e(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3, android.content.Intent intent, boolean z17) {
        boolean z18;
        if (!c21427xe5bb8a3.m()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (c21427xe5bb8a3.l()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea();
                c21427xe5bb8a3.f278560n = c21628xcedb13ea;
                c21427xe5bb8a3.f39391x6a280707 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21631x5f0c8f14(c21427xe5bb8a3.f278547a, c21628xcedb13ea);
                z18 = true;
            } else {
                z18 = false;
            }
            try {
                c21427xe5bb8a3.g();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LauncherUI.NewChattingTabUI", e17, "[prepareChattingFragment]", new java.lang.Object[0]);
            }
            if (intent != null) {
                c21427xe5bb8a3.f278560n.m7436x8619eaa0().putAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(intent));
            }
            if (z18) {
                c21427xe5bb8a3.f39391x6a280707.mo78437xc39adf8f(c21427xe5bb8a3.f278550d, z17);
                c21427xe5bb8a3.f278552f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba) c21427xe5bb8a3.f278560n.m7474xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.bkb);
                c21427xe5bb8a3.f278560n.f279689m = true;
            } else {
                c21427xe5bb8a3.f39391x6a280707.mo78433x94b667f0();
            }
            if (c21427xe5bb8a3.f278560n.m78668x4e2d2008()) {
                c21427xe5bb8a3.f278560n.m78658x28280f95().m81454x4335bff3(false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(z18), intent);
            return;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (c21427xe5bb8a3.l()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea();
            c21427xe5bb8a3.f278560n = c21628xcedb13ea2;
            c21427xe5bb8a3.f39391x6a280707 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21631x5f0c8f14(c21427xe5bb8a3.f278547a, c21628xcedb13ea2);
        }
        try {
            c21427xe5bb8a3.g();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LauncherUI.NewChattingTabUI", e18, "[prepareChattingFragment]", new java.lang.Object[0]);
        }
        if (intent != null) {
            c21427xe5bb8a3.f278560n.m7436x8619eaa0().putAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(intent));
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = c21427xe5bb8a3.f278560n;
            if (!abstractC21611x7536149b.f279689m) {
                abstractC21611x7536149b.Q0(c21427xe5bb8a3.f278547a);
            }
        } else {
            if (c21427xe5bb8a3.f278560n.f279689m) {
                c21427xe5bb8a3.f39391x6a280707.mo78433x94b667f0();
            } else {
                c21427xe5bb8a3.f39391x6a280707.mo78437xc39adf8f(c21427xe5bb8a3.f278550d, false);
                c21427xe5bb8a3.f278552f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba) c21427xe5bb8a3.f278560n.m7474xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.bkb);
                c21427xe5bb8a3.f278560n.f279689m = true;
            }
            if (c21427xe5bb8a3.f278560n.m78668x4e2d2008()) {
                c21427xe5bb8a3.f278560n.m78658x28280f95().m81454x4335bff3(false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Boolean.valueOf(!c21427xe5bb8a3.f278560n.f279689m), intent);
    }

    public final boolean a(boolean z17, int i17) {
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = (com.p314xaae8f345.mm.ui.C21374x812c2fd3) this.f278548b;
        c21374x812c2fd3.getClass();
        if (!(c21374x812c2fd3.f278290p == com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus.ACTIVITY_RESUME)) {
            return false;
        }
        android.view.View findViewById = this.f278547a.findViewById(com.p314xaae8f345.mm.R.id.huh);
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] null == container");
            return true;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f278547a.findViewById(com.p314xaae8f345.mm.R.id.l3_);
        if (imageView != null && imageView.getVisibility() == 8 && imageView.getDrawable() != null) {
            imageView.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] prepareView VISIBLE");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "_performOnSettleImpl", "(ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/NewChattingTabUI", "_performOnSettleImpl", "(ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (imageView == null || imageView.getVisibility() != 0) {
            int width = findViewById.getWidth() == 0 ? this.f278547a.getResources().getDisplayMetrics().widthPixels : findViewById.getWidth();
            if (z17) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(findViewById, 208L, 0.0f, 0.0f, null);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(findViewById, 234L, (width * (-1)) / 2.5f, 0.0f, null);
            }
        } else {
            int width2 = imageView.getWidth() == 0 ? this.f278547a.getResources().getDisplayMetrics().widthPixels : imageView.getWidth();
            if (z17) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(imageView, 208L, 0.0f, 0.0f, null);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(imageView, 234L, (width2 * (-1)) / 2.5f, 0.0f, null);
            }
        }
        return true;
    }

    public boolean f(boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b;
        android.widget.ImageView imageView;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = this.f278549c;
        objArr[0] = java.lang.Boolean.valueOf(c22559x35245a10 == null ? false : c22559x35245a10.isShown());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "try closeChatting, ishow:%b", objArr);
        i(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f278559m);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a102 = this.f278549c;
        if (c22559x35245a102 == null || c22559x35245a102.getVisibility() == 8 || (abstractC21611x7536149b = this.f278560n) == null || this.f278547a == null) {
            return false;
        }
        if (abstractC21611x7536149b.m78668x4e2d2008()) {
            al5.a3.c(this.f278547a);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] needAnim:%b", java.lang.Boolean.valueOf(z17));
        ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 4);
        this.f278557k = true;
        if (z17 && this.f278568v == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f278547a, com.p314xaae8f345.mm.ui.uc.f292614d);
            this.f278568v = loadAnimation;
            loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.bg(this));
        }
        db5.m9.a(true, new android.content.Intent().putExtra("classname", "mainui").putExtra("main_process", false));
        if (this.f278560n.mo26090x345d1387() && (imageView = (android.widget.ImageView) this.f278547a.getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_)) != null && imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] prepareView GONE");
        }
        q(0);
        if (z17) {
            this.f39391x6a280707.mo78435xaae90f0c();
            this.f39391x6a280707.mo78436x13e5bfe();
            this.f278549c.startAnimation(this.f278568v);
        } else {
            this.f39391x6a280707.mo78435xaae90f0c();
            this.f39391x6a280707.mo78436x13e5bfe();
            this.f278549c.setVisibility(8);
            this.f278547a.mo2326xb052149b(1.0f);
            s();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0414, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0465  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21427xe5bb8a3.g():void");
    }

    public void h() {
        if (k()) {
            ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 4);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f278560n;
            if (abstractC21611x7536149b == null || !abstractC21611x7536149b.m78668x4e2d2008()) {
                return;
            }
            this.f278560n.m78658x28280f95().m81450x8e764904(false);
        }
    }

    public void i(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f278560n;
            if (abstractC21611x7536149b == null || abstractC21611x7536149b.m7474xfb86a31b() == null) {
                return;
            }
            this.f278560n.m7474xfb86a31b().setImportantForAccessibility(1);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2 = this.f278560n;
        if (abstractC21611x7536149b2 == null || abstractC21611x7536149b2.m7474xfb86a31b() == null || com.p314xaae8f345.mm.ui.bk.y()) {
            return;
        }
        this.f278560n.m7474xfb86a31b().setImportantForAccessibility(4);
    }

    public final int j() {
        int i17;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(this.f278547a);
        boolean isInMultiWindowMode = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() != null ? com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode() : false;
        if (!isInMultiWindowMode) {
            android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
            if ((d17 != null ? d17.getBoolean("Main_need_read_top_margin", false) : false) && (i17 = d17.getInt("Main_top_marign", -1)) >= 0) {
                return i17;
            }
        }
        if (isInMultiWindowMode) {
            h17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", java.lang.Integer.valueOf(h17), java.lang.Boolean.valueOf(isInMultiWindowMode));
        return h17;
    }

    public boolean k() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f278560n;
        if (abstractC21611x7536149b == null) {
            return false;
        }
        return abstractC21611x7536149b.f279685f.f542247i;
    }

    public boolean l() {
        pd5.l lVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f278560n;
        if (abstractC21611x7536149b == null) {
            return true;
        }
        yb5.d dVar = abstractC21611x7536149b.f279685f;
        dVar.getClass();
        if (!(((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19999x68f1fd1b()) == 1) != dVar.f542244f) || ((lVar = abstractC21611x7536149b.f279690n) != null && lVar.a()))) {
            return false;
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = this.f278547a.mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.j(this.f278560n);
        m7630xb2c12e75.g();
        return true;
    }

    public final boolean m() {
        java.lang.Boolean[] boolArr = this.f278561o;
        if (boolArr[0] == null) {
            synchronized (boolArr) {
                java.lang.Boolean[] boolArr2 = this.f278561o;
                if (boolArr2[0] == null) {
                    boolean z17 = true;
                    if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20046xbf32c985()) != 1) {
                        z17 = false;
                    }
                    boolArr2[0] = java.lang.Boolean.valueOf(z17);
                }
            }
        }
        return this.f278561o[0].booleanValue();
    }

    public final boolean n() {
        return db5.f.g() && ep.a.a() && !zo.e.e(this.f278547a);
    }

    public boolean o(boolean z17, int i17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d;
        yf5.j0 j0Var;
        if (!n()) {
            return true;
        }
        if (z17 && (c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) ((com.p314xaae8f345.mm.ui.C21374x812c2fd3) this.f278548b).f278294t.f278468o.get(0)) != null && (j0Var = c22376x88ed722d.f288912v) != null) {
            ((yf5.w0) j0Var).f543521t.b(170);
        }
        return a(z17, i17);
    }

    public final void p() {
        android.graphics.Bitmap bitmap = this.f278564r;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "bitmap recycle %s", this.f278564r.toString());
        this.f278564r.recycle();
    }

    public final void q(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] visible:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f278547a;
        if (activityC21401x6ce6f73f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] getActivity is null");
            return;
        }
        android.view.View findViewById = activityC21401x6ce6f73f.findViewById(com.p314xaae8f345.mm.R.id.huh);
        if (findViewById == null || findViewById.getVisibility() == i17) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "setLauncherContainerVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/NewChattingTabUI", "setLauncherContainerVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void r(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        com.p314xaae8f345.mm.ui.n8 n8Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78658x28280f95;
        this.f278562p = java.lang.System.currentTimeMillis();
        boolean z18 = (com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.c0() || com.p314xaae8f345.mm.ui.bk.y())) || com.p314xaae8f345.mm.ui.bk.Z() || com.p314xaae8f345.mm.ui.bk.w0();
        if (!z18) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f278560n;
            if (abstractC21611x7536149b != null && (m78658x28280f95 = abstractC21611x7536149b.m78658x28280f95()) != null && !m78658x28280f95.C) {
                java.util.LinkedList linkedList = al5.a3.f87397a;
                m78658x28280f95.m81452x86e3665(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20047x9fb82942()) == 1);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.b(true);
            if (z17) {
                if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_suspend_request_layout_extend, 1) == 1) && (n8Var = this.f278548b) != null) {
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = (com.p314xaae8f345.mm.ui.C21374x812c2fd3) n8Var;
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_suspend_request_layout, 1) == 1) {
                        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h17 = c21374x812c2fd3.f278294t.h(0);
                        if (h17 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
                            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) h17).w0(4000L);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "Suspend requestLayout() disabled.");
                    }
                }
            }
        }
        if (m() && !z18 && l()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea();
            this.f278560n = c21628xcedb13ea;
            this.f39391x6a280707 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21631x5f0c8f14(this.f278547a, c21628xcedb13ea);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = this.f278549c;
        objArr[0] = java.lang.Boolean.valueOf(c22559x35245a10 == null ? false : c22559x35245a10.isShown());
        objArr[1] = str;
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "try startChatting, ishow:%b userName:%s needAnim:%b", objArr);
        i(true);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
        this.f278565s = false;
        this.f278555i = bundle;
        this.f278554h = str;
        this.f278556j = z17;
        if (z17) {
            jz5.g gVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.m.f279968a;
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2 = this.f278560n;
            if (abstractC21611x7536149b2 != null) {
                abstractC21611x7536149b2.T0();
            }
        }
        if (!z18) {
            gm0.j1.e().p();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(-8);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f39392xeac1d598);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f39392xeac1d598);
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f278547a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent.putExtra("Chat_User", this.f278554h);
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f278547a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21401x6ce6f73f, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21401x6ce6f73f.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21401x6ce6f73f, "com/tencent/mm/ui/NewChattingTabUI", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void s() {
        if (n()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f278560n == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f278560n;
            if (abstractC21611x7536149b != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78658x28280f95 = abstractC21611x7536149b.m78658x28280f95();
                m78658x28280f95.f292974v = false;
                m78658x28280f95.F = false;
                this.f278560n.m78658x28280f95().f292966n = 0.0f;
            }
        }
    }
}

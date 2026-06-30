package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f229865a = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);

    /* renamed from: b, reason: collision with root package name */
    public static final int f229866b = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 140);

    /* renamed from: c, reason: collision with root package name */
    public static int f229867c;

    /* renamed from: d, reason: collision with root package name */
    public static int f229868d;

    /* renamed from: e, reason: collision with root package name */
    public static int f229869e;

    /* renamed from: f, reason: collision with root package name */
    public static int f229870f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f229871g;

    /* renamed from: h, reason: collision with root package name */
    public static float f229872h;

    static {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 85);
        f229867c = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 39);
        f229868d = 0;
        f229869e = 0;
        f229870f = 0;
        f229871g = 38;
        f229872h = 1.0f;
    }

    public static void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        int i17;
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(abstractActivityC21394xb3d2c0cf);
        int i18 = h17.x;
        int i19 = h17.y;
        int j17 = com.p314xaae8f345.mm.ui.bk.k(abstractActivityC21394xb3d2c0cf) ? i19 - com.p314xaae8f345.mm.ui.bk.j(abstractActivityC21394xb3d2c0cf) : i19;
        if (abstractActivityC21394xb3d2c0cf.mo2533x106ab264() != null) {
            i17 = abstractActivityC21394xb3d2c0cf.mo2533x106ab264().l();
            if (i17 <= 0) {
                i17 = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
            }
        } else {
            i17 = 0;
        }
        int p17 = (j17 - i17) - com.p314xaae8f345.mm.ui.bk.p(abstractActivityC21394xb3d2c0cf);
        double d17 = (i19 / i18) * 1.0d;
        int i27 = f229865a;
        int i28 = d17 > 2.0d ? (p17 - (i27 * 3)) / 20 : (p17 - (i27 * 3)) / 17;
        f229870f = java.lang.Math.max(i28 * 4, f229866b);
        f229867c = (int) (i28 * 1.5d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "baseA: %s, top height: %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(f229870f));
        f229869e = (i18 - (i27 * 2)) / 3;
        gm0.j1.i();
        java.util.Iterator it = ef3.r.wi().Ai(((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, null)).intValue()).iterator();
        int i29 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) it.next();
            if (c19100xad1ade2c != null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(1);
                float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                f229872h = q17;
                if (com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) || com.p314xaae8f345.mm.ui.bk.M(f229872h, i65.a.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
                    f229872h = i65.a.t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
                textPaint.setTextSize(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14) * f229872h);
                int height = new android.text.StaticLayout(c19100xad1ade2c.f261353e, textPaint, f229869e - i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0), true).getHeight();
                if (i29 < height) {
                    i29 = height;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "maxTextHeight: %s", java.lang.Integer.valueOf(i29));
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 24) + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 35) + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 5) + i29 + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        f229868d = b17;
        int i37 = f229869e;
        if (b17 < i37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_HEIGHT_SIZE_PX < GRID_Width_SIZE_PX,use GRID_Width_SIZE_PX: %s", java.lang.Integer.valueOf(i37));
            f229868d = f229869e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_GAP_SIZE_PX: %s，GRID_Width_SIZE_PX:%s,MAX_GRID_HEIGHT ：%s", java.lang.Integer.valueOf(f229867c), java.lang.Integer.valueOf(f229869e), java.lang.Integer.valueOf(f229868d));
    }

    public static void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17, boolean z18) {
        if (z18) {
            a(abstractActivityC21394xb3d2c0cf, z17);
            return;
        }
        a(abstractActivityC21394xb3d2c0cf, z17);
        if (z17) {
            f229870f = f229870f + i65.a.b(abstractActivityC21394xb3d2c0cf, f229871g) + f229865a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "calcGridSize, GRID_HEIGHT_SIZE_PX: %s, TOP_FUNC_LINE_GRID_SIZE_PX: %s", java.lang.Integer.valueOf(f229868d), java.lang.Integer.valueOf(f229870f));
    }

    public static void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        android.graphics.Rect rect = new android.graphics.Rect();
        abstractActivityC21394xb3d2c0cf.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i17 = rect.right - rect.left;
        int i18 = f229865a;
        int i19 = i18 * 11;
        int i27 = (i17 - (i19 * 4)) / 5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "screenWidth，：%s , defaultGapWidth: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "baseA：%s , tempGridGapSize: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
        if (i27 >= i18) {
            f229867c = i27;
            f229869e = i19;
        } else {
            f229867c = i18;
            f229869e = (i17 - (i18 * 5)) / 4;
        }
        gm0.j1.i();
        int i28 = 0;
        java.util.Iterator it = bt4.d.b(((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue()).iterator();
        while (it.hasNext()) {
            r45.n53 n53Var = (r45.n53) it.next();
            if (n53Var != null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(1);
                float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                f229872h = q17;
                if (com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) || com.p314xaae8f345.mm.ui.bk.M(f229872h, i65.a.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
                    f229872h = i65.a.t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
                textPaint.setTextSize(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14) * f229872h);
                int height = new android.text.StaticLayout(n53Var.f462615d.f463530e, textPaint, f229869e, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6), true).getHeight();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n53Var.f462621m)) {
                    textPaint.setTextSize(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10) * f229872h);
                    height = height + new android.text.StaticLayout(n53Var.f462621m, textPaint, f229869e, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6), true).getHeight() + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
                }
                if (i28 < height) {
                    i28 = height;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "maxTextHeight: %s", java.lang.Integer.valueOf(i28));
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 32) + b17 + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10) + i28 + b17;
        f229868d = b18;
        int i29 = f229869e;
        if (b18 < i29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_HEIGHT_SIZE_PX < GRID_Width_SIZE_PX,use GRID_Width_SIZE_PX: %s", java.lang.Integer.valueOf(i29));
            f229868d = f229869e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionGridSizeCalculator", "GRID_GAP_SIZE_PX: %s，GRID_Width_SIZE_PX:%s,MAX_GRID_HEIGHT ：%s", java.lang.Integer.valueOf(f229867c), java.lang.Integer.valueOf(f229869e), java.lang.Integer.valueOf(f229868d));
    }
}

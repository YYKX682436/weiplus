package lw2;

/* loaded from: classes15.dex */
public final class o {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f403123J;
    public android.util.Size K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public android.view.VelocityTracker Q;
    public long R;
    public long S;
    public float T;

    /* renamed from: a, reason: collision with root package name */
    public final float f403124a;

    /* renamed from: b, reason: collision with root package name */
    public final float f403125b;

    /* renamed from: c, reason: collision with root package name */
    public final float f403126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f403127d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f403128e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f403129f;

    /* renamed from: g, reason: collision with root package name */
    public nn0.a0 f403130g;

    /* renamed from: h, reason: collision with root package name */
    public int f403131h;

    /* renamed from: i, reason: collision with root package name */
    public int f403132i;

    /* renamed from: j, reason: collision with root package name */
    public final int f403133j;

    /* renamed from: k, reason: collision with root package name */
    public final int f403134k;

    /* renamed from: l, reason: collision with root package name */
    public final float f403135l;

    /* renamed from: m, reason: collision with root package name */
    public final float f403136m;

    /* renamed from: n, reason: collision with root package name */
    public final float f403137n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f403138o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f403139p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.PointF f403140q;

    /* renamed from: r, reason: collision with root package name */
    public int f403141r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.PointF f403142s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.PointF f403143t;

    /* renamed from: u, reason: collision with root package name */
    public float f403144u;

    /* renamed from: v, reason: collision with root package name */
    public float f403145v;

    /* renamed from: w, reason: collision with root package name */
    public float f403146w;

    /* renamed from: x, reason: collision with root package name */
    public float f403147x;

    /* renamed from: y, reason: collision with root package name */
    public float f403148y;

    /* renamed from: z, reason: collision with root package name */
    public float f403149z;

    public o(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f403124a = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Kf).mo141623x754a37bb()).r()).floatValue();
        this.f403125b = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Lf).mo141623x754a37bb()).r()).floatValue();
        this.f403126c = 1.01f;
        this.f403127d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Mf).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
        int b17 = e8Var.b(context);
        this.f403133j = b17;
        this.f403134k = e8Var.c(null);
        float f17 = (b17 * 2.25f) / 40.0f;
        this.f403135l = f17;
        this.f403136m = f17;
        this.f403137n = 5.0f;
        this.f403139p = new int[2];
        this.f403140q = new android.graphics.PointF();
        this.f403142s = new android.graphics.PointF();
        this.f403143t = new android.graphics.PointF();
        this.f403145v = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.F = 10.0f;
        this.G = 2.0f;
        this.H = 0.1f;
        this.I = 1.0f;
        on0.c cVar = on0.c.f428320d;
        this.K = new android.util.Size(0, 0);
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleManager", str);
    }

    public final void b() {
        android.view.View view = this.f403138o;
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleManager", "checkAnimate viewScale: " + this.B + " scalePrevPoint: " + this.f403142s + " viewTransitionX: " + this.f403148y + " viewTransitionY: " + this.f403149z);
            nn0.a0 a0Var = this.f403130g;
            if (a0Var != null) {
                a0Var.h0(this.B == 1.0f);
            }
            view.setScaleX(this.B);
            view.setScaleY(this.B);
            view.setTranslationX(this.f403148y);
            view.setTranslationY(this.f403149z);
        }
    }

    public final void c(android.graphics.PointF pointF) {
        android.graphics.PointF pointF2 = this.f403142s;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        a("saveScalePrevPoint origin point: " + pointF.y);
        this.f403142s.y = (((float) this.f403132i) / ((float) this.f403133j)) * pointF.y;
        a("saveScalePrevPoint after point: " + this.f403142s.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r9, int r10, android.util.Size r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw2.o.d(int, int, android.util.Size):void");
    }

    public final void e() {
        if (this.f403131h <= 0 || this.f403132i <= 0) {
            return;
        }
        if (this.B <= 1.0f) {
            this.f403148y = 0.0f;
            this.f403149z = 0.0f;
            return;
        }
        this.f403148y += this.f403146w;
        this.f403149z += this.f403147x;
        android.view.View view = this.f403138o;
        if (view != null) {
            int i17 = 1;
            float f17 = 1;
            float pivotX = view.getPivotX() * (this.B - f17);
            float f18 = this.f403136m;
            float f19 = pivotX + f18;
            float pivotX2 = ((view.getPivotX() - this.f403131h) * (this.B - f17)) - f18;
            if (this.f403148y > f19) {
                this.f403148y = f19;
            }
            if (this.f403148y < pivotX2) {
                this.f403148y = pivotX2;
            }
            float pivotY = view.getPivotY();
            float f27 = this.B;
            float f28 = pivotY * (f27 - f17);
            float f29 = this.f403139p[1] - f28;
            float f37 = this.f403149z;
            float f38 = f29 + f37;
            float f39 = this.f403132i * f27;
            float f47 = f39 + f38;
            int i18 = this.f403133j;
            float f48 = i18;
            if (f39 <= f48) {
                this.f403149z = f37 - this.f403147x;
                return;
            }
            float f49 = this.f403135l;
            if (f38 > f49) {
                this.f403149z = f49 - f29;
            } else {
                i17 = 0;
            }
            float f57 = f48 - f49;
            if (f47 < f57) {
                this.f403149z = f57 - (f29 + f39);
                i17 = 2;
            }
            a("checkOnMove hit:" + i17 + " pivotX:" + view.getPivotX() + " pivotY:" + view.getPivotY() + " yOffset:" + f28 + "yTop:" + f38 + " yBottom:" + f47 + " viewTransitionY:" + this.f403149z + " translation[" + view.getTranslationY() + "] threshold:" + f49 + " screenHeight:" + i18 + ' ');
        }
    }

    public final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateViewLocation animViewScreenPos: ");
        int[] iArr = this.f403139p;
        sb6.append(iArr[0]);
        sb6.append(' ');
        sb6.append(iArr[1]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleManager", sb6.toString());
        android.view.View view = this.f403138o;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            d(view.getMeasuredWidth(), view.getMeasuredHeight(), this.K);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleManager", "updateViewLocation after animViewScreenPos: " + iArr[0] + ' ' + iArr[1]);
    }
}

package d94;

/* loaded from: classes4.dex */
public class i {
    public d94.f B;
    public android.graphics.Point C;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f309098a;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f309102e;

    /* renamed from: f, reason: collision with root package name */
    public int f309103f;

    /* renamed from: g, reason: collision with root package name */
    public int f309104g;

    /* renamed from: i, reason: collision with root package name */
    public float f309106i;

    /* renamed from: j, reason: collision with root package name */
    public float f309107j;

    /* renamed from: m, reason: collision with root package name */
    public int f309110m;

    /* renamed from: n, reason: collision with root package name */
    public int f309111n;

    /* renamed from: o, reason: collision with root package name */
    public long f309112o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f309113p;

    /* renamed from: q, reason: collision with root package name */
    public float f309114q;

    /* renamed from: r, reason: collision with root package name */
    public float f309115r;

    /* renamed from: s, reason: collision with root package name */
    public float f309116s;

    /* renamed from: t, reason: collision with root package name */
    public long f309117t;

    /* renamed from: u, reason: collision with root package name */
    public long f309118u;

    /* renamed from: v, reason: collision with root package name */
    public long f309119v;

    /* renamed from: w, reason: collision with root package name */
    public float f309120w;

    /* renamed from: x, reason: collision with root package name */
    public float f309121x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.animation.Interpolator[] f309122y;

    /* renamed from: z, reason: collision with root package name */
    public long f309123z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Random f309101d = new java.util.Random();

    /* renamed from: h, reason: collision with root package name */
    public long f309105h = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f309108k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f309109l = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
    public float A = 0.8f;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f309099b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f309100c = new java.util.LinkedList();

    public i(android.content.Context context, android.widget.FrameLayout frameLayout) {
        this.f309098a = context;
        this.f309102e = frameLayout;
    }

    public static float d(android.content.Context context, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        try {
            float f18 = (context.getResources().getDisplayMetrics().xdpi / 160.0f) * f17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return f18;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParticleGenerator", "dp2px, exp=" + th6.toString());
            float f19 = f17 * 2.5f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dp2px", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return f19;
        }
    }

    public void a(android.graphics.Point point) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int i19 = point.x;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f309113p == null && this.B != null && currentTimeMillis - this.f309112o > 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleGenerator", "try getBitmap");
            android.graphics.Bitmap a17 = this.B.a();
            if (a17 != null) {
                this.f309113p = new android.graphics.drawable.BitmapDrawable(this.f309098a.getResources(), a17);
            }
            this.f309112o = currentTimeMillis;
        }
        if (this.f309113p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ParticleGenerator", "addParticle, bmp==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcTimeDiff", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int i27 = this.f309104g;
        if (e() <= 6) {
            i27 = 0;
        }
        if (e() >= ((int) (this.f309103f * 0.8f))) {
            i27 = (int) (this.f309104g * 1.5f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTimeDiff", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        if (currentTimeMillis - this.f309105h > i27) {
            this.f309105h = currentTimeMillis;
            if (this.C == null) {
                this.C = new android.graphics.Point(point.x, point.y);
            }
            android.graphics.Point point2 = this.C;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            if (this.f309110m <= 0 || this.f309111n <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParticleGenerator", "illegal size, w=" + this.f309110m + ", h=" + this.f309111n);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcPointDistance", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                int sqrt = (int) java.lang.Math.sqrt(java.lang.Math.pow(point.x - point2.x, 2.0d) + java.lang.Math.pow(point.y - point2.y, 2.0d));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPointDistance", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                int i28 = point.x;
                int i29 = i28 - point2.x > 0 ? 1 : 0;
                c(i28, point.y, i29);
                if (e() >= ((int) (this.f309103f * 0.8f))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                } else {
                    int i37 = (int) (this.f309110m * this.f309116s);
                    if (sqrt >= i37) {
                        float f17 = i37 * this.A;
                        int i38 = f17 > 0.0f ? ((int) (sqrt / f17)) - 1 : 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleGenerator", "insert=" + i38);
                        if (i38 > 0) {
                            int i39 = i38 + 1;
                            int abs = java.lang.Math.abs(point.x - point2.x) / i39;
                            int abs2 = java.lang.Math.abs(point.y - point2.y) / i39;
                            for (int i47 = 0; i47 < i38; i47++) {
                                int i48 = point.x;
                                int i49 = point2.x;
                                if (i48 < i49) {
                                    int i57 = i47 + 1;
                                    i18 = i48 + (abs * i57);
                                    int i58 = point.y;
                                    int i59 = i57 * abs2;
                                    i17 = i58 < point2.y ? i58 + i59 : i58 - i59;
                                } else {
                                    int i66 = i47 + 1;
                                    int i67 = i49 + (abs * i66);
                                    int i68 = point2.y;
                                    int i69 = i66 * abs2;
                                    i17 = i68 < point.y ? i68 + i69 : i68 - i69;
                                    i18 = i67;
                                }
                                c(i18, i17, i29);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInsertPoint", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                }
            }
            this.C.set(point.x, point.y);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addParticle", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        android.view.View view = new android.view.View(this.f309098a);
        view.setBackground(this.f309113p);
        this.f309102e.addView(view, new android.widget.FrameLayout.LayoutParams(this.f309110m, this.f309111n));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d94.i.c(int, int, int):void");
    }

    public final int e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int size = this.f309099b.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return size;
    }

    public final int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        int size = this.f309100c.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheCount", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return size;
    }

    public final android.view.animation.Interpolator g(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        android.view.animation.Interpolator[] interpolatorArr = this.f309122y;
        if (interpolatorArr == null || i17 < 0 || i17 >= interpolatorArr.length) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
            return null;
        }
        android.view.animation.Interpolator interpolator = interpolatorArr[i17];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInterpolator", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        return interpolator;
    }

    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleGenerator", "reset");
        this.C = null;
        this.f309105h = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    public final void i(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator", "resetParticleView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/touchparticle/ParticleGenerator", "resetParticleView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetParticleView", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }

    public void j(d94.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        this.B = fVar;
        this.f309113p = null;
        android.graphics.Bitmap a17 = fVar.a();
        android.content.Context context = this.f309098a;
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleGenerator", "setAnimConfig, bmp!=null");
            this.f309113p = new android.graphics.drawable.BitmapDrawable(context.getResources(), a17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleGenerator", "setAnimConfig, bmp==null");
        }
        this.f309112o = java.lang.System.currentTimeMillis();
        android.view.animation.Interpolator[] interpolatorArr = new android.view.animation.Interpolator[4];
        this.f309122y = interpolatorArr;
        interpolatorArr[0] = new android.view.animation.LinearInterpolator();
        this.f309122y[1] = new android.view.animation.AccelerateInterpolator();
        this.f309122y[2] = new android.view.animation.DecelerateInterpolator();
        this.f309122y[3] = new android.view.animation.AccelerateDecelerateInterpolator();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initParam", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        this.f309106i = d(context, fVar.f309083m);
        this.f309107j = d(context, fVar.f309084n);
        this.f309110m = i65.a.b(context, fVar.f309072b);
        this.f309111n = i65.a.b(context, fVar.f309071a);
        this.f309103f = fVar.f309073c;
        int i17 = fVar.f309074d;
        if (i17 <= 0) {
            i17 = 30;
        }
        this.f309104g = 1000 / i17;
        this.f309120w = fVar.f309079i;
        this.f309121x = fVar.f309080j;
        long j17 = fVar.f309082l;
        this.f309118u = j17;
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParticleGenerator", "illegal fadeOutDelay:" + this.f309118u);
            this.f309118u = 300L;
        }
        long j18 = fVar.f309081k;
        this.f309119v = j18;
        if (j18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParticleGenerator", "illegal fadeOutDuration:" + this.f309119v);
            this.f309119v = 300L;
        }
        this.f309114q = fVar.f309075e;
        this.f309115r = fVar.f309076f;
        this.f309116s = fVar.f309077g;
        long j19 = fVar.f309078h;
        this.f309117t = j19;
        if (j19 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParticleGenerator", "illegal scaleDuration:" + this.f309117t);
            this.f309117t = 300L;
        }
        float f17 = fVar.f309085o;
        this.A = f17;
        if (f17 <= 0.0f) {
            this.A = 0.8f;
        }
        this.f309123z = this.f309118u + this.f309119v + 50;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initParam", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
    }
}

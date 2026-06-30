package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes15.dex */
public abstract class c implements android.view.View.OnTouchListener {

    /* renamed from: w, reason: collision with root package name */
    public static final int f92617w = android.view.ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a f92618d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Interpolator f92619e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f92620f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f92621g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f92622h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f92623i;

    /* renamed from: m, reason: collision with root package name */
    public int f92624m;

    /* renamed from: n, reason: collision with root package name */
    public int f92625n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f92626o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f92627p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f92628q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f92629r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f92630s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f92631t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f92632u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f92633v;

    public c(android.view.View view) {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a aVar = new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a();
        this.f92618d = aVar;
        this.f92619e = new android.view.animation.AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f92622h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f92623i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f92626o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f92627p = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f92628q = fArr5;
        this.f92620f = view;
        float f17 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        float f18 = ((int) ((1575.0f * f17) + 0.5f)) / 1000.0f;
        fArr5[0] = f18;
        fArr5[1] = f18;
        float f19 = ((int) ((f17 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f19;
        fArr4[1] = f19;
        this.f92624m = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f92625n = f92617w;
        aVar.f92607a = 500;
        aVar.f92608b = 500;
    }

    public static float b(float f17, float f18, float f19) {
        return f17 > f19 ? f19 : f17 < f18 ? f18 : f17;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f92622h
            r0 = r0[r4]
            float[] r1 = r3.f92623i
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.Interpolator r0 = r3.f92619e
            if (r6 >= 0) goto L27
            float r5 = -r5
            android.view.animation.AccelerateInterpolator r0 = (android.view.animation.AccelerateInterpolator) r0
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L31
        L27:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L3a
            android.view.animation.AccelerateInterpolator r0 = (android.view.animation.AccelerateInterpolator) r0
            float r5 = r0.getInterpolation(r5)
        L31:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L3b
        L3a:
            r5 = r2
        L3b:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L40
            return r2
        L40:
            float[] r0 = r3.f92626o
            r0 = r0[r4]
            float[] r1 = r3.f92627p
            r1 = r1[r4]
            float[] r2 = r3.f92628q
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L55
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L55:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c.a(int, float, float, float):float");
    }

    public final float c(float f17, float f18) {
        if (f18 == 0.0f) {
            return 0.0f;
        }
        int i17 = this.f92624m;
        if (i17 == 0 || i17 == 1) {
            if (f17 < f18) {
                if (f17 >= 0.0f) {
                    return 1.0f - (f17 / f18);
                }
                if (this.f92632u && i17 == 1) {
                    return 1.0f;
                }
            }
        } else if (i17 == 2 && f17 < 0.0f) {
            return f17 / (-f18);
        }
        return 0.0f;
    }

    public final void d() {
        int i17 = 0;
        if (this.f92630s) {
            this.f92632u = false;
            return;
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a aVar = this.f92618d;
        aVar.getClass();
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        int i18 = (int) (currentAnimationTimeMillis - aVar.f92611e);
        int i19 = aVar.f92608b;
        if (i18 > i19) {
            i17 = i19;
        } else if (i18 >= 0) {
            i17 = i18;
        }
        aVar.f92615i = i17;
        aVar.f92614h = aVar.a(currentAnimationTimeMillis);
        aVar.f92613g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e() {
        /*
            r9 = this;
            androidx.core.widget.a r0 = r9.f92618d
            float r1 = r0.f92610d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f92609c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L55
            r3 = r9
            androidx.core.widget.k r3 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.k) r3
            android.widget.ListView r3 = r3.f92636x
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L23
        L21:
            r1 = r2
            goto L51
        L23:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r4) goto L50
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r5
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r5
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f92633v
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7d
        L16:
            r7.d()
            goto L7d
        L1a:
            r7.f92631t = r2
            r7.f92629r = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f92620f
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            androidx.core.widget.a r9 = r7.f92618d
            r9.f92609c = r0
            r9.f92610d = r8
            boolean r8 = r7.f92632u
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            java.lang.Runnable r8 = r7.f92621g
            if (r8 != 0) goto L5f
            androidx.core.widget.b r8 = new androidx.core.widget.b
            r8.<init>(r7)
            r7.f92621g = r8
        L5f:
            r7.f92632u = r2
            r7.f92630s = r2
            boolean r8 = r7.f92629r
            if (r8 != 0) goto L74
            int r8 = r7.f92625n
            if (r8 <= 0) goto L74
            java.lang.Runnable r9 = r7.f92621g
            long r5 = (long) r8
            java.util.WeakHashMap r8 = n3.l1.f415895a
            n3.u0.n(r4, r9, r5)
            goto L7b
        L74:
            java.lang.Runnable r8 = r7.f92621g
            androidx.core.widget.b r8 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.b) r8
            r8.run()
        L7b:
            r7.f92629r = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p075x2eaf9f.p079xd1075a44.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

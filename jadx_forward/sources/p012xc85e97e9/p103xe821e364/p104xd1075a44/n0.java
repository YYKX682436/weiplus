package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class n0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {
    public static final int[] I = {android.R.attr.state_pressed};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f93678J = new int[0];
    public final android.animation.ValueAnimator F;
    public int G;
    public final java.lang.Runnable H;

    /* renamed from: d, reason: collision with root package name */
    public final int f93679d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93680e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f93681f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f93682g;

    /* renamed from: h, reason: collision with root package name */
    public final int f93683h;

    /* renamed from: i, reason: collision with root package name */
    public final int f93684i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f93685m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f93686n;

    /* renamed from: o, reason: collision with root package name */
    public final int f93687o;

    /* renamed from: p, reason: collision with root package name */
    public final int f93688p;

    /* renamed from: q, reason: collision with root package name */
    public int f93689q;

    /* renamed from: r, reason: collision with root package name */
    public int f93690r;

    /* renamed from: s, reason: collision with root package name */
    public float f93691s;

    /* renamed from: t, reason: collision with root package name */
    public int f93692t;

    /* renamed from: u, reason: collision with root package name */
    public int f93693u;

    /* renamed from: v, reason: collision with root package name */
    public float f93694v;

    /* renamed from: y, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93697y;

    /* renamed from: w, reason: collision with root package name */
    public int f93695w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f93696x = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f93698z = false;
    public boolean A = false;
    public int B = 0;
    public int C = 0;
    public final int[] D = new int[2];
    public final int[] E = new int[2];

    public n0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i17, int i18, int i19) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        this.G = 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j0 j0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.j0(this);
        this.H = j0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k0 k0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.k0(this);
        this.f93681f = stateListDrawable;
        this.f93682g = drawable;
        this.f93685m = stateListDrawable2;
        this.f93686n = drawable2;
        this.f93683h = java.lang.Math.max(i17, stateListDrawable.getIntrinsicWidth());
        this.f93684i = java.lang.Math.max(i17, drawable.getIntrinsicWidth());
        this.f93687o = java.lang.Math.max(i17, stateListDrawable2.getIntrinsicWidth());
        this.f93688p = java.lang.Math.max(i17, drawable2.getIntrinsicWidth());
        this.f93679d = i18;
        this.f93680e = i19;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.l0(this));
        ofFloat.addUpdateListener(new p012xc85e97e9.p103xe821e364.p104xd1075a44.m0(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f93697y;
        if (c1163xf1deaba42 == c1163xf1deaba4) {
            return;
        }
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.S0(this);
            this.f93697y.U0(this);
            this.f93697y.V0(k0Var);
            this.f93697y.removeCallbacks(j0Var);
        }
        this.f93697y = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.N(this);
            this.f93697y.P(this);
            this.f93697y.i(k0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r8 >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        if (r4 >= 0) goto L49;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.n0.a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.MotionEvent motionEvent) {
        int i17 = this.B;
        if (i17 == 1) {
            boolean e17 = e(motionEvent.getX(), motionEvent.getY());
            boolean d17 = d(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!e17 && !d17) {
                return false;
            }
            if (d17) {
                this.C = 1;
                this.f93694v = (int) motionEvent.getX();
            } else if (e17) {
                this.C = 2;
                this.f93691s = (int) motionEvent.getY();
            }
            f(2);
        } else if (i17 != 2) {
            return false;
        }
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }

    public boolean d(float f17, float f18) {
        if (f18 >= this.f93696x - this.f93687o) {
            int i17 = this.f93693u;
            int i18 = this.f93692t;
            if (f17 >= i17 - (i18 / 2) && f17 <= i17 + (i18 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(float f17, float f18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93697y;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z17 = n3.v0.d(c1163xf1deaba4) == 1;
        int i17 = this.f93683h;
        if (z17) {
            if (f17 > i17 / 2) {
                return false;
            }
        } else if (f17 < this.f93695w - i17) {
            return false;
        }
        int i18 = this.f93690r;
        int i19 = this.f93689q / 2;
        return f18 >= ((float) (i18 - i19)) && f18 <= ((float) (i18 + i19));
    }

    public void f(int i17) {
        java.lang.Runnable runnable = this.H;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.f93681f;
        if (i17 == 2 && this.B != 2) {
            stateListDrawable.setState(I);
            this.f93697y.removeCallbacks(runnable);
        }
        if (i17 == 0) {
            this.f93697y.invalidate();
        } else {
            g();
        }
        if (this.B == 2 && i17 != 2) {
            stateListDrawable.setState(f93678J);
            this.f93697y.removeCallbacks(runnable);
            this.f93697y.postDelayed(runnable, 1200);
        } else if (i17 == 1) {
            this.f93697y.removeCallbacks(runnable);
            this.f93697y.postDelayed(runnable, 1500);
        }
        this.B = i17;
    }

    public void g() {
        int i17 = this.G;
        android.animation.ValueAnimator valueAnimator = this.F;
        if (i17 != 0) {
            if (i17 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.G = 1;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f93695w != this.f93697y.getWidth() || this.f93696x != this.f93697y.getHeight()) {
            this.f93695w = this.f93697y.getWidth();
            this.f93696x = this.f93697y.getHeight();
            f(0);
            return;
        }
        if (this.G != 0) {
            if (this.f93698z) {
                int i17 = this.f93695w;
                int i18 = this.f93683h;
                int i19 = i17 - i18;
                int i27 = this.f93690r;
                int i28 = this.f93689q;
                int i29 = i27 - (i28 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable = this.f93681f;
                stateListDrawable.setBounds(0, 0, i18, i28);
                int i37 = this.f93696x;
                int i38 = this.f93684i;
                android.graphics.drawable.Drawable drawable = this.f93682g;
                drawable.setBounds(0, 0, i38, i37);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f93697y;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                if (n3.v0.d(c1163xf1deaba42) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i18, i29);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i18, -i29);
                } else {
                    canvas.translate(i19, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i29);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i19, -i29);
                }
            }
            if (this.A) {
                int i39 = this.f93696x;
                int i47 = this.f93687o;
                int i48 = i39 - i47;
                int i49 = this.f93693u;
                int i57 = this.f93692t;
                int i58 = i49 - (i57 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = this.f93685m;
                stateListDrawable2.setBounds(0, 0, i57, i47);
                int i59 = this.f93695w;
                int i66 = this.f93688p;
                android.graphics.drawable.Drawable drawable2 = this.f93686n;
                drawable2.setBounds(0, 0, i59, i66);
                canvas.translate(0.0f, i48);
                drawable2.draw(canvas);
                canvas.translate(i58, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i58, -i48);
            }
        }
    }
}

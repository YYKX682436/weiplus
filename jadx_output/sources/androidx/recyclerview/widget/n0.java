package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class n0 extends androidx.recyclerview.widget.p2 implements androidx.recyclerview.widget.v2 {
    public static final int[] I = {android.R.attr.state_pressed};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f12145J = new int[0];
    public final android.animation.ValueAnimator F;
    public int G;
    public final java.lang.Runnable H;

    /* renamed from: d, reason: collision with root package name */
    public final int f12146d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12147e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f12148f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f12149g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12150h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12151i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f12152m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f12153n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12154o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12155p;

    /* renamed from: q, reason: collision with root package name */
    public int f12156q;

    /* renamed from: r, reason: collision with root package name */
    public int f12157r;

    /* renamed from: s, reason: collision with root package name */
    public float f12158s;

    /* renamed from: t, reason: collision with root package name */
    public int f12159t;

    /* renamed from: u, reason: collision with root package name */
    public int f12160u;

    /* renamed from: v, reason: collision with root package name */
    public float f12161v;

    /* renamed from: y, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f12164y;

    /* renamed from: w, reason: collision with root package name */
    public int f12162w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f12163x = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12165z = false;
    public boolean A = false;
    public int B = 0;
    public int C = 0;
    public final int[] D = new int[2];
    public final int[] E = new int[2];

    public n0(androidx.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i17, int i18, int i19) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        this.G = 0;
        androidx.recyclerview.widget.j0 j0Var = new androidx.recyclerview.widget.j0(this);
        this.H = j0Var;
        androidx.recyclerview.widget.k0 k0Var = new androidx.recyclerview.widget.k0(this);
        this.f12148f = stateListDrawable;
        this.f12149g = drawable;
        this.f12152m = stateListDrawable2;
        this.f12153n = drawable2;
        this.f12150h = java.lang.Math.max(i17, stateListDrawable.getIntrinsicWidth());
        this.f12151i = java.lang.Math.max(i17, drawable.getIntrinsicWidth());
        this.f12154o = java.lang.Math.max(i17, stateListDrawable2.getIntrinsicWidth());
        this.f12155p = java.lang.Math.max(i17, drawable2.getIntrinsicWidth());
        this.f12146d = i18;
        this.f12147e = i19;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new androidx.recyclerview.widget.l0(this));
        ofFloat.addUpdateListener(new androidx.recyclerview.widget.m0(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f12164y;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.S0(this);
            this.f12164y.U0(this);
            this.f12164y.V0(k0Var);
            this.f12164y.removeCallbacks(j0Var);
        }
        this.f12164y = recyclerView;
        if (recyclerView != null) {
            recyclerView.N(this);
            this.f12164y.P(this);
            this.f12164y.i(k0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r8 >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        if (r4 >= 0) goto L49;
     */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.recyclerview.widget.RecyclerView r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n0.a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
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
                this.f12161v = (int) motionEvent.getX();
            } else if (e17) {
                this.C = 2;
                this.f12158s = (int) motionEvent.getY();
            }
            f(2);
        } else if (i17 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }

    public boolean d(float f17, float f18) {
        if (f18 >= this.f12163x - this.f12154o) {
            int i17 = this.f12160u;
            int i18 = this.f12159t;
            if (f17 >= i17 - (i18 / 2) && f17 <= i17 + (i18 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(float f17, float f18) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12164y;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z17 = n3.v0.d(recyclerView) == 1;
        int i17 = this.f12150h;
        if (z17) {
            if (f17 > i17 / 2) {
                return false;
            }
        } else if (f17 < this.f12162w - i17) {
            return false;
        }
        int i18 = this.f12157r;
        int i19 = this.f12156q / 2;
        return f18 >= ((float) (i18 - i19)) && f18 <= ((float) (i18 + i19));
    }

    public void f(int i17) {
        java.lang.Runnable runnable = this.H;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.f12148f;
        if (i17 == 2 && this.B != 2) {
            stateListDrawable.setState(I);
            this.f12164y.removeCallbacks(runnable);
        }
        if (i17 == 0) {
            this.f12164y.invalidate();
        } else {
            g();
        }
        if (this.B == 2 && i17 != 2) {
            stateListDrawable.setState(f12145J);
            this.f12164y.removeCallbacks(runnable);
            this.f12164y.postDelayed(runnable, 1200);
        } else if (i17 == 1) {
            this.f12164y.removeCallbacks(runnable);
            this.f12164y.postDelayed(runnable, 1500);
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

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f12162w != this.f12164y.getWidth() || this.f12163x != this.f12164y.getHeight()) {
            this.f12162w = this.f12164y.getWidth();
            this.f12163x = this.f12164y.getHeight();
            f(0);
            return;
        }
        if (this.G != 0) {
            if (this.f12165z) {
                int i17 = this.f12162w;
                int i18 = this.f12150h;
                int i19 = i17 - i18;
                int i27 = this.f12157r;
                int i28 = this.f12156q;
                int i29 = i27 - (i28 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable = this.f12148f;
                stateListDrawable.setBounds(0, 0, i18, i28);
                int i37 = this.f12163x;
                int i38 = this.f12151i;
                android.graphics.drawable.Drawable drawable = this.f12149g;
                drawable.setBounds(0, 0, i38, i37);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f12164y;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (n3.v0.d(recyclerView2) == 1) {
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
                int i39 = this.f12163x;
                int i47 = this.f12154o;
                int i48 = i39 - i47;
                int i49 = this.f12160u;
                int i57 = this.f12159t;
                int i58 = i49 - (i57 / 2);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = this.f12152m;
                stateListDrawable2.setBounds(0, 0, i57, i47);
                int i59 = this.f12162w;
                int i66 = this.f12155p;
                android.graphics.drawable.Drawable drawable2 = this.f12153n;
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

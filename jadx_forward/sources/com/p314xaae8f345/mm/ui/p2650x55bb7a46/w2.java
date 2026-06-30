package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class w2 extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public float f287718d;

    /* renamed from: e, reason: collision with root package name */
    public float f287719e;

    /* renamed from: f, reason: collision with root package name */
    public float f287720f;

    /* renamed from: g, reason: collision with root package name */
    public float f287721g;

    /* renamed from: h, reason: collision with root package name */
    public float f287722h;

    /* renamed from: i, reason: collision with root package name */
    public float f287723i;

    /* renamed from: m, reason: collision with root package name */
    public float f287724m;

    /* renamed from: n, reason: collision with root package name */
    public float f287725n;

    /* renamed from: o, reason: collision with root package name */
    public float f287726o;

    /* renamed from: p, reason: collision with root package name */
    public float f287727p;

    /* renamed from: q, reason: collision with root package name */
    public final int f287728q;

    /* renamed from: r, reason: collision with root package name */
    public final int f287729r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f287730s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f287731t = false;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f287732u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.v2(this);

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 f287733v;

    public w2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16, int i17, int i18) {
        this.f287733v = c21614x5c06ae16;
        this.f287728q = 0;
        this.f287729r = 0;
        this.f287730s = false;
        this.f287728q = i17;
        this.f287729r = i18;
        this.f287730s = false;
    }

    public void a() {
        float f17 = this.f287718d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f287733v;
        int i17 = c21614x5c06ae16.f279727h;
        this.f287722h = f17 * i17;
        this.f287723i = this.f287719e * i17;
        int i18 = this.f287728q;
        if (i18 == 2) {
            float f18 = this.f287720f;
            int i19 = c21614x5c06ae16.f279728i;
            this.f287724m = f18 * i19;
            this.f287725n = this.f287721g * i19;
            return;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                float f19 = this.f287720f;
                int i27 = c21614x5c06ae16.f279728i;
                this.f287724m = f19 * i27;
                this.f287725n = this.f287721g * i27;
                return;
            }
            float f27 = this.f287720f;
            int i28 = c21614x5c06ae16.f279729m;
            this.f287724m = f27 * i28;
            this.f287725n = this.f287721g * i28;
            return;
        }
        float f28 = this.f287720f;
        int i29 = c21614x5c06ae16.f279729m;
        this.f287724m = i29 * f28;
        float f29 = this.f287721g;
        this.f287725n = i29 * f29;
        if (c21614x5c06ae16.f279734r) {
            int i37 = c21614x5c06ae16.f279735s;
            this.f287724m = (f28 * i29) - i37;
            this.f287725n = (f29 * i29) - i37;
        }
        if (this.f287725n < 0.0f) {
            this.f287725n = 0.0f;
        }
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = this.f287728q;
        if (f17 > 0.0f && !this.f287731t) {
            if (i17 == 1) {
                float f18 = this.f287720f;
                int i18 = this.f287733v.f279728i;
                this.f287724m = f18 * i18;
                this.f287725n = this.f287721g * i18;
            }
            this.f287731t = true;
        }
        float f19 = this.f287722h;
        float f27 = this.f287724m;
        float f28 = this.f287723i;
        if (f19 != f28) {
            f19 += (f28 - f19) * f17;
        }
        float f29 = this.f287725n;
        if (f27 != f29) {
            f27 += (f29 - f27) * f17;
            if (i17 == 2) {
                f27 -= this.f287729r;
            }
        }
        transformation.getMatrix().setTranslate(f19, f27);
        float f37 = this.f287726o;
        float f38 = this.f287727p;
        if (f37 == f38 || 3 != i17) {
            return;
        }
        float f39 = f37 + ((f38 - f37) * f17);
        transformation.getMatrix().postScale(f39, f39);
    }

    @Override // android.view.animation.Animation
    public void finalize() {
        super.finalize();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "finalize!");
        this.f287733v.removeOnLayoutChangeListener(this.f287732u);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f287733v;
        int i28 = this.f287728q;
        if (i28 == 1) {
            float a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(0.1f, 0.9f);
            this.f287718d = a17;
            this.f287719e = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(a17 - 0.25f, a17 + 0.25f);
            this.f287720f = 1.1f;
            this.f287721g = -0.2f;
            setInterpolator(new android.view.animation.LinearInterpolator());
        } else if (i28 == 2) {
            this.f287718d = 0.0f;
            this.f287719e = 0.0f;
            this.f287720f = 0.0f;
            this.f287721g = 1.0f;
            setInterpolator(new ta5.a());
        } else if (i28 == 3) {
            this.f287718d = 0.0f;
            this.f287719e = 0.0f;
            this.f287720f = 1.5f;
            if (this.f287730s) {
                this.f287721g = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(0.4f, 0.55f);
            } else {
                this.f287721g = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(0.54999995f, 0.85f);
            }
            setInterpolator(new ta5.b(0.5f));
        } else if (i28 == 4) {
            int i29 = this.f287729r;
            float a18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(0.0f, 1.0f - ((i29 * 1.0f) / c21614x5c06ae16.f279728i));
            this.f287718d = 1.0f;
            this.f287719e = 0.0f - ((i29 * 1.0f) / c21614x5c06ae16.f279727h);
            this.f287720f = a18;
            this.f287721g = a18;
            setInterpolator(new android.view.animation.LinearInterpolator());
        } else if (i28 != 999) {
            float a19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(0.1f, 0.9f);
            this.f287718d = a19;
            this.f287719e = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(a19 - 0.5f, a19 + 0.5f);
            this.f287720f = -0.2f;
            this.f287721g = 1.1f;
            setInterpolator(new android.view.animation.LinearInterpolator());
        } else {
            float a27 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(0.1f, 0.9f);
            this.f287718d = a27;
            this.f287719e = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.a(a27 - 0.5f, a27 + 0.5f);
            this.f287720f = 0.0f;
            this.f287721g = 0.0f;
            this.f287726o = 0.8f;
            this.f287727p = 1.1f;
            setInterpolator(new android.view.animation.LinearInterpolator());
        }
        if (i28 != 0 && i28 != 1) {
            c21614x5c06ae16.addOnLayoutChangeListener(this.f287732u);
        }
        a();
    }

    public w2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16, int i17, int i18, boolean z17) {
        this.f287733v = c21614x5c06ae16;
        this.f287728q = 0;
        this.f287729r = 0;
        this.f287730s = false;
        this.f287728q = i17;
        this.f287729r = i18;
        this.f287730s = z17;
    }
}

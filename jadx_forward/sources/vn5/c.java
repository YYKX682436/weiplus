package vn5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f519980a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f519981b;

    /* renamed from: c, reason: collision with root package name */
    public int f519982c;

    /* renamed from: d, reason: collision with root package name */
    public float f519983d;

    /* renamed from: e, reason: collision with root package name */
    public float f519984e;

    /* renamed from: f, reason: collision with root package name */
    public float f519985f;

    /* renamed from: g, reason: collision with root package name */
    public float f519986g;

    /* renamed from: h, reason: collision with root package name */
    public float f519987h;

    /* renamed from: i, reason: collision with root package name */
    public int f519988i;

    /* renamed from: j, reason: collision with root package name */
    public int f519989j;

    /* renamed from: k, reason: collision with root package name */
    public int f519990k;

    /* renamed from: l, reason: collision with root package name */
    public int f519991l;

    /* renamed from: m, reason: collision with root package name */
    public float f519992m;

    /* renamed from: n, reason: collision with root package name */
    public float f519993n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f519994o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f519995p;

    public c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f519980a = view;
        this.f519981b = true;
        this.f519985f = 1.0f;
        this.f519994o = jz5.h.b(vn5.a.f519978d);
        this.f519995p = jz5.h.b(vn5.b.f519979d);
    }

    public void a(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        float f19;
        float f27;
        if (!this.f519981b || canvas == null) {
            return;
        }
        android.view.View view = this.f519980a;
        this.f519992m = view.getMeasuredWidth();
        this.f519993n = view.getMeasuredHeight();
        float f28 = this.f519985f;
        float f29 = this.f519986g;
        if (f29 == 0.0f) {
            f17 = this.f519984e * f28;
            f18 = this.f519992m - f17;
        } else if (f29 < 0.0f) {
            f17 = (this.f519984e * f28) - java.lang.Math.abs(f29);
            f18 = (this.f519992m - (this.f519984e * f28)) - java.lang.Math.abs(this.f519986g);
        } else if (f29 > 0.0f) {
            float f37 = this.f519984e * f28;
            f18 = java.lang.Math.abs(f29) + (this.f519992m - f37);
            f17 = f37;
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        float f38 = this.f519987h;
        if (f38 == 0.0f) {
            f19 = f28 * this.f519984e;
            f27 = this.f519993n - f19;
        } else if (f38 < 0.0f) {
            float abs = (this.f519984e * f28) - java.lang.Math.abs(f38);
            f27 = (this.f519993n - (f28 * this.f519984e)) - java.lang.Math.abs(this.f519987h);
            f19 = abs;
        } else if (f38 > 0.0f) {
            f19 = f28 * this.f519984e;
            f27 = java.lang.Math.abs(f38) + (this.f519993n - f19);
        } else {
            f19 = 0.0f;
            f27 = 0.0f;
        }
        jz5.g gVar = this.f519994o;
        android.graphics.Paint paint = (android.graphics.Paint) ((jz5.n) gVar).mo141623x754a37bb();
        paint.setColor(this.f519982c);
        paint.setAntiAlias(true);
        if (this.f519984e > 0.0f) {
            paint.setMaskFilter(new android.graphics.BlurMaskFilter(this.f519984e, android.graphics.BlurMaskFilter.Blur.OUTER));
        }
        jz5.g gVar2 = this.f519995p;
        ((android.graphics.RectF) ((jz5.n) gVar2).mo141623x754a37bb()).set(f17, f19, f18, f27);
        if (this.f519983d == 0.0f) {
            canvas.drawRect((android.graphics.RectF) ((jz5.n) gVar2).mo141623x754a37bb(), (android.graphics.Paint) ((jz5.n) gVar).mo141623x754a37bb());
            return;
        }
        android.graphics.RectF rectF = (android.graphics.RectF) ((jz5.n) gVar2).mo141623x754a37bb();
        float f39 = this.f519983d;
        canvas.drawRoundRect(rectF, f39, f39, (android.graphics.Paint) ((jz5.n) gVar).mo141623x754a37bb());
    }

    public final void b() {
        float f17 = this.f519986g;
        if (f17 > 0.0f) {
            this.f519989j = (int) (this.f519984e + java.lang.Math.abs(f17));
            this.f519988i = (int) this.f519984e;
        } else {
            if (f17 == 0.0f) {
                float f18 = this.f519984e;
                this.f519988i = (int) f18;
                this.f519989j = (int) f18;
            } else {
                this.f519988i = (int) (this.f519984e + java.lang.Math.abs(f17));
                this.f519989j = (int) this.f519984e;
            }
        }
        float f19 = this.f519987h;
        if (f19 > 0.0f) {
            this.f519991l = (int) (this.f519984e + java.lang.Math.abs(f19));
            this.f519990k = (int) this.f519984e;
        } else {
            if (f19 == 0.0f) {
                float f27 = this.f519984e;
                this.f519990k = (int) f27;
                this.f519991l = (int) f27;
            } else {
                this.f519990k = (int) (this.f519984e + java.lang.Math.abs(f19));
                this.f519991l = (int) this.f519984e;
            }
        }
        this.f519980a.setPadding(this.f519988i, this.f519990k, this.f519989j, this.f519991l);
    }

    public void c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f519982c = obtainStyledAttributes.getColor(2, 0);
        this.f519983d = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f519984e = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f519985f = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f519986g = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f519987h = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
        float f17 = this.f519983d;
        if (f17 < 0.0f) {
            this.f519983d = -f17;
        }
        float f18 = this.f519984e;
        if (f18 < 0.0f) {
            this.f519984e = -f18;
        }
        float f19 = this.f519985f;
        if (f19 < 0.0f) {
            this.f519985f = -f19;
        }
        b();
    }
}

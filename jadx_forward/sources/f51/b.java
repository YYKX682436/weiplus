package f51;

/* loaded from: classes11.dex */
public abstract class b {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public android.view.VelocityTracker E;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f341130a = new android.graphics.Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f341131b = new android.graphics.Paint(1);

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f341132c;

    /* renamed from: d, reason: collision with root package name */
    public long f341133d;

    /* renamed from: e, reason: collision with root package name */
    public float f341134e;

    /* renamed from: f, reason: collision with root package name */
    public float f341135f;

    /* renamed from: g, reason: collision with root package name */
    public float f341136g;

    /* renamed from: h, reason: collision with root package name */
    public float f341137h;

    /* renamed from: i, reason: collision with root package name */
    public float f341138i;

    /* renamed from: j, reason: collision with root package name */
    public float f341139j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Float f341140k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Float f341141l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Long f341142m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Long f341143n;

    /* renamed from: o, reason: collision with root package name */
    public float f341144o;

    /* renamed from: p, reason: collision with root package name */
    public float f341145p;

    /* renamed from: q, reason: collision with root package name */
    public float f341146q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Float f341147r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Long f341148s;

    /* renamed from: t, reason: collision with root package name */
    public long f341149t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Interpolator f341150u;

    /* renamed from: v, reason: collision with root package name */
    public float f341151v;

    /* renamed from: w, reason: collision with root package name */
    public float f341152w;

    /* renamed from: x, reason: collision with root package name */
    public float f341153x;

    /* renamed from: y, reason: collision with root package name */
    public float f341154y;

    /* renamed from: z, reason: collision with root package name */
    public float f341155z;

    public static long a(float f17, float f18, float f19, java.lang.Long l17, java.lang.Float f27, int i17, int i18) {
        if (f19 == 0.0f) {
            if (l17 != null) {
                f18 = f27.floatValue();
            }
            if (f18 > 0.0f) {
                i17 = i18;
            }
            if (f18 == 0.0f) {
                return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
            double d17 = (i17 - f17) / f18;
            return d17 > 0.0d ? (long) d17 : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        if (f19 > 0.0f) {
            i17 = i18;
        }
        if (l17 != null && l17.longValue() >= 0) {
            double longValue = ((((i17 - f17) - (f18 * ((float) l17.longValue()))) - (((f19 * 0.5d) * l17.longValue()) * l17.longValue())) + (f27.floatValue() * ((float) l17.longValue()))) / f27.floatValue();
            return longValue > 0.0d ? (long) longValue : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        float f28 = 2.0f * f19;
        double sqrt = java.lang.Math.sqrt(((i17 * f28) - (f28 * f17)) + (f18 * f18));
        double d18 = f18;
        double d19 = f19;
        double d27 = ((-sqrt) - d18) / d19;
        if (d27 > 0.0d) {
            return (long) d27;
        }
        double d28 = (sqrt - d18) / d19;
        return d28 > 0.0d ? (long) d28 : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
    }

    public static java.lang.Long c(java.lang.Float f17, float f18, float f19) {
        if (f17 != null) {
            if (f19 != 0.0f) {
                long floatValue = (f17.floatValue() - f18) / f19;
                return java.lang.Long.valueOf(floatValue > 0 ? floatValue : 0L);
            }
            if (f17.floatValue() < f18) {
                return 0L;
            }
        }
        return null;
    }

    public final float b(long j17, float f17, float f18, float f19, java.lang.Long l17, java.lang.Float f27) {
        if (l17 != null && j17 >= l17.longValue()) {
            return f17 + (f18 * ((float) l17.longValue())) + (f19 * 0.5f * ((float) l17.longValue()) * ((float) l17.longValue())) + (((float) (j17 - l17.longValue())) * f27.floatValue());
        }
        float f28 = (float) j17;
        return f17 + (f18 * f28) + (f19 * 0.5f * f28 * f28);
    }

    public final void d(android.graphics.Canvas canvas, float f17, float f18, float f19, float f27) {
        canvas.save();
        canvas.clipRect(this.f341132c);
        android.graphics.Matrix matrix = this.f341130a;
        matrix.reset();
        android.graphics.Paint paint = this.f341131b;
        paint.setAlpha(this.A);
        e(canvas, matrix, paint, f17, f18, f19, f27);
        canvas.restore();
    }

    public abstract void e(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.Paint paint, float f17, float f18, float f19, float f27);

    public abstract int f();

    public abstract int g();

    public void h(android.graphics.Rect rect) {
        this.f341132c = rect;
        this.f341142m = c(this.f341140k, this.f341136g, this.f341138i);
        this.f341143n = c(this.f341141l, this.f341137h, this.f341139j);
        this.f341148s = c(this.f341147r, this.f341145p, this.f341146q);
        if (this.f341151v == 0.0f) {
            long j17 = this.f341149t;
            this.f341151v = j17 >= 0 ? (float) j17 : 9.223372E18f;
            this.f341151v = java.lang.Math.min((float) a(this.f341134e, this.f341136g, this.f341138i, this.f341142m, this.f341140k, rect.left - g(), rect.right), this.f341151v);
            this.f341151v = java.lang.Math.min((float) a(this.f341135f, this.f341137h, this.f341139j, this.f341143n, this.f341141l, rect.top - f(), rect.bottom), this.f341151v);
        }
        this.f341131b.setAlpha(this.A);
    }

    public void i() {
        this.f341133d = 0L;
        this.f341135f = 0.0f;
        this.f341134e = 0.0f;
        this.f341137h = 0.0f;
        this.f341136g = 0.0f;
        this.f341139j = 0.0f;
        this.f341138i = 0.0f;
        this.f341141l = null;
        this.f341140k = null;
        this.f341143n = null;
        this.f341142m = null;
        this.f341144o = 0.0f;
        this.f341145p = 0.0f;
        this.f341146q = 0.0f;
        this.f341147r = null;
        this.f341148s = null;
        this.f341149t = 0L;
        this.f341151v = 0.0f;
        this.f341152w = 0.0f;
        this.f341150u = null;
        this.f341154y = 0.0f;
        this.f341153x = 0.0f;
        this.f341155z = 0.0f;
        this.A = 255;
        this.B = false;
        this.C = false;
    }
}

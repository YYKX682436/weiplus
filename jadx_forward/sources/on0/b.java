package on0;

/* loaded from: classes3.dex */
public final class b {
    public on0.c A;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f428294a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f428295b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f428296c;

    /* renamed from: d, reason: collision with root package name */
    public nn0.a0 f428297d;

    /* renamed from: e, reason: collision with root package name */
    public int f428298e;

    /* renamed from: f, reason: collision with root package name */
    public int f428299f;

    /* renamed from: g, reason: collision with root package name */
    public final int f428300g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f428301h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f428302i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.PointF f428303j;

    /* renamed from: k, reason: collision with root package name */
    public int f428304k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.PointF f428305l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.PointF f428306m;

    /* renamed from: n, reason: collision with root package name */
    public float f428307n;

    /* renamed from: o, reason: collision with root package name */
    public float f428308o;

    /* renamed from: p, reason: collision with root package name */
    public float f428309p;

    /* renamed from: q, reason: collision with root package name */
    public float f428310q;

    /* renamed from: r, reason: collision with root package name */
    public float f428311r;

    /* renamed from: s, reason: collision with root package name */
    public float f428312s;

    /* renamed from: t, reason: collision with root package name */
    public float f428313t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f428314u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f428315v;

    /* renamed from: w, reason: collision with root package name */
    public float f428316w;

    /* renamed from: x, reason: collision with root package name */
    public float f428317x;

    /* renamed from: y, reason: collision with root package name */
    public float f428318y;

    /* renamed from: z, reason: collision with root package name */
    public float f428319z;

    public b(android.content.Context context) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f428294a = context;
        boolean z17 = true;
        this.f428296c = true;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            i17 = (i19 >= i18 ? i19 : i18) - c17;
        }
        this.f428300g = i17;
        this.f428302i = new int[2];
        this.f428303j = new android.graphics.PointF();
        this.f428305l = new android.graphics.PointF();
        this.f428306m = new android.graphics.PointF();
        this.f428312s = 1.0f;
        this.f428313t = 1.0f;
        this.f428316w = 3.0f;
        this.f428317x = 2.0f;
        this.f428318y = 0.85f;
        this.f428319z = 1.0f;
        this.A = on0.c.f428320d;
    }

    public final void a() {
        android.view.View view = this.f428301h;
        if (view != null) {
            java.util.Objects.toString(this.f428305l);
            nn0.a0 a0Var = this.f428297d;
            if (a0Var != null) {
                a0Var.h0(this.f428313t == 1.0f);
            }
            view.setScaleX(this.f428313t);
            view.setScaleY(this.f428313t);
            view.setTranslationX(this.f428310q);
            view.setTranslationY(this.f428311r);
        }
    }

    public final void b(android.graphics.PointF pointF) {
        android.graphics.PointF pointF2 = this.f428305l;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        if (this.A != on0.c.f428321e) {
            return;
        }
        pointF2.y = (this.f428299f / this.f428300g) * pointF.y;
    }

    public final void c(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        this.f428298e = i17;
        this.f428299f = i18;
        android.view.View view = this.f428301h;
        int[] iArr = this.f428302i;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        on0.c cVar = (this.f428298e <= 0 || this.f428299f <= 0) ? on0.c.f428320d : this.f428294a.getResources().getConfiguration().orientation == 2 ? on0.c.f428320d : ((float) (this.f428298e / this.f428299f)) >= 1.0f ? on0.c.f428321e : on0.c.f428320d;
        this.A = cVar;
        if (cVar == on0.c.f428321e) {
            this.f428317x = this.f428300g / i18;
        } else {
            this.f428317x = 2.0f;
        }
        this.f428316w = (this.f428317x * 3) / 2.0f;
        this.f428319z = 1.0f;
        this.f428318y = 0.85f;
        int i19 = iArr[0];
        int i27 = iArr[1];
    }

    public final void d() {
        if (this.f428298e <= 0 || this.f428299f <= 0) {
            return;
        }
        if (this.f428313t <= 1.0f) {
            this.f428310q = 0.0f;
            this.f428311r = 0.0f;
            return;
        }
        this.f428310q += this.f428308o;
        this.f428311r += this.f428309p;
        android.view.View view = this.f428301h;
        if (view != null) {
            float f17 = 1;
            float pivotX = view.getPivotX() * (this.f428313t - f17);
            float pivotX2 = (view.getPivotX() - this.f428298e) * (this.f428313t - f17);
            if (this.f428310q > pivotX) {
                this.f428310q = pivotX;
            }
            if (this.f428310q < pivotX2) {
                this.f428310q = pivotX2;
            }
            if (this.A == on0.c.f428320d) {
                float pivotY = view.getPivotY() * (this.f428313t - f17);
                float pivotY2 = (view.getPivotY() - this.f428299f) * (this.f428313t - f17);
                view.getPivotX();
                view.getPivotY();
                if (this.f428311r > pivotY) {
                    this.f428311r = pivotY;
                }
                if (this.f428311r < pivotY2) {
                    this.f428311r = pivotY2;
                    return;
                }
                return;
            }
            float pivotY3 = view.getPivotY();
            float f18 = this.f428313t;
            float f19 = (pivotY3 * (f18 - f17)) - this.f428302i[1];
            float f27 = (this.f428300g + f19) - (this.f428299f * f18);
            view.getPivotX();
            view.getPivotY();
            if (this.f428311r < f19) {
                this.f428311r = f19;
            }
            if (this.f428311r > f27) {
                this.f428311r = f27;
            }
        }
    }
}

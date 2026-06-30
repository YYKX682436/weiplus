package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class p4 extends android.view.View implements u1.o1 {

    /* renamed from: s, reason: collision with root package name */
    public static final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n4 f92216s = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.n4(null);

    /* renamed from: t, reason: collision with root package name */
    public static final android.view.ViewOutlineProvider f92217t = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l4();

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.reflect.Method f92218u;

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.reflect.Field f92219v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f92220w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f92221x;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92222d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v2 f92223e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f92224f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f92225g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3 f92226h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f92227i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f92228m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f92229n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92230o;

    /* renamed from: p, reason: collision with root package name */
    public final e1.v f92231p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3 f92232q;

    /* renamed from: r, reason: collision with root package name */
    public long f92233r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 ownerView, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v2 container, yz5.l drawBlock, yz5.a invalidateParentLayer) {
        super(ownerView.getContext());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ownerView, "ownerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBlock, "drawBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidateParentLayer, "invalidateParentLayer");
        this.f92222d = ownerView;
        this.f92223e = container;
        this.f92224f = drawBlock;
        this.f92225g = invalidateParentLayer;
        this.f92226h = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3(ownerView.getDensity());
        this.f92231p = new e1.v();
        this.f92232q = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m4.f92193d);
        int i17 = e1.i1.f327806c;
        this.f92233r = e1.i1.f327805b;
        setWillNotDraw(false);
        setId(android.view.View.generateViewId());
        container.addView(this);
    }

    /* renamed from: getManualClipPath */
    private final e1.p0 m7119x2bc64671() {
        if (getClipToOutline()) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3 q3Var = this.f92226h;
            if (!(!q3Var.f92248i)) {
                q3Var.e();
                return q3Var.f92246g;
            }
        }
        return null;
    }

    /* renamed from: setInvalidated */
    private final void m7120x3771b0c7(boolean z17) {
        if (z17 != this.f92229n) {
            this.f92229n = z17;
            this.f92222d.k(this, z17);
        }
    }

    @Override // u1.o1
    public void a(d1.d rect, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3 l3Var = this.f92232q;
        if (!z17) {
            e1.j0.c(l3Var.b(this), rect);
            return;
        }
        float[] a17 = l3Var.a(this);
        if (a17 != null) {
            e1.j0.c(a17, rect);
            return;
        }
        rect.f307152a = 0.0f;
        rect.f307153b = 0.0f;
        rect.f307154c = 0.0f;
        rect.f307155d = 0.0f;
    }

    @Override // u1.o1
    public void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47, long j17, e1.a1 shape, boolean z17, e1.w0 w0Var, long j18, long j19, p2.s layoutDirection, p2.f density) {
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shape, "shape");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        this.f92233r = j17;
        setScaleX(f17);
        setScaleY(f18);
        setAlpha(f19);
        setTranslationX(f27);
        setTranslationY(f28);
        setElevation(f29);
        setRotation(f39);
        setRotationX(f37);
        setRotationY(f38);
        long j27 = this.f92233r;
        int i17 = e1.i1.f327806c;
        setPivotX(java.lang.Float.intBitsToFloat((int) (j27 >> 32)) * getWidth());
        setPivotY(e1.i1.a(this.f92233r) * getHeight());
        m7127xb2151e64(f47);
        e1.a1 a1Var = e1.v0.f327822a;
        this.f92227i = z17 && shape == a1Var;
        j();
        boolean z18 = m7119x2bc64671() != null;
        setClipToOutline(z17 && shape != a1Var);
        boolean d17 = this.f92226h.d(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        setOutlineProvider(this.f92226h.b() != null ? f92217t : null);
        boolean z19 = m7119x2bc64671() != null;
        if (z18 != z19 || (z19 && d17)) {
            mo7146x92d0313b();
        }
        if (!this.f92230o && getElevation() > 0.0f && (aVar = this.f92225g) != null) {
            aVar.mo152xb9724478();
        }
        this.f92232q.c();
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 28) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.r4 r4Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.r4.f92270a;
            r4Var.a(this, e1.a0.h(j18));
            r4Var.b(this, e1.a0.h(j19));
        }
        if (i18 >= 31) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s4.f92277a.a(this, w0Var);
        }
    }

    @Override // u1.o1
    public long c(long j17, boolean z17) {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3 l3Var = this.f92232q;
        if (!z17) {
            return e1.j0.b(l3Var.b(this), j17);
        }
        float[] a17 = l3Var.a(this);
        if (a17 != null) {
            return e1.j0.b(a17, j17);
        }
        int i17 = d1.e.f307159e;
        return d1.e.f307157c;
    }

    @Override // u1.o1
    public void d(long j17) {
        int i17 = (int) (j17 >> 32);
        int b17 = p2.q.b(j17);
        if (i17 == getWidth() && b17 == getHeight()) {
            return;
        }
        long j18 = this.f92233r;
        int i18 = e1.i1.f327806c;
        float f17 = i17;
        setPivotX(java.lang.Float.intBitsToFloat((int) (j18 >> 32)) * f17);
        float f18 = b17;
        setPivotY(e1.i1.a(this.f92233r) * f18);
        long a17 = d1.l.a(f17, f18);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3 q3Var = this.f92226h;
        if (!d1.k.a(q3Var.f92243d, a17)) {
            q3Var.f92243d = a17;
            q3Var.f92247h = true;
        }
        setOutlineProvider(q3Var.b() != null ? f92217t : null);
        layout(getLeft(), getTop(), getLeft() + i17, getTop() + b17);
        j();
        this.f92232q.c();
    }

    @Override // u1.o1
    /* renamed from: destroy */
    public void mo7121x5cd39ffa() {
        m7120x3771b0c7(false);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92222d;
        c1059xa8272988.A = true;
        this.f92224f = null;
        this.f92225g = null;
        c1059xa8272988.q(this);
        this.f92223e.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        boolean z17 = false;
        m7120x3771b0c7(false);
        e1.v vVar = this.f92231p;
        e1.b bVar = vVar.f327821a;
        android.graphics.Canvas canvas2 = bVar.f327758a;
        bVar.f327758a = canvas;
        e1.p0 m7119x2bc64671 = m7119x2bc64671();
        e1.b bVar2 = vVar.f327821a;
        if (m7119x2bc64671 != null || !canvas.isHardwareAccelerated()) {
            bVar2.c();
            this.f92226h.a(bVar2);
            z17 = true;
        }
        yz5.l lVar = this.f92224f;
        if (lVar != null) {
            lVar.mo146xb9724478(bVar2);
        }
        if (z17) {
            bVar2.b();
        }
        bVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas2, "<set-?>");
        bVar2.f327758a = canvas2;
    }

    @Override // u1.o1
    public void e(yz5.l drawBlock, yz5.a invalidateParentLayer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBlock, "drawBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidateParentLayer, "invalidateParentLayer");
        this.f92223e.addView(this);
        this.f92227i = false;
        this.f92230o = false;
        int i17 = e1.i1.f327806c;
        this.f92233r = e1.i1.f327805b;
        this.f92224f = drawBlock;
        this.f92225g = invalidateParentLayer;
    }

    @Override // u1.o1
    public boolean f(long j17) {
        float c17 = d1.e.c(j17);
        float d17 = d1.e.d(j17);
        if (this.f92227i) {
            return 0.0f <= c17 && c17 < ((float) getWidth()) && 0.0f <= d17 && d17 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f92226h.c(j17);
        }
        return true;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // u1.o1
    public void g(long j17) {
        int i17 = p2.m.f432922c;
        int i18 = (int) (j17 >> 32);
        int left = getLeft();
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3 l3Var = this.f92232q;
        if (i18 != left) {
            offsetLeftAndRight(i18 - getLeft());
            l3Var.c();
        }
        int b17 = p2.m.b(j17);
        if (b17 != getTop()) {
            offsetTopAndBottom(b17 - getTop());
            l3Var.c();
        }
    }

    /* renamed from: getCameraDistancePx */
    public final float m7122xe188958() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: getContainer */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v2 m7123xe6eebdcb() {
        return this.f92223e;
    }

    /* renamed from: getLayerId */
    public long m7124x3b4d0a16() {
        return getId();
    }

    /* renamed from: getOwnerView */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 m7125x7b8142() {
        return this.f92222d;
    }

    /* renamed from: getOwnerViewId */
    public long m7126xcfa041fd() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.o4.a(this.f92222d);
        }
        return -1L;
    }

    @Override // u1.o1
    public void h() {
        if (!this.f92229n || f92221x) {
            return;
        }
        m7120x3771b0c7(false);
        f92216s.a(this);
    }

    @Override // u1.o1
    public void i(e1.u canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        boolean z17 = getElevation() > 0.0f;
        this.f92230o = z17;
        if (z17) {
            canvas.m();
        }
        this.f92223e.a(canvas, this, getDrawingTime());
        if (this.f92230o) {
            canvas.g();
        }
    }

    @Override // android.view.View, u1.o1
    /* renamed from: invalidate */
    public void mo7146x92d0313b() {
        if (this.f92229n) {
            return;
        }
        m7120x3771b0c7(true);
        super.invalidate();
        this.f92222d.invalidate();
    }

    public final void j() {
        android.graphics.Rect rect;
        if (this.f92227i) {
            android.graphics.Rect rect2 = this.f92228m;
            if (rect2 == null) {
                this.f92228m = new android.graphics.Rect(0, 0, getWidth(), getHeight());
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f92228m;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    /* renamed from: setCameraDistancePx */
    public final void m7127xb2151e64(float f17) {
        setCameraDistance(f17 * getResources().getDisplayMetrics().densityDpi);
    }
}

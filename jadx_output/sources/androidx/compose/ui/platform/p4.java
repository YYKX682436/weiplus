package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class p4 extends android.view.View implements u1.o1 {

    /* renamed from: s, reason: collision with root package name */
    public static final androidx.compose.ui.platform.n4 f10683s = new androidx.compose.ui.platform.n4(null);

    /* renamed from: t, reason: collision with root package name */
    public static final android.view.ViewOutlineProvider f10684t = new androidx.compose.ui.platform.l4();

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.reflect.Method f10685u;

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.reflect.Field f10686v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f10687w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f10688x;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f10689d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.platform.v2 f10690e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f10691f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f10692g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.compose.ui.platform.q3 f10693h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10694i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f10695m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10696n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10697o;

    /* renamed from: p, reason: collision with root package name */
    public final e1.v f10698p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.compose.ui.platform.l3 f10699q;

    /* renamed from: r, reason: collision with root package name */
    public long f10700r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(androidx.compose.ui.platform.AndroidComposeView ownerView, androidx.compose.ui.platform.v2 container, yz5.l drawBlock, yz5.a invalidateParentLayer) {
        super(ownerView.getContext());
        kotlin.jvm.internal.o.g(ownerView, "ownerView");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.o.g(invalidateParentLayer, "invalidateParentLayer");
        this.f10689d = ownerView;
        this.f10690e = container;
        this.f10691f = drawBlock;
        this.f10692g = invalidateParentLayer;
        this.f10693h = new androidx.compose.ui.platform.q3(ownerView.getDensity());
        this.f10698p = new e1.v();
        this.f10699q = new androidx.compose.ui.platform.l3(androidx.compose.ui.platform.m4.f10660d);
        int i17 = e1.i1.f246273c;
        this.f10700r = e1.i1.f246272b;
        setWillNotDraw(false);
        setId(android.view.View.generateViewId());
        container.addView(this);
    }

    private final e1.p0 getManualClipPath() {
        if (getClipToOutline()) {
            androidx.compose.ui.platform.q3 q3Var = this.f10693h;
            if (!(!q3Var.f10715i)) {
                q3Var.e();
                return q3Var.f10713g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z17) {
        if (z17 != this.f10696n) {
            this.f10696n = z17;
            this.f10689d.k(this, z17);
        }
    }

    @Override // u1.o1
    public void a(d1.d rect, boolean z17) {
        kotlin.jvm.internal.o.g(rect, "rect");
        androidx.compose.ui.platform.l3 l3Var = this.f10699q;
        if (!z17) {
            e1.j0.c(l3Var.b(this), rect);
            return;
        }
        float[] a17 = l3Var.a(this);
        if (a17 != null) {
            e1.j0.c(a17, rect);
            return;
        }
        rect.f225619a = 0.0f;
        rect.f225620b = 0.0f;
        rect.f225621c = 0.0f;
        rect.f225622d = 0.0f;
    }

    @Override // u1.o1
    public void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47, long j17, e1.a1 shape, boolean z17, e1.w0 w0Var, long j18, long j19, p2.s layoutDirection, p2.f density) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(shape, "shape");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(density, "density");
        this.f10700r = j17;
        setScaleX(f17);
        setScaleY(f18);
        setAlpha(f19);
        setTranslationX(f27);
        setTranslationY(f28);
        setElevation(f29);
        setRotation(f39);
        setRotationX(f37);
        setRotationY(f38);
        long j27 = this.f10700r;
        int i17 = e1.i1.f246273c;
        setPivotX(java.lang.Float.intBitsToFloat((int) (j27 >> 32)) * getWidth());
        setPivotY(e1.i1.a(this.f10700r) * getHeight());
        setCameraDistancePx(f47);
        e1.a1 a1Var = e1.v0.f246289a;
        this.f10694i = z17 && shape == a1Var;
        j();
        boolean z18 = getManualClipPath() != null;
        setClipToOutline(z17 && shape != a1Var);
        boolean d17 = this.f10693h.d(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        setOutlineProvider(this.f10693h.b() != null ? f10684t : null);
        boolean z19 = getManualClipPath() != null;
        if (z18 != z19 || (z19 && d17)) {
            invalidate();
        }
        if (!this.f10697o && getElevation() > 0.0f && (aVar = this.f10692g) != null) {
            aVar.invoke();
        }
        this.f10699q.c();
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 28) {
            androidx.compose.ui.platform.r4 r4Var = androidx.compose.ui.platform.r4.f10737a;
            r4Var.a(this, e1.a0.h(j18));
            r4Var.b(this, e1.a0.h(j19));
        }
        if (i18 >= 31) {
            androidx.compose.ui.platform.s4.f10744a.a(this, w0Var);
        }
    }

    @Override // u1.o1
    public long c(long j17, boolean z17) {
        androidx.compose.ui.platform.l3 l3Var = this.f10699q;
        if (!z17) {
            return e1.j0.b(l3Var.b(this), j17);
        }
        float[] a17 = l3Var.a(this);
        if (a17 != null) {
            return e1.j0.b(a17, j17);
        }
        int i17 = d1.e.f225626e;
        return d1.e.f225624c;
    }

    @Override // u1.o1
    public void d(long j17) {
        int i17 = (int) (j17 >> 32);
        int b17 = p2.q.b(j17);
        if (i17 == getWidth() && b17 == getHeight()) {
            return;
        }
        long j18 = this.f10700r;
        int i18 = e1.i1.f246273c;
        float f17 = i17;
        setPivotX(java.lang.Float.intBitsToFloat((int) (j18 >> 32)) * f17);
        float f18 = b17;
        setPivotY(e1.i1.a(this.f10700r) * f18);
        long a17 = d1.l.a(f17, f18);
        androidx.compose.ui.platform.q3 q3Var = this.f10693h;
        if (!d1.k.a(q3Var.f10710d, a17)) {
            q3Var.f10710d = a17;
            q3Var.f10714h = true;
        }
        setOutlineProvider(q3Var.b() != null ? f10684t : null);
        layout(getLeft(), getTop(), getLeft() + i17, getTop() + b17);
        j();
        this.f10699q.c();
    }

    @Override // u1.o1
    public void destroy() {
        setInvalidated(false);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10689d;
        androidComposeView.A = true;
        this.f10691f = null;
        this.f10692g = null;
        androidComposeView.q(this);
        this.f10690e.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        boolean z17 = false;
        setInvalidated(false);
        e1.v vVar = this.f10698p;
        e1.b bVar = vVar.f246288a;
        android.graphics.Canvas canvas2 = bVar.f246225a;
        bVar.f246225a = canvas;
        e1.p0 manualClipPath = getManualClipPath();
        e1.b bVar2 = vVar.f246288a;
        if (manualClipPath != null || !canvas.isHardwareAccelerated()) {
            bVar2.c();
            this.f10693h.a(bVar2);
            z17 = true;
        }
        yz5.l lVar = this.f10691f;
        if (lVar != null) {
            lVar.invoke(bVar2);
        }
        if (z17) {
            bVar2.b();
        }
        bVar2.getClass();
        kotlin.jvm.internal.o.g(canvas2, "<set-?>");
        bVar2.f246225a = canvas2;
    }

    @Override // u1.o1
    public void e(yz5.l drawBlock, yz5.a invalidateParentLayer) {
        kotlin.jvm.internal.o.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.o.g(invalidateParentLayer, "invalidateParentLayer");
        this.f10690e.addView(this);
        this.f10694i = false;
        this.f10697o = false;
        int i17 = e1.i1.f246273c;
        this.f10700r = e1.i1.f246272b;
        this.f10691f = drawBlock;
        this.f10692g = invalidateParentLayer;
    }

    @Override // u1.o1
    public boolean f(long j17) {
        float c17 = d1.e.c(j17);
        float d17 = d1.e.d(j17);
        if (this.f10694i) {
            return 0.0f <= c17 && c17 < ((float) getWidth()) && 0.0f <= d17 && d17 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f10693h.c(j17);
        }
        return true;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // u1.o1
    public void g(long j17) {
        int i17 = p2.m.f351389c;
        int i18 = (int) (j17 >> 32);
        int left = getLeft();
        androidx.compose.ui.platform.l3 l3Var = this.f10699q;
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

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final androidx.compose.ui.platform.v2 getContainer() {
        return this.f10690e;
    }

    public long getLayerId() {
        return getId();
    }

    public final androidx.compose.ui.platform.AndroidComposeView getOwnerView() {
        return this.f10689d;
    }

    public long getOwnerViewId() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.o4.a(this.f10689d);
        }
        return -1L;
    }

    @Override // u1.o1
    public void h() {
        if (!this.f10696n || f10688x) {
            return;
        }
        setInvalidated(false);
        f10683s.a(this);
    }

    @Override // u1.o1
    public void i(e1.u canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        boolean z17 = getElevation() > 0.0f;
        this.f10697o = z17;
        if (z17) {
            canvas.m();
        }
        this.f10690e.a(canvas, this, getDrawingTime());
        if (this.f10697o) {
            canvas.g();
        }
    }

    @Override // android.view.View, u1.o1
    public void invalidate() {
        if (this.f10696n) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f10689d.invalidate();
    }

    public final void j() {
        android.graphics.Rect rect;
        if (this.f10694i) {
            android.graphics.Rect rect2 = this.f10695m;
            if (rect2 == null) {
                this.f10695m = new android.graphics.Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.o.d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f10695m;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    public final void setCameraDistancePx(float f17) {
        setCameraDistance(f17 * getResources().getDisplayMetrics().densityDpi);
    }
}

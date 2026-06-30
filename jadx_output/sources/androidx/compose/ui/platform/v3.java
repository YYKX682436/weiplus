package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class v3 implements u1.o1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f10766d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f10767e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f10768f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10769g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.compose.ui.platform.q3 f10770h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10771i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10772m;

    /* renamed from: n, reason: collision with root package name */
    public e1.n0 f10773n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.compose.ui.platform.l3 f10774o;

    /* renamed from: p, reason: collision with root package name */
    public final e1.v f10775p;

    /* renamed from: q, reason: collision with root package name */
    public long f10776q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.compose.ui.platform.p2 f10777r;

    public v3(androidx.compose.ui.platform.AndroidComposeView ownerView, yz5.l drawBlock, yz5.a invalidateParentLayer) {
        kotlin.jvm.internal.o.g(ownerView, "ownerView");
        kotlin.jvm.internal.o.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.o.g(invalidateParentLayer, "invalidateParentLayer");
        this.f10766d = ownerView;
        this.f10767e = drawBlock;
        this.f10768f = invalidateParentLayer;
        this.f10770h = new androidx.compose.ui.platform.q3(ownerView.getDensity());
        this.f10774o = new androidx.compose.ui.platform.l3(androidx.compose.ui.platform.u3.f10756d);
        this.f10775p = new e1.v();
        int i17 = e1.i1.f246273c;
        this.f10776q = e1.i1.f246272b;
        androidx.compose.ui.platform.p2 s3Var = android.os.Build.VERSION.SDK_INT >= 29 ? new androidx.compose.ui.platform.s3(ownerView) : new androidx.compose.ui.platform.r3(ownerView);
        s3Var.j(true);
        this.f10777r = s3Var;
    }

    @Override // u1.o1
    public void a(d1.d rect, boolean z17) {
        kotlin.jvm.internal.o.g(rect, "rect");
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        androidx.compose.ui.platform.l3 l3Var = this.f10774o;
        if (!z17) {
            e1.j0.c(l3Var.b(p2Var), rect);
            return;
        }
        float[] a17 = l3Var.a(p2Var);
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
        this.f10776q = j17;
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        boolean h17 = p2Var.h();
        androidx.compose.ui.platform.q3 q3Var = this.f10770h;
        boolean z18 = false;
        boolean z19 = h17 && !(q3Var.f10715i ^ true);
        p2Var.setScaleX(f17);
        p2Var.setScaleY(f18);
        p2Var.setAlpha(f19);
        p2Var.y(f27);
        p2Var.b(f28);
        p2Var.d(f29);
        p2Var.x(e1.a0.h(j18));
        p2Var.z(e1.a0.h(j19));
        p2Var.o(f39);
        p2Var.k(f37);
        p2Var.m(f38);
        p2Var.i(f47);
        int i17 = e1.i1.f246273c;
        p2Var.p(java.lang.Float.intBitsToFloat((int) (j17 >> 32)) * p2Var.getWidth());
        p2Var.q(e1.i1.a(j17) * p2Var.getHeight());
        e1.a1 a1Var = e1.v0.f246289a;
        p2Var.s(z17 && shape != a1Var);
        p2Var.c(z17 && shape == a1Var);
        p2Var.g(w0Var);
        boolean d17 = this.f10770h.d(shape, p2Var.getAlpha(), p2Var.h(), p2Var.A(), layoutDirection, density);
        p2Var.r(q3Var.b());
        if (p2Var.h() && !(!q3Var.f10715i)) {
            z18 = true;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10766d;
        if (z19 != z18 || (z18 && d17)) {
            if (!this.f10769g && !this.f10771i) {
                androidComposeView.invalidate();
                j(true);
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.compose.ui.platform.q5.f10724a.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        if (!this.f10772m && p2Var.A() > 0.0f && (aVar = this.f10768f) != null) {
            aVar.invoke();
        }
        this.f10774o.c();
    }

    @Override // u1.o1
    public long c(long j17, boolean z17) {
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        androidx.compose.ui.platform.l3 l3Var = this.f10774o;
        if (!z17) {
            return e1.j0.b(l3Var.b(p2Var), j17);
        }
        float[] a17 = l3Var.a(p2Var);
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
        long j18 = this.f10776q;
        int i18 = e1.i1.f246273c;
        float f17 = i17;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j18 >> 32)) * f17;
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        p2Var.p(intBitsToFloat);
        float f18 = b17;
        p2Var.q(e1.i1.a(this.f10776q) * f18);
        if (p2Var.t(p2Var.getLeft(), p2Var.getTop(), p2Var.getLeft() + i17, p2Var.getTop() + b17)) {
            long a17 = d1.l.a(f17, f18);
            androidx.compose.ui.platform.q3 q3Var = this.f10770h;
            if (!d1.k.a(q3Var.f10710d, a17)) {
                q3Var.f10710d = a17;
                q3Var.f10714h = true;
            }
            p2Var.r(q3Var.b());
            if (!this.f10769g && !this.f10771i) {
                this.f10766d.invalidate();
                j(true);
            }
            this.f10774o.c();
        }
    }

    @Override // u1.o1
    public void destroy() {
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        if (p2Var.f()) {
            p2Var.u();
        }
        this.f10767e = null;
        this.f10768f = null;
        this.f10771i = true;
        j(false);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10766d;
        androidComposeView.A = true;
        androidComposeView.q(this);
    }

    @Override // u1.o1
    public void e(yz5.l drawBlock, yz5.a invalidateParentLayer) {
        kotlin.jvm.internal.o.g(drawBlock, "drawBlock");
        kotlin.jvm.internal.o.g(invalidateParentLayer, "invalidateParentLayer");
        j(false);
        this.f10771i = false;
        this.f10772m = false;
        int i17 = e1.i1.f246273c;
        this.f10776q = e1.i1.f246272b;
        this.f10767e = drawBlock;
        this.f10768f = invalidateParentLayer;
    }

    @Override // u1.o1
    public boolean f(long j17) {
        float c17 = d1.e.c(j17);
        float d17 = d1.e.d(j17);
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        if (p2Var.v()) {
            return 0.0f <= c17 && c17 < ((float) p2Var.getWidth()) && 0.0f <= d17 && d17 < ((float) p2Var.getHeight());
        }
        if (p2Var.h()) {
            return this.f10770h.c(j17);
        }
        return true;
    }

    @Override // u1.o1
    public void g(long j17) {
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        int left = p2Var.getLeft();
        int top = p2Var.getTop();
        int i17 = (int) (j17 >> 32);
        int b17 = p2.m.b(j17);
        if (left == i17 && top == b17) {
            return;
        }
        p2Var.n(i17 - left);
        p2Var.e(b17 - top);
        int i18 = android.os.Build.VERSION.SDK_INT;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10766d;
        if (i18 >= 26) {
            androidx.compose.ui.platform.q5.f10724a.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        this.f10774o.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // u1.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r4 = this;
            boolean r0 = r4.f10769g
            androidx.compose.ui.platform.p2 r1 = r4.f10777r
            if (r0 != 0) goto Lc
            boolean r0 = r1.f()
            if (r0 != 0) goto L2e
        Lc:
            r0 = 0
            r4.j(r0)
            boolean r0 = r1.h()
            if (r0 == 0) goto L24
            androidx.compose.ui.platform.q3 r0 = r4.f10770h
            boolean r2 = r0.f10715i
            r2 = r2 ^ 1
            if (r2 != 0) goto L24
            r0.e()
            e1.p0 r0 = r0.f10713g
            goto L25
        L24:
            r0 = 0
        L25:
            yz5.l r2 = r4.f10767e
            if (r2 == 0) goto L2e
            e1.v r3 = r4.f10775p
            r1.w(r3, r0, r2)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.v3.h():void");
    }

    @Override // u1.o1
    public void i(e1.u canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Canvas canvas2 = e1.c.f246229a;
        android.graphics.Canvas canvas3 = ((e1.b) canvas).f246225a;
        boolean isHardwareAccelerated = canvas3.isHardwareAccelerated();
        androidx.compose.ui.platform.p2 p2Var = this.f10777r;
        if (isHardwareAccelerated) {
            h();
            boolean z17 = p2Var.A() > 0.0f;
            this.f10772m = z17;
            if (z17) {
                canvas.m();
            }
            p2Var.a(canvas3);
            if (this.f10772m) {
                canvas.g();
                return;
            }
            return;
        }
        float left = p2Var.getLeft();
        float top = p2Var.getTop();
        float right = p2Var.getRight();
        float bottom = p2Var.getBottom();
        if (p2Var.getAlpha() < 1.0f) {
            e1.n0 n0Var = this.f10773n;
            if (n0Var == null) {
                n0Var = new e1.g();
                this.f10773n = n0Var;
            }
            e1.g gVar = (e1.g) n0Var;
            gVar.c(p2Var.getAlpha());
            canvas3.saveLayer(left, top, right, bottom, gVar.f246254a);
        } else {
            canvas.c();
        }
        canvas.e(left, top);
        canvas.p(this.f10774o.b(p2Var));
        if (p2Var.h() || p2Var.v()) {
            this.f10770h.a(canvas);
        }
        yz5.l lVar = this.f10767e;
        if (lVar != null) {
            lVar.invoke(canvas);
        }
        canvas.b();
        j(false);
    }

    @Override // u1.o1
    public void invalidate() {
        if (this.f10769g || this.f10771i) {
            return;
        }
        this.f10766d.invalidate();
        j(true);
    }

    public final void j(boolean z17) {
        if (z17 != this.f10769g) {
            this.f10769g = z17;
            this.f10766d.k(this, z17);
        }
    }
}

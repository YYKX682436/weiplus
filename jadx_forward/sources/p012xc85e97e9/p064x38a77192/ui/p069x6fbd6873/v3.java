package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class v3 implements u1.o1 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92299d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f92300e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f92301f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92302g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3 f92303h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f92304i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92305m;

    /* renamed from: n, reason: collision with root package name */
    public e1.n0 f92306n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3 f92307o;

    /* renamed from: p, reason: collision with root package name */
    public final e1.v f92308p;

    /* renamed from: q, reason: collision with root package name */
    public long f92309q;

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 f92310r;

    public v3(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 ownerView, yz5.l drawBlock, yz5.a invalidateParentLayer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ownerView, "ownerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBlock, "drawBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidateParentLayer, "invalidateParentLayer");
        this.f92299d = ownerView;
        this.f92300e = drawBlock;
        this.f92301f = invalidateParentLayer;
        this.f92303h = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3(ownerView.getDensity());
        this.f92307o = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.u3.f92289d);
        this.f92308p = new e1.v();
        int i17 = e1.i1.f327806c;
        this.f92309q = e1.i1.f327805b;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 s3Var = android.os.Build.VERSION.SDK_INT >= 29 ? new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s3(ownerView) : new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.r3(ownerView);
        s3Var.j(true);
        this.f92310r = s3Var;
    }

    @Override // u1.o1
    public void a(d1.d rect, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3 l3Var = this.f92307o;
        if (!z17) {
            e1.j0.c(l3Var.b(p2Var), rect);
            return;
        }
        float[] a17 = l3Var.a(p2Var);
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
        this.f92309q = j17;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        boolean h17 = p2Var.h();
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3 q3Var = this.f92303h;
        boolean z18 = false;
        boolean z19 = h17 && !(q3Var.f92248i ^ true);
        p2Var.mo7116x222a7750(f17);
        p2Var.mo7117x222a7751(f18);
        p2Var.mo7115x52b5721c(f19);
        p2Var.y(f27);
        p2Var.b(f28);
        p2Var.d(f29);
        p2Var.x(e1.a0.h(j18));
        p2Var.z(e1.a0.h(j19));
        p2Var.o(f39);
        p2Var.k(f37);
        p2Var.m(f38);
        p2Var.i(f47);
        int i17 = e1.i1.f327806c;
        p2Var.p(java.lang.Float.intBitsToFloat((int) (j17 >> 32)) * p2Var.mo7114x755bd410());
        p2Var.q(e1.i1.a(j17) * p2Var.mo7110x1c4fb41d());
        e1.a1 a1Var = e1.v0.f327822a;
        p2Var.s(z17 && shape != a1Var);
        p2Var.c(z17 && shape == a1Var);
        p2Var.g(w0Var);
        boolean d17 = this.f92303h.d(shape, p2Var.mo7108x742757a8(), p2Var.h(), p2Var.A(), layoutDirection, density);
        p2Var.r(q3Var.b());
        if (p2Var.h() && !(!q3Var.f92248i)) {
            z18 = true;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92299d;
        if (z19 != z18 || (z18 && d17)) {
            if (!this.f92302g && !this.f92304i) {
                c1059xa8272988.invalidate();
                j(true);
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q5.f92257a.a(c1059xa8272988);
        } else {
            c1059xa8272988.invalidate();
        }
        if (!this.f92305m && p2Var.A() > 0.0f && (aVar = this.f92301f) != null) {
            aVar.mo152xb9724478();
        }
        this.f92307o.c();
    }

    @Override // u1.o1
    public long c(long j17, boolean z17) {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l3 l3Var = this.f92307o;
        if (!z17) {
            return e1.j0.b(l3Var.b(p2Var), j17);
        }
        float[] a17 = l3Var.a(p2Var);
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
        long j18 = this.f92309q;
        int i18 = e1.i1.f327806c;
        float f17 = i17;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j18 >> 32)) * f17;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        p2Var.p(intBitsToFloat);
        float f18 = b17;
        p2Var.q(e1.i1.a(this.f92309q) * f18);
        if (p2Var.t(p2Var.mo7111xfb82087d(), p2Var.mo7113xb588721f(), p2Var.mo7111xfb82087d() + i17, p2Var.mo7113xb588721f() + b17)) {
            long a17 = d1.l.a(f17, f18);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3 q3Var = this.f92303h;
            if (!d1.k.a(q3Var.f92243d, a17)) {
                q3Var.f92243d = a17;
                q3Var.f92247h = true;
            }
            p2Var.r(q3Var.b());
            if (!this.f92302g && !this.f92304i) {
                this.f92299d.invalidate();
                j(true);
            }
            this.f92307o.c();
        }
    }

    @Override // u1.o1
    /* renamed from: destroy */
    public void mo7121x5cd39ffa() {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        if (p2Var.f()) {
            p2Var.u();
        }
        this.f92300e = null;
        this.f92301f = null;
        this.f92304i = true;
        j(false);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92299d;
        c1059xa8272988.A = true;
        c1059xa8272988.q(this);
    }

    @Override // u1.o1
    public void e(yz5.l drawBlock, yz5.a invalidateParentLayer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBlock, "drawBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidateParentLayer, "invalidateParentLayer");
        j(false);
        this.f92304i = false;
        this.f92305m = false;
        int i17 = e1.i1.f327806c;
        this.f92309q = e1.i1.f327805b;
        this.f92300e = drawBlock;
        this.f92301f = invalidateParentLayer;
    }

    @Override // u1.o1
    public boolean f(long j17) {
        float c17 = d1.e.c(j17);
        float d17 = d1.e.d(j17);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        if (p2Var.v()) {
            return 0.0f <= c17 && c17 < ((float) p2Var.mo7114x755bd410()) && 0.0f <= d17 && d17 < ((float) p2Var.mo7110x1c4fb41d());
        }
        if (p2Var.h()) {
            return this.f92303h.c(j17);
        }
        return true;
    }

    @Override // u1.o1
    public void g(long j17) {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        int mo7111xfb82087d = p2Var.mo7111xfb82087d();
        int mo7113xb588721f = p2Var.mo7113xb588721f();
        int i17 = (int) (j17 >> 32);
        int b17 = p2.m.b(j17);
        if (mo7111xfb82087d == i17 && mo7113xb588721f == b17) {
            return;
        }
        p2Var.n(i17 - mo7111xfb82087d);
        p2Var.e(b17 - mo7113xb588721f);
        int i18 = android.os.Build.VERSION.SDK_INT;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92299d;
        if (i18 >= 26) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q5.f92257a.a(c1059xa8272988);
        } else {
            c1059xa8272988.invalidate();
        }
        this.f92307o.c();
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
            boolean r0 = r4.f92302g
            androidx.compose.ui.platform.p2 r1 = r4.f92310r
            if (r0 != 0) goto Lc
            boolean r0 = r1.f()
            if (r0 != 0) goto L2e
        Lc:
            r0 = 0
            r4.j(r0)
            boolean r0 = r1.h()
            if (r0 == 0) goto L24
            androidx.compose.ui.platform.q3 r0 = r4.f92303h
            boolean r2 = r0.f92248i
            r2 = r2 ^ 1
            if (r2 != 0) goto L24
            r0.e()
            e1.p0 r0 = r0.f92246g
            goto L25
        L24:
            r0 = 0
        L25:
            yz5.l r2 = r4.f92300e
            if (r2 == 0) goto L2e
            e1.v r3 = r4.f92308p
            r1.w(r3, r0, r2)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.v3.h():void");
    }

    @Override // u1.o1
    public void i(e1.u canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Canvas canvas2 = e1.c.f327762a;
        android.graphics.Canvas canvas3 = ((e1.b) canvas).f327758a;
        boolean isHardwareAccelerated = canvas3.isHardwareAccelerated();
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p2 p2Var = this.f92310r;
        if (isHardwareAccelerated) {
            h();
            boolean z17 = p2Var.A() > 0.0f;
            this.f92305m = z17;
            if (z17) {
                canvas.m();
            }
            p2Var.a(canvas3);
            if (this.f92305m) {
                canvas.g();
                return;
            }
            return;
        }
        float mo7111xfb82087d = p2Var.mo7111xfb82087d();
        float mo7113xb588721f = p2Var.mo7113xb588721f();
        float mo7112x75156866 = p2Var.mo7112x75156866();
        float mo7109x12a4bd21 = p2Var.mo7109x12a4bd21();
        if (p2Var.mo7108x742757a8() < 1.0f) {
            e1.n0 n0Var = this.f92306n;
            if (n0Var == null) {
                n0Var = new e1.g();
                this.f92306n = n0Var;
            }
            e1.g gVar = (e1.g) n0Var;
            gVar.c(p2Var.mo7108x742757a8());
            canvas3.saveLayer(mo7111xfb82087d, mo7113xb588721f, mo7112x75156866, mo7109x12a4bd21, gVar.f327787a);
        } else {
            canvas.c();
        }
        canvas.e(mo7111xfb82087d, mo7113xb588721f);
        canvas.p(this.f92307o.b(p2Var));
        if (p2Var.h() || p2Var.v()) {
            this.f92303h.a(canvas);
        }
        yz5.l lVar = this.f92300e;
        if (lVar != null) {
            lVar.mo146xb9724478(canvas);
        }
        canvas.b();
        j(false);
    }

    @Override // u1.o1
    /* renamed from: invalidate */
    public void mo7146x92d0313b() {
        if (this.f92302g || this.f92304i) {
            return;
        }
        this.f92299d.invalidate();
        j(true);
    }

    public final void j(boolean z17) {
        if (z17 != this.f92302g) {
            this.f92302g = z17;
            this.f92299d.k(this, z17);
        }
    }
}

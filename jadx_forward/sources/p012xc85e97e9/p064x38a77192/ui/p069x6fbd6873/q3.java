package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public p2.f f92240a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92241b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Outline f92242c;

    /* renamed from: d, reason: collision with root package name */
    public long f92243d;

    /* renamed from: e, reason: collision with root package name */
    public e1.a1 f92244e;

    /* renamed from: f, reason: collision with root package name */
    public e1.p0 f92245f;

    /* renamed from: g, reason: collision with root package name */
    public e1.p0 f92246g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f92247h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f92248i;

    /* renamed from: j, reason: collision with root package name */
    public e1.p0 f92249j;

    /* renamed from: k, reason: collision with root package name */
    public d1.i f92250k;

    /* renamed from: l, reason: collision with root package name */
    public float f92251l;

    /* renamed from: m, reason: collision with root package name */
    public long f92252m;

    /* renamed from: n, reason: collision with root package name */
    public long f92253n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92254o;

    /* renamed from: p, reason: collision with root package name */
    public p2.s f92255p;

    /* renamed from: q, reason: collision with root package name */
    public e1.m0 f92256q;

    public q3(p2.f density) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        this.f92240a = density;
        this.f92241b = true;
        android.graphics.Outline outline = new android.graphics.Outline();
        outline.setAlpha(1.0f);
        this.f92242c = outline;
        int i17 = d1.k.f307176d;
        long j17 = d1.k.f307174b;
        this.f92243d = j17;
        this.f92244e = e1.v0.f327822a;
        int i18 = d1.e.f307159e;
        this.f92252m = d1.e.f307156b;
        this.f92253n = j17;
        this.f92255p = p2.s.Ltr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if ((d1.a.b(r6.f307170e) == r0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r12 == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [e1.p0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [e1.p0, e1.i] */
    /* JADX WARN: Type inference failed for: r5v6, types: [e1.p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(e1.u r15) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3.a(e1.u):void");
    }

    public final android.graphics.Outline b() {
        e();
        if (this.f92254o && this.f92241b) {
            return this.f92242c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(long r19) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.q3.c(long):boolean");
    }

    public final boolean d(e1.a1 shape, float f17, boolean z17, float f18, p2.s layoutDirection, p2.f density) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shape, "shape");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        this.f92242c.setAlpha(f17);
        boolean z18 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f92244e, shape);
        if (z18) {
            this.f92244e = shape;
            this.f92247h = true;
        }
        boolean z19 = z17 || f18 > 0.0f;
        if (this.f92254o != z19) {
            this.f92254o = z19;
            this.f92247h = true;
        }
        if (this.f92255p != layoutDirection) {
            this.f92255p = layoutDirection;
            this.f92247h = true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f92240a, density)) {
            this.f92240a = density;
            this.f92247h = true;
        }
        return z18;
    }

    public final void e() {
        if (this.f92247h) {
            this.f92252m = d1.e.f307156b;
            long j17 = this.f92243d;
            this.f92253n = j17;
            this.f92251l = 0.0f;
            this.f92246g = null;
            this.f92247h = false;
            this.f92248i = false;
            boolean z17 = this.f92254o;
            android.graphics.Outline outline = this.f92242c;
            if (!z17 || d1.k.d(j17) <= 0.0f || d1.k.b(this.f92243d) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f92241b = true;
            e1.m0 a17 = this.f92244e.a(this.f92243d, this.f92255p, this.f92240a);
            this.f92256q = a17;
            if (a17 instanceof e1.k0) {
                d1.g gVar = ((e1.k0) a17).f327810a;
                float f17 = gVar.f307162a;
                float f18 = gVar.f307163b;
                this.f92252m = d1.f.a(f17, f18);
                float f19 = gVar.f307164c;
                float f27 = gVar.f307162a;
                float f28 = gVar.f307165d;
                this.f92253n = d1.l.a(f19 - f27, f28 - f18);
                outline.setRect(a06.d.b(f27), a06.d.b(f18), a06.d.b(f19), a06.d.b(f28));
                return;
            }
            if (a17 instanceof e1.l0) {
                d1.i iVar = ((e1.l0) a17).f327811a;
                float b17 = d1.a.b(iVar.f307170e);
                float f29 = iVar.f307166a;
                float f37 = iVar.f307167b;
                this.f92252m = d1.f.a(f29, f37);
                float f38 = iVar.f307168c;
                float f39 = iVar.f307169d;
                this.f92253n = d1.l.a(f38 - f29, f39 - f37);
                if (d1.j.b(iVar)) {
                    this.f92242c.setRoundRect(a06.d.b(f29), a06.d.b(f37), a06.d.b(f38), a06.d.b(f39), b17);
                    this.f92251l = b17;
                    return;
                }
                e1.p0 p0Var = this.f92245f;
                if (p0Var == null) {
                    p0Var = e1.k.a();
                    this.f92245f = p0Var;
                }
                e1.i iVar2 = (e1.i) p0Var;
                iVar2.c();
                iVar2.a(iVar);
                int i17 = android.os.Build.VERSION.SDK_INT;
                android.graphics.Path path = iVar2.f327796a;
                if (i17 > 28 || path.isConvex()) {
                    outline.setConvexPath(path);
                    this.f92248i = true ^ outline.canClip();
                } else {
                    this.f92241b = false;
                    outline.setEmpty();
                    this.f92248i = true;
                }
                this.f92246g = iVar2;
            }
        }
    }
}

package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public p2.f f10707a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10708b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Outline f10709c;

    /* renamed from: d, reason: collision with root package name */
    public long f10710d;

    /* renamed from: e, reason: collision with root package name */
    public e1.a1 f10711e;

    /* renamed from: f, reason: collision with root package name */
    public e1.p0 f10712f;

    /* renamed from: g, reason: collision with root package name */
    public e1.p0 f10713g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10714h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10715i;

    /* renamed from: j, reason: collision with root package name */
    public e1.p0 f10716j;

    /* renamed from: k, reason: collision with root package name */
    public d1.i f10717k;

    /* renamed from: l, reason: collision with root package name */
    public float f10718l;

    /* renamed from: m, reason: collision with root package name */
    public long f10719m;

    /* renamed from: n, reason: collision with root package name */
    public long f10720n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10721o;

    /* renamed from: p, reason: collision with root package name */
    public p2.s f10722p;

    /* renamed from: q, reason: collision with root package name */
    public e1.m0 f10723q;

    public q3(p2.f density) {
        kotlin.jvm.internal.o.g(density, "density");
        this.f10707a = density;
        this.f10708b = true;
        android.graphics.Outline outline = new android.graphics.Outline();
        outline.setAlpha(1.0f);
        this.f10709c = outline;
        int i17 = d1.k.f225643d;
        long j17 = d1.k.f225641b;
        this.f10710d = j17;
        this.f10711e = e1.v0.f246289a;
        int i18 = d1.e.f225626e;
        this.f10719m = d1.e.f225623b;
        this.f10720n = j17;
        this.f10722p = p2.s.Ltr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if ((d1.a.b(r6.f225637e) == r0) != false) goto L41;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.q3.a(e1.u):void");
    }

    public final android.graphics.Outline b() {
        e();
        if (this.f10721o && this.f10708b) {
            return this.f10709c;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.q3.c(long):boolean");
    }

    public final boolean d(e1.a1 shape, float f17, boolean z17, float f18, p2.s layoutDirection, p2.f density) {
        kotlin.jvm.internal.o.g(shape, "shape");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(density, "density");
        this.f10709c.setAlpha(f17);
        boolean z18 = !kotlin.jvm.internal.o.b(this.f10711e, shape);
        if (z18) {
            this.f10711e = shape;
            this.f10714h = true;
        }
        boolean z19 = z17 || f18 > 0.0f;
        if (this.f10721o != z19) {
            this.f10721o = z19;
            this.f10714h = true;
        }
        if (this.f10722p != layoutDirection) {
            this.f10722p = layoutDirection;
            this.f10714h = true;
        }
        if (!kotlin.jvm.internal.o.b(this.f10707a, density)) {
            this.f10707a = density;
            this.f10714h = true;
        }
        return z18;
    }

    public final void e() {
        if (this.f10714h) {
            this.f10719m = d1.e.f225623b;
            long j17 = this.f10710d;
            this.f10720n = j17;
            this.f10718l = 0.0f;
            this.f10713g = null;
            this.f10714h = false;
            this.f10715i = false;
            boolean z17 = this.f10721o;
            android.graphics.Outline outline = this.f10709c;
            if (!z17 || d1.k.d(j17) <= 0.0f || d1.k.b(this.f10710d) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f10708b = true;
            e1.m0 a17 = this.f10711e.a(this.f10710d, this.f10722p, this.f10707a);
            this.f10723q = a17;
            if (a17 instanceof e1.k0) {
                d1.g gVar = ((e1.k0) a17).f246277a;
                float f17 = gVar.f225629a;
                float f18 = gVar.f225630b;
                this.f10719m = d1.f.a(f17, f18);
                float f19 = gVar.f225631c;
                float f27 = gVar.f225629a;
                float f28 = gVar.f225632d;
                this.f10720n = d1.l.a(f19 - f27, f28 - f18);
                outline.setRect(a06.d.b(f27), a06.d.b(f18), a06.d.b(f19), a06.d.b(f28));
                return;
            }
            if (a17 instanceof e1.l0) {
                d1.i iVar = ((e1.l0) a17).f246278a;
                float b17 = d1.a.b(iVar.f225637e);
                float f29 = iVar.f225633a;
                float f37 = iVar.f225634b;
                this.f10719m = d1.f.a(f29, f37);
                float f38 = iVar.f225635c;
                float f39 = iVar.f225636d;
                this.f10720n = d1.l.a(f38 - f29, f39 - f37);
                if (d1.j.b(iVar)) {
                    this.f10709c.setRoundRect(a06.d.b(f29), a06.d.b(f37), a06.d.b(f38), a06.d.b(f39), b17);
                    this.f10718l = b17;
                    return;
                }
                e1.p0 p0Var = this.f10712f;
                if (p0Var == null) {
                    p0Var = e1.k.a();
                    this.f10712f = p0Var;
                }
                e1.i iVar2 = (e1.i) p0Var;
                iVar2.c();
                iVar2.a(iVar);
                int i17 = android.os.Build.VERSION.SDK_INT;
                android.graphics.Path path = iVar2.f246263a;
                if (i17 > 28 || path.isConvex()) {
                    outline.setConvexPath(path);
                    this.f10715i = true ^ outline.canClip();
                } else {
                    this.f10708b = false;
                    outline.setEmpty();
                    this.f10715i = true;
                }
                this.f10713g = iVar2;
            }
        }
    }
}

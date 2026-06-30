package u5;

/* loaded from: classes14.dex */
public final class a extends h1.c {

    /* renamed from: i, reason: collision with root package name */
    public h1.c f506223i;

    /* renamed from: m, reason: collision with root package name */
    public final h1.c f506224m;

    /* renamed from: n, reason: collision with root package name */
    public final d6.g f506225n;

    /* renamed from: o, reason: collision with root package name */
    public final int f506226o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f506227p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.v2 f506228q;

    /* renamed from: r, reason: collision with root package name */
    public long f506229r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f506230s;

    /* renamed from: t, reason: collision with root package name */
    public final n0.v2 f506231t;

    /* renamed from: u, reason: collision with root package name */
    public final n0.v2 f506232u;

    public a(h1.c cVar, h1.c cVar2, d6.g scale, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        this.f506223i = cVar;
        this.f506224m = cVar2;
        this.f506225n = scale;
        this.f506226o = i17;
        this.f506227p = z17;
        this.f506228q = n0.s4.c(0, null, 2, null);
        this.f506229r = -1L;
        this.f506231t = n0.s4.c(java.lang.Float.valueOf(1.0f), null, 2, null);
        this.f506232u = n0.s4.c(null, null, 2, null);
    }

    @Override // h1.c
    public boolean a(float f17) {
        ((n0.q4) this.f506231t).mo148714x53d8522f(java.lang.Float.valueOf(f17));
        return true;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        ((n0.q4) this.f506232u).mo148714x53d8522f(zVar);
        return true;
    }

    @Override // h1.c
    public long h() {
        h1.c cVar = this.f506223i;
        d1.k kVar = cVar == null ? null : new d1.k(cVar.h());
        long j17 = kVar == null ? d1.k.f307174b : kVar.f307177a;
        h1.c cVar2 = this.f506224m;
        d1.k kVar2 = cVar2 != null ? new d1.k(cVar2.h()) : null;
        long j18 = kVar2 == null ? d1.k.f307174b : kVar2.f307177a;
        long j19 = d1.k.f307175c;
        if (j17 != j19) {
            return j18 != j19 ? d1.l.a(java.lang.Math.max(d1.k.d(j17), d1.k.d(j18)), java.lang.Math.max(d1.k.b(j17), d1.k.b(j18))) : j19;
        }
        return j19;
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        boolean z17 = this.f506230s;
        h1.c cVar = this.f506224m;
        if (z17) {
            j(iVar, cVar, k());
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.f506229r == -1) {
            this.f506229r = uptimeMillis;
        }
        float f17 = ((float) (uptimeMillis - this.f506229r)) / this.f506226o;
        float e17 = e06.p.e(f17, 0.0f, 1.0f) * k();
        float k17 = this.f506227p ? k() - e17 : k();
        this.f506230s = ((double) f17) >= 1.0d;
        j(iVar, this.f506223i, k17);
        j(iVar, cVar, e17);
        if (this.f506230s) {
            this.f506223i = null;
        } else {
            n0.v2 v2Var = this.f506228q;
            ((n0.q4) v2Var).mo148714x53d8522f(java.lang.Integer.valueOf(((java.lang.Number) ((n0.q4) v2Var).mo128745x754a37bb()).intValue() + 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(g1.i r14, h1.c r15, float r16) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.a.j(g1.i, h1.c, float):void");
    }

    public final float k() {
        return ((java.lang.Number) this.f506231t.mo128745x754a37bb()).floatValue();
    }
}

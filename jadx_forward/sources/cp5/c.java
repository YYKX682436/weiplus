package cp5;

/* loaded from: classes14.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.vqm.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f302652a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f302653b;

    /* renamed from: c, reason: collision with root package name */
    public final long f302654c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.vqm.f f302655d;

    /* renamed from: e, reason: collision with root package name */
    public final long f302656e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f302657f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f302658g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f302659h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f302660i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f302661j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f302662k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f302663l;

    public c(java.lang.String tag, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f302652a = tag;
        this.f302653b = z17;
        this.f302654c = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b;
        this.f302656e = aVar.d();
        this.f302657f = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f302658g = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f302659h = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f302660i = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f302661j = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f302662k = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f302663l = new java.util.concurrent.atomic.AtomicLong(0L);
        if (com.p314xaae8f345.mm.p1006xc5476f33.vqm.b.f258849b.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.f(this);
            this.f302655d = fVar;
            aVar.a(fVar);
        }
    }

    public final void a(int i17) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f302659h;
        atomicLong.incrementAndGet();
        this.f302660i.addAndGet(i17);
        long j17 = atomicLong.get();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = this.f302663l;
        long j18 = atomicLong2.get();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = this.f302662k;
        if (this.f302653b) {
            if (atomicLong3.get() >= 1 || j17 <= this.f302654c) {
                return;
            }
            h(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2139, 1);
            atomicLong3.incrementAndGet();
            return;
        }
        long j19 = atomicLong3.get();
        if (j17 - j18 < (j19 < 5 ? 1000L : j19 < 8 ? 5000L : 20000L) || !atomicLong2.compareAndSet(j18, j17)) {
            return;
        }
        h(false);
        i();
        atomicLong3.incrementAndGet();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2139, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public long b() {
        return this.f302656e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void c() {
        i();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void e() {
        i();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0 b0Var, byte[] bArr, byte[] bArr2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void g(com.p314xaae8f345.mm.p1006xc5476f33.vqm.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.vqm.y yVar) {
    }

    public final void h(boolean z17) {
        long j17 = this.f302659h.get();
        java.lang.String str = this.f302652a + "_Report";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BufferReport(Stopped: ");
        sb6.append(z17);
        sb6.append(")] AllocCount:");
        sb6.append(j17);
        sb6.append(" | Phys:");
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((this.f302660i.get() / 1024.0d) / 1024.0d)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append("MB | Virt:");
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((this.f302661j.get() / 1024.0d) / 1024.0d)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        sb6.append(format2);
        sb6.append("MB");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    public final void i() {
        if (this.f302655d == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0.Matrix;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.p();
        pVar.K = this.f302661j.get();
        pVar.W[31] = true;
        pVar.f258956J = this.f302660i.get();
        pVar.W[30] = true;
        aVar.f(b0Var, pVar.m75963xebb06ba0());
    }
}

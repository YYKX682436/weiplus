package x8;

/* loaded from: classes15.dex */
public final class a implements q8.e, q8.m {

    /* renamed from: a, reason: collision with root package name */
    public q8.g f533997a;

    /* renamed from: b, reason: collision with root package name */
    public q8.o f533998b;

    /* renamed from: c, reason: collision with root package name */
    public x8.b f533999c;

    /* renamed from: d, reason: collision with root package name */
    public int f534000d;

    /* renamed from: e, reason: collision with root package name */
    public int f534001e;

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        if (this.f533999c == null) {
            x8.b a17 = x8.d.a(fVar);
            this.f533999c = a17;
            if (a17 == null) {
                throw new m8.x("Unsupported or unrecognized wav header.");
            }
            int i17 = a17.f534003b;
            int i18 = a17.f534006e * i17;
            int i19 = a17.f534002a;
            this.f533998b.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.b(null, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54263xb16343ff, null, i18 * i19, 32768, i19, i17, a17.f534007f, null, null, 0, null));
            this.f534000d = this.f533999c.f534005d;
        }
        x8.b bVar = this.f533999c;
        if (!((bVar.f534008g == 0 || bVar.f534009h == 0) ? false : true)) {
            fVar.getClass();
            bVar.getClass();
            q8.b bVar2 = (q8.b) fVar;
            bVar2.f442153e = 0;
            t9.p pVar = new t9.p(8);
            x8.c a18 = x8.c.a(fVar, pVar);
            while (true) {
                int f17 = t9.d0.f(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                int i27 = a18.f534010a;
                long j17 = a18.f534011b;
                if (i27 == f17) {
                    bVar2.f(8);
                    bVar.f534008g = bVar2.f442151c;
                    bVar.f534009h = j17;
                    this.f533997a.b(this);
                    break;
                }
                long j18 = j17 + 8;
                int f18 = t9.d0.f("RIFF");
                int i28 = a18.f534010a;
                if (i28 == f18) {
                    j18 = 12;
                }
                if (j18 > 2147483647L) {
                    throw new m8.x("Chunk is too large (~2GB+) to skip; id: " + i28);
                }
                bVar2.f((int) j18);
                a18 = x8.c.a(fVar, pVar);
            }
        }
        int d17 = this.f533998b.d(fVar, 32768 - this.f534001e, true);
        if (d17 != -1) {
            this.f534001e += d17;
        }
        int i29 = this.f534001e;
        int i37 = this.f534000d;
        int i38 = i29 / i37;
        if (i38 > 0) {
            long j19 = ((((q8.b) fVar).f442151c - i29) * 1000000) / this.f533999c.f534004c;
            int i39 = i38 * i37;
            int i47 = i29 - i39;
            this.f534001e = i47;
            this.f533998b.b(j19, 1, i39, i47, null);
        }
        return d17 == -1 ? -1 : 0;
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f533997a = gVar;
        this.f533998b = gVar.l(0, 1);
        this.f533999c = null;
        gVar.j();
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        x8.b bVar = this.f533999c;
        long j18 = (j17 * bVar.f534004c) / 1000000;
        long j19 = bVar.f534005d;
        return java.lang.Math.min((j18 / j19) * j19, bVar.f534009h - j19) + bVar.f534008g;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        return x8.d.a(fVar) != null;
    }

    @Override // q8.m
    public long g() {
        return ((this.f533999c.f534009h / r0.f534005d) * 1000000) / r0.f534003b;
    }

    @Override // q8.e
    /* renamed from: release */
    public void mo131096x41012807() {
    }

    @Override // q8.e
    /* renamed from: seek */
    public void mo131097x35ce78(long j17, long j18) {
        this.f534001e = 0;
    }
}

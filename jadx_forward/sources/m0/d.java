package m0;

/* loaded from: classes14.dex */
public final class d extends m0.w implements n0.e4 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f403983e;

    /* renamed from: f, reason: collision with root package name */
    public final float f403984f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.e5 f403985g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.e5 f403986h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.l0 f403987i;

    public d(boolean z17, float f17, n0.e5 e5Var, n0.e5 e5Var2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(z17, e5Var2);
        this.f403983e = z17;
        this.f403984f = f17;
        this.f403985g = e5Var;
        this.f403986h = e5Var2;
        this.f403987i = new x0.l0();
    }

    @Override // a0.s1
    public void a(g1.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        long j17 = ((e1.y) this.f403985g.mo128745x754a37bb()).f327855a;
        ((u1.o0) fVar).b();
        f(fVar, this.f403984f, j17);
        java.util.Iterator it = ((x0.a0) this.f403987i.entrySet()).iterator();
        while (it.hasNext()) {
            m0.r rVar = (m0.r) ((java.util.Map.Entry) it.next()).getValue();
            float f17 = ((m0.j) this.f403986h.mo128745x754a37bb()).f404011d;
            if (!(f17 == 0.0f)) {
                long b17 = e1.y.b(j17, f17, 0.0f, 0.0f, 0.0f, 14, null);
                rVar.getClass();
                if (rVar.f404031d == null) {
                    long a17 = fVar.a();
                    float f18 = m0.s.f404040a;
                    rVar.f404031d = java.lang.Float.valueOf(java.lang.Math.max(d1.k.d(a17), d1.k.b(a17)) * 0.3f);
                }
                java.lang.Float f19 = rVar.f404032e;
                boolean z17 = rVar.f404030c;
                if (f19 == null) {
                    float f27 = rVar.f404029b;
                    rVar.f404032e = java.lang.Float.isNaN(f27) ? java.lang.Float.valueOf(m0.s.a(fVar, z17, fVar.a())) : java.lang.Float.valueOf(fVar.R(f27));
                }
                if (rVar.f404028a == null) {
                    rVar.f404028a = new d1.e(fVar.r());
                }
                if (rVar.f404033f == null) {
                    rVar.f404033f = new d1.e(d1.f.a(d1.k.d(fVar.a()) / 2.0f, d1.k.b(fVar.a()) / 2.0f));
                }
                float floatValue = (!((java.lang.Boolean) ((n0.q4) rVar.f404039l).mo128745x754a37bb()).booleanValue() || ((java.lang.Boolean) ((n0.q4) rVar.f404038k).mo128745x754a37bb()).booleanValue()) ? ((java.lang.Number) rVar.f404034g.d()).floatValue() : 1.0f;
                java.lang.Float f28 = rVar.f404031d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f28);
                float floatValue2 = f28.floatValue();
                java.lang.Float f29 = rVar.f404032e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f29);
                float a18 = q2.a.a(floatValue2, f29.floatValue(), ((java.lang.Number) rVar.f404035h.d()).floatValue());
                d1.e eVar = rVar.f404028a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
                float c17 = d1.e.c(eVar.f307160a);
                d1.e eVar2 = rVar.f404033f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar2);
                float c18 = d1.e.c(eVar2.f307160a);
                z.e eVar3 = rVar.f404036i;
                float a19 = q2.a.a(c17, c18, ((java.lang.Number) eVar3.d()).floatValue());
                d1.e eVar4 = rVar.f404028a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar4);
                float d17 = d1.e.d(eVar4.f307160a);
                d1.e eVar5 = rVar.f404033f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar5);
                long a27 = d1.f.a(a19, q2.a.a(d17, d1.e.d(eVar5.f307160a), ((java.lang.Number) eVar3.d()).floatValue()));
                long b18 = e1.y.b(b17, e1.y.d(b17) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
                if (z17) {
                    float d18 = d1.k.d(fVar.a());
                    float b19 = d1.k.b(fVar.a());
                    g1.b bVar = (g1.b) fVar.p();
                    long b27 = bVar.b();
                    bVar.a().c();
                    ((g1.d) bVar.f349037a).a(0.0f, 0.0f, d18, b19, 1);
                    g1.h.b(fVar, b18, a18, a27, 0.0f, null, null, 0, 120, null);
                    bVar.a().b();
                    bVar.c(b27);
                } else {
                    g1.h.b(fVar, b18, a18, a27, 0.0f, null, null, 0, 120, null);
                }
            }
        }
    }

    @Override // n0.e4
    public void b() {
    }

    @Override // n0.e4
    public void c() {
        this.f403987i.clear();
    }

    @Override // n0.e4
    public void d() {
        this.f403987i.clear();
    }

    @Override // m0.w
    public void e(c0.r interaction, p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interaction, "interaction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        x0.l0 l0Var = this.f403987i;
        java.util.Iterator it = ((x0.a0) l0Var.f532437e).iterator();
        while (it.hasNext()) {
            m0.r rVar = (m0.r) ((java.util.Map.Entry) it.next()).getValue();
            ((n0.q4) rVar.f404039l).mo148714x53d8522f(java.lang.Boolean.TRUE);
            ((p3325xe03a0797.p3326xc267989b.a0) rVar.f404037j).U(jz5.f0.f384359a);
        }
        boolean z17 = this.f403983e;
        m0.r rVar2 = new m0.r(z17 ? new d1.e(interaction.f118476a) : null, this.f403984f, z17, null);
        l0Var.put(interaction, rVar2);
        p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new m0.c(rVar2, this, interaction, null), 3, null);
    }

    @Override // m0.w
    public void g(c0.r interaction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interaction, "interaction");
        m0.r rVar = (m0.r) this.f403987i.get(interaction);
        if (rVar != null) {
            ((n0.q4) rVar.f404039l).mo148714x53d8522f(java.lang.Boolean.TRUE);
            ((p3325xe03a0797.p3326xc267989b.a0) rVar.f404037j).U(jz5.f0.f384359a);
        }
    }
}

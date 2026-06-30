package fp4;

/* loaded from: classes10.dex */
public final class s extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f346907f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f346908g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f346909h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f346910i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f346911m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f346912n;

    /* renamed from: o, reason: collision with root package name */
    public long f346913o;

    /* renamed from: p, reason: collision with root package name */
    public long f346914p;

    /* renamed from: q, reason: collision with root package name */
    public long f346915q;

    /* renamed from: r, reason: collision with root package name */
    public long f346916r;

    /* renamed from: s, reason: collision with root package name */
    public long f346917s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.a f346918t;

    /* renamed from: u, reason: collision with root package name */
    public final fp4.o f346919u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 holder, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f346907f = holder;
        jz5.h.b(new fp4.m(this));
        this.f346908g = jz5.h.b(new fp4.q(this));
        this.f346909h = jz5.h.b(new fp4.r(this));
        this.f346910i = jz5.h.b(new fp4.i(this));
        this.f346911m = jz5.h.b(new fp4.n(this));
        this.f346919u = new fp4.o(this, status);
    }

    public final void A(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        zu3.a aVar = this.f346918t;
        if (aVar != null) {
            boolean z17 = this.f346912n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f346907f;
            if (!z17) {
                this.f346912n = true;
                c17043x8103c103.m68232x76bcab3c(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d z18 = z();
                fp4.o oVar = this.f346919u;
                z18.m72570x6c4ebec7(oVar);
                z().m72575x7a9de772(oVar);
                c17043x8103c103.m68234x466a35c6(new fp4.j(this));
                ((android.widget.ImageView) ((jz5.n) this.f346910i).mo141623x754a37bb()).setOnClickListener(new fp4.k(this));
                ((android.widget.ImageView) ((jz5.n) this.f346911m).mo141623x754a37bb()).setOnClickListener(new fp4.l(this));
            }
            long j17 = 1000;
            long m97261xccb87a6a = composition.i().m97261xccb87a6a() / j17;
            this.f346913o = composition.i().m97259x74606f23() / j17;
            bv3.d dVar = aVar.f557293c;
            long b17 = dVar.b();
            long j18 = this.f346913o;
            if (b17 > j18) {
                bv3.c cVar = dVar.f106265b;
                cVar.c(cVar.f106261c + (j18 - cVar.a()));
            }
            this.f346914p = dVar.c();
            long b18 = dVar.b();
            this.f346915q = b18;
            this.f346916r = this.f346914p;
            this.f346917s = b18;
            bv3.d dVar2 = new bv3.d(0L, false, 3, null);
            dVar2.d(this.f346916r, this.f346917s);
            aVar.f557292b = dVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogTimeEditPlugin", "time range:" + dVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d z19 = z();
            zu3.a aVar2 = this.f346918t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
            long c17 = aVar2.f557293c.c();
            zu3.a aVar3 = this.f346918t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar3);
            z19.b(composition, c17, aVar3.f557293c.b());
            c17043x8103c103.m68236x76500a7f(true);
        }
    }

    @Override // bp4.a0
    public void c(long j17) {
        z().m72574x3ae760af(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f346907f;
        if (!c17043x8103c103.h()) {
            return false;
        }
        c17043x8103c103.m68236x76500a7f(false);
        return true;
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (i17 == 8) {
            this.f346907f.m68236x76500a7f(false);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d z() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d) ((jz5.n) this.f346909h).mo141623x754a37bb();
    }
}

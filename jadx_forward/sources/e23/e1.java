package e23;

/* loaded from: classes12.dex */
public class e1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f328363q;

    /* renamed from: r, reason: collision with root package name */
    public long f328364r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f328365s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f328366t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f328367u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f328368v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f328369w;

    /* renamed from: x, reason: collision with root package name */
    public final e23.c1 f328370x;

    /* renamed from: y, reason: collision with root package name */
    public final e23.d1 f328371y;

    public e1(int i17) {
        super(16, i17);
        this.f328370x = new e23.c1(this, this.f505298h);
        this.f328371y = new e23.d1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String g27;
        e23.d1 d1Var = (e23.d1) eVar;
        p13.y yVar = this.f328363q;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(yVar.f432720e, yVar.f432719d);
        tt0.c a17 = tt0.c.a(Li.j());
        this.f328364r = Li.m124847x74d37ac6();
        this.f328365s = a17.f503320b;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(this.f328365s)) {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(this.f328365s);
            g27 = Bi == null ? this.f328365s : Bi.f68913x21f9b213;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f328365s, true);
            g27 = n17 == null ? this.f328365s : n17.g2();
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = d1Var.f328352c.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f328366t = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, g27, textSize);
        this.f328367u = a17.f503321c;
        this.f328368v = k35.m1.f(context, this.f328363q.f432721f, true, false);
        this.f328369w = a17.f503327i;
    }

    @Override // u13.g
    public int j() {
        return this.f328363q.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328370x;
    }
}

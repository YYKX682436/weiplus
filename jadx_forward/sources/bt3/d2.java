package bt3;

/* loaded from: classes9.dex */
public class d2 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f105755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.q f105756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 f105758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f105759e;

    public d2(long j17, ot0.q qVar, java.lang.String str, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f105755a = j17;
        this.f105756b = qVar;
        this.f105757c = str;
        this.f105758d = c5303xc75d2f73;
        this.f105759e = f9Var;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        r45.bq0 bq0Var;
        if (i17 == 0) {
            long j17 = this.f105755a;
            ot0.q qVar = this.f105756b;
            bt3.g2.c(j17, qVar.m(), qVar.k(), this.f105757c, this.f105758d.f135623g.f87848a);
            return;
        }
        java.lang.String str3 = this.f105757c;
        long j18 = this.f105755a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f105759e;
        if (-3200 != i17) {
            f9Var.r1(5);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j18, f9Var, true);
            if (bt3.g2.I(str3, j18, false, str)) {
                return;
            }
            bt3.g2.b(str3, str);
            return;
        }
        bt3.g2.a(j18, f9Var);
        long j19 = this.f105755a;
        java.lang.String str4 = this.f105757c;
        ot0.q v17 = ot0.q.v(f9Var.j());
        bt3.b0 x17 = bt3.g2.x(v17);
        if (x17 != null) {
            java.lang.String str5 = x17.f105738a;
            bq0Var = x17.f105740c;
            str2 = str5;
        } else {
            str2 = "";
            bq0Var = null;
        }
        bt3.g2.c(j19, v17.m(), str2, str4, bq0Var);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).f105961d.put(java.lang.Long.valueOf(j18), str3);
    }
}

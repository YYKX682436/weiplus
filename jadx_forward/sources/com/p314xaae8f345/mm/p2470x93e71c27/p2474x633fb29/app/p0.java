package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class p0 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f270555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f270558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f270559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ul5 f270560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270561g;

    public p0(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, ot0.q qVar, r45.bq0 bq0Var, r45.ul5 ul5Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2) {
        this.f270555a = j17;
        this.f270556b = f9Var;
        this.f270557c = str;
        this.f270558d = qVar;
        this.f270559e = bq0Var;
        this.f270560f = ul5Var;
        this.f270561g = f9Var2;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        long j17 = this.f270555a;
        if (i17 != 0) {
            if (-3200 == i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "why errCode equals %s", java.lang.Integer.valueOf(i17));
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f270561g;
            f9Var.r1(5);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(j17, f9Var);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var2.e1(f9Var.mo78012x3fdd41df() + 1);
            f9Var2.u1(f9Var.Q0());
            f9Var2.d1(str);
            f9Var2.m124850x7650bebc(10000);
            f9Var2.r1(6);
            f9Var2.j1(0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
            return;
        }
        zs3.b0 b0Var = new zs3.b0();
        b0Var.f68498x297eb4f7 = j17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = this.f270556b;
        b0Var.f68499x6e8b9edb = f9Var3.m124847x74d37ac6();
        b0Var.f68500x2687819 = f9Var3.Q0();
        b0Var.f68503x1209e7cb = this.f270557c;
        ot0.q qVar = this.f270558d;
        b0Var.f68502x29dd02d3 = qVar.n();
        b0Var.f68495x225aa2b6 = qVar.f430191g;
        b0Var.f68494x84214f59 = this.f270559e;
        b0Var.f68504x2262335f = 0;
        b0Var.f68496x3474bf20 = this.f270560f.f468999g;
        b0Var.f68497x88be67a1 = new java.util.Random().nextInt(2147483645) + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerrecord needNetScene insert ret:%b, id:%d, localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).mo880xb970c2b9(b0Var)), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b0Var.f68497x88be67a1));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, false);
    }
}

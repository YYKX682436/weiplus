package bt3;

/* loaded from: classes9.dex */
public class e2 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f105778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f105779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f105781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ul5 f105782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f105783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f105784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f105785h;

    public e2(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, ot0.q qVar, r45.ul5 ul5Var, r45.bq0 bq0Var, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2) {
        this.f105778a = j17;
        this.f105779b = f9Var;
        this.f105780c = str;
        this.f105781d = qVar;
        this.f105782e = ul5Var;
        this.f105783f = bq0Var;
        this.f105784g = z17;
        this.f105785h = f9Var2;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        r45.bq0 bq0Var;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f105779b;
        if (i17 == 0) {
            bt3.g2.e(this.f105778a, f9Var.Q0(), f9Var.m124847x74d37ac6(), this.f105780c, this.f105781d, this.f105782e, this.f105783f, this.f105784g);
            return;
        }
        java.lang.String str4 = this.f105780c;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f105785h;
        long j17 = this.f105778a;
        if (-3200 != i17) {
            f9Var2.r1(5);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, f9Var2, true);
            bt3.g2.b(str4, str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "errcode equals %s, errMsg:%s, msgId:%s, toUser:%s", java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(j17), str4);
        bt3.g2.a(j17, f9Var2);
        java.lang.String Q0 = f9Var.Q0();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        ot0.q v17 = ot0.q.v(f9Var2.j());
        bt3.b0 x17 = bt3.g2.x(v17);
        if (x17 != null) {
            str2 = x17.f105738a;
            str3 = x17.f105739b;
            bq0Var = x17.f105740c;
        } else {
            str2 = "";
            bq0Var = null;
            str3 = "";
        }
        zs3.b0 b0Var = new zs3.b0();
        b0Var.f68498x297eb4f7 = j17;
        b0Var.f68499x6e8b9edb = m124847x74d37ac6;
        b0Var.f68500x2687819 = Q0;
        b0Var.f68503x1209e7cb = str4;
        b0Var.f68502x29dd02d3 = v17.f430187f;
        b0Var.f68495x225aa2b6 = str2;
        b0Var.f68494x84214f59 = bq0Var;
        b0Var.f68504x2262335f = 0;
        b0Var.f68496x3474bf20 = str3;
        b0Var.f68497x88be67a1 = new java.util.Random().nextInt(2147483645) + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", "summerrecord Normal RecordMsgStorage insert ret:%b, id:%d, oriMsgId:%d localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).mo880xb970c2b9(b0Var)), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Integer.valueOf(b0Var.f68497x88be67a1));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, this.f105784g);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).f105961d.put(java.lang.Long.valueOf(j17), str4);
    }
}

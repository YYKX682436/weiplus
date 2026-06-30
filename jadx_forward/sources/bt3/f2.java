package bt3;

/* loaded from: classes9.dex */
public class f2 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f105792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.q f105793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f105795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f105796f;

    public f2(int i17, long j17, ot0.q qVar, java.lang.String str, r45.bq0 bq0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f105791a = i17;
        this.f105792b = j17;
        this.f105793c = qVar;
        this.f105794d = str;
        this.f105795e = bq0Var;
        this.f105796f = f9Var;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        r45.bq0 bq0Var;
        if (i17 == 0) {
            int i18 = this.f105791a;
            long j17 = this.f105792b;
            ot0.q qVar = this.f105793c;
            bt3.g2.d(i18, j17, qVar.m(), qVar.k(), this.f105794d, this.f105795e);
            return;
        }
        java.lang.String str3 = this.f105794d;
        long j18 = this.f105792b;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f105796f;
        if (-3200 != i17) {
            f9Var.r1(5);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j18, f9Var, true);
            bt3.g2.b(str3, str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "errcode equals %s, errMsg:%s, msgId:%s, toUser:%s", java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(j18), str3);
        bt3.g2.a(j18, f9Var);
        int i19 = this.f105791a;
        long j19 = this.f105792b;
        java.lang.String str4 = this.f105794d;
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
        bt3.g2.d(i19, j19, v17.m(), str2, str4, bq0Var);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).f105961d.put(java.lang.Long.valueOf(j18), str3);
    }
}

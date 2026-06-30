package bt3;

/* loaded from: classes9.dex */
public class l2 implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f105873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f105874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f105875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bt3.m2 f105876g;

    public l2(bt3.m2 m2Var, m11.b0 b0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17) {
        this.f105876g = m2Var;
        this.f105873d = b0Var;
        this.f105874e = f9Var;
        this.f105875f = j17;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "download image succed: %s, errType: %s, errCode:%s", java.lang.Boolean.valueOf(i19 == 0 && i27 == 0), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        boolean z17 = obj instanceof r45.gp0;
        bt3.m2 m2Var = this.f105876g;
        if (z17) {
            r45.gp0 gp0Var = (r45.gp0) obj;
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            m11.b0 b0Var = this.f105873d;
            gp0Var.A0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f105874e, bm5.c0.f104083a.d(b0Var.j()), m11.c0.b(b0Var), "", ""));
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f105874e;
            gp0Var.B0(((k90.b) u0Var).mj(f9Var, f9Var.z0(), true));
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(b0Var.f404185t, "msg", null);
            if (d17 != null) {
                gp0Var.b0((java.lang.String) d17.get(".msg.img.$cdnbigimgurl"));
                gp0Var.q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.img.$length"), 0));
                gp0Var.a0((java.lang.String) d17.get(".msg.img.$aeskey"));
                m2Var.f105882d.f68494x84214f59.f452497f.set(m2Var.f105883e, gp0Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "parse cdnInfo failed. [%s]", b0Var.f404185t);
            }
            m2Var.f105884f.put(java.lang.Long.valueOf(gp0Var.V1), java.lang.Boolean.TRUE);
        } else {
            m2Var.f105884f.put(java.lang.Long.valueOf(this.f105875f), java.lang.Boolean.TRUE);
        }
        m2Var.a(m2Var.f105884f, m2Var.f105886h, m2Var.f105882d);
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        bt3.m2 m2Var = this.f105876g;
        m2Var.f105884f.put(java.lang.Long.valueOf(this.f105875f), java.lang.Boolean.TRUE);
        m2Var.a(m2Var.f105884f, m2Var.f105886h, m2Var.f105882d);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}

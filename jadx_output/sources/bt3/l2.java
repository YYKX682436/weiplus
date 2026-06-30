package bt3;

/* loaded from: classes9.dex */
public class l2 implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f24340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f24341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f24342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bt3.m2 f24343g;

    public l2(bt3.m2 m2Var, m11.b0 b0Var, com.tencent.mm.storage.f9 f9Var, long j17) {
        this.f24343g = m2Var;
        this.f24340d = b0Var;
        this.f24341e = f9Var;
        this.f24342f = j17;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "download image succed: %s, errType: %s, errCode:%s", java.lang.Boolean.valueOf(i19 == 0 && i27 == 0), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        boolean z17 = obj instanceof r45.gp0;
        bt3.m2 m2Var = this.f24343g;
        if (z17) {
            r45.gp0 gp0Var = (r45.gp0) obj;
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            m11.b0 b0Var = this.f24340d;
            gp0Var.A0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f24341e, bm5.c0.f22550a.d(b0Var.j()), m11.c0.b(b0Var), "", ""));
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.tencent.mm.storage.f9 f9Var = this.f24341e;
            gp0Var.B0(((k90.b) u0Var).mj(f9Var, f9Var.z0(), true));
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(b0Var.f322652t, "msg", null);
            if (d17 != null) {
                gp0Var.b0((java.lang.String) d17.get(".msg.img.$cdnbigimgurl"));
                gp0Var.q0(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$length"), 0));
                gp0Var.a0((java.lang.String) d17.get(".msg.img.$aeskey"));
                m2Var.f24349d.field_dataProto.f370964f.set(m2Var.f24350e, gp0Var);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "parse cdnInfo failed. [%s]", b0Var.f322652t);
            }
            m2Var.f24351f.put(java.lang.Long.valueOf(gp0Var.V1), java.lang.Boolean.TRUE);
        } else {
            m2Var.f24351f.put(java.lang.Long.valueOf(this.f24342f), java.lang.Boolean.TRUE);
        }
        m2Var.a(m2Var.f24351f, m2Var.f24353h, m2Var.f24349d);
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        bt3.m2 m2Var = this.f24343g;
        m2Var.f24351f.put(java.lang.Long.valueOf(this.f24342f), java.lang.Boolean.TRUE);
        m2Var.a(m2Var.f24351f, m2Var.f24353h, m2Var.f24349d);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }
}

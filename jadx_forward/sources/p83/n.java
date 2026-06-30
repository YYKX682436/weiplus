package p83;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f434301d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.te5 f434302e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f434303f = null;

    public n(int i17, long j17, long j18, int i18) {
        this.f434301d = null;
        this.f434302e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.te5();
        lVar.f152198b = new r45.ue5();
        lVar.f152200d = 723;
        lVar.f152199c = "/cgi-bin/micromsg-bin/pstnshutdown";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f434301d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.te5 te5Var = (r45.te5) a17.f152243a.f152217a;
        this.f434302e = te5Var;
        te5Var.f467886d = c01.z1.r();
        te5Var.f467887e = i17;
        te5Var.f467888f = j17;
        te5Var.f467890h = j18;
        te5Var.f467891i = i18;
        te5Var.f467889g = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallShutDown", "roomId: %d, roomKey: %d, callSeq: %d, status: %d, timestamp: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(currentTimeMillis));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f434303f = u0Var;
        return mo9409x10f9447a(sVar, this.f434301d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 723;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallShutDown", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f434303f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

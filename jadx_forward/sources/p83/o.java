package p83;

/* loaded from: classes8.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f434304d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ve5 f434305e;

    /* renamed from: f, reason: collision with root package name */
    public r45.we5 f434306f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f434307g;

    public o(int i17, long j17, int i18, long j18, boolean z17) {
        this.f434304d = null;
        this.f434305e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ve5();
        lVar.f152198b = new r45.we5();
        lVar.f152200d = 819;
        lVar.f152199c = "/cgi-bin/micromsg-bin/pstnsync";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f434304d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.ve5 ve5Var = (r45.ve5) a17.f152243a.f152217a;
        this.f434305e = ve5Var;
        ve5Var.f469699d = c01.z1.r();
        ve5Var.f469700e = i17;
        ve5Var.f469701f = j17;
        ve5Var.f469702g = currentTimeMillis;
        ve5Var.f469703h = i18;
        ve5Var.f469704i = j18;
        if (z17) {
            ve5Var.f469705m = 1;
        } else {
            ve5Var.f469705m = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallSync", "roomId: %d, roomKey: %d, syncKey: %d, callSeq: %d,dataFlag: %d, timestamp: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(ve5Var.f469705m), java.lang.Long.valueOf(currentTimeMillis));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f434307g = u0Var;
        return mo9409x10f9447a(sVar, this.f434304d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 819;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallSync", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f434306f = (r45.we5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f434307g.mo815x76e0bfae(i18, i19, str, this);
    }
}

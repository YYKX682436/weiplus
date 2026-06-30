package i61;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370462d;

    /* renamed from: e, reason: collision with root package name */
    public r45.d0 f370463e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370464f;

    public k(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.c0();
        lVar.f152198b = new r45.d0();
        lVar.f152200d = 1695;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaaquerydetail";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370462d = a17;
        r45.c0 c0Var = (r45.c0) a17.f152243a.f152217a;
        c0Var.f452720d = str;
        c0Var.f452721e = i17;
        c0Var.f452722f = str2;
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAQueryDetail", "set sign and ver");
            c0Var.f452723g = str3;
            c0Var.f452724h = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAQueryDetail", "NetSceneAAQueryDetail, billNo: %s, scene: %s, groupId: %s", str, java.lang.Integer.valueOf(i17), str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAQueryDetail", "doScene");
        this.f370464f = u0Var;
        return mo9409x10f9447a(sVar, this.f370462d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1695;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAQueryDetail", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.d0 d0Var = (r45.d0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f370463e = d0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAQueryDetail", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(d0Var.f453488d), this.f370463e.f453489e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370464f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

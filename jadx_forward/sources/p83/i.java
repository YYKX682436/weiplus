package p83;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f434286d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.me5 f434287e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ne5 f434288f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f434289g = null;

    public i(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f434286d = null;
        this.f434287e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.me5();
        lVar.f152198b = new r45.ne5();
        lVar.f152200d = 991;
        lVar.f152199c = "/cgi-bin/micromsg-bin/pstninvite";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f434286d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int e17 = vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        r45.me5 me5Var = (r45.me5) a17.f152243a.f152217a;
        me5Var.f461950d = c01.z1.r();
        me5Var.f461951e = str2;
        me5Var.f461955i = str;
        me5Var.f461954h = i17;
        me5Var.f461952f = e17;
        me5Var.f461956m = 1;
        me5Var.f461953g = currentTimeMillis;
        me5Var.f461957n = i18;
        me5Var.f461958o = i19;
        this.f434287e = me5Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallInvite", "toUsername: %s, phoneNumber: %s, invitedId: %s, netType: %d, dialScene: %d, countryType: %d", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f434289g = u0Var;
        return mo9409x10f9447a(sVar, this.f434286d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 991;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallInvite", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f434288f = (r45.ne5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 || i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f434289g;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f434289g;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

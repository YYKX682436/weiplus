package ar1;

/* loaded from: classes4.dex */
public final class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f94911d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f94912e;

    public j(java.lang.String str, int i17) {
        java.lang.String c17;
        r45.pb3 pb3Var = new r45.pb3();
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        pb3Var.f464454d = c17;
        pb3Var.f464455e = 20;
        pb3Var.f464456f = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 25742;
        lVar.f152197a = pb3Var;
        lVar.f152198b = new r45.qb3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mp/getblacklist";
        this.f94911d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.NetSceneBizFansGetBlackList", "NetSceneBizFansGetBlackList");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f94912e = u0Var;
        return mo9409x10f9447a(sVar, this.f94911d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 25742;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.NetSceneBizFansGetBlackList", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f94912e;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

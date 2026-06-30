package bs4;

/* loaded from: classes4.dex */
public abstract class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f105536d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f105537e;

    public a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.at atVar = new r45.at();
        atVar.f451784f = str;
        atVar.f451782d = i17;
        atVar.f451783e = i18;
        lVar.f152197a = atVar;
        lVar.f152198b = new r45.bt();
        lVar.f152199c = mo11133xb5887636();
        lVar.f152200d = mo11132x19c9adf5();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.J(str);
        lVar.f152204h = 0;
        this.f105537e = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCancelPay", "request uri: %s, reqKey: %s, payScene: %d, payChannel:%d", mo11133xb5887636(), str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f105536d = u0Var;
        return mo9409x10f9447a(sVar, this.f105537e, this);
    }

    /* renamed from: getFuncId */
    public abstract int mo11132x19c9adf5();

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return mo11132x19c9adf5();
    }

    /* renamed from: getUri */
    public abstract java.lang.String mo11133xb5887636();

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        mo11133xb5887636();
        if (i18 == 0 && i19 == 0) {
            try {
                r45.bt btVar = (r45.bt) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCancelPay", "NetSceneCancelPay BaseResponse.Ret is %d, BaseResponse.ErrMsg is %s", java.lang.Integer.valueOf(btVar.f76492x92037252.f458492d), btVar.f76492x92037252.f458493e);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCancelPay", e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f105536d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

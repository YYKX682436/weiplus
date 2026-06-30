package wt4;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f531062d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f531063e;

    public a(int i17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.c75();
        lVar.f152198b = new r45.d75();
        lVar.f152199c = "/cgi-bin/mmpay-bin/payubatchuserroll";
        lVar.f152200d = com.p314xaae8f345.mm.p874xaefb6cc9.y.f29758x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f531063e = a17;
        r45.c75 c75Var = (r45.c75) a17.f152243a.f152217a;
        c75Var.f452882d = i17;
        c75Var.f452883e = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f531062d = u0Var;
        return mo9409x10f9447a(sVar, this.f531063e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p874xaefb6cc9.y.f29758x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayUPayQueryUserRoll", "errType = " + i18 + " errCode " + i19 + " errMsg " + str);
        this.f531062d.mo815x76e0bfae(i18, i19, str, this);
        if (i18 == 0 && i19 == 0) {
            int i27 = ((r45.d75) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f453737d;
        }
    }
}

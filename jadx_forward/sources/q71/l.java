package q71;

/* loaded from: classes7.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f441881d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f441882e;

    public l(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nd0();
        lVar.f152198b = new r45.od0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
        lVar.f152200d = tj.d.f76812x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f441882e = a17;
        r45.nd0 nd0Var = (r45.nd0) a17.f152243a.f152217a;
        nd0Var.f462790e = "invoice_info";
        nd0Var.f462791f = i17;
        nd0Var.f462792g = 2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f441881d = u0Var;
        return mo9409x10f9447a(sVar, this.f441882e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return tj.d.f76812x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDeleteUserAutoFillInfo", "");
        }
        this.f441881d.mo815x76e0bfae(i18, i19, str, this);
    }
}

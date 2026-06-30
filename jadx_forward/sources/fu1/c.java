package fu1;

/* loaded from: classes2.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348354d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348355e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348356f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348357g;

    public c(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zn3();
        lVar.f152198b = new r45.ao3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
        lVar.f152200d = oc1.e.f73030x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f348354d = a17;
        r45.zn3 zn3Var = (r45.zn3) a17.f152243a.f152217a;
        zn3Var.f473771d = str;
        zn3Var.f473772e = i17;
        zn3Var.f473773f = str2;
        zn3Var.f473774g = str3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348355e = u0Var;
        return mo9409x10f9447a(sVar, this.f348354d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return oc1.e.f73030x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(oc1.e.f73030x366c91de), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.ao3 ao3Var = (r45.ao3) this.f348354d.f152244b.f152233a;
            this.f348356f = ao3Var.f451699d;
            this.f348357g = ao3Var.f451701f;
        }
        this.f348355e.mo815x76e0bfae(i18, i19, str, this);
    }
}

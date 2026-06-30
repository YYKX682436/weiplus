package p83;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f434261d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ge5 f434262e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f434263f = null;

    public a(int i17, long j17, java.lang.String str, java.lang.String str2, int i18, long j18) {
        this.f434261d = null;
        this.f434262e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ge5();
        lVar.f152198b = new r45.he5();
        lVar.f152200d = gd1.s.f69811x366c91de;
        lVar.f152199c = "/cgi-bin/micromsg-bin/pstncancelinvite";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f434261d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.ge5 ge5Var = (r45.ge5) a17.f152243a.f152217a;
        this.f434262e = ge5Var;
        ge5Var.f456702d = i17;
        ge5Var.f456703e = j17;
        ge5Var.f456704f = str;
        ge5Var.f456705g = currentTimeMillis;
        ge5Var.f456706h = i18;
        ge5Var.f456707i = str2;
        ge5Var.f456708m = j18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f434263f = u0Var;
        return mo9409x10f9447a(sVar, this.f434261d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return gd1.s.f69811x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallCancel", "errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f434263f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

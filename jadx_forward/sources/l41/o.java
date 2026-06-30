package l41;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, ab0.s {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397415d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397416e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397417f;

    public o(java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.q4();
        lVar.f152198b = new r45.r4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/addopenimcontact";
        lVar.f152200d = ma1.a.f72799x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397416e = a17;
        this.f397417f = str;
        r45.q4 q4Var = (r45.q4) a17.f152243a.f152217a;
        q4Var.f465183d = str;
        q4Var.f465184e = str2;
        if (bArr != null && bArr.length > 0) {
            q4Var.f465186g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "tp_username: %s, antispam_ticket:%s spamContext:%s", str, str2, bArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397415d = u0Var;
        return mo9409x10f9447a(sVar, this.f397416e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return ma1.a.f72799x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int intValue = ((java.lang.Integer) bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2557xc3c3c8ee.C20594x5613bb7c())).intValue();
        if (intValue == 1) {
            i19 = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s rValue:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f397417f, java.lang.Integer.valueOf(intValue));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397415d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

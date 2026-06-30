package l41;

/* loaded from: classes9.dex */
public class x extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397488d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397489e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397490f;

    /* renamed from: g, reason: collision with root package name */
    public r45.a05 f397491g;

    public x(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bk3();
        lVar.f152198b = new r45.ck3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getopenimcontact";
        lVar.f152200d = 881;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397489e = a17;
        this.f397490f = str;
        str2 = str2 == null ? "" : str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMContact", "get openim username: %s, roomname: %s, ticket:%s", str, str2, str3);
        r45.bk3 bk3Var = (r45.bk3) a17.f152243a.f152217a;
        bk3Var.f452352d = str;
        bk3Var.f452353e = str2;
        bk3Var.f452354f = str3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397488d = u0Var;
        return mo9409x10f9447a(sVar, this.f397489e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 881;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f397490f);
        if (i18 != 0 || i19 != 0) {
            this.f397488d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.ck3 ck3Var = (r45.ck3) this.f397489e.f152244b.f152233a;
        this.f397491g = ck3Var.f453152e;
        l41.j0.b(ck3Var);
        this.f397488d.mo815x76e0bfae(i18, i19, str, this);
    }
}

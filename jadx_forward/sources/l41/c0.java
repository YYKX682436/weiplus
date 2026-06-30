package l41;

/* loaded from: classes11.dex */
public class c0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397318d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397319e;

    /* renamed from: f, reason: collision with root package name */
    public final int f397320f;

    /* renamed from: g, reason: collision with root package name */
    public final xg3.q0 f397321g;

    public c0(xg3.q0 q0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.z05();
        lVar.f152198b = new r45.a15();
        lVar.f152199c = "/cgi-bin/micromsg-bin/openimoplog";
        lVar.f152200d = 806;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397319e = a17;
        int i17 = q0Var.f535960f;
        this.f397320f = i17;
        this.f397321g = q0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneOpenIMOPLog", "type: %d", java.lang.Integer.valueOf(i17));
        r45.z05 z05Var = (r45.z05) a17.f152243a.f152217a;
        z05Var.f473103d = i17;
        z05Var.f473104e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(q0Var.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397318d = u0Var;
        return mo9409x10f9447a(sVar, this.f397319e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 806;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneOpenIMOPLog", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, opType:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f397320f));
        this.f397318d.mo815x76e0bfae(i18, i19, str, this);
    }
}

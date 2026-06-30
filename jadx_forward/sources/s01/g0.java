package s01;

/* loaded from: classes4.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f483406d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f483407e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f483408f;

    public g0(java.lang.String str, r45.j53 j53Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u90();
        lVar.f152198b = new r45.v90();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/createbizchatinfo";
        lVar.f152200d = 1355;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f483407e = a17;
        r45.u90 u90Var = (r45.u90) a17.f152243a.f152217a;
        u90Var.f468684d = str;
        u90Var.f468685e = j53Var;
        this.f483408f = obj;
    }

    public r45.v90 H() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f483407e;
        if (oVar == null || (fVar = oVar.f152244b.f152233a) == null) {
            return null;
        }
        return (r45.v90) fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f483406d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "do scene");
        return mo9409x10f9447a(sVar, this.f483407e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1355;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f483406d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

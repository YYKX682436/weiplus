package r61;

/* loaded from: classes4.dex */
public class i1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474417d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474418e;

    /* renamed from: f, reason: collision with root package name */
    public int f474419f;

    public i1(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3513;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getoldacctfriend";
        r45.pj3 pj3Var = new r45.pj3();
        this.f474419f = i17;
        pj3Var.f464634e = i17;
        pj3Var.f464633d = str;
        pj3Var.f464635f = str2;
        lVar.f152197a = pj3Var;
        lVar.f152198b = new r45.qj3();
        this.f474417d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetOldAccountFriend", "get old account friend %s, max seq %d, session %s", str, java.lang.Integer.valueOf(i17), str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474418e = u0Var;
        return mo9409x10f9447a(sVar, this.f474417d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3513;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetOldAccountFriend", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f474417d;
            if (!((r45.qj3) oVar.f152244b.f152233a).f465585d.isEmpty()) {
                this.f474419f = ((r45.ky4) ((r45.qj3) oVar.f152244b.f152233a).f465585d.get(((r45.qj3) r1).f465585d.size() - 1)).f460571f;
            }
        }
        this.f474418e.mo815x76e0bfae(i18, i19, str, this);
    }
}

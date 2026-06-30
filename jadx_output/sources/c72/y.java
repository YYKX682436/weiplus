package c72;

/* loaded from: classes8.dex */
public class y extends c72.a implements com.tencent.mm.network.l0, c72.c {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39602d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39603e;

    public y(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hx6();
        lVar.f70665b = new r45.ix6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifyface";
        lVar.f70667d = 797;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39603e = a17;
        r45.hx6 hx6Var = (r45.hx6) a17.f70710a.f70684a;
        hx6Var.f376544e = j17;
        hx6Var.f376546g = str;
        hx6Var.f376547h = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39602d = u0Var;
        return dispatch(sVar, this.f39603e, this);
    }

    @Override // c72.c
    public boolean e() {
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 797;
    }

    @Override // c72.c
    public java.lang.String n() {
        return null;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ix6 ix6Var = (r45.ix6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            i19 = ix6Var.f377399f;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceVerifyFace", "hy: is Verified: %b", java.lang.Boolean.valueOf(i19 == 0));
        } else if (ix6Var != null && ix6Var.f377399f != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceVerifyFace", "hy: has DetailRet, use it");
            i19 = ix6Var.f377399f;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f39602d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

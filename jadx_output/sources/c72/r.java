package c72;

/* loaded from: classes8.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, c72.c {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39585d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39586e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f39587f = null;

    public r(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ln5();
        lVar.f70665b = new r45.mn5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/registerface";
        lVar.f70667d = 918;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39586e = a17;
        r45.ln5 ln5Var = (r45.ln5) a17.f70710a.f70684a;
        ln5Var.f379661d = j17;
        ln5Var.f379662e = str;
        ln5Var.f379663f = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39585d = u0Var;
        return dispatch(sVar, this.f39586e, this);
    }

    @Override // c72.c
    public boolean e() {
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 918;
    }

    @Override // c72.c
    public java.lang.String n() {
        return this.f39587f;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.mn5 mn5Var = (r45.mn5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            i19 = mn5Var.f380696f;
            boolean z17 = i19 == 0;
            this.f39587f = mn5Var.f380694d;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceRegFace", "hy: is Verified: %b", java.lang.Boolean.valueOf(z17));
        } else if (mn5Var != null && mn5Var.f380696f != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceRegFace", "hy: has detail ret. use");
            i19 = mn5Var.f380696f;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f39585d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

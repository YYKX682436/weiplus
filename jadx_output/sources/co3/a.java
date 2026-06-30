package co3;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f43799d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f43800e;

    public a(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q90();
        lVar.f70665b = new r45.r90();
        lVar.f70666c = "/cgi-bin/mmpay-bin/cpucardgetconfig2";
        lVar.f70667d = 1561;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f43800e = a17;
        ((r45.q90) a17.f70710a.f70684a).f383768d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f43799d = u0Var;
        return dispatch(sVar, this.f43800e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1561;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f43799d.onSceneEnd(i18, i19, str, this);
    }
}

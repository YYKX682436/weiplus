package c72;

/* loaded from: classes4.dex */
public class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39599d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39600e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f39601f;

    public x(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f39601f = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uo0();
        lVar.f70665b = new r45.vo0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/facevideobindbioid";
        lVar.f70667d = 1197;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39600e = a17;
        this.f39601f = str;
        r45.uo0 uo0Var = (r45.uo0) a17.f70710a.f70684a;
        uo0Var.f387523f = str2;
        uo0Var.f387521d = j17;
        uo0Var.f387524g = str4;
        uo0Var.f387522e = str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39599d = u0Var;
        return dispatch(sVar, this.f39600e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1197;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f39599d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

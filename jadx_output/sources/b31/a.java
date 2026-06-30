package b31;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f17589d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f17590e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.zq5 f17591f;

    public a(int i17, java.util.LinkedList linkedList, r45.du5 du5Var, r45.du5 du5Var2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zq5();
        lVar.f70665b = new r45.ar5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/reportvoiceresult";
        lVar.f70667d = 228;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f17590e = a17;
        r45.zq5 zq5Var = (r45.zq5) a17.f70710a.f70684a;
        this.f17591f = zq5Var;
        zq5Var.f392306d = i17;
        zq5Var.f392307e = linkedList;
        zq5Var.f392308f = du5Var;
        zq5Var.f392309g = du5Var2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f17589d = u0Var;
        return dispatch(sVar, this.f17590e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 228;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f17589d.onSceneEnd(i18, i19, str, this);
    }
}

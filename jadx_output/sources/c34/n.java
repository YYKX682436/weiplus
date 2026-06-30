package c34;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f38218d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f38219e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f38220f;

    /* renamed from: g, reason: collision with root package name */
    public int f38221g;

    public n(int i17, float f17, float f18, int i18, int i19, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u36();
        lVar.f70665b = new r45.v36();
        lVar.f70666c = "/cgi-bin/micromsg-bin/shakereport";
        lVar.f70667d = 161;
        lVar.f70668e = 56;
        lVar.f70669f = 1000000056;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f38219e = a17;
        r45.u36 u36Var = (r45.u36) a17.f70710a.f70684a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShakeReport", "share reprot %f %f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        u36Var.f386991d = i17;
        u36Var.f386992e = f17;
        u36Var.f386993f = f18;
        u36Var.f386994g = i18;
        u36Var.f386995h = str;
        u36Var.f386996i = str2;
        u36Var.f386999o = i19;
        u36Var.f386997m = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) c01.d9.b().p().l(4107, null), 0);
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(4106, null));
        u36Var.f386998n = q17;
        c01.d9.b().p().w(4106, java.lang.Integer.valueOf(q17 + 1));
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.toByteArray());
            u36Var.f387001q = cu5Var2;
        } catch (java.lang.Throwable unused) {
        }
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2002, f17, f18, i18);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f38218d = u0Var;
        return dispatch(sVar, this.f38219e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 161;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f38219e;
        r45.v36 v36Var = (r45.v36) oVar.f70711b.f70700a;
        this.f38221g = v0Var.getRespObj().getRetCode();
        if (i18 == 0 && i19 == 0) {
            this.f38220f = x51.j1.d(v36Var.f387853d);
        }
        this.f38218d.onSceneEnd(i18, i19, str, this);
    }
}

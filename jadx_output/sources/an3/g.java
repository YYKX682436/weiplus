package an3;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f8870d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f8871e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f8872f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f8873g;

    public g(int i17, float f17, float f18, int i18, int i19, java.lang.String str, java.lang.String str2) {
        if (i17 != 1 && i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneLbsRoom", "OpCode Error :" + i17);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.h64();
        lVar.f70665b = new r45.i64();
        lVar.f70666c = "/cgi-bin/micromsg-bin/joinlbsroom";
        lVar.f70667d = 376;
        lVar.f70668e = 183;
        lVar.f70669f = 1000000183;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f8871e = a17;
        r45.h64 h64Var = (r45.h64) a17.f70710a.f70684a;
        h64Var.f375871d = i17;
        h64Var.f375872e = f17;
        h64Var.f375873f = f18;
        h64Var.f375874g = i18;
        h64Var.f375875h = str;
        h64Var.f375876i = str2;
        h64Var.f375877m = i19;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f8870d = u0Var;
        return dispatch(sVar, this.f8871e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 376;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.f fVar = this.f8871e.f70710a.f70684a;
        int i27 = ((r45.h64) fVar).f375871d;
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.i64 i64Var = (r45.i64) oVar.f70711b.f70700a;
        if (i18 != 0) {
            this.f8870d.onSceneEnd(i18, i19, str, this);
            return;
        }
        if (((r45.h64) fVar).f375871d == 1) {
            this.f8872f = i64Var.f376761d;
            this.f8873g = i64Var.f376762e;
            this.f8870d.onSceneEnd(i18, i19, str, this);
        } else if (((r45.h64) fVar).f375871d == 2) {
            an3.e.b(((r45.h64) oVar.f70710a.f70684a).f375878n);
            this.f8870d.onSceneEnd(i18, i19, str, this);
        }
    }

    public g(int i17, java.lang.String str, int i18, int i19) {
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneLbsRoom", "OpCode Error :" + i17);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.h64();
        lVar.f70665b = new r45.i64();
        lVar.f70666c = "/cgi-bin/micromsg-bin/joinlbsroom";
        lVar.f70667d = 376;
        lVar.f70668e = 183;
        lVar.f70669f = 1000000183;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f8871e = a17;
        r45.h64 h64Var = (r45.h64) a17.f70710a.f70684a;
        h64Var.f375872e = 0.0f;
        h64Var.f375873f = 0.0f;
        h64Var.f375874g = 0;
        h64Var.f375877m = 0;
        h64Var.f375875h = "";
        h64Var.f375876i = "";
        h64Var.f375871d = i17;
        h64Var.f375878n = str;
        h64Var.f375880p = i18;
        h64Var.f375879o = i19;
    }
}

package c72;

/* loaded from: classes2.dex */
public class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39595d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39596e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39597f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39598g = false;

    public w(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ri6();
        lVar.f70665b = new r45.si6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/switchopface";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.lbs.h.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39596e = a17;
        ((r45.ri6) a17.f70710a.f70684a).f384939d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39595d = u0Var;
        return dispatch(sVar, this.f39596e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.lbs.h.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.si6 si6Var = (r45.si6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f39597f = si6Var.f385766d;
        this.f39598g = si6Var.f385767e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceSwitchOpFace", "hy: NetSceneFaceSwitchOpFace errType: %d, errCode: %d, errMsg: %s, hasBio: %b, isOpen: %b", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Boolean.valueOf(this.f39597f), java.lang.Boolean.valueOf(this.f39598g));
        com.tencent.mm.modelbase.u0 u0Var = this.f39595d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

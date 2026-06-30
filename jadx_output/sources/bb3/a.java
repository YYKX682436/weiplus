package bb3;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f19097d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f19098e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f19099f;

    public a(java.lang.String str, byte[] bArr) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.e10();
        lVar.f70665b = new r45.f10();
        lVar.f70667d = 503;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkloginqrcode";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f19098e = a17;
        r45.e10 e10Var = (r45.e10) a17.f70710a.f70684a;
        byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
        e10Var.f372899d = x51.j1.a(s07);
        e10Var.f372901f = (int) (java.lang.System.currentTimeMillis() / 1000);
        e10Var.f372900e = str;
        e10Var.f372902g = 0;
        a17.setRsaInfo(o45.pi.a());
        a17.f70714e = 1;
        a17.getReqObj().setPassKey(s07);
        this.f19099f = bArr;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f19097d = u0Var;
        return dispatch(sVar, this.f19098e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 503;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckLoginQRCode", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f19097d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

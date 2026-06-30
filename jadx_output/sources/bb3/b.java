package bb3;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f19100d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f19101e;

    public b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ai3();
        lVar.f70665b = new r45.bi3();
        lVar.f70667d = 502;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getloginqrcode";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f19101e = a17;
        r45.ai3 ai3Var = (r45.ai3) a17.f70710a.f70684a;
        byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
        ai3Var.f370019d = x51.j1.a(s07);
        ai3Var.f370020e = 0;
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.toByteArray());
            ai3Var.f370023h = cu5Var2;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetLoginQRCode", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        this.f19101e.setRsaInfo(o45.pi.a());
        com.tencent.mm.modelbase.o oVar = this.f19101e;
        oVar.f70714e = 1;
        oVar.getReqObj().setPassKey(s07);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f19100d = u0Var;
        return dispatch(sVar, this.f19101e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 502;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetLoginQRCode", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f19100d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

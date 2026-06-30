package bt3;

/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f24301d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f24302e;

    /* renamed from: f, reason: collision with root package name */
    public final bt3.j0 f24303f;

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, bt3.j0 j0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.i10();
        lVar.f70665b = new r45.j10();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkmd5";
        lVar.f70667d = 939;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f24302e = a17;
        r45.i10 i10Var = (r45.i10) a17.f70710a.f70684a;
        i10Var.f376657d = str;
        i10Var.f376658e = str2;
        i10Var.f376659f = str3;
        i10Var.f376660g = i17;
        this.f24303f = j0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckMd5", "summersafecdn NetSceneCheckMd5 fileid[%s], md5[%s], newmd5[%s], crc[%d], stack[%s]", str, str2, str3, java.lang.Integer.valueOf(i17), new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f24301d = u0Var;
        return dispatch(sVar, this.f24302e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 939;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckMd5", "summersafecdn onGYNetEnd [%d, %d, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f24301d.onSceneEnd(i18, i19, str, this);
        bt3.j0 j0Var = this.f24303f;
        if (j0Var != null) {
            if (i18 != 0 || i19 != 0) {
                j0Var.a("", i18, i19);
            } else {
                r45.j10 j10Var = (r45.j10) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
                j0Var.a(j10Var != null ? j10Var.f377490d : "", i18, i19);
            }
        }
    }
}

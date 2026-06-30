package c01;

/* loaded from: classes4.dex */
public class oa extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f37367d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f37368e;

    /* renamed from: f, reason: collision with root package name */
    public int f37369f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f37370g = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f37372i = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f37371h = 0;

    public oa(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        r45.k10 k10Var = new r45.k10();
        k10Var.f378283d = i17;
        k10Var.f378285f = str;
        k10Var.f378287h = str2;
        k10Var.f378286g = str3;
        k10Var.f378291o = str4;
        k10Var.f378290n = str5;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = k10Var;
        lVar.f70665b = new r45.l10();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkmobilesimtype";
        lVar.f70667d = gd1.j.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f37367d = a17;
        a17.f70714e = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetMobileSIMType", "Check scene[%d] IP[%s] IMEI[%s] IMSI[%s] uuid[%s] adid[%s]", java.lang.Integer.valueOf(i17), k10Var.f378285f, k10Var.f378287h, k10Var.f378286g, k10Var.f378291o, k10Var.f378290n);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f37368e = u0Var;
        return dispatch(sVar, this.f37367d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return gd1.j.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetMobileSIMType", "summerdiz NetSceneGetMobileSIMType onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.l10 l10Var = (r45.l10) this.f37367d.f70711b.f70700a;
            this.f37369f = l10Var.f379069g;
            int i27 = l10Var.f379068f;
            this.f37370g = i27;
            this.f37371h = l10Var.f379066d;
            this.f37372i = l10Var.f379067e;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetMobileSIMType", "CheckMobileSIMTypeResp ProductType[%d] expiredTime[%d] flag[%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(l10Var.f379067e), java.lang.Integer.valueOf(l10Var.f379069g));
        }
        this.f37368e.onSceneEnd(i18, i19, str, this);
    }
}

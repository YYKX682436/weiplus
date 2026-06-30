package c01;

/* loaded from: classes4.dex */
public class oa extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f118900d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f118901e;

    /* renamed from: f, reason: collision with root package name */
    public int f118902f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f118903g = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f118905i = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f118904h = 0;

    public oa(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        r45.k10 k10Var = new r45.k10();
        k10Var.f459816d = i17;
        k10Var.f459818f = str;
        k10Var.f459820h = str2;
        k10Var.f459819g = str3;
        k10Var.f459824o = str4;
        k10Var.f459823n = str5;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = k10Var;
        lVar.f152198b = new r45.l10();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkmobilesimtype";
        lVar.f152200d = gd1.j.f69801x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f118900d = a17;
        a17.f152247e = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetMobileSIMType", "Check scene[%d] IP[%s] IMEI[%s] IMSI[%s] uuid[%s] adid[%s]", java.lang.Integer.valueOf(i17), k10Var.f459818f, k10Var.f459820h, k10Var.f459819g, k10Var.f459824o, k10Var.f459823n);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f118901e = u0Var;
        return mo9409x10f9447a(sVar, this.f118900d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return gd1.j.f69801x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetMobileSIMType", "summerdiz NetSceneGetMobileSIMType onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.l10 l10Var = (r45.l10) this.f118900d.f152244b.f152233a;
            this.f118902f = l10Var.f460602g;
            int i27 = l10Var.f460601f;
            this.f118903g = i27;
            this.f118904h = l10Var.f460599d;
            this.f118905i = l10Var.f460600e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetMobileSIMType", "CheckMobileSIMTypeResp ProductType[%d] expiredTime[%d] flag[%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(l10Var.f460600e), java.lang.Integer.valueOf(l10Var.f460602g));
        }
        this.f118901e.mo815x76e0bfae(i18, i19, str, this);
    }
}

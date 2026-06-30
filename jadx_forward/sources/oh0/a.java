package oh0;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f426715d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f426716e;

    public a(int i17, java.lang.String str, int i18, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jq5();
        lVar.f152198b = new r45.kq5();
        lVar.f152200d = 5193;
        lVar.f152199c = "/cgi-bin/mmpay-bin/report_qrcode_img_classify";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f426715d = a17;
        r45.jq5 jq5Var = (r45.jq5) a17.f152243a.f152217a;
        jq5Var.f459589e = str;
        jq5Var.f459588d = i17;
        jq5Var.f459592h = i19;
        jq5Var.f459593i = str3;
        jq5Var.f459590f = i18;
        jq5Var.f459591g = str2;
        jq5Var.f459594m = str4;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f426716e = u0Var;
        return mo9409x10f9447a(sVar, this.f426715d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5193;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQRCodeOCRScanReport", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        this.f426716e.mo815x76e0bfae(i18, i19, str, this);
    }
}

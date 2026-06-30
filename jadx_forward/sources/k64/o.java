package k64;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f386135d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f386136e;

    public o(java.lang.String str, long j17, int i17) {
        this(str, j17, i17, "");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        this.f386136e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f386135d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        int i17 = this.f386135d.f152246d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdAppointment", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f386136e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
    }

    public o(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.j0();
        lVar.f152198b = new r45.k0();
        lVar.f152199c = "/cgi-bin/mmoc-bin/adplayinfo/ad_appointment";
        lVar.f152200d = 5159;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f386135d = a17;
        r45.j0 j0Var = (r45.j0) a17.f152243a.f152217a;
        j0Var.f458965d = str;
        j0Var.f458966e = j17;
        j0Var.f458967f = i17;
        j0Var.f458968g = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneAdAppointment", "appointmentId=" + j17 + ", opType=" + i17 + ", uxInfo=" + str + ", phoneNumber=" + str2);
    }
}

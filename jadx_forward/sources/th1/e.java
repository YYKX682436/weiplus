package th1;

/* loaded from: classes7.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f500850d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f500851e;

    /* renamed from: f, reason: collision with root package name */
    public r45.q77 f500852f;

    public e() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.p77();
        lVar.f152198b = new r45.q77();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchtitle";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.r.f33391x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f500850d = a17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetWeAppSearchTitle", "doScene");
        this.f500851e = u0Var;
        return mo9409x10f9447a(sVar, this.f500850d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.r.f33391x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetWeAppSearchTitle", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f500852f = (r45.q77) this.f500850d.f152244b.f152233a;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f500851e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        if (this.f500852f.f465283d == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_INPUT_HINT_LANG_STRING_SYNC, java.util.Locale.getDefault().getLanguage());
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_STRING_SYNC, this.f500852f.f465283d.f466132d);
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_ID_STRING_SYNC, this.f500852f.f465283d.f466133e);
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_INPUT_HINT_UPDATE_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_FROM_DESKTOP_INPUT_HINT_CONTENT_STRING_SYNC, this.f500852f.f465284e.f466132d);
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_FROM_DESKTOP_MORE_INPUT_HINT_CONTENT_STRING_SYNC, this.f500852f.f465285f.f466132d);
    }
}

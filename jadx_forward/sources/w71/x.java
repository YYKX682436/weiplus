package w71;

/* loaded from: classes11.dex */
public final class x extends com.p314xaae8f345.mm.p944x882e457a.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final w71.s f524993d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f524994e;

    /* renamed from: f, reason: collision with root package name */
    public final long f524995f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f524996g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.l0 f524997h;

    public x(w71.s cgi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        this.f524993d = cgi;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f524995f = java.lang.System.currentTimeMillis();
        this.f524997h = new w71.w(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: accept */
    public boolean mo47993xab27b508(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: callbackErrorIfNeed */
    public void mo47957xb0a065f6(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "scene callback error");
        super.mo47957xb0a065f6(i17, i18, errMsg);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f524996g;
        this.f524993d.a(i17, i18, errMsg, oVar != null ? oVar.f152244b.f152233a : null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "scene cancel: %d, func: %d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(mo808xfb85f7b0()));
        super.mo9408xae7a2e7a();
        this.f524993d.a(3, -1, "cancel", null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 iose) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iose, "iose");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "into scene doScene: %d, func: %d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(mo808xfb85f7b0()));
        this.f524994e = iose;
        int mo9409x10f9447a = mo9409x10f9447a(dispatcher, this.f524996g, this.f524997h);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(mo808xfb85f7b0());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(mo9409x10f9447a);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "scene doScene, dispatch finish, %d, func: %d, netId: %d, time: %d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f524995f));
        if (mo9409x10f9447a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "scene doScene, dispatch failed, net id:%d, func: %d", java.lang.Integer.valueOf(mo9409x10f9447a), java.lang.Integer.valueOf(mo808xfb85f7b0()));
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f524996g;
            this.f524993d.a(3, -1, "dispatch failed, netId < 0", oVar != null ? oVar.f152244b.f152233a : null);
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReqResp */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = super.mo47948x7f0c4558();
        return mo47948x7f0c4558 != null ? mo47948x7f0c4558 : this.f524996g;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f524996g;
        if (oVar != null) {
            return oVar.f152246d;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }
}

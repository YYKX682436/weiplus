package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152156d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.m1 f152157e = this;

    /* renamed from: f, reason: collision with root package name */
    public final long f152158f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f152159g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f152160h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.i f152161i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.l0 f152162m;

    public g(com.p314xaae8f345.mm.p944x882e457a.i iVar) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f152158f = java.lang.System.currentTimeMillis();
        this.f152162m = new com.p314xaae8f345.mm.p944x882e457a.h(this);
        this.f152161i = iVar;
    }

    public final void H(int i17, int i18, java.lang.String str) {
        km5.u.h((km5.b) this.f152160h.get(), com.p314xaae8f345.mm.p944x882e457a.f.a(i17, i18, str, this.f152159g.f152244b.f152233a, this, this.f152161i));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: callbackErrorIfNeed */
    public void mo47957xb0a065f6(final int i17, final int i18, final java.lang.String str) {
        super.mo47957xb0a065f6(i17, i18, str);
        boolean equals = "1".equals(j62.e.g().a("clicfg_cgi_async_resume_callback", "1", false, false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cgi", "doAsyncResumeCallback %s", java.lang.Boolean.valueOf(equals));
        if (equals) {
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.g$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p944x882e457a.g.this.H(i17, i18, str);
                }
            }, "do_cgi_resume_callback");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152156d = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f152159g, this.f152162m);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f152157e.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f152159g.f152246d);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(mo9409x10f9447a);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cgi", "Start doScene:%d func:%d netid:%d time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f152158f));
        if (mo9409x10f9447a < 0) {
            H(3, -1, "");
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReqResp */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = super.mo47948x7f0c4558();
        return mo47948x7f0c4558 != null ? mo47948x7f0c4558 : this.f152159g;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f152159g.f152246d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        this.f152161i.getClass();
        return 1;
    }
}

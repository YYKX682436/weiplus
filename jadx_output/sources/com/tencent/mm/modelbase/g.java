package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.modelbase.m1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f70623d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f70624e = this;

    /* renamed from: f, reason: collision with root package name */
    public final long f70625f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f70626g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f70627h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.i f70628i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f70629m;

    public g(com.tencent.mm.modelbase.i iVar) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f70625f = java.lang.System.currentTimeMillis();
        this.f70629m = new com.tencent.mm.modelbase.h(this);
        this.f70628i = iVar;
    }

    public final void H(int i17, int i18, java.lang.String str) {
        km5.u.h((km5.b) this.f70627h.get(), com.tencent.mm.modelbase.f.a(i17, i18, str, this.f70626g.f70711b.f70700a, this, this.f70628i));
    }

    @Override // com.tencent.mm.modelbase.m1
    public void callbackErrorIfNeed(final int i17, final int i18, final java.lang.String str) {
        super.callbackErrorIfNeed(i17, i18, str);
        boolean equals = "1".equals(j62.e.g().a("clicfg_cgi_async_resume_callback", "1", false, false));
        com.tencent.mars.xlog.Log.i("MicroMsg.Cgi", "doAsyncResumeCallback %s", java.lang.Boolean.valueOf(equals));
        if (equals) {
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.g$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.modelbase.g.this.H(i17, i18, str);
                }
            }, "do_cgi_resume_callback");
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f70623d = u0Var;
        int dispatch = dispatch(sVar, this.f70626g, this.f70629m);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f70624e.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f70626g.f70713d);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(dispatch);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Cgi", "Start doScene:%d func:%d netid:%d time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f70625f));
        if (dispatch < 0) {
            H(3, -1, "");
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.network.v0 getReqResp() {
        com.tencent.mm.network.v0 reqResp = super.getReqResp();
        return reqResp != null ? reqResp : this.f70626g;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f70626g.f70713d;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        this.f70628i.getClass();
        return 1;
    }
}

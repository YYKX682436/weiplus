package gf;

/* loaded from: classes7.dex */
public final class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f352665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f352666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2936x80def495.C25587x226dda3 f352667f;

    public n(int i17, com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe, com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3) {
        this.f352665d = i17;
        this.f352666e = c3955x2d990bfe;
        this.f352667f = c25587x226dda3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x
    /* renamed from: onDestroy */
    public final void mo32099xac79a11b() {
        boolean z17;
        boolean unused;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("v8 destroy callback ");
        sb6.append(this.f352665d);
        sb6.append(" mSkylineRuntimeJNIBootstrapDone:");
        z17 = this.f352666e.f129244g;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", sb6.toString());
        long m95854xceabf3ec = this.f352667f.m95854xceabf3ec();
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = this.f352666e;
        unused = c3955x2d990bfe.f129244g;
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = c3955x2d990bfe.f129241d;
        if (c25587x226dda3 != null) {
            c25587x226dda3.mo95667x46923104();
            c25587x226dda3.mo95677x41012807();
        }
        c3955x2d990bfe.f129241d = null;
        synchronized (df.a1.f310954a) {
            df.x0 x0Var = (df.x0) df.a1.f310956c.get(java.lang.Long.valueOf(m95854xceabf3ec));
            if (x0Var != null) {
                x0Var.f311141f.size();
            }
        }
        ik1.h0.b(new gf.m(m95854xceabf3ec));
    }
}

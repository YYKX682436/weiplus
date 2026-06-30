package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class y implements com.p314xaae8f345.mm.p2621x8fb0427b.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287548d;

    /* renamed from: e, reason: collision with root package name */
    public final qs5.n f287549e;

    /* renamed from: f, reason: collision with root package name */
    public final qs5.n f287550f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f287551g;

    public y(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f287548d = f9Var;
        qs5.n nVar = qs5.n.f447980g;
        this.f287549e = nVar;
        this.f287550f = nVar;
        ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.U1() : null);
        if (v17 != null) {
            r45.g92 g92Var = ((zy2.c) v17.y(zy2.c.class)).f558892b;
            qs5.n Wj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Wj(g92Var, false);
            this.f287549e = Wj;
            qs5.n Wj2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Wj(g92Var, true);
            this.f287550f = Wj2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", "localLiveState:" + Wj + ", cacheLiveState:" + Wj2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y yVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y) obj;
        if (this.f287548d != null) {
            if ((yVar != null ? yVar.f287548d : null) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needInvalidate:");
                sb6.append(this.f287551g);
                sb6.append(", old.localLiveState:");
                qs5.n nVar = this.f287549e;
                sb6.append(nVar);
                sb6.append(", new.localLiveState:");
                sb6.append(yVar.f287549e);
                sb6.append(", new.cacheLiveState:");
                qs5.n nVar2 = yVar.f287550f;
                sb6.append(nVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", sb6.toString());
                if (!this.f287551g && (nVar2 != yVar.f287549e || nVar2 != nVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}

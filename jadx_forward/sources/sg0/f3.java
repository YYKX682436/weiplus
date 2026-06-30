package sg0;

/* loaded from: classes8.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f489247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f489248e;

    public f3(int i17, su4.h2 h2Var) {
        this.f489247d = i17;
        this.f489248e = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseSearchPage scene ");
        sb6.append(this.f489247d);
        sb6.append(" appid: ");
        su4.h2 h2Var = this.f489248e;
        sb6.append(h2Var.f494439a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", sb6.toString());
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Yj(h2Var.f494439a, h2Var.f494440b);
        }
    }
}

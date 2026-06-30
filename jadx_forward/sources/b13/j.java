package b13;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.m f98642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f98643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f98644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98645g;

    public j(b13.m mVar, boolean z17, android.view.View view, yz5.l lVar) {
        this.f98642d = mVar;
        this.f98643e = z17;
        this.f98644f = view;
        this.f98645g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b13.m mVar = this.f98642d;
        mVar.x(true);
        boolean z17 = this.f98643e;
        yz5.l lVar = this.f98645g;
        if (!z17) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            return;
        }
        dr4.p1 p1Var = mVar.f257908f;
        if (p1Var != null) {
            p1Var.i(true);
        }
        pv.g0 g0Var = mVar.J1;
        if (g0Var != null) {
            ((ep1.k) g0Var).e(null, this.f98644f, new android.graphics.Point(1, 1), null, new b13.i(mVar, lVar));
        }
    }
}

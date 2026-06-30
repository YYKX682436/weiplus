package b13;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.m f17109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f17111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17112g;

    public j(b13.m mVar, boolean z17, android.view.View view, yz5.l lVar) {
        this.f17109d = mVar;
        this.f17110e = z17;
        this.f17111f = view;
        this.f17112g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b13.m mVar = this.f17109d;
        mVar.x(true);
        boolean z17 = this.f17110e;
        yz5.l lVar = this.f17112g;
        if (!z17) {
            lVar.invoke(java.lang.Boolean.TRUE);
            return;
        }
        dr4.p1 p1Var = mVar.f176375f;
        if (p1Var != null) {
            p1Var.i(true);
        }
        pv.g0 g0Var = mVar.J1;
        if (g0Var != null) {
            ((ep1.k) g0Var).e(null, this.f17111f, new android.graphics.Point(1, 1), null, new b13.i(mVar, lVar));
        }
    }
}

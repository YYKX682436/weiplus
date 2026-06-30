package dy4;

/* loaded from: classes15.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f326243f;

    public u0(dy4.f1 f1Var, int i17, int i18) {
        this.f326241d = f1Var;
        this.f326242e = i17;
        this.f326243f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f326241d;
        int i17 = this.f326242e;
        int i18 = this.f326243f;
        if (!f1Var.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerError, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        dg.d dVar = f1Var.V;
        if (dVar != null) {
            ((dy4.m) dVar).a(i17, i18);
        }
    }
}

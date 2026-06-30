package pm0;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.g0 f438313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.k0 f438314e;

    public l(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        this.f438313d = g0Var;
        this.f438314e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object mo3195x754a37bb = this.f438313d.mo3195x754a37bb();
        if (mo3195x754a37bb != null) {
            this.f438314e.mo525x7bb163d5(mo3195x754a37bb);
        }
    }
}

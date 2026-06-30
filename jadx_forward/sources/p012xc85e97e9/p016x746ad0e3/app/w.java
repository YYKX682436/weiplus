package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public final class w implements o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.g0 f90760d;

    public w(p012xc85e97e9.p016x746ad0e3.app.g0 g0Var) {
        this.f90760d = g0Var;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        this.f90760d.k(rVar);
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        android.view.Window.Callback r17 = this.f90760d.r();
        if (r17 == null) {
            return true;
        }
        r17.onMenuOpened(108, rVar);
        return true;
    }
}

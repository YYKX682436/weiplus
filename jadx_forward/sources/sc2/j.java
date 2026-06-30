package sc2;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.n f487509d;

    public j(sc2.n nVar) {
        this.f487509d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.n nVar = this.f487509d;
        xc2.p0 p0Var = nVar.f84680h;
        android.view.View view = nVar.f84676d;
        if (p0Var == null || view == null) {
            return;
        }
        nVar.G(p0Var, view);
    }
}

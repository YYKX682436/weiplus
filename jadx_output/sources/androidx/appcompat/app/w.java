package androidx.appcompat.app;

/* loaded from: classes15.dex */
public final class w implements o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9227d;

    public w(androidx.appcompat.app.g0 g0Var) {
        this.f9227d = g0Var;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        this.f9227d.k(rVar);
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        android.view.Window.Callback r17 = this.f9227d.r();
        if (r17 == null) {
            return true;
        }
        r17.onMenuOpened(108, rVar);
        return true;
    }
}

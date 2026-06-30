package androidx.fragment.app;

/* loaded from: classes14.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.n0 f11391d;

    public m0(androidx.fragment.app.n0 n0Var) {
        this.f11391d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        androidx.fragment.app.n0 n0Var = this.f11391d;
        if (n0Var.f11410b.getAnimatingAway() != null) {
            n0Var.f11410b.setAnimatingAway(null);
            androidx.fragment.app.p2 p2Var = n0Var.f11411c;
            androidx.fragment.app.Fragment fragment = n0Var.f11410b;
            j3.h hVar = n0Var.f11412d;
            androidx.fragment.app.d1 d1Var = (androidx.fragment.app.d1) p2Var;
            d1Var.getClass();
            synchronized (hVar) {
                z17 = hVar.f297333a;
            }
            if (z17) {
                return;
            }
            d1Var.f11301a.removeCancellationSignal(fragment, hVar);
        }
    }
}

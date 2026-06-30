package androidx.fragment.app;

/* loaded from: classes14.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.p2 f11367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j3.h f11369f;

    public j2(androidx.fragment.app.p2 p2Var, androidx.fragment.app.Fragment fragment, j3.h hVar) {
        this.f11367d = p2Var;
        this.f11368e = fragment;
        this.f11369f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        j3.h hVar = this.f11369f;
        androidx.fragment.app.d1 d1Var = (androidx.fragment.app.d1) this.f11367d;
        androidx.fragment.app.Fragment fragment = this.f11368e;
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

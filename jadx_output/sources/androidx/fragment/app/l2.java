package androidx.fragment.app;

/* loaded from: classes14.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.p2 f11380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j3.h f11382f;

    public l2(androidx.fragment.app.p2 p2Var, androidx.fragment.app.Fragment fragment, j3.h hVar) {
        this.f11380d = p2Var;
        this.f11381e = fragment;
        this.f11382f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        j3.h hVar = this.f11382f;
        androidx.fragment.app.d1 d1Var = (androidx.fragment.app.d1) this.f11380d;
        androidx.fragment.app.Fragment fragment = this.f11381e;
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

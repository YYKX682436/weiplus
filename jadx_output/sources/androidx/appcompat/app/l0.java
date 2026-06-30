package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.q0 f9195d;

    public l0(androidx.appcompat.app.q0 q0Var) {
        this.f9195d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.app.q0 q0Var = this.f9195d;
        android.view.Menu N = q0Var.N();
        o.r rVar = N instanceof o.r ? (o.r) N : null;
        if (rVar != null) {
            rVar.z();
        }
        try {
            N.clear();
            android.view.Window.Callback callback = q0Var.f9206c;
            if (!((n.m) callback).onCreatePanelMenu(0, N) || !((androidx.appcompat.app.p0) callback).onPreparePanel(0, null, N)) {
                N.clear();
            }
        } finally {
            if (rVar != null) {
                rVar.y();
            }
        }
    }
}

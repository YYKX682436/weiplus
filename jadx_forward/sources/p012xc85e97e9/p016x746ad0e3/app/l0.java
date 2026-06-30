package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.q0 f90728d;

    public l0(p012xc85e97e9.p016x746ad0e3.app.q0 q0Var) {
        this.f90728d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.app.q0 q0Var = this.f90728d;
        android.view.Menu N = q0Var.N();
        o.r rVar = N instanceof o.r ? (o.r) N : null;
        if (rVar != null) {
            rVar.z();
        }
        try {
            N.clear();
            android.view.Window.Callback callback = q0Var.f90739c;
            if (!((n.m) callback).onCreatePanelMenu(0, N) || !((p012xc85e97e9.p016x746ad0e3.app.p0) callback).onPreparePanel(0, null, N)) {
                N.clear();
            }
        } finally {
            if (rVar != null) {
                rVar.y();
            }
        }
    }
}

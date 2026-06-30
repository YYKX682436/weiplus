package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public final class n0 implements o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f90731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.q0 f90732e;

    public n0(p012xc85e97e9.p016x746ad0e3.app.q0 q0Var) {
        this.f90732e = q0Var;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar;
        if (this.f90731d) {
            return;
        }
        this.f90731d = true;
        p012xc85e97e9.p016x746ad0e3.app.q0 q0Var = this.f90732e;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) q0Var.f90737a).f91280a.f91011d;
        if (c0076xa566151a != null && (qVar = c0076xa566151a.f90873z) != null) {
            qVar.l();
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i iVar = qVar.B;
            if (iVar != null && iVar.b()) {
                iVar.f423244j.mo2732x63a3b28a();
            }
        }
        android.view.Window.Callback callback = q0Var.f90739c;
        if (callback != null) {
            ((n.m) callback).onPanelClosed(108, rVar);
        }
        this.f90731d = false;
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        android.view.Window.Callback callback = this.f90732e.f90739c;
        if (callback == null) {
            return false;
        }
        ((n.m) callback).onMenuOpened(108, rVar);
        return true;
    }
}

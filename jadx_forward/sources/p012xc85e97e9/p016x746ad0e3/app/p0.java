package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class p0 extends n.m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.q0 f90735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p012xc85e97e9.p016x746ad0e3.app.q0 q0Var, android.view.Window.Callback callback) {
        super(callback);
        this.f90735e = q0Var;
    }

    @Override // n.m, android.view.Window.Callback
    public android.view.View onCreatePanelView(int i17) {
        return i17 == 0 ? new android.view.View(((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90735e.f90737a).a()) : super.onCreatePanelView(i17);
    }

    @Override // n.m, android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i17, view, menu);
        if (onPreparePanel) {
            p012xc85e97e9.p016x746ad0e3.app.q0 q0Var = this.f90735e;
            if (!q0Var.f90738b) {
                ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) q0Var.f90737a).f91292m = true;
                q0Var.f90738b = true;
            }
        }
        return onPreparePanel;
    }
}

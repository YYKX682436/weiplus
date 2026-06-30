package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class p0 extends n.m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.q0 f9202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.q0 q0Var, android.view.Window.Callback callback) {
        super(callback);
        this.f9202e = q0Var;
    }

    @Override // n.m, android.view.Window.Callback
    public android.view.View onCreatePanelView(int i17) {
        return i17 == 0 ? new android.view.View(((androidx.appcompat.widget.z2) this.f9202e.f9204a).a()) : super.onCreatePanelView(i17);
    }

    @Override // n.m, android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i17, view, menu);
        if (onPreparePanel) {
            androidx.appcompat.app.q0 q0Var = this.f9202e;
            if (!q0Var.f9205b) {
                ((androidx.appcompat.widget.z2) q0Var.f9204a).f9759m = true;
                q0Var.f9205b = true;
            }
        }
        return onPreparePanel;
    }
}

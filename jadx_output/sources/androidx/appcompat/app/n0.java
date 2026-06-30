package androidx.appcompat.app;

/* loaded from: classes15.dex */
public final class n0 implements o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.q0 f9199e;

    public n0(androidx.appcompat.app.q0 q0Var) {
        this.f9199e = q0Var;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        androidx.appcompat.widget.q qVar;
        if (this.f9198d) {
            return;
        }
        this.f9198d = true;
        androidx.appcompat.app.q0 q0Var = this.f9199e;
        androidx.appcompat.widget.ActionMenuView actionMenuView = ((androidx.appcompat.widget.z2) q0Var.f9204a).f9747a.f9478d;
        if (actionMenuView != null && (qVar = actionMenuView.f9340z) != null) {
            qVar.l();
            androidx.appcompat.widget.i iVar = qVar.B;
            if (iVar != null && iVar.b()) {
                iVar.f341711j.dismiss();
            }
        }
        android.view.Window.Callback callback = q0Var.f9206c;
        if (callback != null) {
            ((n.m) callback).onPanelClosed(108, rVar);
        }
        this.f9198d = false;
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        android.view.Window.Callback callback = this.f9199e.f9206c;
        if (callback == null) {
            return false;
        }
        ((n.m) callback).onMenuOpened(108, rVar);
        return true;
    }
}

package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class t implements o.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionMenuView f9701d;

    public t(androidx.appcompat.widget.ActionMenuView actionMenuView) {
        this.f9701d = actionMenuView;
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.u uVar = this.f9701d.G;
        if (uVar == null) {
            return false;
        }
        androidx.appcompat.widget.v2 v2Var = ((androidx.appcompat.widget.r2) uVar).f9696a.M;
        return v2Var != null ? ((n.m) ((androidx.appcompat.app.m0) v2Var).f9197a.f9206c).onMenuItemSelected(0, menuItem) : false;
    }

    @Override // o.p
    public void d(o.r rVar) {
        o.p pVar = this.f9701d.B;
        if (pVar != null) {
            pVar.d(rVar);
        }
    }
}

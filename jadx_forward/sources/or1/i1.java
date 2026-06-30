package or1;

/* loaded from: classes9.dex */
public class i1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.j1 f429039d;

    public i1(or1.j1 j1Var) {
        this.f429039d = j1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        or1.j1 j1Var = this.f429039d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var = j1Var.f429045c;
        if (w6Var != null) {
            w6Var.a();
            j1Var.f429045c = null;
        }
        j1Var.f429045c = new com.p314xaae8f345.mm.ui.p2740x696c9db.w6(j1Var.f429043a);
        com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var2 = j1Var.f429045c;
        w6Var2.f292413u = new or1.g1(this);
        w6Var2.f292414v = new or1.h1(this);
        w6Var2.e();
        return false;
    }
}

package ab5;

/* loaded from: classes9.dex */
public class x extends ab5.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab5.z f84517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ab5.z zVar) {
        super(zVar);
        this.f84517b = zVar;
    }

    @Override // ab5.t, ab5.y
    public android.view.View a() {
        ab5.z zVar = this.f84517b;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(zVar.f84519b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569953st, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a37)).setText(zVar.f84519b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571818qp));
        return inflate;
    }

    @Override // ab5.y
    /* renamed from: onCreateMMMenu */
    public void mo1048xc459429a(db5.g4 g4Var) {
        g4Var.f(6, this.f84517b.f84519b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571730no));
    }

    @Override // ab5.t, ab5.y
    /* renamed from: onMMMenuItemSelected */
    public void mo1049x34063ac(android.view.MenuItem menuItem, int i17) {
        super.mo1049x34063ac(menuItem, i17);
    }
}

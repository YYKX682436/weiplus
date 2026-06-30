package ab5;

/* loaded from: classes9.dex */
public class u extends ab5.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab5.z f84514b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ab5.z zVar) {
        super(zVar);
        this.f84514b = zVar;
    }

    @Override // ab5.y
    /* renamed from: onCreateMMMenu */
    public void mo1048xc459429a(db5.g4 g4Var) {
        ab5.z zVar = this.f84514b;
        g4Var.f(2, zVar.f84519b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571817qo));
        g4Var.f(8, zVar.f84519b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571815qm));
        g4Var.f(7, ab5.z.b(zVar));
    }

    @Override // ab5.t, ab5.y
    /* renamed from: onMMMenuItemSelected */
    public void mo1049x34063ac(android.view.MenuItem menuItem, int i17) {
        super.mo1049x34063ac(menuItem, i17);
    }
}

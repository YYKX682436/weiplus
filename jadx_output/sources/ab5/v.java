package ab5;

/* loaded from: classes9.dex */
public class v extends ab5.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab5.z f2982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ab5.z zVar) {
        super(zVar);
        this.f2982b = zVar;
    }

    @Override // ab5.y
    public void onCreateMMMenu(db5.g4 g4Var) {
        ab5.z zVar = this.f2982b;
        g4Var.f(3, zVar.f2986b.getString(com.tencent.mm.R.string.f490286qq));
        g4Var.f(8, zVar.f2986b.getString(com.tencent.mm.R.string.f490282qm));
        g4Var.f(7, ab5.z.b(zVar));
    }

    @Override // ab5.t, ab5.y
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        super.onMMMenuItemSelected(menuItem, i17);
    }
}

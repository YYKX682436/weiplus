package ab5;

/* loaded from: classes9.dex */
public class w extends ab5.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab5.z f2983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ab5.z zVar) {
        super(zVar);
        this.f2983b = zVar;
    }

    @Override // ab5.t, ab5.y
    public android.view.View a() {
        ab5.z zVar = this.f2983b;
        android.view.View inflate = com.tencent.mm.ui.id.b(zVar.f2986b).inflate(com.tencent.mm.R.layout.f488420st, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a37)).setText(zVar.f2986b.getString(com.tencent.mm.R.string.f490283qn));
        return inflate;
    }

    @Override // ab5.y
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.f(5, this.f2983b.f2986b.getString(com.tencent.mm.R.string.f490195nm));
    }

    @Override // ab5.t, ab5.y
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        super.onMMMenuItemSelected(menuItem, i17);
    }
}

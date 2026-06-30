package cr3;

/* loaded from: classes11.dex */
public class c0 implements db5.t4, db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303459d;

    public c0(cr3.d0 d0Var, cr3.p pVar) {
        this.f303459d = d0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f303459d.f303465e;
        if (z3Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1())) {
            g4Var.a(10, com.p314xaae8f345.mm.R.C30867xcad56011.bhb);
        }
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        cr3.d0 d0Var = this.f303459d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = d0Var.f303465e;
        if (z3Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1())) {
            d0Var.j(menuItem.getItemId());
        }
    }
}

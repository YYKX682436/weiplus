package b53;

/* loaded from: classes8.dex */
public class e implements tx4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b53.f f99617a;

    public e(b53.f fVar) {
        this.f99617a = fVar;
    }

    @Override // tx4.f
    public void a(android.view.MenuItem menuItem) {
        r45.rk4 rk4Var;
        b53.f fVar = this.f99617a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = fVar.f99618a;
        android.content.Context context = x0Var.f488143d;
        b53.c cVar = fVar.f99619b;
        b53.a aVar = (b53.a) ((java.util.HashMap) cVar.f99615b).get(java.lang.Integer.valueOf(menuItem.getItemId()));
        java.util.Iterator it = cVar.f99614a.iterator();
        while (true) {
            if (!it.hasNext()) {
                rk4Var = null;
                break;
            }
            rk4Var = (r45.rk4) it.next();
            if (rk4Var != null && rk4Var.f466500g == menuItem.getItemId()) {
                break;
            }
        }
        if (aVar != null && rk4Var != null) {
            aVar.b(context, x0Var, rk4Var);
        }
        fVar.f99620c.b();
    }
}

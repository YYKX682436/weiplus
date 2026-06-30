package pk2;

/* loaded from: classes3.dex */
public final class s9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.e9 f437776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f437777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f437778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f437779g;

    public s9(pk2.e9 e9Var, yz5.l lVar, yz5.l lVar2, pk2.p7 p7Var) {
        this.f437776d = e9Var;
        this.f437777e = lVar;
        this.f437778f = lVar2;
        this.f437779g = p7Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f437776d.f437245a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((qk2.h) obj).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar = (qk2.h) obj;
        if (hVar != null) {
            hVar.A();
        } else {
            yz5.l lVar = this.f437777e;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
            }
        }
        yz5.l lVar2 = this.f437778f;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
        }
        this.f437779g.c().h();
    }
}

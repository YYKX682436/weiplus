package pk2;

/* loaded from: classes3.dex */
public final class q9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.e9 f437731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f437732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f437733f;

    public q9(pk2.e9 e9Var, yz5.l lVar, pk2.p7 p7Var) {
        this.f437731d = e9Var;
        this.f437732e = lVar;
        this.f437733f = p7Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f437731d.f437245a.iterator();
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
        }
        yz5.l lVar = this.f437732e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
        }
        this.f437733f.c().h();
    }
}

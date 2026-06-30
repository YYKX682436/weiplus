package aw2;

/* loaded from: classes10.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f96299d;

    public k(aw2.n nVar) {
        this.f96299d = nVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        aw2.n nVar = this.f96299d;
        if (itemId != 4) {
            if (itemId != 5) {
                return;
            }
            rx2.p pVar = nVar.f96312g;
            pVar.f482517e.mo146xb9724478(java.lang.Boolean.TRUE);
            pVar.f482522m = true;
            pVar.f482519g.setVisibility(0);
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = nVar.f96309d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        aw2.a aVar = ((sr2.o1) pf5.z.f435481a.a(activity).a(sr2.o1.class)).f493188f;
        if (aVar != null) {
            aVar.f96253g.d();
        }
    }
}

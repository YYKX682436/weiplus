package ay3;

/* loaded from: classes5.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486 f96818d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486 activityC17230x7ab03486) {
        this.f96818d = activityC17230x7ab03486;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486 activityC17230x7ab03486 = this.f96818d;
        android.view.LayoutInflater.from(activityC17230x7ab03486);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC17230x7ab03486, 1, false);
        db5.g4 g4Var = new db5.g4(activityC17230x7ab03486);
        new db5.g4(activityC17230x7ab03486);
        ay3.c cVar = ay3.c.f96816d;
        ay3.d dVar = new ay3.d(activityC17230x7ab03486);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(activityC17230x7ab03486);
        cVar.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = cVar;
            k0Var.f293414s = dVar;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return false;
    }
}

package ns4;

/* loaded from: classes8.dex */
public final class a1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f420965d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f420965d = activityC19066x54c41420;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f420965d;
        ms4.n nVar = activityC19066x54c41420.f260687i;
        if (nVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar.P6(20);
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19066x54c41420).f39906x53855852 = 4;
        if (!activityC19066x54c41420.mo73847x7d641a7d()) {
            activityC19066x54c41420.finish();
            return true;
        }
        activityC19066x54c41420.mo48674x36654fab();
        activityC19066x54c41420.showDialog(1000);
        return true;
    }
}

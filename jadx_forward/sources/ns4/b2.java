package ns4;

/* loaded from: classes8.dex */
public final class b2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f420972d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        this.f420972d = activityC19067xb53aa1de;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f420972d;
        ms4.t tVar = activityC19067xb53aa1de.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        tVar.R6(10);
        activityC19067xb53aa1de.finish();
        return true;
    }
}

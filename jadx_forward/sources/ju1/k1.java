package ju1;

/* loaded from: classes9.dex */
public final class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f383289e;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76, java.util.List list) {
        this.f383288d = activityC13077xb3b83e76;
        this.f383289e = list;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76 = this.f383288d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13077xb3b83e76.mo55332x76847179(), 1, false);
        k0Var.f293405n = new ju1.i1(this.f383289e);
        k0Var.f293414s = new ju1.j1(activityC13077xb3b83e76);
        k0Var.v();
        return false;
    }
}

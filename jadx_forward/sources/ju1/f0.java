package ju1;

/* loaded from: classes9.dex */
public final class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 f383247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f383248e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1, java.util.List list) {
        this.f383247d = activityC13076xc17cada1;
        this.f383248e = list;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1 = this.f383247d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13076xc17cada1.mo55332x76847179(), 1, false);
        k0Var.f293405n = new ju1.d0(this.f383248e);
        k0Var.f293414s = new ju1.e0(activityC13076xc17cada1);
        k0Var.v();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 3, 1);
        return false;
    }
}

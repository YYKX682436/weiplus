package p61;

/* loaded from: classes5.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 f433797d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 activityC11368x3bd82e91) {
        this.f433797d = activityC11368x3bd82e91;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f433797d.mo55332x76847179();
        android.view.LayoutInflater.from(mo55332x76847179);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179, 1, false);
        db5.g4 g4Var = new db5.g4(mo55332x76847179);
        new db5.g4(mo55332x76847179);
        p61.e3 e3Var = new p61.e3(this);
        p61.f3 f3Var = new p61.f3(this);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(mo55332x76847179);
        e3Var.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = e3Var;
            k0Var.f293414s = f3Var;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return false;
    }
}

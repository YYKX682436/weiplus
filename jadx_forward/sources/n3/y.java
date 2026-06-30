package n3;

/* loaded from: classes12.dex */
public class y implements android.view.MenuItem.OnActionExpandListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3.a0 f415973d;

    public y(n3.a0 a0Var) {
        this.f415973d = a0Var;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f5 f5Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f5) this.f415973d;
        f5Var.getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.N;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = f5Var.f182379a;
        if (activityC13570xd6b9f257.a7()) {
            return false;
        }
        activityC13570xd6b9f257.finish();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        this.f415973d.getClass();
        return true;
    }
}

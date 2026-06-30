package sj3;

/* loaded from: classes14.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490341d;

    public y0(sj3.a1 a1Var) {
        this.f490341d = a1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "onClick: " + menuItem.getItemId());
        this.f490341d.f().R6(menuItem.getItemId() == 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().O(menuItem.getItemId(), true);
    }
}

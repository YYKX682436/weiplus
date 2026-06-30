package cr3;

/* loaded from: classes8.dex */
public class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303503d;

    public z(cr3.d0 d0Var) {
        this.f303503d = d0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "onMMMenuItemSelected() called with: menuItemId = [" + itemId + "], index = [" + i17 + "]");
        cr3.d0 d0Var = this.f303503d;
        if (itemId == 11) {
            d0Var.g(false);
        } else if (itemId == 12) {
            d0Var.g(true);
        }
    }
}

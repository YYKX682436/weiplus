package sj3;

/* loaded from: classes12.dex */
public final class m2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490173d;

    public m2(sj3.g3 g3Var) {
        this.f490173d = g3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        sj3.g3 g3Var = this.f490173d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            sj3.g3.a(g3Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = g3Var.f490053a;
            serviceConnectionC16581x3d1d6bd2.f231774t = true;
            com.p314xaae8f345.mm.ui.ee.f(serviceConnectionC16581x3d1d6bd2.getTaskId(), null);
            if (com.p314xaae8f345.mm.ui.bk.w0()) {
                com.p314xaae8f345.mm.ui.fj.f(g3Var.f490053a, true);
            }
        }
    }
}

package go2;

/* loaded from: classes2.dex */
public final class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355595d;

    public s(go2.z zVar) {
        this.f355595d = zVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        go2.z zVar = this.f355595d;
        if (itemId == 1020) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_WHITE_LIST_MODE", 8);
            ((im2.p4) ((zy2.m8) ((jz5.n) zVar.f355619J).mo141623x754a37bb())).R6(intent);
            return;
        }
        if (itemId != 1021) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_MEMBER", true);
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_PROFILE", false);
        im2.p4 p4Var = (im2.p4) ((zy2.m8) ((jz5.n) zVar.f355619J).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p4Var.f374020d, "FinderLive.entrance, create notice btn click");
        p4Var.f374032s = intent2;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(p4Var.m158354x19263085())) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(p4Var.m158354x19263085());
            u1Var.g(p4Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dls));
            u1Var.n(p4Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var.l(im2.k4.f373950a);
            u1Var.q(false);
            return;
        }
        if (p4Var.Q6(xy2.c.e(p4Var.m80379x76847179()))) {
            m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
            if (I1 != null && I1.v0()) {
                zl2.q4.f555466a.Q();
            } else {
                pf5.e.m158344xbe96bc24(p4Var, null, null, new im2.j4(p4Var, null), 3, null);
            }
        }
    }
}

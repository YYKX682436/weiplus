package ns4;

/* loaded from: classes8.dex */
public final class g3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421065e;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b2) {
        this.f421064d = activityC19068x49d5e62b;
        this.f421065e = activityC19068x49d5e62b2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "setOnMenuSelectedListener click.");
        boolean z17 = false;
        if (menuItem != null && menuItem.getItemId() == 1) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421064d;
            ms4.o0 o0Var = activityC19068x49d5e62b.f260718d;
            if (o0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            ns4.f3 f3Var = new ns4.f3(activityC19068x49d5e62b, this.f421065e);
            o0Var.f412629r.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            new ks4.f().l().h(new ms4.l0(o0Var, f3Var));
        }
    }
}

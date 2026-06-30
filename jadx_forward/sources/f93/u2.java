package f93;

/* loaded from: classes11.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc f342011d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc activityC16170x2911e4dc) {
        this.f342011d = activityC16170x2911e4dc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc activityC16170x2911e4dc = this.f342011d;
        boolean z17 = true;
        if (!activityC16170x2911e4dc.f224800m) {
            if (activityC16170x2911e4dc.a7()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC16170x2911e4dc);
                u1Var.g(activityC16170x2911e4dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgj));
                u1Var.a(true);
                u1Var.n(activityC16170x2911e4dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgl));
                u1Var.j(activityC16170x2911e4dc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgk));
                u1Var.b(new f93.q2(activityC16170x2911e4dc));
                z17 = false;
                u1Var.q(false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onCancelClick(): not change, exit");
            }
        }
        if (z17) {
            activityC16170x2911e4dc.finish();
        }
    }
}

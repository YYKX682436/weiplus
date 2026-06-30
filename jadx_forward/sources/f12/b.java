package f12;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13252x1a51290c f340102d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13252x1a51290c activityC13252x1a51290c) {
        this.f340102d = activityC13252x1a51290c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13252x1a51290c activityC13252x1a51290c = this.f340102d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC13252x1a51290c.f178968h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC13252x1a51290c.f178968h = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC13252x1a51290c, activityC13252x1a51290c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572616bu5), true, 0, null);
    }
}

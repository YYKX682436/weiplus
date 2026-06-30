package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f288233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.g2 f288234e;

    public f2(com.p314xaae8f345.mm.ui.p2690x38b72420.g2 g2Var, int i17) {
        this.f288234e = g2Var;
        this.f288233d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        i21.q h17 = i21.q.h();
        com.p314xaae8f345.mm.ui.p2690x38b72420.g2 g2Var = this.f288234e;
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948 = g2Var.f288250a;
        java.lang.String str = activityC22295xcc682948.f287918t;
        java.util.LinkedList linkedList = activityC22295xcc682948.f287922x;
        int i17 = this.f288233d;
        java.lang.String d17 = h17.d(str, ((r45.c5) linkedList.get(i17)).f452825d);
        g2Var.f288250a.G.add(i17, d17);
        if (i17 < g2Var.f288250a.f287901J.size()) {
            ((r45.ko5) g2Var.f288250a.f287901J.get(i17)).set(2, d17);
        }
        if (i17 == 0 && ((r45.c5) g2Var.f288250a.f287922x.get(i17)).f452826e == null) {
            g2Var.f288250a.E.add(d17);
            g2Var.f288250a.f287925y.remove(i17);
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc6829482 = g2Var.f288250a;
        activityC22295xcc6829482.f7(activityC22295xcc6829482.G, 0);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc6829483 = g2Var.f288250a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ContactRemarkInfoModUI", "checkRunPendingAddRecommendImage() called remarkImageDownloadCount:%s", java.lang.Integer.valueOf(activityC22295xcc6829483.R1));
        if (activityC22295xcc6829483.R1 != 0 || (runnable = activityC22295xcc6829483.O1) == null) {
            return;
        }
        runnable.run();
        activityC22295xcc6829483.O1 = null;
    }
}

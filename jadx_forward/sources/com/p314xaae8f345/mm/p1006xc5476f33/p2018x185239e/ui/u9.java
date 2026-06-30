package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class u9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239515d;

    public u9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb) {
        this.f239515d = activityC17155x7c2f4bb;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239515d;
        sb6.append(activityC17155x7c2f4bb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gv7));
        sb6.append(" ");
        sb6.append(activityC17155x7c2f4bb.B);
        activityC17155x7c2f4bb.f239132e.setText(sb6.toString());
        java.lang.String str = activityC17155x7c2f4bb.D;
        if (str == null || str.length() <= 0) {
            java.lang.String str2 = activityC17155x7c2f4bb.C;
            if (str2 != null && str2.length() > 0) {
                activityC17155x7c2f4bb.f239133f.setText(activityC17155x7c2f4bb.C);
            }
        } else {
            activityC17155x7c2f4bb.f239133f.setText(activityC17155x7c2f4bb.D);
        }
        activityC17155x7c2f4bb.f239134g.m75394x3288e7c1(true);
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC17155x7c2f4bb, 36.0f);
        activityC17155x7c2f4bb.f239134g.b(activityC17155x7c2f4bb.E, d17, d17, -1);
    }
}

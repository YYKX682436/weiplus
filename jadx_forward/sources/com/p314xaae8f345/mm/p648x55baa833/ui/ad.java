package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea f145577f;

    public ad(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea, java.lang.String str, int i17) {
        this.f145577f = activityC10372xd653ffea;
        this.f145575d = str;
        this.f145576e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f145575d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = this.f145577f;
        if (K0) {
            activityC10372xd653ffea.f145504d.setAdapter((android.widget.ListAdapter) activityC10372xd653ffea.f145510m);
            activityC10372xd653ffea.f145518u.setVisibility(8);
            return;
        }
        activityC10372xd653ffea.f145504d.setAdapter((android.widget.ListAdapter) activityC10372xd653ffea.f145509i);
        if (this.f145576e > 0) {
            activityC10372xd653ffea.f145518u.setVisibility(8);
        } else {
            activityC10372xd653ffea.f145518u.setText(o13.q.d(activityC10372xd653ffea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icq), activityC10372xd653ffea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icp), p13.i.a(str, str, false, false)).f432638a);
            activityC10372xd653ffea.f145518u.setVisibility(0);
        }
    }
}

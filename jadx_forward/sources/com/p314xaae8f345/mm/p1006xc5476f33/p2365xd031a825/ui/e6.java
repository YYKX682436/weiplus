package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f261786d;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1) {
        this.f261786d = activityC19116x82bf90f1;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f261786d;
        int height = activityC19116x82bf90f1.J1.getHeight();
        android.view.ViewGroup viewGroup = activityC19116x82bf90f1.Q;
        int height2 = viewGroup != null ? viewGroup.getHeight() : 0;
        boolean z17 = activityC19116x82bf90f1.R.getVisibility() == 0;
        boolean z18 = activityC19116x82bf90f1.H.getVisibility() == 0;
        boolean z19 = activityC19116x82bf90f1.N1.getVisibility() == 0;
        int bottom = z18 ? activityC19116x82bf90f1.H.getBottom() : -1;
        if (z17) {
            bottom = activityC19116x82bf90f1.R.getBottom();
        }
        if (z19) {
            bottom = activityC19116x82bf90f1.N1.getBottom();
        }
        if (bottom <= 0 && (findViewById = activityC19116x82bf90f1.findViewById(com.p314xaae8f345.mm.R.id.kqt)) != null) {
            bottom = findViewById.getBottom();
        }
        if (activityC19116x82bf90f1.A1.getVisibility() != 0 && activityC19116x82bf90f1.H1.getVisibility() != 0) {
            height += i65.a.b(activityC19116x82bf90f1, 70);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "autoAdjustLayout inner, height: %s, topViewPos: %s, contentHeight: %s, topMargin: %s, 50dp: %s", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(bottom), java.lang.Integer.valueOf(height2), java.lang.Integer.valueOf((height2 - bottom) - height), java.lang.Integer.valueOf(i65.a.b(activityC19116x82bf90f1, 50)));
    }
}

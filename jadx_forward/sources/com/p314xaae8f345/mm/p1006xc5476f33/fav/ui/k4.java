package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class k4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b f182749d;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b) {
        this.f182749d = activityC13569x56faec8b;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b = this.f182749d;
        if (activityC13569x56faec8b.f181911m == -1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            activityC13569x56faec8b.f181911m = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = activityC13569x56faec8b.f181911m;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 3590000 && elapsedRealtime <= 3600000) {
            android.widget.Toast toast = activityC13569x56faec8b.f181912n;
            if (toast == null) {
                activityC13569x56faec8b.f181912n = dp.a.m125854x26a183b(activityC13569x56faec8b, activityC13569x56faec8b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))), 0);
            } else {
                toast.setText(activityC13569x56faec8b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))));
            }
            activityC13569x56faec8b.f181912n.show();
        }
        if (elapsedRealtime < 3600000) {
            return true;
        }
        activityC13569x56faec8b.f181910i = true;
        activityC13569x56faec8b.P6();
        return false;
    }
}

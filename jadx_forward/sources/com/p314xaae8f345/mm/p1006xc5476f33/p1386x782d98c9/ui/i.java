package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 f181032a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1) {
        this.f181032a = activityC13457xf0c8f0d1;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Receive action broadcast failed...");
            return;
        }
        java.lang.String action = intent.getAction();
        boolean equals = "android.bluetooth.adapter.action.STATE_CHANGED".equals(action);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1 = this.f181032a;
        if (equals) {
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 12) {
                if (lq1.a.e()) {
                    activityC13457xf0c8f0d1.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e(this));
                    if (!activityC13457xf0c8f0d1.f180704o || com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f();
                    }
                }
            } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10 && !lq1.a.e()) {
                activityC13457xf0c8f0d1.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f(this));
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ni().e();
            }
        }
        if (activityC13457xf0c8f0d1.f180704o && "android.location.MODE_CHANGED".equals(action)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                activityC13457xf0c8f0d1.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h(this));
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ni().e();
            } else {
                activityC13457xf0c8f0d1.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.g(this));
                if (lq1.a.e()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f();
                }
            }
        }
    }
}

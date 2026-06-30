package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class z extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13459xe0f36c34 f181265a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13459xe0f36c34 activityC13459xe0f36c34) {
        this.f181265a = activityC13459xe0f36c34;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Action broadcast receive...");
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        boolean equals = "android.bluetooth.adapter.action.STATE_CHANGED".equals(action);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13459xe0f36c34 activityC13459xe0f36c34 = this.f181265a;
        if (equals && activityC13459xe0f36c34.D) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (intExtra != 12) {
                if (intExtra == 10) {
                    activityC13459xe0f36c34.T6(3);
                    return;
                }
                return;
            } else if (!activityC13459xe0f36c34.E || com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                activityC13459xe0f36c34.T6(2);
                return;
            } else {
                activityC13459xe0f36c34.T6(6);
                return;
            }
        }
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) && activityC13459xe0f36c34.C) {
            int intExtra2 = intent.getIntExtra("wifi_state", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Wifi state changed action: wifiState(%d)", java.lang.Integer.valueOf(intExtra2));
            if (intExtra2 == 3) {
                activityC13459xe0f36c34.T6(1);
                return;
            } else {
                if (intExtra2 == 1) {
                    activityC13459xe0f36c34.T6(5);
                    return;
                }
                return;
            }
        }
        if (activityC13459xe0f36c34.E && "android.location.MODE_CHANGED".equals(action)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                activityC13459xe0f36c34.T6(6);
            } else if (lq1.a.e()) {
                activityC13459xe0f36c34.T6(2);
            } else {
                activityC13459xe0f36c34.T6(3);
            }
        }
    }
}

package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class z extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI f99732a;

    public z(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI exdeviceBindDeviceGuideUI) {
        this.f99732a = exdeviceBindDeviceGuideUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Action broadcast receive...");
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        boolean equals = "android.bluetooth.adapter.action.STATE_CHANGED".equals(action);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI exdeviceBindDeviceGuideUI = this.f99732a;
        if (equals && exdeviceBindDeviceGuideUI.D) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (intExtra != 12) {
                if (intExtra == 10) {
                    exdeviceBindDeviceGuideUI.T6(3);
                    return;
                }
                return;
            } else if (!exdeviceBindDeviceGuideUI.E || com.tencent.mm.sdk.platformtools.n2.a()) {
                exdeviceBindDeviceGuideUI.T6(2);
                return;
            } else {
                exdeviceBindDeviceGuideUI.T6(6);
                return;
            }
        }
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) && exdeviceBindDeviceGuideUI.C) {
            int intExtra2 = intent.getIntExtra("wifi_state", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Wifi state changed action: wifiState(%d)", java.lang.Integer.valueOf(intExtra2));
            if (intExtra2 == 3) {
                exdeviceBindDeviceGuideUI.T6(1);
                return;
            } else {
                if (intExtra2 == 1) {
                    exdeviceBindDeviceGuideUI.T6(5);
                    return;
                }
                return;
            }
        }
        if (exdeviceBindDeviceGuideUI.E && "android.location.MODE_CHANGED".equals(action)) {
            if (!com.tencent.mm.sdk.platformtools.n2.a()) {
                exdeviceBindDeviceGuideUI.T6(6);
            } else if (lq1.a.e()) {
                exdeviceBindDeviceGuideUI.T6(2);
            } else {
                exdeviceBindDeviceGuideUI.T6(3);
            }
        }
    }
}

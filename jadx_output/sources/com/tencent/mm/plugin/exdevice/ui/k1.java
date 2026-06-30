package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class k1 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI f99541a;

    public k1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f99541a = exdeviceConnectWifiUI;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.b2
    public void a(int i17, java.lang.Object... objArr) {
        if (i17 != 0 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if ((obj instanceof java.lang.Integer) && (objArr[1] instanceof java.lang.Integer)) {
            int intValue = ((java.lang.Integer) obj).intValue();
            int intValue2 = ((java.lang.Integer) objArr[1]).intValue();
            com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f99541a;
            if (exdeviceConnectWifiUI.F.isHeld()) {
                exdeviceConnectWifiUI.F.release();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "AirKiss jni callback (%d, %d)", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
            if (intValue == 0 && intValue2 == 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.exdevice.ui.h1(this));
            } else {
                exdeviceConnectWifiUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.j1(this));
            }
        }
    }
}

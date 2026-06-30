package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class a extends u32.p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a f180375d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a();

    @Override // u32.q0
    public android.os.Bundle Rb(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "onExdeviceInvoke, action code = %d", java.lang.Integer.valueOf(i17));
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
            return null;
        }
        if (i17 != 0) {
            return null;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
        } else {
            int i18 = bundle.getInt("key_state");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "handleOnBluetoothStateChange, state = %d", java.lang.Integer.valueOf(i18));
            if (-1 == i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "invalid state, just leave!!!");
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5357xfd1f325f c5357xfd1f325f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5357xfd1f325f();
                c5357xfd1f325f.f135683g.f88662a = i18;
                if (!c5357xfd1f325f.e()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "EventCenter.instance.publish failed!!!");
                }
            }
        }
        return null;
    }
}

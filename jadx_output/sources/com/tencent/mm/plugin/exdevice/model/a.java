package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class a extends u32.p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.exdevice.model.a f98842d = new com.tencent.mm.plugin.exdevice.model.a();

    @Override // u32.q0
    public android.os.Bundle Rb(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "onExdeviceInvoke, action code = %d", java.lang.Integer.valueOf(i17));
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
            return null;
        }
        if (i17 != 0) {
            return null;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
        } else {
            int i18 = bundle.getInt("key_state");
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "handleOnBluetoothStateChange, state = %d", java.lang.Integer.valueOf(i18));
            if (-1 == i18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "invalid state, just leave!!!");
            } else {
                com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent exDeviceOnBluetoothStateChangeEvent = new com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent();
                exDeviceOnBluetoothStateChangeEvent.f54150g.f7129a = i18;
                if (!exDeviceOnBluetoothStateChangeEvent.e()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "EventCenter.instance.publish failed!!!");
                }
            }
        }
        return null;
    }
}

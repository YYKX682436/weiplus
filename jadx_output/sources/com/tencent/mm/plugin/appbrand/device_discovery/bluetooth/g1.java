package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        super(0);
        this.f77883d = monitoredBluetoothDeviceInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = this.f77883d;
        jSONObject.put("appid", monitoredBluetoothDeviceInfo.field_appId);
        jSONObject.put("bluetoothDeviceId", monitoredBluetoothDeviceInfo.field_bluetoothDeviceId);
        jSONObject.put("deviceId", monitoredBluetoothDeviceInfo.field_wechatToken);
        return jSONObject;
    }
}

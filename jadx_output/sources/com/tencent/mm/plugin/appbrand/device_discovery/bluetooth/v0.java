package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public abstract class v0 {
    public static final void a(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1 event, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e1 context) {
        kotlin.jvm.internal.o.g(monitoredBluetoothDeviceInfo, "<this>");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.autogen.mmdata.rpt.BLEDeviceMonitorStruct bLEDeviceMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.BLEDeviceMonitorStruct();
        bLEDeviceMonitorStruct.f55349d = event.f77927d;
        java.lang.String field_appId = monitoredBluetoothDeviceInfo.field_appId;
        kotlin.jvm.internal.o.f(field_appId, "field_appId");
        bLEDeviceMonitorStruct.f55350e = bLEDeviceMonitorStruct.b("AppId", com.tencent.mm.plugin.appbrand.utils.i1.a(field_appId), true);
        bLEDeviceMonitorStruct.f55351f = monitoredBluetoothDeviceInfo.field_versionType;
        java.lang.String field_entryPackage = monitoredBluetoothDeviceInfo.field_entryPackage;
        kotlin.jvm.internal.o.f(field_entryPackage, "field_entryPackage");
        bLEDeviceMonitorStruct.f55355j = bLEDeviceMonitorStruct.b("EntryPackage", com.tencent.mm.plugin.appbrand.utils.i1.a(field_entryPackage), true);
        java.lang.String field_wechatToken = monitoredBluetoothDeviceInfo.field_wechatToken;
        kotlin.jvm.internal.o.f(field_wechatToken, "field_wechatToken");
        bLEDeviceMonitorStruct.f55353h = bLEDeviceMonitorStruct.b("Sn", com.tencent.mm.plugin.appbrand.utils.i1.a(field_wechatToken), true);
        java.lang.String field_bluetoothDeviceId = monitoredBluetoothDeviceInfo.field_bluetoothDeviceId;
        kotlin.jvm.internal.o.f(field_bluetoothDeviceId, "field_bluetoothDeviceId");
        bLEDeviceMonitorStruct.f55354i = bLEDeviceMonitorStruct.b("BluetoothDeviceid", com.tencent.mm.plugin.appbrand.utils.i1.a(field_bluetoothDeviceId), true);
        if (context.d() != null) {
            bLEDeviceMonitorStruct.f55352g = r5.f77945d;
        }
        if (context.c() != null) {
            bLEDeviceMonitorStruct.f55358m = r5.intValue();
        }
        java.lang.String b17 = context.b();
        if (b17 != null) {
            bLEDeviceMonitorStruct.f55356k = bLEDeviceMonitorStruct.b("SessionId", com.tencent.mm.plugin.appbrand.utils.i1.a(b17), true);
        }
        java.lang.String a17 = context.a();
        if (a17 != null) {
            bLEDeviceMonitorStruct.f55357l = bLEDeviceMonitorStruct.b("InstanceId", com.tencent.mm.plugin.appbrand.utils.i1.a(a17), true);
        }
        bLEDeviceMonitorStruct.k();
    }
}

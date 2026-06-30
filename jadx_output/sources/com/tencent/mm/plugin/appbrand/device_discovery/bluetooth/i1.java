package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class i1 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f77896d = {"appId", "wechatToken"};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f77897e = {"appId", "versionType"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f77898f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo.A, "MonitoredBluetoothDeviceInfoV2")};

    static {
        java.lang.String[] strArr = {"wechatToken", "appId"};
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", PRIMARY KEY ( ");
        int i17 = 0;
        int i18 = 0;
        while (i17 < 2) {
            java.lang.String str = strArr[i17];
            int i19 = i18 + 1;
            if (i18 == 0) {
                sb6.append(str);
            } else {
                sb6.append(", " + str);
            }
            i17++;
            i18 = i19;
        }
        sb6.append(" )");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo.A.f316956e += sb7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo.A, "MonitoredBluetoothDeviceInfoV2", dm.b8.f235881o);
        kotlin.jvm.internal.o.g(db6, "db");
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.h1(this, db6));
    }

    public final synchronized java.util.List y0(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, appId: " + str);
        android.database.Cursor rawQuery = rawQuery("SELECT * FROM " + getTableName() + " WHERE appId = '" + str + '\'', new java.lang.String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                arrayList2 = new java.util.ArrayList();
                do {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
                    monitoredBluetoothDeviceInfo.convertFrom(rawQuery);
                    arrayList2.add(monitoredBluetoothDeviceInfo);
                } while (rawQuery.moveToNext());
                rawQuery.close();
            } else {
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor moveToFirst fail");
                arrayList2 = null;
            }
            arrayList = arrayList2 != null ? arrayList2 : null;
        }
        t91.a.f416567a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor is null");
        return arrayList;
    }

    public final synchronized java.util.List z0(java.lang.String str, int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, appId: " + str + ", versionType: " + i17);
        android.database.Cursor rawQuery = rawQuery("SELECT * FROM " + getTableName() + " WHERE appId = '" + str + "' AND versionType = " + i17, new java.lang.String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                arrayList2 = new java.util.ArrayList();
                do {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
                    monitoredBluetoothDeviceInfo.convertFrom(rawQuery);
                    arrayList2.add(monitoredBluetoothDeviceInfo);
                } while (rawQuery.moveToNext());
                rawQuery.close();
            } else {
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor moveToFirst fail");
                arrayList2 = null;
            }
            arrayList = arrayList2 != null ? arrayList2 : null;
        }
        t91.a.f416567a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllAppInfo, allCursor is null");
        return arrayList;
    }
}

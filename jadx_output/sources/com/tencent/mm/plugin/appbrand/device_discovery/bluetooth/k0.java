package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 f77902a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a f77903b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f77904c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f77905d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f77906e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f77907f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f77908g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f77909h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f77910i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f77911j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f77912k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.Set f77913l;

    static {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0();
        f77902a = k0Var;
        f77903b = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a(k0Var);
        f77905d = new java.util.concurrent.ConcurrentHashMap();
        f77906e = new java.util.concurrent.ConcurrentHashMap();
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        kotlin.jvm.internal.o.f(newSetFromMap, "newSetFromMap(...)");
        f77907f = newSetFromMap;
        f77908g = new java.util.concurrent.ConcurrentHashMap();
        f77909h = jz5.h.a(jz5.i.f302831f, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c0.f77876d);
        f77910i = new java.lang.Object();
        f77911j = new java.util.HashSet();
        f77912k = new java.util.HashMap();
        f77913l = new java.util.HashSet();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.OnMonitorBluetoothDeviceAuthorizeStateEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$1
            {
                this.__eventId = -1115899257;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.OnMonitorBluetoothDeviceAuthorizeStateEvent onMonitorBluetoothDeviceAuthorizeStateEvent) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.OnMonitorBluetoothDeviceAuthorizeStateEvent event = onMonitorBluetoothDeviceAuthorizeStateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "callback, event: " + event);
                if (!event.f77862h) {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var2 = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a;
                    java.lang.String str = event.f77861g;
                    k0Var2.c(str, 0);
                    k0Var2.c(str, 1);
                    k0Var2.c(str, 2);
                }
                return false;
            }
        }.alive();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$2
            {
                this.__eventId = -1720382084;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent cgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent) {
                java.lang.String str;
                com.tencent.mm.protobuf.g gVar;
                com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent event = cgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.appbrand.launching.k9 k9Var = event.f84560g;
                if (k9Var != null && (str = k9Var.field_appId) != null) {
                    r45.b10 b10Var = k9Var.field_jsapiInfo;
                    byte[] bArr = (b10Var == null || (gVar = b10Var.f370425d) == null) ? null : gVar.f192156a;
                    if (bArr != null) {
                        if (1089 < bArr.length) {
                            int i17 = -com.tencent.mm.sdk.platformtools.t8.P(x51.o1.f452060m, 0);
                            if (i17 == -2) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "callback#UpdateLaunchWxaAppInfoBroadcastEvent, hardcode perm off, block");
                                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.b(str);
                            } else if (i17 != -1) {
                                byte b17 = bArr[1089];
                                if (b17 == 1) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "callback#UpdateLaunchWxaAppInfoBroadcastEvent, unblock");
                                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.l(str);
                                } else if (b17 == 6) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "callback#UpdateLaunchWxaAppInfoBroadcastEvent, block");
                                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.b(str);
                                }
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "callback#UpdateLaunchWxaAppInfoBroadcastEvent, hardcode perm on, unblock");
                                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.l(str);
                            }
                        }
                    }
                }
                return false;
            }
        }.alive();
    }

    public static final void a(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var, java.lang.String str) {
        k0Var.getClass();
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) f77908g).get(str);
        if (map == null) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "resumeConnect, deviceId2HasConnectedMap is null");
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            boolean booleanValue = ((java.lang.Boolean) entry.getValue()).booleanValue();
            t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "resumeConnect, deviceId: " + str2 + ", hasConnected: " + booleanValue);
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1 b1Var = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1) ((java.util.concurrent.ConcurrentHashMap) f77906e).get(str2);
            if (b1Var != null) {
                b1Var.c(booleanValue);
            }
        }
    }

    public final boolean b(java.lang.String appId) {
        java.util.List list;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 g17 = g();
        if (g17 != null) {
            synchronized (g17) {
                t91.a aVar = t91.a.f416567a;
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "blockAppInfo, appId: ".concat(appId));
                java.util.List y07 = g17.y0(appId);
                list = null;
                if (y07 != null) {
                    if (!g17.execSQL(g17.getTableName(), "UPDATE " + g17.getTableName() + " SET isBlocked = 1 WHERE appId = '" + appId + '\'')) {
                        aVar.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "blockAppInfo, execSQL fail");
                        y07 = null;
                    }
                    list = y07;
                }
            }
            if (list != null) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = f77902a;
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[] monitoredBluetoothDeviceInfoArr = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[]) list.toArray(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[0]);
                k0Var.h(3, (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[]) java.util.Arrays.copyOf(monitoredBluetoothDeviceInfoArr, monitoredBluetoothDeviceInfoArr.length));
                return true;
            }
        }
        t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "blockAppInfo, fail");
        return false;
    }

    public final boolean c(java.lang.String appId, int i17) {
        java.util.List list;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 g17 = g();
        if (g17 != null) {
            synchronized (g17) {
                t91.a aVar = t91.a.f416567a;
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "deleteAppInfo, appId: " + appId + ", versionType: " + i17);
                java.util.List z07 = g17.z0(appId, i17);
                list = null;
                if (z07 != null) {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
                    monitoredBluetoothDeviceInfo.field_appId = appId;
                    monitoredBluetoothDeviceInfo.field_versionType = i17;
                    if (!g17.delete(monitoredBluetoothDeviceInfo, (java.lang.String[]) java.util.Arrays.copyOf(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1.f77897e, 2))) {
                        aVar.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "deleteAppInfo, delete fail");
                        z07 = null;
                    }
                    list = z07;
                }
            }
            if (list != null) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = f77902a;
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[] monitoredBluetoothDeviceInfoArr = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[]) list.toArray(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[0]);
                k0Var.h(2, (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[]) java.util.Arrays.copyOf(monitoredBluetoothDeviceInfoArr, monitoredBluetoothDeviceInfoArr.length));
                return true;
            }
        }
        t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "deleteAppInfo, fail");
        return false;
    }

    public final boolean d(java.lang.String appId, java.lang.String wechatToken) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(wechatToken, "wechatToken");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 g17 = g();
        if (g17 != null) {
            synchronized (g17) {
                t91.a.f416567a.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "deleteInfo, appId: " + appId + ", wechatToken: " + wechatToken);
                monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
                monitoredBluetoothDeviceInfo.field_appId = appId;
                monitoredBluetoothDeviceInfo.field_wechatToken = wechatToken;
                java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1.f77896d;
                if (g17.get(monitoredBluetoothDeviceInfo, (java.lang.String[]) java.util.Arrays.copyOf(strArr, 2))) {
                    if (g17.delete(monitoredBluetoothDeviceInfo, (java.lang.String[]) java.util.Arrays.copyOf(strArr, 2))) {
                    }
                }
                monitoredBluetoothDeviceInfo = null;
            }
            if (monitoredBluetoothDeviceInfo != null) {
                f77902a.h(2, monitoredBluetoothDeviceInfo);
                return true;
            }
        }
        t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "deleteInfo, fail");
        return false;
    }

    public final void e(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        if (f77904c) {
            ym5.a1.f(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a0(monitoredBluetoothDeviceInfo));
        } else {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "doMonitor, isMonitor is false");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List f() {
        kz5.p0 p0Var;
        boolean z17;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 g17 = g();
        if (g17 != null) {
            synchronized (g17) {
                android.database.Cursor all = g17.getAll();
                if (all == null) {
                    t91.a.f416567a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllInfo, allCursor is null");
                    p0Var = kz5.p0.f313996d;
                } else if (all.moveToFirst()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    do {
                        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
                        monitoredBluetoothDeviceInfo.convertFrom(all);
                        arrayList.add(monitoredBluetoothDeviceInfo);
                    } while (all.moveToNext());
                    all.close();
                    p0Var = arrayList;
                } else {
                    t91.a.f416567a.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "getAllInfo, allCursor moveToFirst fail");
                    p0Var = kz5.p0.f313996d;
                }
            }
        } else {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getAllInfo, infoStorage is null");
            p0Var = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : p0Var) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo2 = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) obj;
            if (monitoredBluetoothDeviceInfo2.isValid()) {
                z17 = true;
            } else {
                t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getAllInfo, deviceInfo: " + monitoredBluetoothDeviceInfo2 + " is invalid");
                z17 = false;
            }
            if (z17) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 g() {
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1.f77896d;
        return (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1.class);
    }

    public final void h(int i17, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo... monitoredBluetoothDeviceInfoArr) {
        java.lang.Object obj;
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, op: " + i17);
        int i18 = 0;
        if (monitoredBluetoothDeviceInfoArr.length == 0) {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfoList is empty");
            return;
        }
        java.util.Map map = f77905d;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a1 a1Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a1.f77871a;
        if (i17 != 1) {
            if (i17 == 2) {
                int length = monitoredBluetoothDeviceInfoArr.length;
                while (i18 < length) {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = monitoredBluetoothDeviceInfoArr[i18];
                    if (monitoredBluetoothDeviceInfo.isValid()) {
                        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(monitoredBluetoothDeviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77920f, a1Var);
                        m(monitoredBluetoothDeviceInfo);
                    } else {
                        t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfo is invalid");
                    }
                    i18++;
                }
                return;
            }
            if (i17 != 3) {
                return;
            }
            int length2 = monitoredBluetoothDeviceInfoArr.length;
            while (i18 < length2) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo2 = monitoredBluetoothDeviceInfoArr[i18];
                if (!monitoredBluetoothDeviceInfo2.isValid()) {
                    t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfo is invalid");
                } else if (monitoredBluetoothDeviceInfo2.field_isBlocked) {
                    t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, block");
                    m(monitoredBluetoothDeviceInfo2);
                } else {
                    t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, unblock");
                    java.lang.String str = monitoredBluetoothDeviceInfo2.field_bluetoothDeviceId;
                    kotlin.jvm.internal.o.d(str);
                    if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
                        e(monitoredBluetoothDeviceInfo2);
                    }
                }
                i18++;
            }
            return;
        }
        int length3 = monitoredBluetoothDeviceInfoArr.length;
        while (i18 < length3) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo3 = monitoredBluetoothDeviceInfoArr[i18];
            if (monitoredBluetoothDeviceInfo3.isValid()) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(monitoredBluetoothDeviceInfo3, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77919e, a1Var);
                java.lang.String str2 = monitoredBluetoothDeviceInfo3.field_bluetoothDeviceId;
                kotlin.jvm.internal.o.d(str2);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
                if (concurrentHashMap.containsKey(str2)) {
                    t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, is update");
                    java.util.Iterator it = concurrentHashMap.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) obj).field_wechatToken, monitoredBluetoothDeviceInfo3.field_wechatToken)) {
                                break;
                            }
                        }
                    }
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo4 = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) obj;
                    if (monitoredBluetoothDeviceInfo4 != null) {
                        f77902a.m(monitoredBluetoothDeviceInfo4);
                    }
                    if (!monitoredBluetoothDeviceInfo3.field_isBlocked) {
                        e(monitoredBluetoothDeviceInfo3);
                    }
                } else {
                    t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, is insert");
                    if (!monitoredBluetoothDeviceInfo3.field_isBlocked) {
                        e(monitoredBluetoothDeviceInfo3);
                    }
                }
            } else {
                t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfo is invalid");
            }
            i18++;
        }
    }

    public final boolean i(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo info) {
        boolean replace;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 g17 = g();
        if (g17 == null) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "setInfo, infoStorage is null");
            return false;
        }
        info.field_updateTime = java.lang.System.currentTimeMillis();
        synchronized (g17) {
            replace = g17.replace(info);
        }
        if (!replace) {
            return replace;
        }
        f77902a.h(1, info);
        return replace;
    }

    public final boolean j(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo deviceInfo, boolean z17) {
        int i17;
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, isConnected: " + z17);
        java.lang.String field_appId = deviceInfo.field_appId;
        kotlin.jvm.internal.o.f(field_appId, "field_appId");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z(field_appId, deviceInfo.field_versionType);
        synchronized (f77910i) {
            java.util.Set set = f77913l;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar2 = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z) next;
                zVar2.getClass();
                if (true ^ (com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().c(zVar2.f77979a, zVar2.f77980b) != null)) {
                    arrayList.add(next);
                }
            }
            set.removeAll(arrayList);
            java.util.Set set2 = f77913l;
            if (((java.util.HashSet) set2).contains(zVar)) {
                t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, toStartWeApp has started");
            } else {
                if (((java.util.HashSet) f77911j).contains(zVar)) {
                    t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, toStartWeApp is starting");
                    java.util.HashMap hashMap = (java.util.HashMap) f77912k;
                    java.lang.Object obj = hashMap.get(zVar);
                    java.lang.Object obj2 = obj;
                    if (obj == null) {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        hashMap.put(zVar, hashSet);
                        obj2 = hashSet;
                    }
                    ((java.util.Set) obj2).add(deviceInfo);
                    return false;
                }
                int i18 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().X;
                if ((set2 instanceof java.util.Collection) && set2.isEmpty()) {
                    i17 = 0;
                } else {
                    java.util.Iterator it6 = set2.iterator();
                    i17 = 0;
                    while (it6.hasNext()) {
                        if (((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z) it6.next()).a() && (i17 = i17 + 1) < 0) {
                            kz5.c0.o();
                            throw null;
                        }
                    }
                }
                int size = ((java.util.HashSet) f77911j).size();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, maxStartWeAppCount: " + i18 + ", isInBackgroundTemporaryWeAppCount: " + i17 + ", startingWeAppCount: " + size);
                if (i18 <= i17 + size) {
                    t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeAppOnBluetoothDeviceFound, reach max start count limit");
                    return false;
                }
            }
            ((java.util.HashSet) f77911j).add(zVar);
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e0 e0Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e0(deviceInfo);
            com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
            int i19 = zVar.f77980b;
            java.lang.String str = zVar.f77979a;
            com.tencent.luggage.sdk.processes.s c17 = a17.c(str, i19);
            if (c17 == null) {
                t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, aliveAppRecord is null");
                e0Var.invoke(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77943i);
            } else {
                java.lang.String i27 = ((com.tencent.mm.plugin.appbrand.task.k) a17.f(c17)).i();
                if (i27 == null) {
                    t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "getRunningStateAsync, processName is null");
                    e0Var.invoke(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1.f77943i);
                } else {
                    com.tencent.mm.ipcinvoker.f.a(i27, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v.f77969d, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.w(e0Var));
                }
            }
            java.lang.String str2 = deviceInfo.field_bluetoothDeviceId;
            kotlin.jvm.internal.o.d(str2);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = deviceInfo.field_appId;
            b1Var.f317016c = deviceInfo.field_versionType;
            b1Var.f317026h = deviceInfo.field_entryPackage;
            b1Var.f317032k = 1217;
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            android.os.PersistableBundle persistableBundle2 = new android.os.PersistableBundle();
            persistableBundle2.putString("appid", deviceInfo.field_appId);
            persistableBundle2.putString("bluetoothDeviceId", deviceInfo.field_bluetoothDeviceId);
            persistableBundle2.putString("deviceId", deviceInfo.field_wechatToken);
            persistableBundle2.putInt("envVersion", deviceInfo.field_versionType);
            persistableBundle2.putString("entryPackage", deviceInfo.field_entryPackage);
            persistableBundle.putPersistableBundle("DeviceDiscovery_bluetoothDeviceInfo", persistableBundle2);
            persistableBundle.putInt("DeviceDiscovery_isBluetoothDeviceConnected", z17 ? 1 : 0);
            b1Var.f317030j = persistableBundle;
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.h0(b1Var, str2, deviceInfo, zVar));
            return true;
        }
    }

    public final void k(java.lang.String appId, java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppConnectGattSuccess, appId: " + appId + ", deviceId: " + deviceId);
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) f77908g).get(appId);
        if (map == null || ((java.lang.Boolean) map.put(deviceId, java.lang.Boolean.TRUE)) == null) {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppConnectGattSuccess, we dont care");
        }
    }

    public final boolean l(java.lang.String appId) {
        java.util.List list;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 g17 = g();
        if (g17 != null) {
            synchronized (g17) {
                t91.a aVar = t91.a.f416567a;
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "unblockAppInfo, appId: ".concat(appId));
                java.util.List y07 = g17.y0(appId);
                list = null;
                if (y07 != null) {
                    if (!g17.execSQL(g17.getTableName(), "UPDATE " + g17.getTableName() + " SET isBlocked = 0 WHERE appId = '" + appId + '\'')) {
                        aVar.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "unblockAppInfo, execSQL fail");
                        y07 = null;
                    }
                    list = y07;
                }
            }
            if (list != null) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = f77902a;
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[] monitoredBluetoothDeviceInfoArr = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[]) list.toArray(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[0]);
                k0Var.h(3, (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[]) java.util.Arrays.copyOf(monitoredBluetoothDeviceInfoArr, monitoredBluetoothDeviceInfoArr.length));
                return true;
            }
        }
        t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "unblockAppInfo, fail");
        return false;
    }

    public final void m(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        if (!f77904c) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "undoMonitor, isMonitor is false");
            return;
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar = f77903b;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBleKeepAlive", "unregisterKeepAlive: " + monitoredBluetoothDeviceInfo);
        synchronized (aVar) {
            java.util.Iterator it = ((android.util.ArraySet) aVar.f77864b).iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) ((android.util.Pair) it.next()).first).equals(monitoredBluetoothDeviceInfo)) {
                    it.remove();
                }
            }
        }
        ym5.a1.f(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j0(monitoredBluetoothDeviceInfo));
    }
}

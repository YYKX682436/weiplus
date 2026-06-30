package com.tencent.mm.booter;

/* loaded from: classes9.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static i11.e f63436a = null;

    /* renamed from: b, reason: collision with root package name */
    public static float f63437b = -85.0f;

    /* renamed from: c, reason: collision with root package name */
    public static float f63438c = -1000.0f;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f63439d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f63440e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f63441f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f63442g = java.lang.Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public static final i11.c f63443h = new com.tencent.mm.booter.j2();

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f63444i = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.booter.l2(), true);

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f63445j;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f63445j = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceIBeaconRangingResultEvent>(a0Var) { // from class: com.tencent.mm.booter.PostTaskStartRangeForIBeacon$3
            {
                this.__eventId = -1172394697;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceIBeaconRangingResultEvent exDeviceIBeaconRangingResultEvent) {
                com.tencent.mm.autogen.events.ExDeviceIBeaconRangingResultEvent exDeviceIBeaconRangingResultEvent2 = exDeviceIBeaconRangingResultEvent;
                if (exDeviceIBeaconRangingResultEvent2 != null) {
                    am.e6 e6Var = exDeviceIBeaconRangingResultEvent2.f54144g;
                    java.lang.String str = e6Var.f6537a;
                    int i17 = e6Var.f6538b;
                    int i18 = e6Var.f6539c;
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.tencent.mm.booter.m2.f63440e;
                    if (!concurrentHashMap.containsKey(str + "," + i17 + "," + i18)) {
                        r45.vx3 vx3Var = new r45.vx3();
                        vx3Var.f388642d = str;
                        vx3Var.f388643e = i17;
                        vx3Var.f388644f = 65535 & i18;
                        vx3Var.f388645g = e6Var.f6540d;
                        concurrentHashMap.put(str + "," + i17 + "," + i18, vx3Var);
                        if (e6Var.f6540d >= 0.0d && ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.booter.m2.f63441f).size() >= 1) {
                            int i19 = 0;
                            while (true) {
                                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.booter.m2.f63441f;
                                if (i19 >= copyOnWriteArrayList.size()) {
                                    break;
                                }
                                r45.vx3 vx3Var2 = (r45.vx3) copyOnWriteArrayList.get(i19);
                                if (e6Var.f6540d >= vx3Var2.f388645g) {
                                    if (i19 == copyOnWriteArrayList.size() - 1 && e6Var.f6540d > vx3Var2.f388645g) {
                                        copyOnWriteArrayList.add(vx3Var);
                                        break;
                                    }
                                    i19++;
                                } else {
                                    copyOnWriteArrayList.add(i19, vx3Var);
                                    break;
                                }
                            }
                        } else {
                            ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.booter.m2.f63441f).add(vx3Var);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "[shakezb]result iBeacon = %s,beaconMap.size:%d", str + "," + i17 + "," + i18, java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.booter.m2.f63440e).size()));
                }
                return false;
            }
        };
    }

    public static void a() {
        i11.e eVar;
        if (!gm0.j1.a() || gm0.m.r()) {
            return;
        }
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) p17.m(u3Var, null), false));
        com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "the range road status is " + valueOf);
        if (valueOf.booleanValue()) {
            if (com.tencent.mm.sdk.platformtools.t8.i1() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_OPEN_TIEMSTAMP_LONG, null), 0L) > com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_CHANNEL_OPEN_TIME_LONG, null), 0L)) {
                c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_LAST_BEACONINFO_STRING, "");
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                c01.d9.b().getClass();
                gm0.j1.i();
                gm0.j1.b().x();
                return;
            }
            android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || defaultAdapter.getState() != 12) {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                return;
            }
            java.util.List<java.lang.String> e17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().e();
            if (e17 != null) {
                for (java.lang.String str : e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=true,iBeacon = %s", str);
                    com.tencent.mm.autogen.events.ExDeviceIBeaconRangingEvent exDeviceIBeaconRangingEvent = new com.tencent.mm.autogen.events.ExDeviceIBeaconRangingEvent();
                    am.d6 d6Var = exDeviceIBeaconRangingEvent.f54143g;
                    d6Var.f6434a = str;
                    d6Var.f6435b = true;
                    exDeviceIBeaconRangingEvent.e();
                }
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                f63436a = i11.h.e();
                com.tencent.mm.sdk.platformtools.b4 b4Var = f63444i;
                if (b4Var.e()) {
                    b4Var.c(3000L, 3000L);
                }
                if (!f63439d && (eVar = f63436a) != null) {
                    ((i11.h) eVar).l(f63443h, true, false, false);
                }
                f63445j.alive();
            }
        }
    }
}

package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes9.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static i11.e f144969a = null;

    /* renamed from: b, reason: collision with root package name */
    public static float f144970b = -85.0f;

    /* renamed from: c, reason: collision with root package name */
    public static float f144971c = -1000.0f;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f144972d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f144973e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f144974f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f144975g = java.lang.Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public static final i11.c f144976h = new com.p314xaae8f345.mm.p642xad8b531f.j2();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f144977i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p642xad8b531f.l2(), true);

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f144978j;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f144978j = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5351xf5159547>(a0Var) { // from class: com.tencent.mm.booter.PostTaskStartRangeForIBeacon$3
            {
                this.f39173x3fe91575 = -1172394697;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5351xf5159547 c5351xf5159547) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5351xf5159547 c5351xf51595472 = c5351xf5159547;
                if (c5351xf51595472 != null) {
                    am.e6 e6Var = c5351xf51595472.f135677g;
                    java.lang.String str = e6Var.f88070a;
                    int i17 = e6Var.f88071b;
                    int i18 = e6Var.f88072c;
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p642xad8b531f.m2.f144973e;
                    if (!concurrentHashMap.containsKey(str + "," + i17 + "," + i18)) {
                        r45.vx3 vx3Var = new r45.vx3();
                        vx3Var.f470175d = str;
                        vx3Var.f470176e = i17;
                        vx3Var.f470177f = 65535 & i18;
                        vx3Var.f470178g = e6Var.f88073d;
                        concurrentHashMap.put(str + "," + i17 + "," + i18, vx3Var);
                        if (e6Var.f88073d >= 0.0d && ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p642xad8b531f.m2.f144974f).size() >= 1) {
                            int i19 = 0;
                            while (true) {
                                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p642xad8b531f.m2.f144974f;
                                if (i19 >= copyOnWriteArrayList.size()) {
                                    break;
                                }
                                r45.vx3 vx3Var2 = (r45.vx3) copyOnWriteArrayList.get(i19);
                                if (e6Var.f88073d >= vx3Var2.f470178g) {
                                    if (i19 == copyOnWriteArrayList.size() - 1 && e6Var.f88073d > vx3Var2.f470178g) {
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
                            ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p642xad8b531f.m2.f144974f).add(vx3Var);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "[shakezb]result iBeacon = %s,beaconMap.size:%d", str + "," + i17 + "," + i18, java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p642xad8b531f.m2.f144973e).size()));
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
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1((java.lang.Boolean) p17.m(u3Var, null), false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "the range road status is " + valueOf);
        if (valueOf.booleanValue()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_OPEN_TIEMSTAMP_LONG, null), 0L) > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_CHANNEL_OPEN_TIME_LONG, null), 0L)) {
                c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_LAST_BEACONINFO_STRING, "");
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                c01.d9.b().getClass();
                gm0.j1.i();
                gm0.j1.b().x();
                return;
            }
            android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || defaultAdapter.getState() != 12) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                return;
            }
            java.util.List<java.lang.String> e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().e();
            if (e17 != null) {
                for (java.lang.String str : e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=true,iBeacon = %s", str);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5350xd063a2e4 c5350xd063a2e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5350xd063a2e4();
                    am.d6 d6Var = c5350xd063a2e4.f135676g;
                    d6Var.f87967a = str;
                    d6Var.f87968b = true;
                    c5350xd063a2e4.e();
                }
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                f144969a = i11.h.e();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f144977i;
                if (b4Var.e()) {
                    b4Var.c(3000L, 3000L);
                }
                if (!f144972d && (eVar = f144969a) != null) {
                    ((i11.h) eVar).l(f144976h, true, false, false);
                }
                f144978j.mo48813x58998cd();
            }
        }
    }
}

package be1;

/* loaded from: classes7.dex */
public class f0 extends be1.c0 {

    /* renamed from: CTRL_INDEX */
    public static final int f4216x366c91de = 40;

    /* renamed from: NAME */
    public static final java.lang.String f4217x24728b = "getSystemInfo";

    /* renamed from: h, reason: collision with root package name */
    public static android.content.BroadcastReceiver f100997h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f100998i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f100999m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f101000n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f101001o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f101002p = new java.util.concurrent.atomic.AtomicBoolean(false);

    public f0() {
        super(new be1.j());
    }

    public static int E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        int m172249x6b326eb4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        if (a17 != null && a17.s1() != null && (m172249x6b326eb4 = a17.s1().m172249x6b326eb4()) != 0) {
            return m172249x6b326eb4;
        }
        xi1.f mo51615x8408480b = yVar.mo50261xee5260a9().mo51615x8408480b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.JsApiGetSystemInfoLU", "getIntersectStatusBarHeight with component(%s %s), use windowStatusBar[%s]", yVar.mo48798x74292566(), yVar.getClass().getName(), mo51615x8408480b);
        if (mo51615x8408480b != null) {
            return mo51615x8408480b.f536235a;
        }
        return 0;
    }

    public static void F(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        be1.n nVar = (be1.n) yVar.q(be1.n.class);
        float k66 = nVar == null ? 1.0f : nVar.k6();
        map.put("fontSizeSetting", java.lang.Integer.valueOf(java.lang.Math.round(16.0f * k66)));
        map.put("fontSizeScaleFactor", java.lang.Float.valueOf(k66));
    }

    public static void G(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap(6);
        android.graphics.Rect mo51613x2ae93e46 = yVar.mo50261xee5260a9().mo51613x2ae93e46();
        if (mo51613x2ae93e46 != null) {
            int e17 = ik1.w.e(mo51613x2ae93e46.left);
            int e18 = ik1.w.e(mo51613x2ae93e46.top);
            int e19 = ik1.w.e(java.lang.Math.min(mo51613x2ae93e46.right, i17));
            int e27 = ik1.w.e(java.lang.Math.min(mo51613x2ae93e46.bottom, i18));
            hashMap.put("left", java.lang.Integer.valueOf(e17));
            hashMap.put("top", java.lang.Integer.valueOf(e18));
            hashMap.put("right", java.lang.Integer.valueOf(e19));
            hashMap.put("bottom", java.lang.Integer.valueOf(e27));
            hashMap.put("width", java.lang.Integer.valueOf(e19 - e17));
            hashMap.put("height", java.lang.Integer.valueOf(e27 - e18));
            map.put("safeArea", hashMap);
        }
    }

    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.util.Map map) {
    }

    @Override // be1.c0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public java.util.Map B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        int i17;
        java.util.Map B = super.B(yVar);
        int[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.b(yVar);
        java.util.HashMap hashMap = (java.util.HashMap) B;
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(b17[0])));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(b17[1])));
        int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(yVar);
        int i18 = a17[0];
        int i19 = a17[1];
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i19)));
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        hashMap.put("statusBarHeight", java.lang.Integer.valueOf(ik1.w.e(E(yVar))));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(yVar.mo50352x76847179()));
        hashMap.put("version", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h));
        if (yVar.t3() != null && yVar.t3().E0() != null) {
            hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) yVar.t3().E0()).W));
        }
        if (yVar.t3() != null && yVar.t3().m0() != null && yVar.t3().m0().f()) {
            java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
            nf.y yVar2 = nf.x.f418149b;
            hashMap.put("theme", yVar2 != null ? yVar2.i(mo48798x74292566) : false ? "dark" : "light");
        }
        try {
            int[] iArr = new int[2];
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
            android.widget.FrameLayout mo51313xaf0c0532 = a18 == null ? null : a18.mo51313xaf0c0532();
            if (mo51313xaf0c0532 != null) {
                mo51313xaf0c0532.getLocationOnScreen(iArr);
                i17 = iArr[1];
            } else {
                i17 = 0;
            }
            hashMap.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.JsApiGetSystemInfoLU", e17.getMessage());
        }
        int i27 = yVar.mo50352x76847179().getResources().getConfiguration().orientation;
        if (2 == i27) {
            hashMap.put("deviceOrientation", "landscape");
        } else if (1 == i27) {
            hashMap.put("deviceOrientation", "portrait");
        }
        F(B, yVar);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.content.Context mo50352x76847179 = yVar.mo50352x76847179();
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (mo50352x76847179 != null) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f100998i;
            if (atomicBoolean.get()) {
                hashMap2.put("notificationAuthorized", java.lang.Boolean.valueOf(f101002p.get()));
            } else {
                hashMap2.put("notificationAuthorized", java.lang.Boolean.valueOf(new z2.n1(mo50352x76847179).a()));
            }
            if (atomicBoolean.get()) {
                hashMap2.put("wifiEnabled", java.lang.Boolean.valueOf(f100999m.get()));
                hashMap2.put("locationEnabled", java.lang.Boolean.valueOf(f101000n.get() || f101001o.get()));
            } else {
                android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) mo50352x76847179.getApplicationContext().getSystemService("wifi");
                if (wifiManager != null) {
                    hashMap2.put("wifiEnabled", java.lang.Boolean.valueOf(wifiManager.isWifiEnabled()));
                } else {
                    hashMap2.put("wifiEnabled", java.lang.Boolean.FALSE);
                }
                hashMap2.put("locationEnabled", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b()));
            }
            try {
                hashMap2.put("locationAuthorized", java.lang.Boolean.valueOf(nf.t.b(mo50352x76847179, null, "android.permission.ACCESS_FINE_LOCATION")));
                hashMap2.put("cameraAuthorized", java.lang.Boolean.valueOf(nf.t.b(mo50352x76847179, null, "android.permission.CAMERA")));
                hashMap2.put("microphoneAuthorized", java.lang.Boolean.valueOf(nf.t.b(mo50352x76847179, null, "android.permission.RECORD_AUDIO")));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.JsApiGetSystemInfoLU", "check permissions exception", e18);
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                hashMap2.put("locationAuthorized", bool);
                hashMap2.put("cameraAuthorized", bool);
                hashMap2.put("microphoneAuthorized", bool);
            }
            boolean z17 = defaultAdapter != null;
            if (z17 && android.os.Build.VERSION.SDK_INT >= 31) {
                z17 = nf.t.b(mo50352x76847179, null, "android.permission.BLUETOOTH_CONNECT") || nf.t.b(mo50352x76847179, null, "android.permission.BLUETOOTH_SCAN") || nf.t.b(mo50352x76847179, null, "android.permission.BLUETOOTH_ADVERTISE");
            }
            hashMap2.put("bluetoothAuthorized", java.lang.Boolean.valueOf(z17));
        } else {
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            hashMap2.put("wifiEnabled", bool2);
            hashMap2.put("notificationAuthorized", bool2);
            hashMap2.put("locationEnabled", bool2);
            hashMap2.put("locationAuthorized", bool2);
            hashMap2.put("cameraAuthorized", bool2);
            hashMap2.put("microphoneAuthorized", bool2);
        }
        if (defaultAdapter != null) {
            hashMap2.put("bluetoothEnabled", java.lang.Boolean.valueOf(defaultAdapter.isEnabled()));
        } else {
            hashMap2.put("bluetoothEnabled", java.lang.Boolean.FALSE);
        }
        hashMap2.put("phoneCalendarAuthorized", java.lang.Boolean.TRUE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.JsApiGetSystemInfoLU", "check permissions:%s", hashMap2);
        hashMap.putAll(hashMap2);
        G(B, yVar, i18, i19);
        C(yVar, B);
        return B;
    }

    public f0(be1.j jVar) {
        super(jVar);
    }
}

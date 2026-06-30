package be1;

/* loaded from: classes7.dex */
public class f0 extends be1.c0 {
    public static final int CTRL_INDEX = 40;
    public static final java.lang.String NAME = "getSystemInfo";

    /* renamed from: h, reason: collision with root package name */
    public static android.content.BroadcastReceiver f19464h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f19465i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f19466m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f19467n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f19468o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f19469p = new java.util.concurrent.atomic.AtomicBoolean(false);

    public f0() {
        super(new be1.j());
    }

    public static int E(com.tencent.mm.plugin.appbrand.y yVar) {
        int drawnStatusBarHeight;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        if (a17 != null && a17.s1() != null && (drawnStatusBarHeight = a17.s1().getDrawnStatusBarHeight()) != 0) {
            return drawnStatusBarHeight;
        }
        xi1.f statusBar = yVar.getWindowAndroid().getStatusBar();
        com.tencent.mars.xlog.Log.e("Luggage.FULL.JsApiGetSystemInfoLU", "getIntersectStatusBarHeight with component(%s %s), use windowStatusBar[%s]", yVar.getAppId(), yVar.getClass().getName(), statusBar);
        if (statusBar != null) {
            return statusBar.f454702a;
        }
        return 0;
    }

    public static void F(java.util.Map map, com.tencent.mm.plugin.appbrand.y yVar) {
        be1.n nVar = (be1.n) yVar.q(be1.n.class);
        float k66 = nVar == null ? 1.0f : nVar.k6();
        map.put("fontSizeSetting", java.lang.Integer.valueOf(java.lang.Math.round(16.0f * k66)));
        map.put("fontSizeScaleFactor", java.lang.Float.valueOf(k66));
    }

    public static void G(java.util.Map map, com.tencent.mm.plugin.appbrand.y yVar, int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap(6);
        android.graphics.Rect safeAreaInsets = yVar.getWindowAndroid().getSafeAreaInsets();
        if (safeAreaInsets != null) {
            int e17 = ik1.w.e(safeAreaInsets.left);
            int e18 = ik1.w.e(safeAreaInsets.top);
            int e19 = ik1.w.e(java.lang.Math.min(safeAreaInsets.right, i17));
            int e27 = ik1.w.e(java.lang.Math.min(safeAreaInsets.bottom, i18));
            hashMap.put("left", java.lang.Integer.valueOf(e17));
            hashMap.put("top", java.lang.Integer.valueOf(e18));
            hashMap.put("right", java.lang.Integer.valueOf(e19));
            hashMap.put("bottom", java.lang.Integer.valueOf(e27));
            hashMap.put("width", java.lang.Integer.valueOf(e19 - e17));
            hashMap.put("height", java.lang.Integer.valueOf(e27 - e18));
            map.put("safeArea", hashMap);
        }
    }

    public void C(com.tencent.mm.plugin.appbrand.y yVar, java.util.Map map) {
    }

    @Override // be1.c0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public java.util.Map B(com.tencent.mm.plugin.appbrand.y yVar) {
        int i17;
        java.util.Map B = super.B(yVar);
        int[] b17 = com.tencent.mm.plugin.appbrand.utils.f5.b(yVar);
        java.util.HashMap hashMap = (java.util.HashMap) B;
        hashMap.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(b17[0])));
        hashMap.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(b17[1])));
        int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a(yVar);
        int i18 = a17[0];
        int i19 = a17[1];
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i18)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i19)));
        hashMap.put("pixelRatio", java.lang.Float.valueOf(ik1.w.f()));
        hashMap.put("statusBarHeight", java.lang.Integer.valueOf(ik1.w.e(E(yVar))));
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, com.tencent.mm.sdk.platformtools.m2.f(yVar.getContext()));
        hashMap.put("version", com.tencent.mm.sdk.platformtools.a0.a(null, com.tencent.mm.sdk.platformtools.z.f193112h));
        if (yVar.t3() != null && yVar.t3().E0() != null) {
            hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) yVar.t3().E0()).W));
        }
        if (yVar.t3() != null && yVar.t3().m0() != null && yVar.t3().m0().f()) {
            java.lang.String appId = yVar.getAppId();
            nf.y yVar2 = nf.x.f336616b;
            hashMap.put("theme", yVar2 != null ? yVar2.i(appId) : false ? "dark" : "light");
        }
        try {
            int[] iArr = new int[2];
            com.tencent.mm.plugin.appbrand.page.v5 a18 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
            android.widget.FrameLayout pageArea = a18 == null ? null : a18.getPageArea();
            if (pageArea != null) {
                pageArea.getLocationOnScreen(iArr);
                i17 = iArr[1];
            } else {
                i17 = 0;
            }
            hashMap.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.FULL.JsApiGetSystemInfoLU", e17.getMessage());
        }
        int i27 = yVar.getContext().getResources().getConfiguration().orientation;
        if (2 == i27) {
            hashMap.put("deviceOrientation", "landscape");
        } else if (1 == i27) {
            hashMap.put("deviceOrientation", "portrait");
        }
        F(B, yVar);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.content.Context context = yVar.getContext();
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (context != null) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f19465i;
            if (atomicBoolean.get()) {
                hashMap2.put("notificationAuthorized", java.lang.Boolean.valueOf(f19469p.get()));
            } else {
                hashMap2.put("notificationAuthorized", java.lang.Boolean.valueOf(new z2.n1(context).a()));
            }
            if (atomicBoolean.get()) {
                hashMap2.put("wifiEnabled", java.lang.Boolean.valueOf(f19466m.get()));
                hashMap2.put("locationEnabled", java.lang.Boolean.valueOf(f19467n.get() || f19468o.get()));
            } else {
                android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager != null) {
                    hashMap2.put("wifiEnabled", java.lang.Boolean.valueOf(wifiManager.isWifiEnabled()));
                } else {
                    hashMap2.put("wifiEnabled", java.lang.Boolean.FALSE);
                }
                hashMap2.put("locationEnabled", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.n2.a() || com.tencent.mm.sdk.platformtools.n2.b()));
            }
            try {
                hashMap2.put("locationAuthorized", java.lang.Boolean.valueOf(nf.t.b(context, null, "android.permission.ACCESS_FINE_LOCATION")));
                hashMap2.put("cameraAuthorized", java.lang.Boolean.valueOf(nf.t.b(context, null, "android.permission.CAMERA")));
                hashMap2.put("microphoneAuthorized", java.lang.Boolean.valueOf(nf.t.b(context, null, "android.permission.RECORD_AUDIO")));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("Luggage.FULL.JsApiGetSystemInfoLU", "check permissions exception", e18);
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                hashMap2.put("locationAuthorized", bool);
                hashMap2.put("cameraAuthorized", bool);
                hashMap2.put("microphoneAuthorized", bool);
            }
            boolean z17 = defaultAdapter != null;
            if (z17 && android.os.Build.VERSION.SDK_INT >= 31) {
                z17 = nf.t.b(context, null, "android.permission.BLUETOOTH_CONNECT") || nf.t.b(context, null, "android.permission.BLUETOOTH_SCAN") || nf.t.b(context, null, "android.permission.BLUETOOTH_ADVERTISE");
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
        com.tencent.mars.xlog.Log.i("Luggage.FULL.JsApiGetSystemInfoLU", "check permissions:%s", hashMap2);
        hashMap.putAll(hashMap2);
        G(B, yVar, i18, i19);
        C(yVar, B);
        return B;
    }

    public f0(be1.j jVar) {
        super(jVar);
    }
}

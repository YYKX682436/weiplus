package uo;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static int f511066b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f511067c = false;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.FutureTask f511068d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f511069e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f511070f;

    /* renamed from: a, reason: collision with root package name */
    public static final uo.q f511065a = new uo.q();

    /* renamed from: g, reason: collision with root package name */
    public static final android.util.ArrayMap f511071g = new android.util.ArrayMap();

    /* renamed from: h, reason: collision with root package name */
    public static int f511072h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static int f511073i = -1;

    public final void a() {
        try {
            f511070f = null;
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("camera");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cameraIdList, "getCameraIdList(...)");
            for (java.lang.String str : cameraIdList) {
                if (f511070f == null) {
                    f511070f = str + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING) + '+';
                } else {
                    f511070f += str + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING) + '+';
                }
            }
        } catch (java.lang.AssertionError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "some device has some problem in LegecyCamera ");
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "a camera access exception happend");
        }
    }

    public final void b() {
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("camera");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            f511069e = ((android.hardware.camera2.CameraManager) systemService).getCameraIdList().length;
        } catch (java.lang.AssertionError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "some device has some problem in LegecyCamera ");
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "a camera access exception happend");
        }
    }

    public final android.hardware.Camera.CameraInfo c(int i17) {
        if (d() != 2) {
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            return cameraInfo;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.util.ArrayMap arrayMap = f511071g;
        if (!arrayMap.containsKey(valueOf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "cameraInfoList is empty, miss Cache, to make CameraInfo Cache");
            android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
            int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("PluginCamera_CameraInfo_facing_" + i17, -1);
            int o18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("PluginCamera_CameraInfo_orientation_" + i17, -1);
            boolean z17 = false;
            boolean i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("PluginCamera_CameraInfo_canDisableShutterSound_" + i17, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById, id = " + i17 + ", facing = " + o17 + ", orientation =" + o18 + ", canDisableShutterSound = " + i18);
            if (o17 == -1 || o18 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById no MMKV cache");
            } else {
                cameraInfo2.facing = o17;
                cameraInfo2.orientation = o18;
                cameraInfo2.canDisableShutterSound = i18;
                arrayMap.put(java.lang.Integer.valueOf(i17), cameraInfo2);
                z17 = true;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById failed, refresh CameraCache");
                e();
            }
        }
        android.hardware.Camera.CameraInfo cameraInfo3 = (android.hardware.Camera.CameraInfo) arrayMap.get(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "getCameraInfo cameraInfoList.size = " + arrayMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "getCameraInfo id = " + i17 + ", ret = " + cameraInfo3);
        return cameraInfo3;
    }

    public final int d() {
        int i17 = f511066b;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "mCameraNumber == -1，slow initCameraNumbers, use MMKV cache");
            int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("cameraNumberCache", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "get cameraNumberCache from MMKV cameraNumberCache is " + i18);
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV successful, return cameraNumberCache : " + i18);
                if (!f511067c) {
                    int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
                    f511066b = numberOfCameras;
                    return numberOfCameras;
                }
                if (i18 != 0) {
                    f511066b = i18;
                    return i18;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV is 0, error, getNumberOfCameras freshly ");
                int numberOfCameras2 = android.hardware.Camera.getNumberOfCameras();
                f511066b = numberOfCameras2;
                return numberOfCameras2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly");
            f511066b = android.hardware.Camera.getNumberOfCameras();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly DONE");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("cameraNumberCache", f511066b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly save cache done");
        } else if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "mCameraNumber == 0， happened error to get camera number and try again");
            f511066b = android.hardware.Camera.getNumberOfCameras();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "mCameraNumber == 0， happened error to get camera number and try again DONE");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("cameraNumberCache", f511066b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "mCameraNumber is " + f511066b);
        return f511066b;
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "makeCameraInfoCache");
        synchronized (this) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "before getCameraNumbers");
                int d17 = f511065a.d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "after getCameraNumbers");
                for (int i17 = 0; i17 < d17; i17++) {
                    android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                    android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                    android.util.ArrayMap arrayMap = f511071g;
                    arrayMap.put(java.lang.Integer.valueOf(i17), cameraInfo);
                    f511065a.f(i17, cameraInfo.facing, cameraInfo.orientation, cameraInfo.canDisableShutterSound);
                    boolean z17 = true;
                    if (f511072h == -1) {
                        android.hardware.Camera.CameraInfo cameraInfo2 = (android.hardware.Camera.CameraInfo) arrayMap.get(java.lang.Integer.valueOf(i17));
                        if (cameraInfo2 != null && cameraInfo2.facing == 0) {
                            f511072h = i17;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("PluginCamera_BackCameraId", i17);
                        }
                    }
                    if (f511073i == -1) {
                        android.hardware.Camera.CameraInfo cameraInfo3 = (android.hardware.Camera.CameraInfo) arrayMap.get(java.lang.Integer.valueOf(i17));
                        if (cameraInfo3 == null || cameraInfo3.facing != 1) {
                            z17 = false;
                        }
                        if (z17) {
                            f511073i = i17;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("PluginCamera_FrontCameraId", i17);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "makeCameraInfoCache, id = " + i17 + ", facint = " + cameraInfo.facing);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "makeCameraInfoCache mBackCameraId = " + f511072h + ", mFrontCameraId = " + f511073i);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "makeCameraInfoCache failed : " + th6.getMessage() + ", clear cameraInfoList");
                f511071g.clear();
            }
        }
    }

    public final void f(int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "saveCameraInfoToMMKVCache, id = " + i17 + ", orientation = " + i19 + ", canDisableShutterSound = " + z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PluginCamera_CameraInfo_facing_");
        sb6.append(i17);
        L.A(sb6.toString(), i18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("PluginCamera_CameraInfo_orientation_" + i17, i19);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("PluginCamera_CameraInfo_canDisableShutterSound_" + i17, z17);
    }

    public final void g(int i17, android.hardware.Camera.CameraInfo cameraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraInfo, "cameraInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "updateCameraInfoCache " + i17);
        f511071g.put(java.lang.Integer.valueOf(i17), cameraInfo);
    }
}

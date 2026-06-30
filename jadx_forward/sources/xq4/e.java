package xq4;

/* loaded from: classes14.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static yq4.c f537646a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f537647b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static int f537648c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f537649d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f537650e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f537651f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f537652g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f537653h;

    /* renamed from: i, reason: collision with root package name */
    public static int f537654i;

    public static boolean a() {
        boolean z17;
        if (!f537653h) {
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil", "find getNumberOfCameras failed: " + e17.getMessage());
            }
            if (java.lang.Class.forName("android.hardware.Camera").getDeclaredMethod("getNumberOfCameras", null) != null) {
                z17 = true;
                f537652g = z17;
                f537654i = uo.q.f511065a.d();
                f537653h = true;
            }
            z17 = false;
            f537652g = z17;
            f537654i = uo.q.f511065a.d();
            f537653h = true;
        }
        return f537652g;
    }

    public static void b(android.content.Context context) {
        if (f537646a != null) {
            return;
        }
        f537646a = new yq4.c("*", 15, 1, false, true, 0, 0, null, null);
        if (a() && !wo.v1.f529355b.f529190b) {
            c();
        } else if (a() && wo.v1.f529355b.f529190b) {
            c();
            d(context);
        } else {
            d(context);
        }
        wo.e eVar = wo.v1.f529355b;
        if (eVar.f529196h) {
            f537651f = eVar.f529195g;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "gCameraNum:" + f537646a.f546114b + "\ngIsHasFrontCamera:" + f537646a.f546115c + "\ngIsHasBackCamera:" + f537646a.f546116d + "\ngFrontCameraId:" + f537647b + "\ngBackCameraId:" + f537648c + "\ngBackOrientation:" + f537646a.f546118f + "\ngFrontOrientation:" + f537646a.f546117e + "\ngBestFps:" + f537646a.f546113a + "\ngFacePreviewSize:" + f537646a.f546119g + "\ngNonFacePreviewSize:" + f537646a.f546120h + "\ngFaceCameraIsRotate180:" + f537649d + "\ngMainCameraIsRotate180:" + f537650e + "\ngCameraFormat:" + f537651f + "\ngFaceNotRotate:SDK:" + android.os.Build.VERSION.SDK_INT + "\n");
    }

    public static void c() {
        boolean z17;
        int i17;
        int i18;
        f537646a.f546114b = f537654i;
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_voip_camera_info_use_cache_new", true) || o45.wf.f424566k) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "mCameraNumber = %d, useCache = %b", java.lang.Integer.valueOf(f537654i), java.lang.Boolean.valueOf(z17));
        final int i19 = 0;
        while (true) {
            try {
                if (i19 >= f537646a.f546114b) {
                    break;
                }
                if (z17) {
                    cameraInfo = uo.q.f511065a.c(i19);
                    i17 = cameraInfo.facing;
                    i18 = cameraInfo.orientation;
                    ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: xq4.e$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i27 = i19;
                            try {
                                android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
                                android.hardware.Camera.getCameraInfo(i27, cameraInfo2);
                                uo.q.f511065a.g(i27, cameraInfo2);
                            } catch (java.lang.Exception unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil", "error in get camera info");
                            }
                        }
                    }, "initDeviceFromAPI-checkCache");
                } else {
                    android.hardware.Camera.getCameraInfo(i19, cameraInfo);
                    i17 = cameraInfo.facing;
                    i18 = cameraInfo.orientation;
                }
                if (i17 == 1) {
                    if (f537647b != -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "device has other camera id %s in front", java.lang.Integer.valueOf(i19));
                        break;
                    }
                    f537647b = i19;
                    yq4.c cVar = f537646a;
                    cVar.f546117e = i18;
                    cVar.f546115c = true;
                } else if (i17 != 0) {
                    continue;
                } else {
                    if (f537648c != -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "device has other camera id %s in back", java.lang.Integer.valueOf(i19));
                        break;
                    }
                    f537648c = i19;
                    yq4.c cVar2 = f537646a;
                    cVar2.f546118f = i18;
                    cVar2.f546116d = true;
                }
                i19++;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil", "get camera info error: %s", e17.getMessage());
            }
        }
        java.lang.String property = java.lang.System.getProperty("ro.media.enc.camera.platform", null);
        boolean equalsIgnoreCase = property == null ? false : property.equalsIgnoreCase("Mediatek");
        yq4.c cVar3 = f537646a;
        int i27 = cVar3.f546117e;
        if (i27 == 270 || (equalsIgnoreCase && i27 == 0)) {
            f537649d = 1;
        } else {
            f537649d = 0;
        }
        int i28 = cVar3.f546118f;
        if (i28 == 270 || (equalsIgnoreCase && i28 == 0)) {
            f537650e = 1;
        } else {
            f537650e = 0;
        }
    }

    public static void d(android.content.Context context) {
        int i17;
        int i18;
        int i19;
        int i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "initDeviceFromServerConf");
        wo.e eVar = wo.v1.f529355b;
        if (eVar.f529190b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "initDeviceFromServerConf setCameraNum %d", java.lang.Integer.valueOf(eVar.f529189a));
            f537646a.f546114b = eVar.f529189a;
        }
        boolean z17 = eVar.f529200l;
        if (z17) {
            if (eVar.f529199k.f529176a != 0) {
                f537646a.f546116d = true;
            } else {
                f537646a.f546116d = false;
            }
        }
        boolean z18 = eVar.f529198j;
        if (z18) {
            if (eVar.f529197i.f529176a != 0) {
                f537646a.f546115c = true;
            } else {
                f537646a.f546115c = false;
            }
        }
        if (z18 && (i27 = eVar.f529197i.f529178c) >= 0) {
            f537646a.f546117e = i27;
            f537649d = i27;
        }
        if (z17 && (i19 = eVar.f529199k.f529178c) >= 0) {
            f537646a.f546118f = i19;
            f537650e = i19;
        }
        if (z18) {
            yq4.c cVar = f537646a;
            if (cVar.f546119g == null) {
                cVar.f546119g = new android.graphics.Point(0, 0);
            }
            yq4.c cVar2 = f537646a;
            wo.d dVar = eVar.f529197i;
            cVar2.f546119g = new android.graphics.Point(dVar.f529181f, dVar.f529182g);
        }
        if (eVar.f529200l) {
            yq4.c cVar3 = f537646a;
            if (cVar3.f546120h == null) {
                cVar3.f546120h = new android.graphics.Point(0, 0);
            }
            yq4.c cVar4 = f537646a;
            wo.d dVar2 = eVar.f529199k;
            cVar4.f546120h = new android.graphics.Point(dVar2.f529181f, dVar2.f529182g);
        }
        if (eVar.f529200l && (i18 = eVar.f529199k.f529177b) != 0) {
            f537646a.f546113a = i18;
        }
        if (eVar.f529198j && (i17 = eVar.f529197i.f529177b) != 0) {
            f537646a.f546113a = i17;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (eVar.f529190b || packageManager.hasSystemFeature("android.hardware.camera")) {
            return;
        }
        yq4.c cVar5 = f537646a;
        cVar5.f546114b = 0;
        cVar5.f546115c = false;
        cVar5.f546116d = false;
    }
}

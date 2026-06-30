package nr0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final nr0.a f420597a = new nr0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Integer[] f420598b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 f420599c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 f420600d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f420601e;

    static {
        f420598b = android.os.Build.VERSION.SDK_INT < 28 ? new java.lang.Integer[]{0, 1} : new java.lang.Integer[]{0, 1, 3, 4};
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.Camera.CameraKitUtil");
        f420601e = M;
        android.os.Parcelable s17 = M.s("key_front_support_info", com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498.class, new com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498(null, 0, 0, null, 15, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s17, "decodeParcelable(...)");
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 c10891x95c0498 = (com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498) s17;
        f420599c = c10891x95c0498;
        android.os.Parcelable s18 = M.s("key_back_support_info", com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498.class, new com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498(null, 0, 0, null, 15, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s18, "decodeParcelable(...)");
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 c10891x95c04982 = (com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498) s18;
        f420600d = c10891x95c04982;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitUtil", "init camera support info from mmkv, front info:" + c10891x95c0498 + "  back info:" + c10891x95c04982);
        if (!(c10891x95c04982.f150392g.length() == 0)) {
            if (!(c10891x95c0498.f150392g.length() == 0)) {
                return;
            }
        }
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("camera");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
        java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cameraIdList, "getCameraIdList(...)");
        for (java.lang.String str : cameraIdList) {
            try {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cameraCharacteristics, "getCameraCharacteristics(...)");
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 1) {
                    java.lang.Integer num2 = (java.lang.Integer) cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 c10891x95c04983 = f420600d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    c10891x95c04983.getClass();
                    c10891x95c04983.f150389d = str;
                    c10891x95c04983.f150390e = 1;
                    c10891x95c04983.f150391f = num2 != null ? num2.intValue() : -1;
                    java.lang.String b17 = f420597a.b(num2);
                    c10891x95c04983.getClass();
                    c10891x95c04983.f150392g = b17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitUtil", "back camera info id:" + str + " level:" + num2 + " str:" + f420599c.f150392g);
                } else {
                    java.lang.Integer num3 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                    if (num3 != null && num3.intValue() == 0) {
                        java.lang.Integer num4 = (java.lang.Integer) cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498 c10891x95c04984 = f420599c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        c10891x95c04984.getClass();
                        c10891x95c04984.f150389d = str;
                        c10891x95c04984.f150390e = 0;
                        c10891x95c04984.f150391f = num4 != null ? num4.intValue() : -1;
                        java.lang.String b18 = f420597a.b(num4);
                        c10891x95c04984.getClass();
                        c10891x95c04984.f150392g = b18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitUtil", "front camera info id:" + str + " level:" + num4 + " str:" + c10891x95c04984.f150392g);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Camera.CameraKitUtil", e17, "getCameraCharacteristics error!", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f420601e;
        o4Var.C("key_front_support_info", f420599c);
        o4Var.C("key_back_support_info", f420600d);
    }

    public final boolean a() {
        boolean G = kz5.z.G(f420598b, java.lang.Integer.valueOf(f420600d.f150391f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitUtil", "enableCamerax :" + G);
        return G;
    }

    public final java.lang.String b(java.lang.Integer num) {
        return (num != null && num.intValue() == 0) ? "LIMITED" : (num != null && num.intValue() == 1) ? "FULL" : (num != null && num.intValue() == 2) ? "LEGACY" : (num != null && num.intValue() == 3) ? "LEVEL_3" : (num != null && num.intValue() == 4) ? "EXTERNAL" : "UNKNOW";
    }
}

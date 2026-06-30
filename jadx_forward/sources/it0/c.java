package it0;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f376019a;

    /* renamed from: b, reason: collision with root package name */
    public static int f376020b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f376021c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f376022d;

    static {
        int[] iArr;
        if (wo.v1.f529362i.f529239t != 1) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            iArr = new int[]{2, 1, 3, 8, 10, 12};
        } else {
            iArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        }
        f376019a = iArr;
        f376020b = 2;
        f376021c = true;
        f376022d = true;
        ((ku5.t0) ku5.t0.f394148d).g(it0.b.f376018d);
    }

    public static final boolean a() {
        int i17 = f376020b;
        if (i17 <= 1) {
            return false;
        }
        boolean z17 = false;
        boolean z18 = false;
        for (int i18 = 0; i18 < i17; i18++) {
            try {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(i18, cameraInfo);
                int i19 = cameraInfo.facing;
                if (i19 == 1) {
                    z17 = true;
                }
                if (i19 == 0) {
                    z18 = true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraHelper", e17, " error", new java.lang.Object[0]);
                return true;
            }
        }
        return z17 && z18;
    }

    public static final boolean b() {
        boolean z17;
        int i17;
        wo.g1 g1Var = wo.v1.f529362i;
        if (g1Var == null || (i17 = g1Var.f529237r) == -1) {
            z17 = false;
        } else {
            z17 = true;
            if (i17 != 3) {
                return i17 == 1;
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_camera_api_val, 2) != 2 || !z17 || fp.h.a(21)) {
            return false;
        }
        if (fp.e0.f346716g == null) {
            fp.e0.f346716g = fp.e0.f346710a.contains("hmd global") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        if (fp.e0.f346716g.booleanValue()) {
            return false;
        }
        if (fp.e0.f346717h == null) {
            fp.e0.f346717h = fp.e0.f346710a.contains("smartisan") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        if (fp.e0.f346717h.booleanValue()) {
            return false;
        }
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("camera");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
        try {
            cameraManager.getCameraCharacteristics(cameraManager.getCameraIdList()[0]);
            java.lang.Object obj = cameraManager.getCameraCharacteristics("0").get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            int intValue = ((java.lang.Number) obj).intValue();
            if (intValue == 0 || intValue == 2) {
                return false;
            }
            return z17;
        } catch (java.lang.AssertionError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraHelper", "some device has some problem in LegecyCamera ");
            return false;
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraHelper", "a camera access exception happend");
            return false;
        }
    }

    public static final boolean c() {
        int i17;
        wo.g1 g1Var = wo.v1.f529362i;
        return (g1Var == null || (i17 = g1Var.f529241v) == -1) ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_camera2_test_image_switch, false) : i17 == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r26.n0.B(r0, java.lang.String.valueOf(r5), false) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(java.lang.Integer r5) {
        /*
            bm5.o1 r0 = bm5.o1.f104252a
            bm5.h0 r1 = bm5.h0.RepairerConfig_Global_UseCamera2_Int
            r2 = 0
            int r0 = r0.g(r1, r2)
            r1 = 1
            if (r0 != r1) goto Ld
            return r1
        Ld:
            if (r5 == 0) goto L4d
            int r5 = r5.intValue()
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r3 = e42.d0.clicfg_camera_use_camera2_scene
            h62.d r0 = (h62.d) r0
            java.lang.String r4 = ""
            java.lang.String r0 = r0.Zi(r3, r4, r1)
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4)
            if (r3 == 0) goto L32
            int[] r0 = it0.c.f376019a
            boolean r1 = kz5.z.F(r0, r5)
            goto L47
        L32:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r3 != 0) goto L46
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = r26.n0.B(r0, r5, r2)
            if (r5 == 0) goto L46
            goto L47
        L46:
            r1 = r2
        L47:
            if (r1 == 0) goto L4d
            boolean r2 = b()
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.c.d(java.lang.Integer):boolean");
    }

    public static final boolean e(int i17) {
        int i18;
        wo.g1 g1Var = wo.v1.f529362i;
        boolean z17 = true;
        if (!((g1Var == null || g1Var.f529238s == -1 || ((i18 = g1Var.f529237r) != 3 && i18 != 1)) ? false : true)) {
            return false;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_camera2_recordstream_support_scene, "", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            if (r26.n0.B(Zi, java.lang.String.valueOf(i17), false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraHelper", "the scene = " + i17 + " is support record stream ");
                return z17;
            }
        }
        z17 = false;
        return z17;
    }
}

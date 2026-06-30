package qr0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f447589b = true;

    /* renamed from: a, reason: collision with root package name */
    public static final qr0.a f447588a = new qr0.a();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f447590c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_camerakit_report, false);

    public final int a() {
        int i17;
        boolean z17 = false;
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Camerax_Picture_Int, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        if (intValue == 0) {
            i17 = 1;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_camerakit_picture, 1);
            if (1 <= Ni && Ni < 3) {
                z17 = true;
            }
            if (z17) {
                i17 = Ni;
            }
        } else {
            i17 = intValue;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitConfig", "chooseCameraxPictureType local:" + intValue + " value:" + i17);
        return i17;
    }

    public final int b() {
        int i17 = 1;
        if (!nr0.a.f420597a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitConfig", "getCameraInstance value:CAMERA_INSTANCE_1");
            return 1;
        }
        boolean z17 = false;
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Camera_Instance_Int, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        if (intValue == 0) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_camerakit_instance_new, 1);
            if (1 <= Ni && Ni < 4) {
                z17 = true;
            }
            if (z17) {
                i17 = Ni;
            }
        } else {
            i17 = intValue;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitConfig", "getCameraInstance value:" + i17 + " local:" + intValue);
        return i17;
    }

    public final boolean c() {
        boolean z17 = false;
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Camera_Performance_Int, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        if (intValue == 0) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_camerakit_performance, false);
        } else if (intValue != 1) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitConfig", "performanceMode:" + z17);
        return z17;
    }

    public final boolean d(boolean z17) {
        if (z17) {
            return true;
        }
        int i17 = 0;
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Camera1_Preview_Int, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_camerakit_preview, 0);
                r0 = Ni != 1 ? Ni != 2 ? f447589b : false : true;
                i17 = Ni;
            } else {
                r0 = false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitConfig", "choose texturePreview local:" + intValue + " choose:" + i17 + " texturePreview:" + f447589b + " value:" + r0);
        return r0;
    }
}

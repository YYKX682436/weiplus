package ts0;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ts0.d f503083a = new ts0.d();

    /* renamed from: b, reason: collision with root package name */
    public static int f503084b;

    public final boolean a() {
        if (!kz5.c0.i(1, 2).contains(java.lang.Integer.valueOf(f503084b))) {
            return false;
        }
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Media_CaptureCropCameraTexture_Int, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraTextureRenderConfig", "isEnableCropCameraTexture, repairerConfig:" + b17 + ", cpuCrop:" + ts0.c.f503082i);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 0)) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_capture_crop_camera_texture, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraTextureRenderConfig", "isEnableCropCameraTexture, exptConfig:" + Ni);
            if (Ni == 1 && !ts0.c.f503082i) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 1) && !ts0.c.f503082i) {
            return true;
        }
        return false;
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.FovUtil */
/* loaded from: classes14.dex */
public class C0249x3b055a4f {
    private static final java.lang.String TAG = "FovUtil";

    private C0249x3b055a4f() {
    }

    /* renamed from: focalLengthToViewAngleDegrees */
    public static int m3462x911063bf(float f17, float f18) {
        m3.h.b(f17 > 0.0f, "Focal length should be positive.");
        m3.h.b(f18 > 0.0f, "Sensor length should be positive.");
        int degrees = (int) java.lang.Math.toDegrees(java.lang.Math.atan(f18 / (f17 * 2.0f)) * 2.0d);
        m3.h.c(degrees, 0, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    /* renamed from: getDefaultFocalLength */
    public static float m3463x1f7fcaa0(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        float[] fArr = (float[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        m3.h.d(fArr, "The focal lengths can not be empty.");
        return fArr[0];
    }

    /* renamed from: getDeviceDefaultViewAngleDegrees */
    public static int m3464x35fc9f8e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a, int i17) {
        try {
            for (java.lang.String str : c0332x1ad8324a.m3758x174bbe54()) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3757xc2a5207f = c0332x1ad8324a.m3757xc2a5207f(str);
                java.lang.Integer num = (java.lang.Integer) m3757xc2a5207f.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                m3.h.d(num, "Lens facing can not be null");
                if (num.intValue() == p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0252xf2a95aba.m3481x327b82a1(i17)) {
                    return m3462x911063bf(m3463x1f7fcaa0(m3757xc2a5207f), m3465x472862fa(m3757xc2a5207f));
                }
            }
            throw new java.lang.IllegalArgumentException("Unable to get the default focal length with the specified lens facing.");
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 unused) {
            throw new java.lang.IllegalArgumentException("Unable to get the default focal length.");
        }
    }

    /* renamed from: getSensorHorizontalLength */
    public static float m3465x472862fa(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        android.util.SizeF sizeF = (android.util.SizeF) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        android.graphics.Rect rect = (android.graphics.Rect) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        android.util.Size size = (android.util.Size) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        java.lang.Integer num = (java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
        m3.h.d(sizeF, "The sensor size can't be null.");
        m3.h.d(num, "The sensor orientation can't be null.");
        m3.h.d(rect, "The active array size can't be null.");
        m3.h.d(size, "The pixel array size can't be null.");
        android.util.Size m5960x1b5f820 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5960x1b5f820(rect);
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5956x99b544a7(num.intValue())) {
            sizeF = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5964xfaff5aa3(sizeF);
            m5960x1b5f820 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5963x5aad6603(m5960x1b5f820);
            size = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5963x5aad6603(size);
        }
        return (sizeF.getWidth() * m5960x1b5f820.getWidth()) / size.getWidth();
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk */
/* loaded from: classes14.dex */
public class C0358x137c66a1 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {
    /* renamed from: load */
    public static boolean m3919x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        java.lang.Integer num = (java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null) {
            return false;
        }
        num.intValue();
        return false;
    }

    /* renamed from: getCorrectedAspectRatio */
    public int m3920xb95ca4c0() {
        return 2;
    }
}

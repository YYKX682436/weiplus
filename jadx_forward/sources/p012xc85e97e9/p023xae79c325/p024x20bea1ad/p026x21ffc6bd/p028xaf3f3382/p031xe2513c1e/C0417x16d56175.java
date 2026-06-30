package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus */
/* loaded from: classes14.dex */
public class C0417x16d56175 {
    /* renamed from: toggleHDRPlus */
    public void m4082x7d1f5bbc(int i17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        if (((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0383x38b27749) p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0383x38b27749.class)) == null) {
            return;
        }
        if (i17 == 0) {
            builder.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL, java.lang.Boolean.TRUE);
        } else {
            if (i17 != 1) {
                return;
            }
            builder.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL, java.lang.Boolean.FALSE);
        }
    }
}

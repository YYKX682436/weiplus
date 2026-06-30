package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk */
/* loaded from: classes14.dex */
public class C0360x35ff0b63 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {
    private static final java.lang.String TAG = "CamcorderProfileResolutionQuirk";

    /* renamed from: mStreamConfigurationMapCompat */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68 f697xee9fea55;

    /* renamed from: mSupportedResolutions */
    private java.util.List<android.util.Size> f698xdc1d13c6 = null;

    public C0360x35ff0b63(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        this.f697xee9fea55 = c0322x11ef9595.m3734xbd9771be();
    }

    /* renamed from: load */
    public static boolean m3922x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        java.lang.Integer num = (java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: getSupportedResolutions */
    public java.util.List<android.util.Size> m3923x2103142f() {
        if (this.f698xdc1d13c6 == null) {
            android.util.Size[] m3784xa804d6db = this.f697xee9fea55.m3784xa804d6db(34);
            this.f698xdc1d13c6 = m3784xa804d6db != null ? java.util.Arrays.asList((android.util.Size[]) m3784xa804d6db.clone()) : java.util.Collections.emptyList();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "mSupportedResolutions = " + this.f698xdc1d13c6);
        }
        return new java.util.ArrayList(this.f698xdc1d13c6);
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler */
/* loaded from: classes13.dex */
public class C0409x88444532 {

    /* renamed from: mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled */
    private final boolean f732xdd2b0f41;

    /* renamed from: mIsImageCaptureFailWithAutoFlashQuirkEnabled */
    private final boolean f733x90fd2abe;

    public C0409x88444532(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f733x90fd2abe = c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0379xb0535a4c.class);
        this.f732xdd2b0f41 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0369x78af6be9.class) != null;
    }

    /* renamed from: getCorrectedAeMode */
    public int m4072xb6e33d9a(int i17) {
        if ((this.f733x90fd2abe || this.f732xdd2b0f41) && i17 == 2) {
            return 1;
        }
        return i17;
    }
}

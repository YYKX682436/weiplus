package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture */
/* loaded from: classes14.dex */
public class C0421x6a050c74 {

    /* renamed from: mAePrecaptureStarted */
    private boolean f746xa91cde4d = false;

    /* renamed from: mHasAutoFlashUnderExposedQuirk */
    private final boolean f747xa31f18c2;

    public C0421x6a050c74(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f747xa31f18c2 = c0744x90dabc95.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0359xbc837015.class) != null;
    }

    /* renamed from: onAePrecaptureFinished */
    public void m4091x646fbc98() {
        this.f746xa91cde4d = false;
    }

    /* renamed from: onAePrecaptureStarted */
    public void m4092x711279b() {
        this.f746xa91cde4d = true;
    }

    /* renamed from: shouldSetAeModeAlwaysFlash */
    public boolean m4093x43f4decb(int i17) {
        return this.f746xa91cde4d && i17 == 0 && this.f747xa31f18c2;
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.AeFpsRange */
/* loaded from: classes14.dex */
public class C0408xdae04e38 {

    /* renamed from: mAeTargetFpsRange */
    private final android.util.Range<java.lang.Integer> f731xc8afae56;

    public C0408xdae04e38(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0356x4948001d c0356x4948001d = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0356x4948001d) c0744x90dabc95.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0356x4948001d.class);
        if (c0356x4948001d == null) {
            this.f731xc8afae56 = null;
        } else {
            this.f731xc8afae56 = c0356x4948001d.m3917x7511df87();
        }
    }

    /* renamed from: addAeFpsRangeOptions */
    public void m4071x7aa99ec5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        android.util.Range<java.lang.Integer> range = this.f731xc8afae56;
        if (range != null) {
            builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.REQUIRED);
        }
    }
}

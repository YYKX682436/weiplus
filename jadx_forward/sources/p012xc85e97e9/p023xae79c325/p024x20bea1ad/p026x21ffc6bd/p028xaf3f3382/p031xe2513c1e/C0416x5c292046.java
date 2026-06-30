package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface */
/* loaded from: classes14.dex */
public class C0416x5c292046 {

    /* renamed from: mHasConfigureSurfaceToSecondarySessionFailQuirk */
    private final boolean f738xc2d1040f;

    /* renamed from: mHasPreviewOrientationIncorrectQuirk */
    private final boolean f739x64f3992e;

    /* renamed from: mHasTextureViewIsClosedQuirk */
    private final boolean f740x87d817b5;

    public C0416x5c292046(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc952) {
        this.f740x87d817b5 = c0744x90dabc952.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0402xcb0027c8.class);
        this.f739x64f3992e = c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0395x481fe641.class);
        this.f738xc2d1040f = c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0368x6d11dd1c.class);
    }

    /* renamed from: onSessionEnd */
    public void m4080x2a2adda4(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        if (!m4081xac4a2be0() || list == null) {
            return;
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo5401x5a5ddf8();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    /* renamed from: shouldForceClose */
    public boolean m4081xac4a2be0() {
        return this.f740x87d817b5 || this.f739x64f3992e || this.f738xc2d1040f;
    }
}

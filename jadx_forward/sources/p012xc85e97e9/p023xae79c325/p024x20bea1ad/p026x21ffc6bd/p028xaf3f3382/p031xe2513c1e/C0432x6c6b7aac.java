package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride */
/* loaded from: classes13.dex */
public class C0432x6c6b7aac {

    /* renamed from: mWorkaroundByCaptureIntentPreview */
    private final boolean f763xf6796528;

    /* renamed from: mWorkaroundByCaptureIntentStillCapture */
    private final boolean f764x241d2b1e;

    public C0432x6c6b7aac(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f763xf6796528 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0363xc472cf58.m3926x67a6549b(c0744x90dabc95);
        this.f764x241d2b1e = c0744x90dabc95.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0380x45e87f80.class);
    }

    /* renamed from: getOverrideParams */
    public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> m4111xbeb5c568(int i17) {
        if (i17 == 3 && this.f763xf6796528) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return java.util.Collections.unmodifiableMap(hashMap);
        }
        if (i17 != 4 || !this.f764x241d2b1e) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return java.util.Collections.unmodifiableMap(hashMap2);
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow */
/* loaded from: classes14.dex */
public class C0429xc9011aec {

    /* renamed from: mShouldStopRepeatingBeforeStillCapture */
    private final boolean f755x22d20862;

    public C0429xc9011aec() {
        this.f755x22d20862 = ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0400x636939cb) p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0400x636939cb.class)) != null;
    }

    /* renamed from: shouldStopRepeatingBeforeCapture */
    public boolean m4108xee4c2055(java.util.List<android.hardware.camera2.CaptureRequest> list, boolean z17) {
        if (this.f755x22d20862 && z17) {
            java.util.Iterator<android.hardware.camera2.CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next().get(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}

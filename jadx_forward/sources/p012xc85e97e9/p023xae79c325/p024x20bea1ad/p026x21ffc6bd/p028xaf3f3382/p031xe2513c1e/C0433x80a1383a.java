package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.TorchStateReset */
/* loaded from: classes14.dex */
public class C0433x80a1383a {

    /* renamed from: mIsImageCaptureTorchIsClosedQuirkEnabled */
    private final boolean f765xa91952b3;

    public C0433x80a1383a() {
        this.f765xa91952b3 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0404x8c192b0c.class) != null;
    }

    /* renamed from: createTorchResetRequest */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m4112xc388eac0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
        builder.m5366x5d0f9056(c0690x88f65a08.m5337x26c6954a());
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = c0690x88f65a08.m5335x1b8de6dc().iterator();
        while (it.hasNext()) {
            builder.m5348x34744cc(it.next());
        }
        builder.m5347x2f697c6b(c0690x88f65a08.m5333xca0018d6());
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.FLASH_MODE, 0);
        builder.m5347x2f697c6b(builder2.mo2888x59bc66e());
        return builder.m5350x59bc66e();
    }

    /* renamed from: isTorchResetRequired */
    public boolean m4113xa18b363c(java.util.List<android.hardware.camera2.CaptureRequest> list, boolean z17) {
        if (!this.f765xa91952b3 || !z17) {
            return false;
        }
        java.util.Iterator<android.hardware.camera2.CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next().get(android.hardware.camera2.CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CaptureCallbackConverter */
/* loaded from: classes14.dex */
final class C0215xb27a5855 {
    private C0215xb27a5855() {
    }

    /* renamed from: toCaptureCallback */
    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback m3320x985029b0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        if (abstractC0659xd0769ba6 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m3321x985029b0(abstractC0659xd0769ba6, arrayList);
        if (arrayList.size() == 1) {
            return (android.hardware.camera2.CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0163x5be7d3d5.m3197x20225057(arrayList);
    }

    /* renamed from: toCaptureCallback */
    public static void m3321x985029b0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
        if (abstractC0659xd0769ba6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0660x3e5cd98d.ComboCameraCaptureCallback) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0660x3e5cd98d.ComboCameraCaptureCallback) abstractC0659xd0769ba6).m5221xc1355a18().iterator();
            while (it.hasNext()) {
                m3321x985029b0(it.next(), list);
            }
        } else if (abstractC0659xd0769ba6 instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0214xaed41b36) {
            list.add(((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0214xaed41b36) abstractC0659xd0769ba6).m3319x5ce77775());
        } else {
            list.add(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0213xab1d9b44(abstractC0659xd0769ba6));
        }
    }
}

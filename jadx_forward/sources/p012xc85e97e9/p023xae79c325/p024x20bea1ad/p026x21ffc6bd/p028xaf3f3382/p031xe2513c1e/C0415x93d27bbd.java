package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession */
/* loaded from: classes14.dex */
public class C0415x93d27bbd {

    /* renamed from: mCaptureSessionOnClosedNotCalledQuirk */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0365x6200c329 f737xc075d116;

    @java.lang.FunctionalInterface
    /* renamed from: androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession$OnConfigured */
    /* loaded from: classes14.dex */
    public interface OnConfigured {
        void run(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4);
    }

    public C0415x93d27bbd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f737xc075d116 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0365x6200c329) c0744x90dabc95.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0365x6200c329.class);
    }

    /* renamed from: forceOnClosed */
    private void m4076xe55e8c36(java.util.Set<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> set) {
        for (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4 : set) {
            interfaceC0264x1b7732c4.mo3596xf33fe440().mo3612x3e0ab82b(interfaceC0264x1b7732c4);
        }
    }

    /* renamed from: forceOnConfigureFailed */
    private void m4077xda9a7739(java.util.Set<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> set) {
        for (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4 : set) {
            interfaceC0264x1b7732c4.mo3596xf33fe440().mo3355xa3b7eee4(interfaceC0264x1b7732c4);
        }
    }

    /* renamed from: onSessionConfigured */
    public void m4078x69db6155(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> list, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> list2, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0415x93d27bbd.OnConfigured onConfigured) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 next;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 next2;
        if (m4079xac4a2be0()) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != interfaceC0264x1b7732c4) {
                linkedHashSet.add(next2);
            }
            m4077xda9a7739(linkedHashSet);
        }
        onConfigured.run(interfaceC0264x1b7732c4);
        if (m4079xac4a2be0()) {
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4> it6 = list2.iterator();
            while (it6.hasNext() && (next = it6.next()) != interfaceC0264x1b7732c4) {
                linkedHashSet2.add(next);
            }
            m4076xe55e8c36(linkedHashSet2);
        }
    }

    /* renamed from: shouldForceClose */
    public boolean m4079xac4a2be0() {
        return this.f737xc075d116 != null;
    }
}

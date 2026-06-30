package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector */
/* loaded from: classes13.dex */
public class C0420x9318adc {
    private static final java.lang.String TAG = "OutputSizesCorrector";

    /* renamed from: mCameraId */
    private final java.lang.String f743x1c133ead;

    /* renamed from: mExcludedSupportedSizesContainer */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0412x59d6b713 f744x5661e906;

    /* renamed from: mExtraSupportedOutputSizeQuirk */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0375xa052f1be f745xe9d80471 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0375xa052f1be) p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0375xa052f1be.class);

    public C0420x9318adc(java.lang.String str) {
        this.f743x1c133ead = str;
        this.f744x5661e906 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0412x59d6b713(str);
    }

    /* renamed from: addExtraSupportedOutputSizesByClass */
    private void m4085x6fe3d1ef(java.util.List<android.util.Size> list, java.lang.Class<?> cls) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0375xa052f1be c0375xa052f1be = this.f745xe9d80471;
        if (c0375xa052f1be == null) {
            return;
        }
        android.util.Size[] m3964xe4471533 = c0375xa052f1be.m3964xe4471533(cls);
        if (m3964xe4471533.length > 0) {
            list.addAll(java.util.Arrays.asList(m3964xe4471533));
        }
    }

    /* renamed from: addExtraSupportedOutputSizesByFormat */
    private void m4086x91e6de60(java.util.List<android.util.Size> list, int i17) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0375xa052f1be c0375xa052f1be = this.f745xe9d80471;
        if (c0375xa052f1be == null) {
            return;
        }
        android.util.Size[] m3963xe4471533 = c0375xa052f1be.m3963xe4471533(i17);
        if (m3963xe4471533.length > 0) {
            list.addAll(java.util.Arrays.asList(m3963xe4471533));
        }
    }

    /* renamed from: excludeProblematicOutputSizesByClass */
    private void m4087x24728322(java.util.List<android.util.Size> list, java.lang.Class<?> cls) {
        java.util.List<android.util.Size> list2 = this.f744x5661e906.get(cls);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    /* renamed from: excludeProblematicOutputSizesByFormat */
    private void m4088x6f2e538d(java.util.List<android.util.Size> list, int i17) {
        java.util.List<android.util.Size> list2 = this.f744x5661e906.get(i17);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    /* renamed from: applyQuirks */
    public android.util.Size[] m4089x8d657583(android.util.Size[] sizeArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(sizeArr));
        m4086x91e6de60(arrayList, i17);
        m4088x6f2e538d(arrayList, i17);
        if (arrayList.isEmpty()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
    }

    /* renamed from: applyQuirks */
    public <T> android.util.Size[] m4090x8d657583(android.util.Size[] sizeArr, java.lang.Class<T> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(sizeArr));
        m4085x6fe3d1ef(arrayList, cls);
        m4087x24728322(arrayList, cls);
        if (arrayList.isEmpty()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector */
/* loaded from: classes13.dex */
public class C0427x8ce9b461 {

    /* renamed from: mExtraCroppingQuirk */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc f753x5caf05f9;

    public C0427x8ce9b461() {
        this((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc) p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc.class));
    }

    /* renamed from: insertOrPrioritize */
    public java.util.List<android.util.Size> m4106x17d9675b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType, java.util.List<android.util.Size> list) {
        android.util.Size m3958xeb8dfb8a;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc c0374xcb2366cc = this.f753x5caf05f9;
        if (c0374xcb2366cc == null || (m3958xeb8dfb8a = c0374xcb2366cc.m3958xeb8dfb8a(configType)) == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m3958xeb8dfb8a);
        for (android.util.Size size : list) {
            if (!size.equals(m3958xeb8dfb8a)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public C0427x8ce9b461(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc c0374xcb2366cc) {
        this.f753x5caf05f9 = c0374xcb2366cc;
    }
}

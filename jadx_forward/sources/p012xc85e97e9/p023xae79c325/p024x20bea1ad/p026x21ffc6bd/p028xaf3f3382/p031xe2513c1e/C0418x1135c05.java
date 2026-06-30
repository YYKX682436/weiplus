package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize */
/* loaded from: classes13.dex */
public class C0418x1135c05 {

    /* renamed from: mExtraCroppingQuirk */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc f741x5caf05f9;

    public C0418x1135c05() {
        this((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc) p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc.class));
    }

    /* renamed from: getMaxPreviewResolution */
    public android.util.Size m4083xc2116a06(android.util.Size size) {
        android.util.Size m3958xeb8dfb8a;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc c0374xcb2366cc = this.f741x5caf05f9;
        if (c0374xcb2366cc == null || (m3958xeb8dfb8a = c0374xcb2366cc.m3958xeb8dfb8a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV)) == null) {
            return size;
        }
        return m3958xeb8dfb8a.getWidth() * m3958xeb8dfb8a.getHeight() > size.getWidth() * size.getHeight() ? m3958xeb8dfb8a : size;
    }

    public C0418x1135c05(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc c0374xcb2366cc) {
        this.f741x5caf05f9 = c0374xcb2366cc;
    }
}

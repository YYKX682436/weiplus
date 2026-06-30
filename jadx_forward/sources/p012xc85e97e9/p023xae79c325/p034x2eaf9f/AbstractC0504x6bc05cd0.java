package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ForwardingImageProxy */
/* loaded from: classes14.dex */
public abstract class AbstractC0504x6bc05cd0 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 {

    /* renamed from: mImage */
    protected final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 f971xbe37f4ee;

    /* renamed from: mLock */
    private final java.lang.Object f972x6243b38 = new java.lang.Object();

    /* renamed from: mOnImageCloseListeners */
    private final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener> f973x53dce296 = new java.util.HashSet();

    /* renamed from: androidx.camera.core.ForwardingImageProxy$OnImageCloseListener */
    /* loaded from: classes14.dex */
    public interface OnImageCloseListener {
        /* renamed from: onImageClose */
        void mo4407x6f90449c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3);
    }

    public AbstractC0504x6bc05cd0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        this.f971xbe37f4ee = interfaceC0536x1ffeadf3;
    }

    /* renamed from: addOnImageCloseListener */
    public void m4405x5b6423b1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener onImageCloseListener) {
        synchronized (this.f972x6243b38) {
            this.f973x53dce296.add(onImageCloseListener);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3, java.lang.AutoCloseable
    public void close() {
        this.f971xbe37f4ee.close();
        m4406xe27b6d3a();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getCropRect */
    public android.graphics.Rect mo4169xfa2ffe0a() {
        return this.f971xbe37f4ee.mo4169xfa2ffe0a();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getFormat */
    public int mo4170x19771aed() {
        return this.f971xbe37f4ee.mo4170x19771aed();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getHeight */
    public int mo4171x1c4fb41d() {
        return this.f971xbe37f4ee.mo4171x1c4fb41d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getImage */
    public android.media.Image mo4172x74984fa5() {
        return this.f971xbe37f4ee.mo4172x74984fa5();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getImageInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 mo4173xcb10cdf3() {
        return this.f971xbe37f4ee.mo4173xcb10cdf3();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getPlanes */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3.PlaneProxy[] mo4174x2a55948d() {
        return this.f971xbe37f4ee.mo4174x2a55948d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getWidth */
    public int mo4175x755bd410() {
        return this.f971xbe37f4ee.mo4175x755bd410();
    }

    /* renamed from: notifyOnImageCloseListeners */
    public void m4406xe27b6d3a() {
        java.util.HashSet hashSet;
        synchronized (this.f972x6243b38) {
            hashSet = new java.util.HashSet(this.f973x53dce296);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener) it.next()).mo4407x6f90449c(this);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: setCropRect */
    public void mo4176xf4e85f16(android.graphics.Rect rect) {
        this.f971xbe37f4ee.mo4176xf4e85f16(rect);
    }
}

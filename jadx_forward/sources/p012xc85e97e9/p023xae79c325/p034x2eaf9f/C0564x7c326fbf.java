package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.SettableImageProxy */
/* loaded from: classes14.dex */
public final class C0564x7c326fbf extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0 {

    /* renamed from: mCropRect */
    private android.graphics.Rect f1209xa3536821;

    /* renamed from: mHeight */
    private final int f1210x6a4b7f4;

    /* renamed from: mImageInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 f1211x465aa6bc;

    /* renamed from: mLock */
    private final java.lang.Object f1212x6243b38;

    /* renamed from: mWidth */
    private final int f1213xbefb7959;

    public C0564x7c326fbf(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 interfaceC0531x43157c89) {
        this(interfaceC0536x1ffeadf3, null, interfaceC0531x43157c89);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getCropRect */
    public android.graphics.Rect mo4169xfa2ffe0a() {
        synchronized (this.f1212x6243b38) {
            if (this.f1209xa3536821 == null) {
                return new android.graphics.Rect(0, 0, mo4175x755bd410(), mo4171x1c4fb41d());
            }
            return new android.graphics.Rect(this.f1209xa3536821);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getHeight */
    public int mo4171x1c4fb41d() {
        return this.f1210x6a4b7f4;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getImageInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 mo4173xcb10cdf3() {
        return this.f1211x465aa6bc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: getWidth */
    public int mo4175x755bd410() {
        return this.f1213xbefb7959;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3
    /* renamed from: setCropRect */
    public void mo4176xf4e85f16(android.graphics.Rect rect) {
        if (rect != null) {
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            if (!rect2.intersect(0, 0, mo4175x755bd410(), mo4171x1c4fb41d())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f1212x6243b38) {
            this.f1209xa3536821 = rect;
        }
    }

    public C0564x7c326fbf(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 interfaceC0531x43157c89) {
        super(interfaceC0536x1ffeadf3);
        this.f1212x6243b38 = new java.lang.Object();
        if (size == null) {
            this.f1213xbefb7959 = super.mo4175x755bd410();
            this.f1210x6a4b7f4 = super.mo4171x1c4fb41d();
        } else {
            this.f1213xbefb7959 = size.getWidth();
            this.f1210x6a4b7f4 = size.getHeight();
        }
        this.f1211x465aa6bc = interfaceC0531x43157c89;
    }
}

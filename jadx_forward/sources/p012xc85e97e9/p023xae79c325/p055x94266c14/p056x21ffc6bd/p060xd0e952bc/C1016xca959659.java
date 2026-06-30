package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.AutoValue_MultiResolutionImageReaderOutputConfig */
/* loaded from: classes14.dex */
final class C1016xca959659 extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c {

    /* renamed from: id, reason: collision with root package name */
    private final int f91890id;

    /* renamed from: imageFormat */
    private final int f2499x6b33dd32;

    /* renamed from: maxImages */
    private final int f2500xcc2078fc;

    /* renamed from: physicalCameraId */
    private final java.lang.String f2501xeb951517;

    /* renamed from: surfaceGroupId */
    private final int f2502x8f95da8d;

    /* renamed from: surfaceSharingOutputConfigs */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> f2503xef47fe01;

    public C1016xca959659(int i17, int i18, java.lang.String str, java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> list, int i19, int i27) {
        this.f91890id = i17;
        this.f2502x8f95da8d = i18;
        this.f2501xeb951517 = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f2503xef47fe01 = list;
        this.f2499x6b33dd32 = i19;
        this.f2500xcc2078fc = i27;
    }

    /* renamed from: equals */
    public boolean m6794xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c abstractC1029xa426485c = (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c) obj;
        return this.f91890id == abstractC1029xa426485c.mo6785x5db1b11() && this.f2502x8f95da8d == abstractC1029xa426485c.mo6790x7e2da783() && ((str = this.f2501xeb951517) != null ? str.equals(abstractC1029xa426485c.mo6788x936d7c8d()) : abstractC1029xa426485c.mo6788x936d7c8d() == null) && this.f2503xef47fe01.equals(abstractC1029xa426485c.mo6791x75db70cb()) && this.f2499x6b33dd32 == abstractC1029xa426485c.mo6795x450a23fc() && this.f2500xcc2078fc == abstractC1029xa426485c.mo6796xcb8dea46();
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getId */
    public int mo6785x5db1b11() {
        return this.f91890id;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c
    /* renamed from: getImageFormat */
    public int mo6795x450a23fc() {
        return this.f2499x6b33dd32;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c
    /* renamed from: getMaxImages */
    public int mo6796xcb8dea46() {
        return this.f2500xcc2078fc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo6788x936d7c8d() {
        return this.f2501xeb951517;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getSurfaceGroupId */
    public int mo6790x7e2da783() {
        return this.f2502x8f95da8d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getSurfaceSharingOutputConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> mo6791x75db70cb() {
        return this.f2503xef47fe01;
    }

    /* renamed from: hashCode */
    public int m6797x8cdac1b() {
        int i17 = (((this.f91890id ^ 1000003) * 1000003) ^ this.f2502x8f95da8d) * 1000003;
        java.lang.String str = this.f2501xeb951517;
        return ((((((i17 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2503xef47fe01.hashCode()) * 1000003) ^ this.f2499x6b33dd32) * 1000003) ^ this.f2500xcc2078fc;
    }

    /* renamed from: toString */
    public java.lang.String m6798x9616526c() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f91890id + ", surfaceGroupId=" + this.f2502x8f95da8d + ", physicalCameraId=" + this.f2501xeb951517 + ", surfaceSharingOutputConfigs=" + this.f2503xef47fe01 + ", imageFormat=" + this.f2499x6b33dd32 + ", maxImages=" + this.f2500xcc2078fc + "}";
    }
}

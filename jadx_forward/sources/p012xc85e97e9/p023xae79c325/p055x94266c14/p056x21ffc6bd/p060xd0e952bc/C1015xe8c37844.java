package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.AutoValue_ImageReaderOutputConfig */
/* loaded from: classes14.dex */
final class C1015xe8c37844 extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1 {

    /* renamed from: id, reason: collision with root package name */
    private final int f91889id;

    /* renamed from: imageFormat */
    private final int f2493x6b33dd32;

    /* renamed from: maxImages */
    private final int f2494xcc2078fc;

    /* renamed from: physicalCameraId */
    private final java.lang.String f2495xeb951517;

    /* renamed from: size */
    private final android.util.Size f2496x35e001;

    /* renamed from: surfaceGroupId */
    private final int f2497x8f95da8d;

    /* renamed from: surfaceSharingOutputConfigs */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> f2498xef47fe01;

    public C1015xe8c37844(int i17, int i18, java.lang.String str, java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> list, android.util.Size size, int i19, int i27) {
        this.f91889id = i17;
        this.f2497x8f95da8d = i18;
        this.f2495xeb951517 = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f2498xef47fe01 = list;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.f2496x35e001 = size;
        this.f2493x6b33dd32 = i19;
        this.f2494xcc2078fc = i27;
    }

    /* renamed from: equals */
    public boolean m6784xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1 abstractC1026x206360a1 = (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1) obj;
        return this.f91889id == abstractC1026x206360a1.mo6785x5db1b11() && this.f2497x8f95da8d == abstractC1026x206360a1.mo6790x7e2da783() && ((str = this.f2495xeb951517) != null ? str.equals(abstractC1026x206360a1.mo6788x936d7c8d()) : abstractC1026x206360a1.mo6788x936d7c8d() == null) && this.f2498xef47fe01.equals(abstractC1026x206360a1.mo6791x75db70cb()) && this.f2496x35e001.equals(abstractC1026x206360a1.mo6789xfb854877()) && this.f2493x6b33dd32 == abstractC1026x206360a1.mo6786x450a23fc() && this.f2494xcc2078fc == abstractC1026x206360a1.mo6787xcb8dea46();
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getId */
    public int mo6785x5db1b11() {
        return this.f91889id;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1
    /* renamed from: getImageFormat */
    public int mo6786x450a23fc() {
        return this.f2493x6b33dd32;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1
    /* renamed from: getMaxImages */
    public int mo6787xcb8dea46() {
        return this.f2494xcc2078fc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo6788x936d7c8d() {
        return this.f2495xeb951517;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1
    /* renamed from: getSize */
    public android.util.Size mo6789xfb854877() {
        return this.f2496x35e001;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getSurfaceGroupId */
    public int mo6790x7e2da783() {
        return this.f2497x8f95da8d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getSurfaceSharingOutputConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> mo6791x75db70cb() {
        return this.f2498xef47fe01;
    }

    /* renamed from: hashCode */
    public int m6792x8cdac1b() {
        int i17 = (((this.f91889id ^ 1000003) * 1000003) ^ this.f2497x8f95da8d) * 1000003;
        java.lang.String str = this.f2495xeb951517;
        return ((((((((i17 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2498xef47fe01.hashCode()) * 1000003) ^ this.f2496x35e001.hashCode()) * 1000003) ^ this.f2493x6b33dd32) * 1000003) ^ this.f2494xcc2078fc;
    }

    /* renamed from: toString */
    public java.lang.String m6793x9616526c() {
        return "ImageReaderOutputConfig{id=" + this.f91889id + ", surfaceGroupId=" + this.f2497x8f95da8d + ", physicalCameraId=" + this.f2495xeb951517 + ", surfaceSharingOutputConfigs=" + this.f2498xef47fe01 + ", size=" + this.f2496x35e001 + ", imageFormat=" + this.f2493x6b33dd32 + ", maxImages=" + this.f2494xcc2078fc + "}";
    }
}

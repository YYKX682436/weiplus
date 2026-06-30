package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.AutoValue_SurfaceOutputConfig */
/* loaded from: classes14.dex */
final class C1017xa2c2d1f3 extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0 {

    /* renamed from: id, reason: collision with root package name */
    private final int f91891id;

    /* renamed from: physicalCameraId */
    private final java.lang.String f2504xeb951517;

    /* renamed from: surface */
    private final android.view.Surface f2505x9189ecad;

    /* renamed from: surfaceGroupId */
    private final int f2506x8f95da8d;

    /* renamed from: surfaceSharingOutputConfigs */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> f2507xef47fe01;

    public C1017xa2c2d1f3(int i17, int i18, java.lang.String str, java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> list, android.view.Surface surface) {
        this.f91891id = i17;
        this.f2506x8f95da8d = i18;
        this.f2504xeb951517 = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f2507xef47fe01 = list;
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.f2505x9189ecad = surface;
    }

    /* renamed from: equals */
    public boolean m6799xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0 abstractC1039xb5b770d0 = (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0) obj;
        return this.f91891id == abstractC1039xb5b770d0.mo6785x5db1b11() && this.f2506x8f95da8d == abstractC1039xb5b770d0.mo6790x7e2da783() && ((str = this.f2504xeb951517) != null ? str.equals(abstractC1039xb5b770d0.mo6788x936d7c8d()) : abstractC1039xb5b770d0.mo6788x936d7c8d() == null) && this.f2507xef47fe01.equals(abstractC1039xb5b770d0.mo6791x75db70cb()) && this.f2505x9189ecad.equals(abstractC1039xb5b770d0.mo6800xcf572877());
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getId */
    public int mo6785x5db1b11() {
        return this.f91891id;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getPhysicalCameraId */
    public java.lang.String mo6788x936d7c8d() {
        return this.f2504xeb951517;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0
    /* renamed from: getSurface */
    public android.view.Surface mo6800xcf572877() {
        return this.f2505x9189ecad;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getSurfaceGroupId */
    public int mo6790x7e2da783() {
        return this.f2506x8f95da8d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0
    /* renamed from: getSurfaceSharingOutputConfigs */
    public java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> mo6791x75db70cb() {
        return this.f2507xef47fe01;
    }

    /* renamed from: hashCode */
    public int m6801x8cdac1b() {
        int i17 = (((this.f91891id ^ 1000003) * 1000003) ^ this.f2506x8f95da8d) * 1000003;
        java.lang.String str = this.f2504xeb951517;
        return ((((i17 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2507xef47fe01.hashCode()) * 1000003) ^ this.f2505x9189ecad.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6802x9616526c() {
        return "SurfaceOutputConfig{id=" + this.f91891id + ", surfaceGroupId=" + this.f2506x8f95da8d + ", physicalCameraId=" + this.f2504xeb951517 + ", surfaceSharingOutputConfigs=" + this.f2507xef47fe01 + ", surface=" + this.f2505x9189ecad + "}";
    }
}

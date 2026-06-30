package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.AutoValue_CameraDeviceId */
/* loaded from: classes16.dex */
final class C0111xee381d73 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876 {

    /* renamed from: brand */
    private final java.lang.String f129x59a4b87;

    /* renamed from: cameraId */
    private final java.lang.String f130xf7159720;

    /* renamed from: device */
    private final java.lang.String f131xb06b1e56;

    /* renamed from: model */
    private final java.lang.String f132x633fb29;

    public C0111xee381d73(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null brand");
        }
        this.f129x59a4b87 = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null device");
        }
        this.f131xb06b1e56 = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null model");
        }
        this.f132x633fb29 = str3;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null cameraId");
        }
        this.f130xf7159720 = str4;
    }

    /* renamed from: equals */
    public boolean m2911xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876 abstractC0207xbe28e876 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876) obj;
        return this.f129x59a4b87.equals(abstractC0207xbe28e876.mo2912x7437f1d1()) && this.f131xb06b1e56.equals(abstractC0207xbe28e876.mo2914x1582414c()) && this.f132x633fb29.equals(abstractC0207xbe28e876.mo2915x74d1a173()) && this.f130xf7159720.equals(abstractC0207xbe28e876.mo2913x72efd496());
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876
    /* renamed from: getBrand */
    public java.lang.String mo2912x7437f1d1() {
        return this.f129x59a4b87;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876
    /* renamed from: getCameraId */
    public java.lang.String mo2913x72efd496() {
        return this.f130xf7159720;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876
    /* renamed from: getDevice */
    public java.lang.String mo2914x1582414c() {
        return this.f131xb06b1e56;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.AbstractC0207xbe28e876
    /* renamed from: getModel */
    public java.lang.String mo2915x74d1a173() {
        return this.f132x633fb29;
    }

    /* renamed from: hashCode */
    public int m2916x8cdac1b() {
        return ((((((this.f129x59a4b87.hashCode() ^ 1000003) * 1000003) ^ this.f131xb06b1e56.hashCode()) * 1000003) ^ this.f132x633fb29.hashCode()) * 1000003) ^ this.f130xf7159720.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m2917x9616526c() {
        return "CameraDeviceId{brand=" + this.f129x59a4b87 + ", device=" + this.f131xb06b1e56 + ", model=" + this.f132x633fb29 + ", cameraId=" + this.f130xf7159720 + "}";
    }
}

package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.AutoValue_CameraUseCaseAdapter_CameraId */
/* loaded from: classes14.dex */
final class C0827xf1fb7e05 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId {

    /* renamed from: cameraConfigId */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 f2049x9530f642;

    /* renamed from: cameraIdString */
    private final java.lang.String f2050x914a0b51;

    public C0827xf1fb7e05(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 abstractC0711x165a88c9) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null cameraIdString");
        }
        this.f2050x914a0b51 = str;
        if (abstractC0711x165a88c9 == null) {
            throw new java.lang.NullPointerException("Null cameraConfigId");
        }
        this.f2049x9530f642 = abstractC0711x165a88c9;
    }

    /* renamed from: equals */
    public boolean m6041xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId cameraId = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId) obj;
        return this.f2050x914a0b51.equals(cameraId.mo6043x7fe1d847()) && this.f2049x9530f642.equals(cameraId.mo6042x83c8c338());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId
    /* renamed from: getCameraConfigId */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 mo6042x83c8c338() {
        return this.f2049x9530f642;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId
    /* renamed from: getCameraIdString */
    public java.lang.String mo6043x7fe1d847() {
        return this.f2050x914a0b51;
    }

    /* renamed from: hashCode */
    public int m6044x8cdac1b() {
        return ((this.f2050x914a0b51.hashCode() ^ 1000003) * 1000003) ^ this.f2049x9530f642.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m6045x9616526c() {
        return "CameraId{cameraIdString=" + this.f2050x914a0b51 + ", cameraConfigId=" + this.f2049x9530f642 + "}";
    }
}

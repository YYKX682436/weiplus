package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.AutoValue_Camera2CameraImpl_UseCaseInfo */
/* loaded from: classes14.dex */
public final class C0110xd123637b extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo {

    /* renamed from: captureTypes */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> f122x2d203cd3;

    /* renamed from: sessionConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f123xdbf22978;

    /* renamed from: streamSpec */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b f124xb8c8fb5b;

    /* renamed from: surfaceResolution */
    private final android.util.Size f125x85130d39;

    /* renamed from: useCaseConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f126x53b16b79;

    /* renamed from: useCaseId */
    private final java.lang.String f127xc424a8d2;

    /* renamed from: useCaseType */
    private final java.lang.Class<?> f128x4da31931;

    public C0110xd123637b(java.lang.String str, java.lang.Class<?> cls, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null useCaseId");
        }
        this.f127xc424a8d2 = str;
        if (cls == null) {
            throw new java.lang.NullPointerException("Null useCaseType");
        }
        this.f128x4da31931 = cls;
        if (c0750xb915958 == null) {
            throw new java.lang.NullPointerException("Null sessionConfig");
        }
        this.f123xdbf22978 = c0750xb915958;
        if (interfaceC0768x83509b59 == null) {
            throw new java.lang.NullPointerException("Null useCaseConfig");
        }
        this.f126x53b16b79 = interfaceC0768x83509b59;
        this.f125x85130d39 = size;
        this.f124xb8c8fb5b = abstractC0756x2f9ad77b;
        this.f122x2d203cd3 = list;
    }

    /* renamed from: equals */
    public boolean m2901xb2c87fbf(java.lang.Object obj) {
        android.util.Size size;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo useCaseInfo = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo) obj;
        if (this.f127xc424a8d2.equals(useCaseInfo.mo2907xc3921a1c()) && this.f128x4da31931.equals(useCaseInfo.mo2908x27795ffb()) && this.f123xdbf22978.equals(useCaseInfo.mo2903x9951e5c2()) && this.f126x53b16b79.equals(useCaseInfo.mo2906x111127c3()) && ((size = this.f125x85130d39) != null ? size.equals(useCaseInfo.mo2905xd8479483()) : useCaseInfo.mo2905xd8479483() == null) && ((abstractC0756x2f9ad77b = this.f124xb8c8fb5b) != null ? abstractC0756x2f9ad77b.equals(useCaseInfo.mo2904xa709b351()) : useCaseInfo.mo2904xa709b351() == null)) {
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list = this.f122x2d203cd3;
            if (list == null) {
                if (useCaseInfo.mo2902x8e12cf49() == null) {
                    return true;
                }
            } else if (list.equals(useCaseInfo.mo2902x8e12cf49())) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo
    /* renamed from: getCaptureTypes */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> mo2902x8e12cf49() {
        return this.f122x2d203cd3;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo
    /* renamed from: getSessionConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 mo2903x9951e5c2() {
        return this.f123xdbf22978;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo
    /* renamed from: getStreamSpec */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo2904xa709b351() {
        return this.f124xb8c8fb5b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo
    /* renamed from: getSurfaceResolution */
    public android.util.Size mo2905xd8479483() {
        return this.f125x85130d39;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo
    /* renamed from: getUseCaseConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo2906x111127c3() {
        return this.f126x53b16b79;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo
    /* renamed from: getUseCaseId */
    public java.lang.String mo2907xc3921a1c() {
        return this.f127xc424a8d2;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0133x27d8c852.UseCaseInfo
    /* renamed from: getUseCaseType */
    public java.lang.Class<?> mo2908x27795ffb() {
        return this.f128x4da31931;
    }

    /* renamed from: hashCode */
    public int m2909x8cdac1b() {
        int hashCode = (((((((this.f127xc424a8d2.hashCode() ^ 1000003) * 1000003) ^ this.f128x4da31931.hashCode()) * 1000003) ^ this.f123xdbf22978.hashCode()) * 1000003) ^ this.f126x53b16b79.hashCode()) * 1000003;
        android.util.Size size = this.f125x85130d39;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b = this.f124xb8c8fb5b;
        int hashCode3 = (hashCode2 ^ (abstractC0756x2f9ad77b == null ? 0 : abstractC0756x2f9ad77b.hashCode())) * 1000003;
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list = this.f122x2d203cd3;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m2910x9616526c() {
        return "UseCaseInfo{useCaseId=" + this.f127xc424a8d2 + ", useCaseType=" + this.f128x4da31931 + ", sessionConfig=" + this.f123xdbf22978 + ", useCaseConfig=" + this.f126x53b16b79 + ", surfaceResolution=" + this.f125x85130d39 + ", streamSpec=" + this.f124xb8c8fb5b + ", captureTypes=" + this.f122x2d203cd3 + "}";
    }
}

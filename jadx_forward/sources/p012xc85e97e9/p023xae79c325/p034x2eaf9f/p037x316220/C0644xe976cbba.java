package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo */
/* loaded from: classes14.dex */
public final class C0644xe976cbba extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 {

    /* renamed from: captureTypes */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> f1419x2d203cd3;

    /* renamed from: dynamicRange */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1420x21e9383e;

    /* renamed from: imageFormat */
    private final int f1421x6b33dd32;

    /* renamed from: implementationOptions */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f1422xbe54468c;

    /* renamed from: size */
    private final android.util.Size f1423x35e001;

    /* renamed from: surfaceConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f f1424xfda3664f;

    /* renamed from: targetFrameRate */
    private final android.util.Range<java.lang.Integer> f1425xa2b8cd5c;

    public C0644xe976cbba(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f abstractC0758x2d42962f, int i17, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, android.util.Range<java.lang.Integer> range) {
        if (abstractC0758x2d42962f == null) {
            throw new java.lang.NullPointerException("Null surfaceConfig");
        }
        this.f1424xfda3664f = abstractC0758x2d42962f;
        this.f1421x6b33dd32 = i17;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.f1423x35e001 = size;
        if (c0491x2bb48c5e == null) {
            throw new java.lang.NullPointerException("Null dynamicRange");
        }
        this.f1420x21e9383e = c0491x2bb48c5e;
        if (list == null) {
            throw new java.lang.NullPointerException("Null captureTypes");
        }
        this.f1419x2d203cd3 = list;
        this.f1422xbe54468c = interfaceC0692x78a46f62;
        this.f1425xa2b8cd5c = range;
    }

    /* renamed from: equals */
    public boolean m5101xb2c87fbf(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 abstractC0643xfc6b6a97 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97) obj;
        if (this.f1424xfda3664f.equals(abstractC0643xfc6b6a97.mo5098xbb032299()) && this.f1421x6b33dd32 == abstractC0643xfc6b6a97.mo5095x450a23fc() && this.f1423x35e001.equals(abstractC0643xfc6b6a97.mo5097xfb854877()) && this.f1420x21e9383e.m4384xb2c87fbf(abstractC0643xfc6b6a97.mo5094x82dbcab4()) && this.f1419x2d203cd3.equals(abstractC0643xfc6b6a97.mo5093x8e12cf49()) && ((interfaceC0692x78a46f62 = this.f1422xbe54468c) != null ? interfaceC0692x78a46f62.equals(abstractC0643xfc6b6a97.mo5096xca0018d6()) : abstractC0643xfc6b6a97.mo5096xca0018d6() == null)) {
            android.util.Range<java.lang.Integer> range = this.f1425xa2b8cd5c;
            if (range == null) {
                if (abstractC0643xfc6b6a97.mo5099x871a9f26() == null) {
                    return true;
                }
            } else if (range.equals(abstractC0643xfc6b6a97.mo5099x871a9f26())) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97
    /* renamed from: getCaptureTypes */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> mo5093x8e12cf49() {
        return this.f1419x2d203cd3;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97
    /* renamed from: getDynamicRange */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e mo5094x82dbcab4() {
        return this.f1420x21e9383e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97
    /* renamed from: getImageFormat */
    public int mo5095x450a23fc() {
        return this.f1421x6b33dd32;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97
    /* renamed from: getImplementationOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5096xca0018d6() {
        return this.f1422xbe54468c;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97
    /* renamed from: getSize */
    public android.util.Size mo5097xfb854877() {
        return this.f1423x35e001;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97
    /* renamed from: getSurfaceConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f mo5098xbb032299() {
        return this.f1424xfda3664f;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97
    /* renamed from: getTargetFrameRate */
    public android.util.Range<java.lang.Integer> mo5099x871a9f26() {
        return this.f1425xa2b8cd5c;
    }

    /* renamed from: hashCode */
    public int m5102x8cdac1b() {
        int hashCode = (((((((((this.f1424xfda3664f.hashCode() ^ 1000003) * 1000003) ^ this.f1421x6b33dd32) * 1000003) ^ this.f1423x35e001.hashCode()) * 1000003) ^ this.f1420x21e9383e.m4387x8cdac1b()) * 1000003) ^ this.f1419x2d203cd3.hashCode()) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62 = this.f1422xbe54468c;
        int hashCode2 = (hashCode ^ (interfaceC0692x78a46f62 == null ? 0 : interfaceC0692x78a46f62.hashCode())) * 1000003;
        android.util.Range<java.lang.Integer> range = this.f1425xa2b8cd5c;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m5103x9616526c() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f1424xfda3664f + ", imageFormat=" + this.f1421x6b33dd32 + ", size=" + this.f1423x35e001 + ", dynamicRange=" + this.f1420x21e9383e + ", captureTypes=" + this.f1419x2d203cd3 + ", implementationOptions=" + this.f1422xbe54468c + ", targetFrameRate=" + this.f1425xa2b8cd5c + "}";
    }
}

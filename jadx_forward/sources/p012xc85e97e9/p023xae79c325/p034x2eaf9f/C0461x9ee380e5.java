package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AutoValue_SurfaceOutput_CameraInputInfo */
/* loaded from: classes14.dex */
final class C0461x9ee380e5 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo {

    /* renamed from: cameraInternal */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f812xd9c4f902;

    /* renamed from: inputCropRect */
    private final android.graphics.Rect f813x9ce4127e;

    /* renamed from: inputSize */
    private final android.util.Size f814x65bdb6eb;

    /* renamed from: mirroring */
    private final boolean f815x13df1fc3;

    /* renamed from: rotationDegrees */
    private final int f816x461e29c9;

    public C0461x9ee380e5(android.util.Size size, android.graphics.Rect rect, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, int i17, boolean z17) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null inputSize");
        }
        this.f814x65bdb6eb = size;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null inputCropRect");
        }
        this.f813x9ce4127e = rect;
        this.f812xd9c4f902 = interfaceC0677x9e0bc522;
        this.f816x461e29c9 = i17;
        this.f815x13df1fc3 = z17;
    }

    /* renamed from: equals */
    public boolean m4225xb2c87fbf(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo) obj;
        return this.f814x65bdb6eb.equals(cameraInputInfo.mo4228x652b2835()) && this.f813x9ce4127e.equals(cameraInputInfo.mo4227x5a43cec8()) && ((interfaceC0677x9e0bc522 = this.f812xd9c4f902) != null ? interfaceC0677x9e0bc522.equals(cameraInputInfo.mo4226xc85cc5f8()) : cameraInputInfo.mo4226xc85cc5f8() == null) && this.f816x461e29c9 == cameraInputInfo.mo4230x2a7ffb93() && this.f815x13df1fc3 == cameraInputInfo.mo4229x134c910d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo
    /* renamed from: getCameraInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 mo4226xc85cc5f8() {
        return this.f812xd9c4f902;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo
    /* renamed from: getInputCropRect */
    public android.graphics.Rect mo4227x5a43cec8() {
        return this.f813x9ce4127e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo
    /* renamed from: getInputSize */
    public android.util.Size mo4228x652b2835() {
        return this.f814x65bdb6eb;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo
    /* renamed from: getMirroring */
    public boolean mo4229x134c910d() {
        return this.f815x13df1fc3;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo
    /* renamed from: getRotationDegrees */
    public int mo4230x2a7ffb93() {
        return this.f816x461e29c9;
    }

    /* renamed from: hashCode */
    public int m4231x8cdac1b() {
        int hashCode = (((this.f814x65bdb6eb.hashCode() ^ 1000003) * 1000003) ^ this.f813x9ce4127e.hashCode()) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f812xd9c4f902;
        return ((((hashCode ^ (interfaceC0677x9e0bc522 == null ? 0 : interfaceC0677x9e0bc522.hashCode())) * 1000003) ^ this.f816x461e29c9) * 1000003) ^ (this.f815x13df1fc3 ? 1231 : 1237);
    }

    /* renamed from: toString */
    public java.lang.String m4232x9616526c() {
        return "CameraInputInfo{inputSize=" + this.f814x65bdb6eb + ", inputCropRect=" + this.f813x9ce4127e + ", cameraInternal=" + this.f812xd9c4f902 + ", rotationDegrees=" + this.f816x461e29c9 + ", mirroring=" + this.f815x13df1fc3 + "}";
    }
}

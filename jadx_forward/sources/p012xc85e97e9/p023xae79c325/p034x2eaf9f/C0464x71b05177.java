package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo */
/* loaded from: classes14.dex */
public final class C0464x71b05177 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo {

    /* renamed from: getCropRect */
    private final android.graphics.Rect f821xfa2ffe0a;

    /* renamed from: getRotationDegrees */
    private final int f822x2a7ffb93;

    /* renamed from: getSensorToBufferTransform */
    private final android.graphics.Matrix f823x65554241;

    /* renamed from: getTargetRotation */
    private final int f824x8d4b9125;

    /* renamed from: hasCameraTransform */
    private final boolean f825x459dfcd;

    /* renamed from: isMirroring */
    private final boolean f826x5a1c61b9;

    public C0464x71b05177(android.graphics.Rect rect, int i17, int i18, boolean z17, android.graphics.Matrix matrix, boolean z18) {
        if (rect == null) {
            throw new java.lang.NullPointerException("Null getCropRect");
        }
        this.f821xfa2ffe0a = rect;
        this.f822x2a7ffb93 = i17;
        this.f824x8d4b9125 = i18;
        this.f825x459dfcd = z17;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null getSensorToBufferTransform");
        }
        this.f823x65554241 = matrix;
        this.f826x5a1c61b9 = z18;
    }

    /* renamed from: equals */
    public boolean m4243xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo transformationInfo = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo) obj;
        return this.f821xfa2ffe0a.equals(transformationInfo.mo4244xfa2ffe0a()) && this.f822x2a7ffb93 == transformationInfo.mo4245x2a7ffb93() && this.f824x8d4b9125 == transformationInfo.mo4247x8d4b9125() && this.f825x459dfcd == transformationInfo.mo4248x459dfcd() && this.f823x65554241.equals(transformationInfo.mo4246x65554241()) && this.f826x5a1c61b9 == transformationInfo.mo4250x5a1c61b9();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo
    /* renamed from: getCropRect */
    public android.graphics.Rect mo4244xfa2ffe0a() {
        return this.f821xfa2ffe0a;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo
    /* renamed from: getRotationDegrees */
    public int mo4245x2a7ffb93() {
        return this.f822x2a7ffb93;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo
    /* renamed from: getSensorToBufferTransform */
    public android.graphics.Matrix mo4246x65554241() {
        return this.f823x65554241;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo
    /* renamed from: getTargetRotation */
    public int mo4247x8d4b9125() {
        return this.f824x8d4b9125;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo
    /* renamed from: hasCameraTransform */
    public boolean mo4248x459dfcd() {
        return this.f825x459dfcd;
    }

    /* renamed from: hashCode */
    public int m4249x8cdac1b() {
        return ((((((((((this.f821xfa2ffe0a.hashCode() ^ 1000003) * 1000003) ^ this.f822x2a7ffb93) * 1000003) ^ this.f824x8d4b9125) * 1000003) ^ (this.f825x459dfcd ? 1231 : 1237)) * 1000003) ^ this.f823x65554241.hashCode()) * 1000003) ^ (this.f826x5a1c61b9 ? 1231 : 1237);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo
    /* renamed from: isMirroring */
    public boolean mo4250x5a1c61b9() {
        return this.f826x5a1c61b9;
    }

    /* renamed from: toString */
    public java.lang.String m4251x9616526c() {
        return "TransformationInfo{getCropRect=" + this.f821xfa2ffe0a + ", getRotationDegrees=" + this.f822x2a7ffb93 + ", getTargetRotation=" + this.f824x8d4b9125 + ", hasCameraTransform=" + this.f825x459dfcd + ", getSensorToBufferTransform=" + this.f823x65554241 + ", isMirroring=" + this.f826x5a1c61b9 + "}";
    }
}

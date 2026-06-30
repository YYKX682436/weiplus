package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.AutoValue_TakePictureManager_CaptureError */
/* loaded from: classes14.dex */
final class C0591x4104ff6e extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError {

    /* renamed from: imageCaptureException */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 f1315x9e65cf24;

    /* renamed from: requestId */
    private final int f1316x295c940a;

    public C0591x4104ff6e(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        this.f1316x295c940a = i17;
        if (c0524xb471f04 == null) {
            throw new java.lang.NullPointerException("Null imageCaptureException");
        }
        this.f1315x9e65cf24 = c0524xb471f04;
    }

    /* renamed from: equals */
    public boolean m4907xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError captureError = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError) obj;
        return this.f1316x295c940a == captureError.mo4909x28ca0554() && this.f1315x9e65cf24.equals(captureError.mo4908xaa11a16e());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError
    /* renamed from: getImageCaptureException */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 mo4908xaa11a16e() {
        return this.f1315x9e65cf24;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError
    /* renamed from: getRequestId */
    public int mo4909x28ca0554() {
        return this.f1316x295c940a;
    }

    /* renamed from: hashCode */
    public int m4910x8cdac1b() {
        return ((this.f1316x295c940a ^ 1000003) * 1000003) ^ this.f1315x9e65cf24.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4911x9616526c() {
        return "CaptureError{requestId=" + this.f1316x295c940a + ", imageCaptureException=" + this.f1315x9e65cf24 + "}";
    }
}

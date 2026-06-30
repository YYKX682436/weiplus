package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.imagecapture.AutoValue_TakePictureRequest */
/* loaded from: classes14.dex */
public final class C0592x6dcf66b5 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 {

    /* renamed from: appExecutor */
    private final java.util.concurrent.Executor f1317xa65a2614;

    /* renamed from: captureMode */
    private final int f1318x9b36209;

    /* renamed from: cropRect */
    private final android.graphics.Rect f1319x7e55c094;

    /* renamed from: inMemoryCallback */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback f1320xd6f324eb;

    /* renamed from: jpegQuality */
    private final int f1321x5b75b377;

    /* renamed from: onDiskCallback */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback f1322x37a33081;

    /* renamed from: outputFileOptions */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions f1323xa243d9c1;

    /* renamed from: rotationDegrees */
    private final int f1324x461e29c9;

    /* renamed from: sensorToBufferTransform */
    private final android.graphics.Matrix f1325x9554da77;

    /* renamed from: sessionConfigCameraCaptureCallbacks */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f1326x719a1905;

    public C0592x6dcf66b5(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback onImageCapturedCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback onImageSavedCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions, android.graphics.Rect rect, android.graphics.Matrix matrix, int i17, int i18, int i19, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Null appExecutor");
        }
        this.f1317xa65a2614 = executor;
        this.f1320xd6f324eb = onImageCapturedCallback;
        this.f1322x37a33081 = onImageSavedCallback;
        this.f1323xa243d9c1 = outputFileOptions;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null cropRect");
        }
        this.f1319x7e55c094 = rect;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransform");
        }
        this.f1325x9554da77 = matrix;
        this.f1324x461e29c9 = i17;
        this.f1321x5b75b377 = i18;
        this.f1318x9b36209 = i19;
        if (list == null) {
            throw new java.lang.NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f1326x719a1905 = list;
    }

    /* renamed from: equals */
    public boolean m4912xb2c87fbf(java.lang.Object obj) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback onImageCapturedCallback;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback onImageSavedCallback;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838) obj;
        return this.f1317xa65a2614.equals(abstractC0637xf28cf838.mo4913x80306cde()) && ((onImageCapturedCallback = this.f1320xd6f324eb) != null ? onImageCapturedCallback.equals(abstractC0637xf28cf838.mo4916x7ecb8c61()) : abstractC0637xf28cf838.mo4916x7ecb8c61() == null) && ((onImageSavedCallback = this.f1322x37a33081) != null ? onImageSavedCallback.equals(abstractC0637xf28cf838.mo4918x263afd77()) : abstractC0637xf28cf838.mo4918x263afd77() == null) && ((outputFileOptions = this.f1323xa243d9c1) != null ? outputFileOptions.equals(abstractC0637xf28cf838.mo4919xf578610b()) : abstractC0637xf28cf838.mo4919xf578610b() == null) && this.f1319x7e55c094.equals(abstractC0637xf28cf838.mo4915xfa2ffe0a()) && this.f1325x9554da77.equals(abstractC0637xf28cf838.mo4921x65554241()) && this.f1324x461e29c9 == abstractC0637xf28cf838.mo4920x2a7ffb93() && this.f1321x5b75b377 == abstractC0637xf28cf838.mo4917x354bfa41() && this.f1318x9b36209 == abstractC0637xf28cf838.mo4914xe389a8d3() && this.f1326x719a1905.equals(abstractC0637xf28cf838.mo4922x2c9b21cf());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getAppExecutor */
    public java.util.concurrent.Executor mo4913x80306cde() {
        return this.f1317xa65a2614;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getCaptureMode */
    public int mo4914xe389a8d3() {
        return this.f1318x9b36209;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getCropRect */
    public android.graphics.Rect mo4915xfa2ffe0a() {
        return this.f1319x7e55c094;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getInMemoryCallback */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback mo4916x7ecb8c61() {
        return this.f1320xd6f324eb;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getJpegQuality */
    public int mo4917x354bfa41() {
        return this.f1321x5b75b377;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getOnDiskCallback */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback mo4918x263afd77() {
        return this.f1322x37a33081;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getOutputFileOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions mo4919xf578610b() {
        return this.f1323xa243d9c1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getRotationDegrees */
    public int mo4920x2a7ffb93() {
        return this.f1324x461e29c9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getSensorToBufferTransform */
    public android.graphics.Matrix mo4921x65554241() {
        return this.f1325x9554da77;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838
    /* renamed from: getSessionConfigCameraCaptureCallbacks */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> mo4922x2c9b21cf() {
        return this.f1326x719a1905;
    }

    /* renamed from: hashCode */
    public int m4923x8cdac1b() {
        int hashCode = (this.f1317xa65a2614.hashCode() ^ 1000003) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback onImageCapturedCallback = this.f1320xd6f324eb;
        int hashCode2 = (hashCode ^ (onImageCapturedCallback == null ? 0 : onImageCapturedCallback.hashCode())) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback onImageSavedCallback = this.f1322x37a33081;
        int hashCode3 = (hashCode2 ^ (onImageSavedCallback == null ? 0 : onImageSavedCallback.hashCode())) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions = this.f1323xa243d9c1;
        return ((((((((((((hashCode3 ^ (outputFileOptions != null ? outputFileOptions.hashCode() : 0)) * 1000003) ^ this.f1319x7e55c094.hashCode()) * 1000003) ^ this.f1325x9554da77.hashCode()) * 1000003) ^ this.f1324x461e29c9) * 1000003) ^ this.f1321x5b75b377) * 1000003) ^ this.f1318x9b36209) * 1000003) ^ this.f1326x719a1905.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4924x9616526c() {
        return "TakePictureRequest{appExecutor=" + this.f1317xa65a2614 + ", inMemoryCallback=" + this.f1320xd6f324eb + ", onDiskCallback=" + this.f1322x37a33081 + ", outputFileOptions=" + this.f1323xa243d9c1 + ", cropRect=" + this.f1319x7e55c094 + ", sensorToBufferTransform=" + this.f1325x9554da77 + ", rotationDegrees=" + this.f1324x461e29c9 + ", jpegQuality=" + this.f1321x5b75b377 + ", captureMode=" + this.f1318x9b36209 + ", sessionConfigCameraCaptureCallbacks=" + this.f1326x719a1905 + "}";
    }
}

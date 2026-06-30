package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.imagecapture.ProcessingRequest */
/* loaded from: classes14.dex */
public class C0627xbfd50fdc {

    /* renamed from: PROGRESS_NOT_RECEIVED */
    static final int f1377x16b61ebf = -1;

    /* renamed from: mCallback */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc f1378x1ab9c7d2;

    /* renamed from: mCaptureFuture */
    final wa.a f1379xb9db3d3c;

    /* renamed from: mCropRect */
    private final android.graphics.Rect f1380xa3536821;

    /* renamed from: mJpegQuality */
    private final int f1381x582c4ca;

    /* renamed from: mLastCaptureProcessProgressed */
    private int f1382x9e25478;

    /* renamed from: mOutputFileOptions */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions f1383x3f2560d4;

    /* renamed from: mRequestId */
    private final int f1384xa413de1d;

    /* renamed from: mRotationDegrees */
    private final int f1385x15cc599c;

    /* renamed from: mSensorToBufferTransform */
    private final android.graphics.Matrix f1386x9bcb874a;

    /* renamed from: mStageIds */
    private final java.util.List<java.lang.Integer> f1387x72d83a67;

    /* renamed from: mTagBundleKey */
    private final java.lang.String f1388xe7897510;

    public C0627xbfd50fdc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 interfaceC0689x87960748, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions, android.graphics.Rect rect, int i17, int i18, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc interfaceC0632x6c3ecfbc, wa.a aVar) {
        this(interfaceC0689x87960748, outputFileOptions, rect, i17, i18, matrix, interfaceC0632x6c3ecfbc, aVar, 0);
    }

    /* renamed from: getCaptureFuture */
    public wa.a m5020x1c2cf0f3() {
        return this.f1379xb9db3d3c;
    }

    /* renamed from: getCropRect */
    public android.graphics.Rect m5021xfa2ffe0a() {
        return this.f1380xa3536821;
    }

    /* renamed from: getJpegQuality */
    public int m5022x354bfa41() {
        return this.f1381x582c4ca;
    }

    /* renamed from: getOutputFileOptions */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions m5023xf578610b() {
        return this.f1383x3f2560d4;
    }

    /* renamed from: getRequestId */
    public int m5024x28ca0554() {
        return this.f1384xa413de1d;
    }

    /* renamed from: getRotationDegrees */
    public int m5025x2a7ffb93() {
        return this.f1385x15cc599c;
    }

    /* renamed from: getSensorToBufferTransform */
    public android.graphics.Matrix m5026x65554241() {
        return this.f1386x9bcb874a;
    }

    /* renamed from: getStageIds */
    public java.util.List<java.lang.Integer> m5027xc9b4d050() {
        return this.f1387x72d83a67;
    }

    /* renamed from: getTagBundleKey */
    public java.lang.String m5028xb0e6ee79() {
        return this.f1388xe7897510;
    }

    /* renamed from: isAborted */
    public boolean m5029x963a6b45() {
        return this.f1378x1ab9c7d2.mo5050x963a6b45();
    }

    /* renamed from: isInMemoryCapture */
    public boolean m5030xd2d80756() {
        return m5023xf578610b() == null;
    }

    /* renamed from: onCaptureFailure */
    public void m5031x86e70f23(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        this.f1378x1ab9c7d2.mo5051x86e70f23(c0524xb471f04);
    }

    /* renamed from: onCaptureProcessProgressed */
    public void m5032x1c9165b4(int i17) {
        if (this.f1382x9e25478 != i17) {
            this.f1382x9e25478 = i17;
            this.f1378x1ab9c7d2.mo5052x1c9165b4(i17);
        }
    }

    /* renamed from: onCaptureStarted */
    public void m5033x56961e1a() {
        this.f1378x1ab9c7d2.mo5053x56961e1a();
    }

    /* renamed from: onFinalResult */
    public void m5034x965a8dd4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults outputFileResults) {
        this.f1378x1ab9c7d2.mo5054x965a8dd4(outputFileResults);
    }

    /* renamed from: onImageCaptured */
    public void m5036x818788ba() {
        if (this.f1382x9e25478 != -1) {
            m5032x1c9165b4(100);
        }
        this.f1378x1ab9c7d2.mo5056x818788ba();
    }

    /* renamed from: onPostviewBitmapAvailable */
    public void m5037x945ddf76(android.graphics.Bitmap bitmap) {
        this.f1378x1ab9c7d2.mo5057x945ddf76(bitmap);
    }

    /* renamed from: onProcessFailure */
    public void m5038xe8fa07da(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        this.f1378x1ab9c7d2.mo5058xe8fa07da(c0524xb471f04);
    }

    public C0627xbfd50fdc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 interfaceC0689x87960748, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions, android.graphics.Rect rect, int i17, int i18, android.graphics.Matrix matrix, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0632x6c3ecfbc interfaceC0632x6c3ecfbc, wa.a aVar, int i19) {
        this.f1382x9e25478 = -1;
        this.f1384xa413de1d = i19;
        this.f1383x3f2560d4 = outputFileOptions;
        this.f1381x582c4ca = i18;
        this.f1385x15cc599c = i17;
        this.f1380xa3536821 = rect;
        this.f1386x9bcb874a = matrix;
        this.f1378x1ab9c7d2 = interfaceC0632x6c3ecfbc;
        this.f1388xe7897510 = java.lang.String.valueOf(interfaceC0689x87960748.hashCode());
        this.f1387x72d83a67 = new java.util.ArrayList();
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78> mo4360x32450065 = interfaceC0689x87960748.mo4360x32450065();
        java.util.Objects.requireNonNull(mo4360x32450065);
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78> it = mo4360x32450065.iterator();
        while (it.hasNext()) {
            this.f1387x72d83a67.add(java.lang.Integer.valueOf(it.next().mo5370x5db1b11()));
        }
        this.f1379xb9db3d3c = aVar;
    }

    /* renamed from: onFinalResult */
    public void m5035x965a8dd4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        this.f1378x1ab9c7d2.mo5055x965a8dd4(interfaceC0536x1ffeadf3);
    }
}

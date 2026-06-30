package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.TakePictureRequest */
/* loaded from: classes14.dex */
public abstract class AbstractC0637xf28cf838 {

    /* renamed from: mRemainingRetires */
    private int f1418x11a0276f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0862x9aa6862a().m6195xa8e25f3d();

    /* renamed from: androidx.camera.core.imagecapture.TakePictureRequest$RetryControl */
    /* loaded from: classes14.dex */
    public interface RetryControl {
        /* renamed from: retryRequest */
        void mo5077xa10c9ac7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCaptureProcessProgressed$3 */
    public /* synthetic */ void m5079xbd33e500(int i17) {
        if (mo4918x263afd77() != null) {
            mo4918x263afd77().mo4375x1c9165b4(i17);
        } else if (mo4916x7ecb8c61() != null) {
            mo4916x7ecb8c61().mo4368x1c9165b4(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onError$0 */
    public /* synthetic */ void m5080x6d22e518(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        boolean z17 = mo4916x7ecb8c61() != null;
        boolean z18 = mo4918x263afd77() != null;
        if (z17 && !z18) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback mo4916x7ecb8c61 = mo4916x7ecb8c61();
            java.util.Objects.requireNonNull(mo4916x7ecb8c61);
            mo4916x7ecb8c61.mo4371xaf8aa769(c0524xb471f04);
        } else {
            if (!z18 || z17) {
                throw new java.lang.IllegalStateException("One and only one callback is allowed.");
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback mo4918x263afd77 = mo4918x263afd77();
            java.util.Objects.requireNonNull(mo4918x263afd77);
            mo4918x263afd77.mo4377xaf8aa769(c0524xb471f04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onPostviewBitmapAvailable$4 */
    public /* synthetic */ void m5081x324e5b29(android.graphics.Bitmap bitmap) {
        if (mo4918x263afd77() != null) {
            mo4918x263afd77().mo4379x945ddf76(bitmap);
        } else if (mo4916x7ecb8c61() != null) {
            mo4916x7ecb8c61().mo4372x945ddf76(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onResult$1 */
    public /* synthetic */ void m5082xcfffd966(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults outputFileResults) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback mo4918x263afd77 = mo4918x263afd77();
        java.util.Objects.requireNonNull(mo4918x263afd77);
        java.util.Objects.requireNonNull(outputFileResults);
        mo4918x263afd77.mo4378x706cd52b(outputFileResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onResult$2 */
    public /* synthetic */ void m5083xcfffd967(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback mo4916x7ecb8c61 = mo4916x7ecb8c61();
        java.util.Objects.requireNonNull(mo4916x7ecb8c61);
        java.util.Objects.requireNonNull(interfaceC0536x1ffeadf3);
        mo4916x7ecb8c61.mo4370x58601d9c(interfaceC0536x1ffeadf3);
    }

    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 of(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback onImageCapturedCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback onImageSavedCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions, android.graphics.Rect rect, android.graphics.Matrix matrix, int i17, int i18, int i19, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list) {
        m3.h.b((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        m3.h.b((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0592x6dcf66b5(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i17, i18, i19, list);
    }

    /* renamed from: decrementRetryCounter */
    public boolean m5084x7570da67() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        int i17 = this.f1418x11a0276f;
        if (i17 <= 0) {
            return false;
        }
        this.f1418x11a0276f = i17 - 1;
        return true;
    }

    /* renamed from: getAppExecutor */
    public abstract java.util.concurrent.Executor mo4913x80306cde();

    /* renamed from: getCaptureMode */
    public abstract int mo4914xe389a8d3();

    /* renamed from: getCropRect */
    public abstract android.graphics.Rect mo4915xfa2ffe0a();

    /* renamed from: getInMemoryCallback */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback mo4916x7ecb8c61();

    /* renamed from: getJpegQuality */
    public abstract int mo4917x354bfa41();

    /* renamed from: getOnDiskCallback */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback mo4918x263afd77();

    /* renamed from: getOutputFileOptions */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions mo4919xf578610b();

    /* renamed from: getRemainingRetries */
    public int m5085x9364b9e6() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        return this.f1418x11a0276f;
    }

    /* renamed from: getRotationDegrees */
    public abstract int mo4920x2a7ffb93();

    /* renamed from: getSensorToBufferTransform */
    public abstract android.graphics.Matrix mo4921x65554241();

    /* renamed from: getSessionConfigCameraCaptureCallbacks */
    public abstract java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> mo4922x2c9b21cf();

    /* renamed from: incrementRetryCounter */
    public void m5086xd91e2f43() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1418x11a0276f++;
    }

    /* renamed from: onCaptureProcessProgressed */
    public void m5087x1c9165b4(final int i17) {
        mo4913x80306cde().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.this.m5079xbd33e500(i17);
            }
        });
    }

    /* renamed from: onError */
    public void m5088xaf8aa769(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        mo4913x80306cde().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$d
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.this.m5080x6d22e518(c0524xb471f04);
            }
        });
    }

    /* renamed from: onPostviewBitmapAvailable */
    public void m5089x945ddf76(final android.graphics.Bitmap bitmap) {
        mo4913x80306cde().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.this.m5081x324e5b29(bitmap);
            }
        });
    }

    /* renamed from: onResult */
    public void m5090x57429edc(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults outputFileResults) {
        mo4913x80306cde().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.this.m5082xcfffd966(outputFileResults);
            }
        });
    }

    /* renamed from: onResult */
    public void m5091x57429edc(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        mo4913x80306cde().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$e
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.this.m5083xcfffd967(interfaceC0536x1ffeadf3);
            }
        });
    }
}

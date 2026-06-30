package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.AndroidImageReaderProxy */
/* loaded from: classes14.dex */
public class C0452xa8e53f7f implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 {

    /* renamed from: mImageReader */
    private final android.media.ImageReader f790x29264f51;

    /* renamed from: mLock */
    private final java.lang.Object f792x6243b38 = new java.lang.Object();

    /* renamed from: mIsImageAvailableListenerCleared */
    private boolean f791x6cd96793 = true;

    public C0452xa8e53f7f(android.media.ImageReader imageReader) {
        this.f790x29264f51 = imageReader;
    }

    /* renamed from: isImageReaderContextNotInitializedException */
    private boolean m4180xc6f54033(java.lang.RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setOnImageAvailableListener$0 */
    public /* synthetic */ void m4181x93584572(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.mo3686xdf8fff6d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setOnImageAvailableListener$1 */
    public /* synthetic */ void m4182x93584573(java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener, android.media.ImageReader imageReader) {
        synchronized (this.f792x6243b38) {
            if (!this.f791x6cd96793) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.AndroidImageReaderProxy$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0452xa8e53f7f.this.m4181x93584572(onImageAvailableListener);
                    }
                });
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireLatestImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e() {
        android.media.Image image;
        synchronized (this.f792x6243b38) {
            try {
                image = this.f790x29264f51.acquireLatestImage();
            } catch (java.lang.RuntimeException e17) {
                if (!m4180xc6f54033(e17)) {
                    throw e17;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0451xf2492582(image);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireNextImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4184x825b5df2() {
        android.media.Image image;
        synchronized (this.f792x6243b38) {
            try {
                image = this.f790x29264f51.acquireNextImage();
            } catch (java.lang.RuntimeException e17) {
                if (!m4180xc6f54033(e17)) {
                    throw e17;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0451xf2492582(image);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: clearOnImageAvailableListener */
    public void mo4185xc0146eae() {
        synchronized (this.f792x6243b38) {
            this.f791x6cd96793 = true;
            this.f790x29264f51.setOnImageAvailableListener(null, null);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: close */
    public void mo4186x5a5ddf8() {
        synchronized (this.f792x6243b38) {
            this.f790x29264f51.close();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getHeight */
    public int mo4187x1c4fb41d() {
        int height;
        synchronized (this.f792x6243b38) {
            height = this.f790x29264f51.getHeight();
        }
        return height;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getImageFormat */
    public int mo4188x450a23fc() {
        int imageFormat;
        synchronized (this.f792x6243b38) {
            imageFormat = this.f790x29264f51.getImageFormat();
        }
        return imageFormat;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getMaxImages */
    public int mo4189xcb8dea46() {
        int maxImages;
        synchronized (this.f792x6243b38) {
            maxImages = this.f790x29264f51.getMaxImages();
        }
        return maxImages;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getSurface */
    public android.view.Surface mo4190xcf572877() {
        android.view.Surface surface;
        synchronized (this.f792x6243b38) {
            surface = this.f790x29264f51.getSurface();
        }
        return surface;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getWidth */
    public int mo4191x755bd410() {
        int width;
        synchronized (this.f792x6243b38) {
            width = this.f790x29264f51.getWidth();
        }
        return width;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: setOnImageAvailableListener */
    public void mo4192x6034c5c3(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener, final java.util.concurrent.Executor executor) {
        synchronized (this.f792x6243b38) {
            this.f791x6cd96793 = false;
            this.f790x29264f51.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.AndroidImageReaderProxy$$b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(android.media.ImageReader imageReader) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0452xa8e53f7f.this.m4182x93584573(executor, onImageAvailableListener, imageReader);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0792x43f0de11.m5921x9cf0d20b());
        }
    }
}

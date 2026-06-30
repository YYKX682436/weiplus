package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget */
/* loaded from: classes15.dex */
public class C28713xbb648c9d implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf {

    /* renamed from: MAX_IMAGES */
    private static final int f71772xf73c15d3 = 4;
    private static final java.lang.String TAG = "ImageReaderPlatformViewRenderTarget";

    /* renamed from: reader */
    private android.media.ImageReader f71777xc84558c3;

    /* renamed from: textureEntry */
    private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageTextureEntry f71778xa4f23c17;

    /* renamed from: bufferWidth */
    private int f71774xc2725166 = 0;

    /* renamed from: bufferHeight */
    private int f71773x7208e187 = 0;

    /* renamed from: onImageAvailableHandler */
    private final android.os.Handler f71775x64a72b1d = new android.os.Handler();

    /* renamed from: onImageAvailableListener */
    private final android.media.ImageReader.OnImageAvailableListener f71776x805b6b41 = new android.media.ImageReader.OnImageAvailableListener() { // from class: io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.1
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(android.media.ImageReader imageReader) {
            android.media.Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (java.lang.IllegalStateException e17) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28713xbb648c9d.TAG, "onImageAvailable acquireLatestImage failed: " + e17.toString());
                image = null;
            }
            if (image == null) {
                return;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28713xbb648c9d.this.f71778xa4f23c17.mo138109xd0f66a61(image);
        }
    };

    public C28713xbb648c9d(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageTextureEntry imageTextureEntry) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f71778xa4f23c17 = imageTextureEntry;
    }

    /* renamed from: closeReader */
    private void m138657x7bfc8db() {
        if (this.f71777xc84558c3 != null) {
            this.f71778xa4f23c17.mo138109xd0f66a61(null);
            this.f71777xc84558c3.close();
            this.f71777xc84558c3 = null;
        }
    }

    /* renamed from: createImageReader */
    public android.media.ImageReader m138658xac380f62() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            return m138660x7e71c542();
        }
        if (i17 >= 29) {
            return m138659x7e71c529();
        }
        throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    /* renamed from: createImageReader29 */
    public android.media.ImageReader m138659x7e71c529() {
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(this.f71774xc2725166, this.f71773x7208e187, 34, 4, 256L);
        newInstance.setOnImageAvailableListener(this.f71776x805b6b41, this.f71775x64a72b1d);
        return newInstance;
    }

    /* renamed from: createImageReader33 */
    public android.media.ImageReader m138660x7e71c542() {
        android.media.ImageReader.Builder builder = new android.media.ImageReader.Builder(this.f71774xc2725166, this.f71773x7208e187);
        builder.setMaxImages(4);
        builder.setImageFormat(34);
        builder.setUsage(256L);
        android.media.ImageReader build = builder.build();
        build.setOnImageAvailableListener(this.f71776x805b6b41, this.f71775x64a72b1d);
        return build;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getHeight */
    public int mo53762x1c4fb41d() {
        return this.f71773x7208e187;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getId */
    public long mo53763x5db1b11() {
        return this.f71778xa4f23c17.id();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getSurface */
    public android.view.Surface mo53764xcf572877() {
        return this.f71777xc84558c3.getSurface();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getWidth */
    public int mo53765x755bd410() {
        return this.f71774xc2725166;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: isReleased */
    public boolean mo53766xafdb8087() {
        return this.f71778xa4f23c17 == null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: release */
    public void mo53767x41012807() {
        m138657x7bfc8db();
        this.f71778xa4f23c17 = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: resize */
    public void mo53768xc84d9cb4(int i17, int i18) {
        if (this.f71777xc84558c3 != null && this.f71774xc2725166 == i17 && this.f71773x7208e187 == i18) {
            return;
        }
        m138657x7bfc8db();
        this.f71774xc2725166 = i17;
        this.f71773x7208e187 = i18;
        this.f71777xc84558c3 = m138658xac380f62();
    }
}

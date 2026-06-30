package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterImageView */
/* loaded from: classes14.dex */
public class C28548x2ab8be04 extends android.view.View implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 {
    private static final java.lang.String TAG = "FlutterImageView";

    /* renamed from: _hellAccFlag_ */
    private byte f70600x7f11beae;

    /* renamed from: currentBitmap */
    private android.graphics.Bitmap f70601x6819dc08;

    /* renamed from: currentImage */
    private android.media.Image f70602x56547f62;

    /* renamed from: flutterRenderer */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f70603x5ace00ff;

    /* renamed from: imageReader */
    private android.media.ImageReader f70604x7f193dfe;

    /* renamed from: isAttachedToFlutterRenderer */
    private boolean f70605xfa7559b6;

    /* renamed from: isAvailable */
    private boolean f70606x1a7eccbf;

    /* renamed from: kind */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind f70607x323b94;

    /* renamed from: io.flutter.embedding.android.FlutterImageView$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind */
        static final /* synthetic */ int[] f70608x435d6649;

        static {
            int[] iArr = new int[io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.m137206xcee59d22().length];
            f70608x435d6649 = iArr;
            try {
                iArr[io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.background.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f70608x435d6649[io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.overlay.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterImageView$SurfaceKind */
    /* loaded from: classes14.dex */
    public enum SurfaceKind {
        background,
        overlay
    }

    public C28548x2ab8be04(android.content.Context context, int i17, int i18, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind surfaceKind) {
        this(context, m137184xac380f62(i17, i18), surfaceKind);
    }

    /* renamed from: closeCurrentImage */
    private void m137183x41d07d7a() {
        android.media.Image image = this.f70602x56547f62;
        if (image != null) {
            image.close();
            this.f70602x56547f62 = null;
        }
    }

    /* renamed from: createImageReader */
    private static android.media.ImageReader m137184xac380f62(int i17, int i18) {
        int i19;
        int i27;
        if (i17 <= 0) {
            m137186x32c593("ImageReader width must be greater than 0, but given width=%d, set width=1", java.lang.Integer.valueOf(i17));
            i19 = 1;
        } else {
            i19 = i17;
        }
        if (i18 <= 0) {
            m137186x32c593("ImageReader height must be greater than 0, but given height=%d, set height=1", java.lang.Integer.valueOf(i18));
            i27 = 1;
        } else {
            i27 = i18;
        }
        return android.os.Build.VERSION.SDK_INT >= 29 ? android.media.ImageReader.newInstance(i19, i27, 1, 3, 768L) : android.media.ImageReader.newInstance(i19, i27, 1, 3);
    }

    /* renamed from: init */
    private void m137185x316510() {
        setAlpha(0.0f);
    }

    /* renamed from: logW */
    private static void m137186x32c593(java.lang.String str, java.lang.Object... objArr) {
        io.p3284xd2ae381c.Log.w(TAG, java.lang.String.format(java.util.Locale.US, str, objArr));
    }

    /* renamed from: updateCurrentBitmap */
    private void m137187x64f721bf() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.hardware.HardwareBuffer hardwareBuffer = this.f70602x56547f62.getHardwareBuffer();
            this.f70601x6819dc08 = android.graphics.Bitmap.wrapHardwareBuffer(hardwareBuffer, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        android.media.Image.Plane[] planes = this.f70602x56547f62.getPlanes();
        if (planes.length != 1) {
            return;
        }
        android.media.Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f70602x56547f62.getHeight();
        android.graphics.Bitmap bitmap = this.f70601x6819dc08;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f70601x6819dc08.getHeight() != height) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(rowStride));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "io/flutter/embedding/android/FlutterImageView", "updateCurrentBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "io/flutter/embedding/android/FlutterImageView", "updateCurrentBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f70601x6819dc08 = createBitmap;
        }
        java.nio.ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f70601x6819dc08.copyPixelsFromBuffer(buffer);
    }

    /* renamed from: acquireLatestImage */
    public boolean m137188xaf314b5e() {
        if (!this.f70605xfa7559b6) {
            return false;
        }
        android.media.Image acquireLatestImage = this.f70604x7f193dfe.acquireLatestImage();
        if (acquireLatestImage != null) {
            m137183x41d07d7a();
            this.f70602x56547f62 = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: attachToRenderer */
    public void mo137189xb6928083(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
        if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.AnonymousClass1.f70608x435d6649[this.f70607x323b94.ordinal()] == 1) {
            c28641x1f60b8df.m138052x614179a(this.f70604x7f193dfe.getSurface());
        }
        setAlpha(1.0f);
        this.f70603x5ace00ff = c28641x1f60b8df;
        this.f70605xfa7559b6 = true;
    }

    /* renamed from: closeImageReader */
    public void m137190x23991ce6() {
        this.f70604x7f193dfe.close();
        this.f70606x1a7eccbf = false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: detachFromRenderer */
    public void mo137191x77fe19c0() {
        if (this.f70605xfa7559b6) {
            setAlpha(0.0f);
            m137188xaf314b5e();
            this.f70601x6819dc08 = null;
            m137183x41d07d7a();
            invalidate();
            this.f70605xfa7559b6 = false;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: getAttachedRenderer */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df mo137192x385aa5fd() {
        return this.f70603x5ace00ff;
    }

    /* renamed from: getImageReader */
    public android.media.ImageReader m137193x58ef84c8() {
        return this.f70604x7f193dfe;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: getRenderSurface */
    public android.view.Surface mo137194x19cc2a81() {
        return this.f70604x7f193dfe.getSurface();
    }

    /* renamed from: getSurface */
    public android.view.Surface m137195xcf572877() {
        return this.f70604x7f193dfe.getSurface();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: isAvailableForRendering */
    public boolean mo137196x1f8c622() {
        return this.f70604x7f193dfe != null && this.f70606x1a7eccbf;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: markSurfaceIsSwapOut */
    public void mo137197x669ed6f1(boolean z17) {
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f70602x56547f62 != null) {
            m137187x64f721bf();
        }
        android.graphics.Bitmap bitmap = this.f70601x6819dc08;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: onRenderSurfaceNextUpdate */
    public void mo137198x896c3e54(java.lang.Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        if (!(i17 == this.f70604x7f193dfe.getWidth() && i18 == this.f70604x7f193dfe.getHeight()) && this.f70607x323b94 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.background && this.f70605xfa7559b6) {
            m137200x5cd9c406(i17, i18);
            this.f70603x5ace00ff.m138052x614179a(this.f70604x7f193dfe.getSurface());
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: pause */
    public void mo137199x65825f6() {
    }

    /* renamed from: resizeIfNeeded */
    public void m137200x5cd9c406(int i17, int i18) {
        if (this.f70603x5ace00ff == null) {
            return;
        }
        if (i17 == this.f70604x7f193dfe.getWidth() && i18 == this.f70604x7f193dfe.getHeight()) {
            return;
        }
        m137183x41d07d7a();
        m137190x23991ce6();
        this.f70604x7f193dfe = m137184xac380f62(i17, i18);
        this.f70606x1a7eccbf = true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17
    /* renamed from: resume */
    public void mo137201xc84dc82d() {
    }

    public C28548x2ab8be04(android.content.Context context) {
        this(context, 1, 1, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.background);
    }

    public C28548x2ab8be04(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, 1, 1, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.background);
    }

    public C28548x2ab8be04(android.content.Context context, android.media.ImageReader imageReader, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind surfaceKind) {
        super(context, null);
        this.f70606x1a7eccbf = false;
        this.f70605xfa7559b6 = false;
        this.f70604x7f193dfe = imageReader;
        this.f70607x323b94 = surfaceKind;
        m137185x316510();
        this.f70606x1a7eccbf = true;
    }
}

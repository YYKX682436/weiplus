package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes15.dex */
public class c implements io.flutter.plugin.platform.PlatformViewRenderTarget {

    /* renamed from: a, reason: collision with root package name */
    public android.media.ImageReader f92276a;

    /* renamed from: b, reason: collision with root package name */
    public int f92277b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f92278c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f92279d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final android.media.ImageReader.OnImageAvailableListener f92280e = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.b(this);

    public c() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.f92278c;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return 123L;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public android.view.Surface getSurface() {
        return this.f92276a.getSurface();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.f92277b;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return false;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        android.media.ImageReader imageReader = this.f92276a;
        if (imageReader != null) {
            imageReader.close();
            this.f92276a = null;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i17, int i18) {
        android.media.ImageReader newInstance;
        android.media.ImageReader imageReader = this.f92276a;
        if (imageReader != null && this.f92277b == i17 && this.f92278c == i18) {
            return;
        }
        if (imageReader != null) {
            imageReader.close();
            this.f92276a = null;
        }
        this.f92277b = i17;
        this.f92278c = i18;
        int i19 = android.os.Build.VERSION.SDK_INT;
        android.os.Handler handler = this.f92279d;
        android.media.ImageReader.OnImageAvailableListener onImageAvailableListener = this.f92280e;
        if (i19 >= 33) {
            android.media.ImageReader.Builder builder = new android.media.ImageReader.Builder(this.f92277b, this.f92278c);
            builder.setMaxImages(4);
            builder.setImageFormat(1);
            newInstance = builder.build();
            newInstance.setOnImageAvailableListener(onImageAvailableListener, handler);
        } else {
            if (i19 < 29) {
                throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = android.media.ImageReader.newInstance(i17, i18, 1, 4, 256L);
            newInstance.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
        this.f92276a = newInstance;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd;

/* loaded from: classes15.dex */
public class c implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf {

    /* renamed from: a, reason: collision with root package name */
    public android.media.ImageReader f173809a;

    /* renamed from: b, reason: collision with root package name */
    public int f173810b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f173811c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f173812d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final android.media.ImageReader.OnImageAvailableListener f173813e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.b(this);

    public c() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getHeight */
    public int mo53762x1c4fb41d() {
        return this.f173811c;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getId */
    public long mo53763x5db1b11() {
        return 123L;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getSurface */
    public android.view.Surface mo53764xcf572877() {
        return this.f173809a.getSurface();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: getWidth */
    public int mo53765x755bd410() {
        return this.f173810b;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: isReleased */
    public boolean mo53766xafdb8087() {
        return false;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: release */
    public void mo53767x41012807() {
        android.media.ImageReader imageReader = this.f173809a;
        if (imageReader != null) {
            imageReader.close();
            this.f173809a = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf
    /* renamed from: resize */
    public void mo53768xc84d9cb4(int i17, int i18) {
        android.media.ImageReader newInstance;
        android.media.ImageReader imageReader = this.f173809a;
        if (imageReader != null && this.f173810b == i17 && this.f173811c == i18) {
            return;
        }
        if (imageReader != null) {
            imageReader.close();
            this.f173809a = null;
        }
        this.f173810b = i17;
        this.f173811c = i18;
        int i19 = android.os.Build.VERSION.SDK_INT;
        android.os.Handler handler = this.f173812d;
        android.media.ImageReader.OnImageAvailableListener onImageAvailableListener = this.f173813e;
        if (i19 >= 33) {
            android.media.ImageReader.Builder builder = new android.media.ImageReader.Builder(this.f173810b, this.f173811c);
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
        this.f173809a = newInstance;
    }
}

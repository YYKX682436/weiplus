package jj3;

/* loaded from: classes14.dex */
public final class b implements jj3.d, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public android.media.ImageReader f381535d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f381536e;

    @Override // jj3.d
    public void a() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.ImageReaderWrapper", "close");
        android.media.ImageReader imageReader = this.f381535d;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f381535d = null;
    }

    @Override // jj3.d
    /* renamed from: getRenderSize */
    public android.util.Size mo67059x356c92ad() {
        android.media.ImageReader imageReader = this.f381535d;
        return imageReader != null ? new android.util.Size(imageReader.getWidth(), imageReader.getHeight()) : new android.util.Size(0, 0);
    }

    @Override // jj3.d
    /* renamed from: getRenderTarget */
    public java.lang.Object mo67061x8dd3293d() {
        android.media.ImageReader imageReader = this.f381535d;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // jj3.d
    /* renamed from: setScreenOri */
    public void mo67068x6335c098(int i17) {
    }
}

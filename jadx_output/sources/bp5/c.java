package bp5;

/* loaded from: classes14.dex */
public final class c implements bp5.h, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final bp5.a f23451d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.ImageReader f23452e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Size f23453f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23454g;

    public c(bp5.a onVideoDataHandler) {
        kotlin.jvm.internal.o.g(onVideoDataHandler, "onVideoDataHandler");
        this.f23451d = onVideoDataHandler;
        this.f23453f = new android.util.Size(0, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.ImageReaderWrapper", "close");
        android.media.ImageReader imageReader = this.f23452e;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f23452e = null;
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.f23454g;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize */
    public android.util.Size getSize() {
        return this.f23453f;
    }

    @Override // bp5.h
    public java.lang.Object getRenderTarget() {
        android.media.ImageReader imageReader = this.f23452e;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // bp5.h
    public void setNeedRecreate(boolean z17) {
        this.f23454g = z17;
    }
}

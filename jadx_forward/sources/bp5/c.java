package bp5;

/* loaded from: classes14.dex */
public final class c implements bp5.h, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final bp5.a f104984d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.ImageReader f104985e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Size f104986f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f104987g;

    public c(bp5.a onVideoDataHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onVideoDataHandler, "onVideoDataHandler");
        this.f104984d = onVideoDataHandler;
        this.f104986f = new android.util.Size(0, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.ImageReaderWrapper", "close");
        android.media.ImageReader imageReader = this.f104985e;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f104985e = null;
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.f104987g;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize */
    public android.util.Size getSize() {
        return this.f104986f;
    }

    @Override // bp5.h
    /* renamed from: getRenderTarget */
    public java.lang.Object mo11009x8dd3293d() {
        android.media.ImageReader imageReader = this.f104985e;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // bp5.h
    /* renamed from: setNeedRecreate */
    public void mo11010xc3db8127(boolean z17) {
        this.f104987g = z17;
    }
}

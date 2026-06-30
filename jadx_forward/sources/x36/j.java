package x36;

/* loaded from: classes13.dex */
public final class j extends java.io.InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x36.k f533221d;

    public j(x36.k kVar) {
        this.f533221d = kVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) java.lang.Math.min(this.f533221d.f533227e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        x36.k kVar = this.f533221d;
        if (kVar.f533227e > 0) {
            return kVar.mo174955xcc4273be() & 255;
        }
        return -1;
    }

    /* renamed from: toString */
    public java.lang.String m174969x9616526c() {
        return this.f533221d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(byte[] sink, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        return this.f533221d.i(sink, i17, i18);
    }
}

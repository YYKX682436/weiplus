package k46;

/* loaded from: classes13.dex */
public class g extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k46.h f385646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k46.h hVar, java.io.InputStream inputStream) {
        super(inputStream);
        this.f385646d = hVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k46.h hVar = this.f385646d;
        try {
            super.close();
        } finally {
            hVar.f385647f.delete();
        }
    }
}

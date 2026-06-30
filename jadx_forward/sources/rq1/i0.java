package rq1;

/* loaded from: classes12.dex */
public final class i0 extends java.io.FilterInputStream {
    public i0(java.util.zip.ZipInputStream zipInputStream) {
        super(zipInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.InputStream inputStream = ((java.io.FilterInputStream) this).in;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inputStream, "null cannot be cast to non-null type java.util.zip.ZipInputStream");
        ((java.util.zip.ZipInputStream) inputStream).closeEntry();
    }
}

package s46;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f484537a = 0;

    static {
        char c17 = java.io.File.separatorChar;
        t46.b bVar = new t46.b(4);
        java.io.PrintWriter printWriter = new java.io.PrintWriter(bVar);
        try {
            printWriter.println();
            bVar.m165877x9616526c();
            printWriter.close();
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                try {
                    printWriter.close();
                } catch (java.lang.Throwable th8) {
                    th6.addSuppressed(th8);
                }
                throw th7;
            }
        }
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static int b(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j17 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j17 += read;
        }
        if (j17 > 2147483647L) {
            return -1;
        }
        return (int) j17;
    }

    public static byte[] c(java.io.InputStream inputStream) {
        t46.a aVar = new t46.a();
        b(inputStream, aVar);
        return aVar.b();
    }

    public static java.lang.String d(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        t46.b bVar = new t46.b();
        java.nio.charset.Charset charset2 = s46.a.f484534a;
        if (charset == null) {
            charset = java.nio.charset.Charset.defaultCharset();
        }
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, charset);
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return bVar.m165877x9616526c();
            }
            bVar.write(cArr, 0, read);
        }
    }
}

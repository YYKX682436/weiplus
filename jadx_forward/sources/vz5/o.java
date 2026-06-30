package vz5;

/* loaded from: classes7.dex */
public abstract class o extends vz5.n {
    public static final java.lang.String c(java.io.File file, java.nio.charset.Charset charset) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charset, "charset");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        try {
            java.lang.String c17 = vz5.v.c(inputStreamReader);
            vz5.b.a(inputStreamReader, null);
            return c17;
        } finally {
        }
    }
}

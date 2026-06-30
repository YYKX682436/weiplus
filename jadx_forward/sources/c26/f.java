package c26;

/* loaded from: classes13.dex */
public final class f {
    public final java.io.InputStream a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.ClassLoader classLoader = c26.f.class.getClassLoader();
        if (classLoader == null) {
            return java.lang.ClassLoader.getSystemResourceAsStream(path);
        }
        java.net.URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        java.net.URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}

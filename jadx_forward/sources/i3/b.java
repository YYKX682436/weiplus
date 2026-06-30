package i3;

/* loaded from: classes5.dex */
public abstract class b {
    public static final java.io.File a(android.net.Uri uri) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uri.getScheme(), "file")) {
            throw new java.lang.IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        java.lang.String path = uri.getPath();
        if (path != null) {
            return new java.io.File(path);
        }
        throw new java.lang.IllegalArgumentException(("Uri path is null: " + uri).toString());
    }
}

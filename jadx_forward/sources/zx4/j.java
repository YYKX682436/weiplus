package zx4;

/* loaded from: classes7.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final zx4.k a(java.lang.String path, zx4.e listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        return android.os.Build.VERSION.SDK_INT >= 29 ? new zx4.k(new java.io.File(path), listener) : new zx4.k(path, listener);
    }
}

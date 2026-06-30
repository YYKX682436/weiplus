package wh;

/* loaded from: classes12.dex */
public final class j implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final wh.j f527338a = new wh.j();

    @Override // java.io.FileFilter
    public final boolean accept(java.io.File pathname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pathname, "pathname");
        return java.util.regex.Pattern.matches("cpu[0-9]+", pathname.getName());
    }
}

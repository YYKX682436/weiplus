package xi;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xi.h f536188d = new xi.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ih.d d17 = ih.d.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "Matrix.with()");
        android.app.Application application = d17.f373004b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(application, "Matrix.with().application");
        java.io.File cacheDir = application.getCacheDir();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheDir, "Matrix.with().application.cacheDir");
        sb6.append(cacheDir.getAbsolutePath());
        sb6.append("/hprofs");
        return new java.io.File(sb6.toString());
    }
}

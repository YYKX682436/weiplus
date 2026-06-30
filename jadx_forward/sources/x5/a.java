package x5;

/* loaded from: classes14.dex */
public final class a implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f533474a;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f533474a = context;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getScheme(), "file")) {
            l36.i0 i0Var = h6.d.f360649a;
            java.util.List<java.lang.String> pathSegments = data.getPathSegments();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pathSegments, "pathSegments");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) kz5.n0.Z(pathSegments), "android_asset")) {
                return true;
            }
        }
        return false;
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421, v5.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List<java.lang.String> pathSegments = ((android.net.Uri) obj).getPathSegments();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pathSegments, "data.pathSegments");
        java.lang.String g07 = kz5.n0.g0(kz5.n0.R(pathSegments, 1), "/", null, null, 0, null, null, 62, null);
        java.io.InputStream open = this.f533474a.getAssets().open(g07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(open, "context.assets.open(path)");
        x36.m b17 = x36.v.b(x36.v.f(open));
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singleton, "getSingleton()");
        return new x5.n(b17, h6.d.a(singleton, g07), v5.d.DISK);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String uri = data.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "data.toString()");
        return uri;
    }
}

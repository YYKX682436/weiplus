package z5;

/* loaded from: classes12.dex */
public final class d implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f551694a;

    public d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f551694a = context;
    }

    @Override // z5.b
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getScheme(), "android.resource")) {
            return false;
        }
        java.lang.String authority = data.getAuthority();
        if (authority == null || r26.n0.N(authority)) {
            return false;
        }
        java.util.List<java.lang.String> pathSegments = data.getPathSegments();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pathSegments, "data.pathSegments");
        return pathSegments.size() == 2;
    }

    @Override // z5.b
    public java.lang.Object d(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        android.content.res.Resources resourcesForApplication = this.f551694a.getPackageManager().getResourcesForApplication(authority);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        java.util.List<java.lang.String> pathSegments = data.getPathSegments();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pathSegments, "pathSegments");
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new java.lang.IllegalStateException(p3321xbce91901.jvm.p3324x21ffc6bd.o.m("Invalid android.resource URI: ", data).toString());
        }
        android.net.Uri parse = android.net.Uri.parse("android.resource://" + authority + '/' + identifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parse, "parse(this)");
        return parse;
    }
}

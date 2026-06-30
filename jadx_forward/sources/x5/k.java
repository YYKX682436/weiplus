package x5;

/* loaded from: classes14.dex */
public final class k extends x5.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l36.m callFactory) {
        super(callFactory);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callFactory, "callFactory");
    }

    @Override // x5.j, x5.g
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getScheme(), "http") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getScheme(), "https");
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String uri = data.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "data.toString()");
        return uri;
    }

    @Override // x5.j
    public l36.k0 e(java.lang.Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "<this>");
        java.lang.String uri2 = uri.toString();
        l36.j0 j0Var = new l36.j0();
        j0Var.b(null, uri2);
        return j0Var.a();
    }
}

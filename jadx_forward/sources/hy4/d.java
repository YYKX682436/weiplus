package hy4;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final hy4.d f367628a = new hy4.d();

    public final java.lang.String a(java.lang.String shareLink, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareLink, "shareLink");
        if (shareLink.length() == 0) {
            return shareLink;
        }
        android.net.Uri parse = android.net.Uri.parse(shareLink);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(parse.getQueryParameter("promoterShareLink")) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return shareLink;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("promoterShareLink");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
            return shareLink;
        }
        java.lang.String uri = parse.buildUpon().appendQueryParameter("promoterShareLink", queryParameter).build().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        return uri;
    }
}

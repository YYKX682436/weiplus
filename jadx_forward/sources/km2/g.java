package km2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static int f390635c;

    /* renamed from: a, reason: collision with root package name */
    public static final km2.g f390633a = new km2.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f390634b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f390636d = jz5.h.b(km2.f.f390629d);

    public final void a(java.lang.String liveType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveType, "liveType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#clearLocalSelectCache liveType=".concat(liveType));
        e().putString(b(liveType), "");
        e().putInt(c(liveType), 0);
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("path_");
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        sb6.append(I1 != null ? I1.f68723xdec927b : null);
        sb6.append('_');
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("time_");
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        sb6.append(I1 != null ? I1.f68723xdec927b : null);
        sb6.append('_');
        sb6.append(str);
        return sb6.toString();
    }

    public final km2.e d(java.lang.String liveType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveType, "liveType");
        java.lang.String string = e().getString(b(liveType), "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#getLocalSelectCache liveType=" + liveType + " cachePath=" + string);
        if (string != null && (android.webkit.URLUtil.isNetworkUrl(string) || com.p314xaae8f345.mm.vfs.w6.j(string))) {
            return new km2.e(string, e().getInt(c(liveType), 0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#getLocalSelectCache file not exist");
        return null;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f390636d).mo141623x754a37bb();
    }

    public final void f(java.lang.String path, java.lang.String liveType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveType, "liveType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#saveLocalSelectCache liveType=" + liveType + " path=" + path);
        e().putString(b(liveType), path);
        e().putInt(c(liveType), c01.id.e());
    }
}

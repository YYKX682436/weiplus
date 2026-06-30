package ts1;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f503151a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f503152b;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) jz5.h.b(ts1.s.f503149d)).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o4Var, "<get-kvUrlQuery>(...)");
        f503151a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(o4Var, 604800L);
        f503152b = jz5.h.b(ts1.r.f503148d);
    }

    public static final java.lang.String a(java.lang.String str) {
        android.net.Uri parse;
        java.lang.String host;
        try {
            parse = android.net.Uri.parse(str);
            host = parse.getHost();
            if (host == null) {
                host = "";
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherUrlQueryManager", e17, "getKey exception", new java.lang.Object[0]);
        }
        if (!((java.util.ArrayList) ((jz5.n) f503152b).mo141623x754a37bb()).contains(host)) {
            return "";
        }
        java.lang.String path = parse.getPath();
        if (path == null) {
            path = "";
        }
        boolean z17 = true;
        if (host.length() > 0) {
            if (path.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                return host + '/' + path;
            }
        }
        return "";
    }

    public static final java.lang.String b(java.lang.String str, zq1.i0 i0Var) {
        java.lang.String url = i0Var.f556516a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
        if (!r26.i0.y(url, "http", false)) {
            return "";
        }
        if (!(str.length() > 0)) {
            return "";
        }
        java.util.List list = i0Var.f556526k;
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.util.List queryList = i0Var.f556526k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(queryList, "queryList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(queryList, 10));
        java.util.Iterator it = queryList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.net.URLEncoder.encode((java.lang.String) it.next()));
        }
        return kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public static final java.lang.String c(java.lang.String url, java.util.HashMap hashMap) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return ((hashMap == null || hashMap.isEmpty()) || (str = (java.lang.String) hashMap.get(a(url))) == null) ? "" : str;
    }
}

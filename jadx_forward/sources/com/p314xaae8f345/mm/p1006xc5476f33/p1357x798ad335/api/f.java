package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f178437a = {"dlied4.myapp.com", "dlied5.myapp.com"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f178438b = new java.util.concurrent.ConcurrentHashMap();

    public static java.lang.String a(java.lang.String str) {
        java.lang.String host = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : android.net.Uri.parse(str).getHost();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(host) || !java.util.Arrays.asList(f178437a).contains(host)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadExtension", "domain is not dlied4/dlied5");
            return str;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10768xcfd1c1ef.f149992e, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.e.class);
        java.lang.String b17 = b(b(str, java.lang.String.format("openid=%s", c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : "")), "p=wechat");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadExtension", "after openid added, url: %s", b17);
        return b17;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        try {
            java.net.URI uri = new java.net.URI(str);
            java.lang.String query = uri.getQuery();
            if (query != null) {
                str2 = query + "&" + str2;
            }
            return new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
        } catch (java.net.URISyntaxException unused) {
            return str;
        }
    }

    public static synchronized void c(java.lang.String str, java.lang.String... strArr) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.class) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && strArr != null) {
                for (int i17 = 0; i17 < strArr.length; i17++) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[i17])) {
                        ((java.util.concurrent.ConcurrentHashMap) f178438b).put(strArr[i17], str);
                    }
                }
            }
        }
    }

    public static synchronized void d(java.lang.String... strArr) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.class) {
            if (strArr != null) {
                for (int i17 = 0; i17 < strArr.length; i17++) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[i17])) {
                        ((java.util.concurrent.ConcurrentHashMap) f178438b).remove(strArr[i17]);
                    }
                }
            }
        }
    }
}

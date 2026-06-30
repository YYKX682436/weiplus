package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.ArrayList f264819a;

    public static java.lang.String a(java.lang.String str) {
        try {
            java.net.URI uri = new java.net.URI(str);
            java.lang.String scheme = uri.getScheme();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(scheme)) {
                return null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(scheme);
            sb6.append("://");
            sb6.append(uri.getHost());
            int port = uri.getPort();
            if (!(port == -1 || (scheme.equalsIgnoreCase("http") && port == 80) || (scheme.equalsIgnoreCase("https") && port == 443))) {
                sb6.append(":");
                sb6.append(uri.getPort());
            }
            return sb6.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.CookiesCleanup", "getOrigin fail %s", e17.getMessage());
            return null;
        }
    }
}

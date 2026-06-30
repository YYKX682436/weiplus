package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f301877a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f301878b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f301879c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f301880d;

    static {
        b();
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String trim = str.trim();
        if (!trim.startsWith("http")) {
            trim = "http://".concat(trim);
        }
        java.lang.String host = android.net.Uri.parse(trim).getHost();
        by5.c4.f("UrlDispatcher", "getHost, host:" + host + ", url:" + trim);
        return host;
    }

    public static synchronized boolean b() {
        synchronized (com.p314xaae8f345.p3210x3857dc.n0.class) {
            if (f301880d) {
                return true;
            }
            try {
                java.lang.String g17 = com.p314xaae8f345.p3210x3857dc.b.m().g("tools_white_list_host_suffix", "tools");
                java.lang.String g18 = com.p314xaae8f345.p3210x3857dc.b.m().g("new_white_list_host_suffix", "tools");
                java.lang.String g19 = com.p314xaae8f345.p3210x3857dc.b.m().g("new_black_list_host_suffix", "tools");
                f301877a.addAll(d(g17));
                f301878b.addAll(d(g18));
                f301879c.addAll(d(g19));
                f301880d = true;
            } catch (java.lang.Throwable th6) {
                by5.c4.d("UrlDispatcher", "init failed error", th6);
            }
            return f301880d;
        }
    }

    public static boolean c(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                if (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equalsIgnoreCase(str2)) {
                    return true;
                }
                if (str.endsWith(str2) && (str.length() == str2.length() || str.charAt((str.length() - str2.length()) - 1) == '.')) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.util.List d(java.lang.String str) {
        java.lang.String[] split;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!android.text.TextUtils.isEmpty(str) && (split = str.split(",")) != null && split.length != 0) {
            for (java.lang.String str2 : split) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    arrayList.add(str2.trim());
                }
            }
        }
        return arrayList;
    }
}

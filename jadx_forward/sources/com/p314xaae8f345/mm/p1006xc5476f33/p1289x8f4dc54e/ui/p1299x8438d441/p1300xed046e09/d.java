package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f175738a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f175739b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f175740c = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(java.lang.String domain) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(domain, "domain");
        java.lang.String g17 = g(domain, false, 2, null);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.a.class) {
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) f175740c.get(g17);
            if (concurrentLinkedDeque != null) {
                for (java.lang.String str : concurrentLinkedDeque) {
                    java.lang.String str2 = (java.lang.String) f175738a.remove(str);
                    if (str2 != null) {
                        linkedList.add(str2);
                    }
                    java.lang.String str3 = (java.lang.String) f175739b.remove(str);
                    if (str3 != null) {
                        linkedList.add(str3);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppMsgContextEx", "clearDomain:" + domain + '#' + g17 + ", [" + kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null) + ']');
    }

    public static final com.p314xaae8f345.mm.vfs.r6 b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6Var, "<this>");
        if (!r6Var.m()) {
            java.lang.String r17 = r6Var.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(r17);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.r(m17.f294800b);
            }
            r6Var.k();
        }
        return r6Var;
    }

    public static final com.p314xaae8f345.mm.vfs.r6 c(com.p314xaae8f345.mm.sdk.p2603x2137b148.g3 g3Var, java.lang.String contentId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentId, "contentId");
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) g3Var.d(contentId);
        if (r6Var != null) {
            return f(r6Var, contentId);
        }
        return null;
    }

    public static final java.lang.String d(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return "_content_" + q(url, false, 2, null);
    }

    public static final java.lang.String e(r45.i9 i9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i9Var, "<this>");
        java.lang.String Url = i9Var.f458355d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
        return d(Url);
    }

    public static final com.p314xaae8f345.mm.vfs.r6 f(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str) {
        return new com.p314xaae8f345.mm.vfs.r6(r6Var.u() + '/' + str);
    }

    public static java.lang.String g(java.lang.String domain, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(domain, "domain");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("_domain_");
        sb6.append(z17 ? "fetch_" : "");
        sb6.append(domain.hashCode());
        return sb6.toString();
    }

    public static final java.lang.String h(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return "_info_" + p(url, false);
    }

    public static final java.lang.String i(java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return "_web_" + p(url, z17);
    }

    public static final java.lang.String j(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        try {
            java.lang.String host = android.net.Uri.parse(hy4.i.h(str)).getHost();
            return host == null ? "unknow" : host;
        } catch (java.lang.Exception unused) {
            return "unknow";
        }
    }

    public static final java.lang.String k(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return "_info_" + q(url, false, 2, null);
    }

    public static final java.lang.String l(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return "_invalid_" + q(url, false, 2, null);
    }

    public static final int m(int i17) {
        byte[] j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().j("_msg_scene_strip");
        boolean z17 = false;
        if (j17 != null) {
            if (!(j17.length == 0)) {
                z17 = true;
            }
        }
        if (!z17) {
            return 10;
        }
        r45.hv5 hv5Var = new r45.hv5();
        hv5Var.mo11468x92b714fd(j17);
        java.util.LinkedList<r45.gv5> SceneControlList = hv5Var.f458006d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SceneControlList, "SceneControlList");
        for (r45.gv5 gv5Var : SceneControlList) {
            if (gv5Var.f457086d == i17) {
                if (gv5Var.f457087e > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgContextEx", "strip " + i17 + ':' + gv5Var.f457087e);
                    return gv5Var.f457087e;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgContextEx", "strip error " + i17 + ':' + gv5Var.f457087e);
            }
        }
        return 10;
    }

    public static final java.lang.String n(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return q(url, false, 2, null);
    }

    public static final java.lang.String o(java.lang.String host, java.lang.String resUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resUrl, "resUrl");
        return host + "/_web_res_" + q(resUrl, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String p(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.p(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: Exception -> 0x00d2, TryCatch #0 {Exception -> 0x00d2, blocks: (B:27:0x009c, B:29:0x00a2, B:31:0x00a8, B:35:0x00b5, B:37:0x00bd, B:41:0x00cd, B:52:0x00c6), top: B:26:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q(java.lang.String r8, boolean r9, int r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.q(java.lang.String, boolean, int, java.lang.Object):java.lang.String");
    }

    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 r() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("mpRelateData_" + (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? gm0.j1.b().h() : gm0.m.i()), 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N, "getMMKV(...)");
        return N;
    }

    public static final void s(java.lang.String shortUrl, java.lang.String longUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortUrl, "shortUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longUrl, "longUrl");
        java.lang.String c17 = hy4.i.c(shortUrl, false);
        java.lang.String n17 = n(longUrl);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgContextEx", "setShortUrlId id:" + n17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgContextEx", "setShortUrlId shortUrl:" + c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgContextEx", "setShortUrlId longUrl:".concat(longUrl));
        r().D("short_url_" + c17, n17);
        f175738a.put(c17, n17);
    }
}

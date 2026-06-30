package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f94205a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f94206b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f94207c = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(java.lang.String domain) {
        kotlin.jvm.internal.o.g(domain, "domain");
        java.lang.String g17 = g(domain, false, 2, null);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (com.tencent.mm.plugin.brandservice.ui.timeline.preload.a.class) {
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) f94207c.get(g17);
            if (concurrentLinkedDeque != null) {
                for (java.lang.String str : concurrentLinkedDeque) {
                    java.lang.String str2 = (java.lang.String) f94205a.remove(str);
                    if (str2 != null) {
                        linkedList.add(str2);
                    }
                    java.lang.String str3 = (java.lang.String) f94206b.remove(str);
                    if (str3 != null) {
                        linkedList.add(str3);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("AppMsgContextEx", "clearDomain:" + domain + '#' + g17 + ", [" + kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null) + ']');
    }

    public static final com.tencent.mm.vfs.r6 b(com.tencent.mm.vfs.r6 r6Var) {
        kotlin.jvm.internal.o.g(r6Var, "<this>");
        if (!r6Var.m()) {
            java.lang.String r17 = r6Var.r();
            kotlin.jvm.internal.o.d(r17);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(r17);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.r(m17.f213267b);
            }
            r6Var.k();
        }
        return r6Var;
    }

    public static final com.tencent.mm.vfs.r6 c(com.tencent.mm.sdk.platformtools.g3 g3Var, java.lang.String contentId) {
        kotlin.jvm.internal.o.g(g3Var, "<this>");
        kotlin.jvm.internal.o.g(contentId, "contentId");
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) g3Var.d(contentId);
        if (r6Var != null) {
            return f(r6Var, contentId);
        }
        return null;
    }

    public static final java.lang.String d(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return "_content_" + q(url, false, 2, null);
    }

    public static final java.lang.String e(r45.i9 i9Var) {
        kotlin.jvm.internal.o.g(i9Var, "<this>");
        java.lang.String Url = i9Var.f376822d;
        kotlin.jvm.internal.o.f(Url, "Url");
        return d(Url);
    }

    public static final com.tencent.mm.vfs.r6 f(com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        return new com.tencent.mm.vfs.r6(r6Var.u() + '/' + str);
    }

    public static java.lang.String g(java.lang.String domain, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(domain, "domain");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("_domain_");
        sb6.append(z17 ? "fetch_" : "");
        sb6.append(domain.hashCode());
        return sb6.toString();
    }

    public static final java.lang.String h(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return "_info_" + p(url, false);
    }

    public static final java.lang.String i(java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        return "_web_" + p(url, z17);
    }

    public static final java.lang.String j(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            java.lang.String host = android.net.Uri.parse(hy4.i.h(str)).getHost();
            return host == null ? "unknow" : host;
        } catch (java.lang.Exception unused) {
            return "unknow";
        }
    }

    public static final java.lang.String k(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return "_info_" + q(url, false, 2, null);
    }

    public static final java.lang.String l(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return "_invalid_" + q(url, false, 2, null);
    }

    public static final int m(int i17) {
        byte[] j17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().j("_msg_scene_strip");
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
        hv5Var.parseFrom(j17);
        java.util.LinkedList<r45.gv5> SceneControlList = hv5Var.f376473d;
        kotlin.jvm.internal.o.f(SceneControlList, "SceneControlList");
        for (r45.gv5 gv5Var : SceneControlList) {
            if (gv5Var.f375553d == i17) {
                if (gv5Var.f375554e > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgContextEx", "strip " + i17 + ':' + gv5Var.f375554e);
                    return gv5Var.f375554e;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgContextEx", "strip error " + i17 + ':' + gv5Var.f375554e);
            }
        }
        return 10;
    }

    public static final java.lang.String n(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return q(url, false, 2, null);
    }

    public static final java.lang.String o(java.lang.String host, java.lang.String resUrl) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(resUrl, "resUrl");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.p(java.lang.String, boolean):java.lang.String");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.q(java.lang.String, boolean, int, java.lang.Object):java.lang.String");
    }

    public static final com.tencent.mm.sdk.platformtools.o4 r() {
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("mpRelateData_" + (com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.b().h() : gm0.m.i()), 2, null);
        kotlin.jvm.internal.o.f(N, "getMMKV(...)");
        return N;
    }

    public static final void s(java.lang.String shortUrl, java.lang.String longUrl) {
        kotlin.jvm.internal.o.g(shortUrl, "shortUrl");
        kotlin.jvm.internal.o.g(longUrl, "longUrl");
        java.lang.String c17 = hy4.i.c(shortUrl, false);
        java.lang.String n17 = n(longUrl);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgContextEx", "setShortUrlId id:" + n17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgContextEx", "setShortUrlId shortUrl:" + c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgContextEx", "setShortUrlId longUrl:".concat(longUrl));
        r().D("short_url_" + c17, n17);
        f94205a.put(c17, n17);
    }
}

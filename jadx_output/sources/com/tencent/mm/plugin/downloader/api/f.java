package com.tencent.mm.plugin.downloader.api;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f96904a = {"dlied4.myapp.com", "dlied5.myapp.com"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f96905b = new java.util.concurrent.ConcurrentHashMap();

    public static java.lang.String a(java.lang.String str) {
        java.lang.String host = com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : android.net.Uri.parse(str).getHost();
        if (com.tencent.mm.sdk.platformtools.t8.K0(host) || !java.util.Arrays.asList(f96904a).contains(host)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadExtension", "domain is not dlied4/dlied5");
            return str;
        }
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.downloader.api.e.class);
        java.lang.String b17 = b(b(str, java.lang.String.format("openid=%s", iPCString != null ? iPCString.f68406d : "")), "p=wechat");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadExtension", "after openid added, url: %s", b17);
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
        synchronized (com.tencent.mm.plugin.downloader.api.f.class) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && strArr != null) {
                for (int i17 = 0; i17 < strArr.length; i17++) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(strArr[i17])) {
                        ((java.util.concurrent.ConcurrentHashMap) f96905b).put(strArr[i17], str);
                    }
                }
            }
        }
    }

    public static synchronized void d(java.lang.String... strArr) {
        synchronized (com.tencent.mm.plugin.downloader.api.f.class) {
            if (strArr != null) {
                for (int i17 = 0; i17 < strArr.length; i17++) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(strArr[i17])) {
                        ((java.util.concurrent.ConcurrentHashMap) f96905b).remove(strArr[i17]);
                    }
                }
            }
        }
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class mg implements com.tencent.map.tools.net.processor.RequestProcessor {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> f50418a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f50419b = false;

    private mg(java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list) {
        this.f50418a = list;
    }

    public static com.tencent.mapsdk.internal.mg a(java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list) {
        return new com.tencent.mapsdk.internal.mg(list);
    }

    private static com.tencent.mapsdk.internal.mg b(java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list) {
        return a(list);
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        com.tencent.map.tools.net.http.HttpProxy httpProxy;
        java.lang.String str = netRequest.url;
        boolean z17 = this.f50419b;
        java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list = this.f50418a;
        if (list != null && !list.isEmpty()) {
            java.lang.String str2 = str;
            boolean z18 = false;
            for (int i17 = 0; i17 < this.f50418a.size(); i17++) {
                com.tencent.map.tools.net.http.HttpProxyRule httpProxyRule = this.f50418a.get(i17);
                if (httpProxyRule.match(str)) {
                    str2 = httpProxyRule.replaceHost(str);
                    z18 = true;
                }
            }
            if (z18) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                java.lang.String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = "https".equals(parse.getScheme()) ? com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX : 80;
                }
                httpProxy = new com.tencent.map.tools.net.http.HttpProxy(new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(host, port)), str2, z17);
                netRequest.proxy = httpProxy;
            }
        }
        httpProxy = null;
        netRequest.proxy = httpProxy;
    }

    private com.tencent.map.tools.net.http.HttpProxy a(java.lang.String str, boolean z17) {
        java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list = this.f50418a;
        if (list != null && !list.isEmpty()) {
            java.lang.String str2 = str;
            boolean z18 = false;
            for (int i17 = 0; i17 < this.f50418a.size(); i17++) {
                com.tencent.map.tools.net.http.HttpProxyRule httpProxyRule = this.f50418a.get(i17);
                if (httpProxyRule.match(str)) {
                    str2 = httpProxyRule.replaceHost(str);
                    z18 = true;
                }
            }
            if (z18) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                java.lang.String host = parse.getHost();
                int port = parse.getPort();
                if (port < 0 || port > 65535) {
                    port = "https".equals(parse.getScheme()) ? com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX : 80;
                }
                return new com.tencent.map.tools.net.http.HttpProxy(new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(host, port)), str2, z17);
            }
        }
        return null;
    }
}

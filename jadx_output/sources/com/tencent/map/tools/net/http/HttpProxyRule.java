package com.tencent.map.tools.net.http;

/* loaded from: classes13.dex */
public class HttpProxyRule extends com.tencent.map.tools.json.JsonComposer {

    @com.tencent.map.tools.json.annotation.Json(name = "domain")
    public java.lang.String domain;

    @com.tencent.map.tools.json.annotation.Json(name = "proxy_domain")
    public java.lang.String proxyDomain;

    public boolean match(java.lang.String str) {
        android.net.Uri parse;
        java.lang.String scheme;
        java.lang.String host;
        if (str == null || (scheme = (parse = android.net.Uri.parse(str)).getScheme()) == null || !scheme.startsWith("http") || (host = parse.getHost()) == null || android.text.TextUtils.isEmpty(host)) {
            return false;
        }
        return host.matches(this.domain);
    }

    public java.lang.String replaceHost(java.lang.String str) {
        java.lang.String host;
        if (str == null) {
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String scheme = parse.getScheme();
        return (scheme == null || !scheme.startsWith("http") || (host = parse.getHost()) == null || android.text.TextUtils.isEmpty(host) || !host.matches(this.domain)) ? str : parse.buildUpon().encodedAuthority(this.proxyDomain).build().toString();
    }
}

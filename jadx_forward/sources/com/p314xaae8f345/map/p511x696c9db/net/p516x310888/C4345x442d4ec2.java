package com.p314xaae8f345.map.p511x696c9db.net.p516x310888;

/* renamed from: com.tencent.map.tools.net.http.HttpProxyRule */
/* loaded from: classes13.dex */
public class C4345x442d4ec2 extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

    /* renamed from: domain */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "domain")
    public java.lang.String f17024xb0f3d4c4;

    /* renamed from: proxyDomain */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "proxy_domain")
    public java.lang.String f17025x632680d2;

    /* renamed from: match */
    public boolean m36055x62dd9c5(java.lang.String str) {
        android.net.Uri parse;
        java.lang.String scheme;
        java.lang.String host;
        if (str == null || (scheme = (parse = android.net.Uri.parse(str)).getScheme()) == null || !scheme.startsWith("http") || (host = parse.getHost()) == null || android.text.TextUtils.isEmpty(host)) {
            return false;
        }
        return host.matches(this.f17024xb0f3d4c4);
    }

    /* renamed from: replaceHost */
    public java.lang.String m36056x199ea27c(java.lang.String str) {
        java.lang.String host;
        if (str == null) {
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String scheme = parse.getScheme();
        return (scheme == null || !scheme.startsWith("http") || (host = parse.getHost()) == null || android.text.TextUtils.isEmpty(host) || !host.matches(this.f17024xb0f3d4c4)) ? str : parse.buildUpon().encodedAuthority(this.f17025x632680d2).build().toString();
    }
}

package org.p3343x72743996.net.p3359x113d858d;

/* renamed from: org.chromium.net.urlconnection.CronetHttpURLStreamHandler */
/* loaded from: classes16.dex */
class C29642x2b41d2a0 extends java.net.URLStreamHandler {

    /* renamed from: mCronetEngine */
    private final org.p3343x72743996.net.AbstractC29507xc7c0f987 f74914xf085d96c;

    public C29642x2b41d2a0(org.p3343x72743996.net.AbstractC29507xc7c0f987 abstractC29507xc7c0f987) {
        this.f74914xf085d96c = abstractC29507xc7c0f987;
    }

    @Override // java.net.URLStreamHandler
    public java.net.URLConnection openConnection(java.net.URL url) {
        return this.f74914xf085d96c.mo153159x946eacc8(url);
    }

    @Override // java.net.URLStreamHandler
    public java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        return this.f74914xf085d96c.mo153235x946eacc8(url, proxy);
    }
}

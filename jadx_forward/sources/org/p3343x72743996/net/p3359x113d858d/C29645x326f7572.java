package org.p3343x72743996.net.p3359x113d858d;

/* renamed from: org.chromium.net.urlconnection.CronetURLStreamHandlerFactory */
/* loaded from: classes16.dex */
public class C29645x326f7572 implements java.net.URLStreamHandlerFactory {

    /* renamed from: mCronetEngine */
    private final org.p3343x72743996.net.AbstractC29507xc7c0f987 f74923xf085d96c;

    public C29645x326f7572(org.p3343x72743996.net.AbstractC29507xc7c0f987 abstractC29507xc7c0f987) {
        if (abstractC29507xc7c0f987 == null) {
            throw new java.lang.NullPointerException("CronetEngine is null.");
        }
        this.f74923xf085d96c = abstractC29507xc7c0f987;
    }

    @Override // java.net.URLStreamHandlerFactory
    public java.net.URLStreamHandler createURLStreamHandler(java.lang.String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new org.p3343x72743996.net.p3359x113d858d.C29642x2b41d2a0(this.f74923xf085d96c);
        }
        return null;
    }
}

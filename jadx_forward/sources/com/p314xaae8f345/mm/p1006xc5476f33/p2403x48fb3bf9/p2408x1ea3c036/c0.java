package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes7.dex */
public class c0 implements qf.c {
    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        java.io.PipedOutputStream pipedOutputStream = new java.io.PipedOutputStream();
        try {
            java.io.PipedInputStream pipedInputStream = new java.io.PipedInputStream(pipedOutputStream);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19260x107b106 c19260x107b106 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19260x107b106(null);
            c19260x107b106.f263656f = str;
            c19260x107b106.f263657g = 1;
            c19260x107b106.f263659i = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a0(this, c19260x107b106, pipedOutputStream);
            c19260x107b106.d();
            return new android.webkit.WebResourceResponse("image/*", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, pipedInputStream);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // qf.c
    public java.lang.String b() {
        return "weixin://resourceid/.*";
    }
}

package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class mc extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde f131944a;

    private static java.io.InputStream a(java.io.InputStream inputStream) {
        return inputStream;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu
    public final void b() {
        super.b();
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde = this.f131944a;
        if (c4330xdd3bdcde != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) c4330xdd3bdcde.m36024xc7995ab4());
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu
    public java.io.InputStream e(java.lang.String str) {
        com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder url = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str);
        a(url);
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35998x180373eb = url.m35998x180373eb();
        this.f131944a = m35998x180373eb;
        if (m35998x180373eb == null) {
            a(new com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde(url.m36002x1b5efe28()));
            return null;
        }
        java.io.InputStream m36024xc7995ab4 = m35998x180373eb.m36024xc7995ab4();
        a(this.f131944a);
        return m36024xc7995ab4;
    }

    public void a(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder netRequestBuilder) {
    }

    public void a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
    }
}

package com.p314xaae8f345.map.p511x696c9db.net.p516x310888;

/* renamed from: com.tencent.map.tools.net.http.HttpConnectionInputStream */
/* loaded from: classes12.dex */
public class C4343xdc81b264 extends java.io.InputStream {

    /* renamed from: mConnection */
    private final java.net.HttpURLConnection f17019xadf6772b;

    /* renamed from: mProxyInputStream */
    private final java.io.InputStream f17020x8a578b29;

    public C4343xdc81b264(java.net.HttpURLConnection httpURLConnection) {
        this.f17019xadf6772b = httpURLConnection;
        this.f17020x8a578b29 = httpURLConnection.getInputStream();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) this.f17020x8a578b29);
        this.f17019xadf6772b.disconnect();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f17020x8a578b29.read();
    }
}

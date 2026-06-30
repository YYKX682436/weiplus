package com.tencent.map.tools.net.http;

/* loaded from: classes12.dex */
public class HttpConnectionInputStream extends java.io.InputStream {
    private final java.net.HttpURLConnection mConnection;
    private final java.io.InputStream mProxyInputStream;

    public HttpConnectionInputStream(java.net.HttpURLConnection httpURLConnection) {
        this.mConnection = httpURLConnection;
        this.mProxyInputStream = httpURLConnection.getInputStream();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) this.mProxyInputStream);
        this.mConnection.disconnect();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.mProxyInputStream.read();
    }
}

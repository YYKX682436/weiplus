package com.facebook.soloader;

/* loaded from: classes13.dex */
public class k0 implements com.facebook.soloader.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.soloader.g0 f44044d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f44045e;

    public k0(com.facebook.soloader.g0 g0Var, java.io.InputStream inputStream) {
        this.f44044d = g0Var;
        this.f44045e = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44045e.close();
    }
}

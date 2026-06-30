package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public class k0 implements com.p166x1da19ac6.p168x5890096f.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p166x1da19ac6.p168x5890096f.g0 f125577d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f125578e;

    public k0(com.p166x1da19ac6.p168x5890096f.g0 g0Var, java.io.InputStream inputStream) {
        this.f125577d = g0Var;
        this.f125578e = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f125578e.close();
    }
}

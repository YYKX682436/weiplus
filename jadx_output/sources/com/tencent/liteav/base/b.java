package com.tencent.liteav.base;

/* loaded from: classes13.dex */
public final class b implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.StrictMode.ThreadPolicy f46286a;

    /* renamed from: b, reason: collision with root package name */
    private final android.os.StrictMode.VmPolicy f46287b;

    private b(android.os.StrictMode.ThreadPolicy threadPolicy) {
        this.f46286a = threadPolicy;
        this.f46287b = null;
    }

    public static com.tencent.liteav.base.b a() {
        return new com.tencent.liteav.base.b(android.os.StrictMode.allowThreadDiskWrites(), (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        android.os.StrictMode.ThreadPolicy threadPolicy = this.f46286a;
        if (threadPolicy != null) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
        android.os.StrictMode.VmPolicy vmPolicy = this.f46287b;
        if (vmPolicy != null) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private b(android.os.StrictMode.ThreadPolicy threadPolicy, byte b17) {
        this(threadPolicy);
    }
}

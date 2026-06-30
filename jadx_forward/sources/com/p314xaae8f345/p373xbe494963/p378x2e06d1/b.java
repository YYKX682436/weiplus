package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

/* loaded from: classes13.dex */
public final class b implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.StrictMode.ThreadPolicy f127819a;

    /* renamed from: b, reason: collision with root package name */
    private final android.os.StrictMode.VmPolicy f127820b;

    private b(android.os.StrictMode.ThreadPolicy threadPolicy) {
        this.f127819a = threadPolicy;
        this.f127820b = null;
    }

    public static com.p314xaae8f345.p373xbe494963.p378x2e06d1.b a() {
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b(android.os.StrictMode.allowThreadDiskWrites(), (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        android.os.StrictMode.ThreadPolicy threadPolicy = this.f127819a;
        if (threadPolicy != null) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
        android.os.StrictMode.VmPolicy vmPolicy = this.f127820b;
        if (vmPolicy != null) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private b(android.os.StrictMode.ThreadPolicy threadPolicy, byte b17) {
        this(threadPolicy);
    }
}

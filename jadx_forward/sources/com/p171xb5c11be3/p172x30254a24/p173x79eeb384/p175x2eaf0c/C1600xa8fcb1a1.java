package com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c;

/* renamed from: com.github.henryye.nativeiv.comm.NativeImageJni */
/* loaded from: classes7.dex */
public class C1600xa8fcb1a1 {

    /* renamed from: a, reason: collision with root package name */
    public long f125605a = 0;

    static {
        g8.g.f350942a.d("NativeImageJni", "load library", new java.lang.Object[0]);
        g8.c.f350941a.mo1902xeb57c8f5("native-iv");
    }

    /* renamed from: nativeDecodeNative */
    private native com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1598x8de4afe7 m17144xd6ff5d5c(long j17, java.nio.ByteBuffer byteBuffer, int i17, boolean z17);

    /* renamed from: nativeDestroy */
    private native void m17145x23caefe3(long j17);

    /* renamed from: nativeInit */
    private native long m17146xb90145c7();

    /* renamed from: nativeRecycleNative */
    private native void m17147x811531b3(long j17, long j18);

    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p175x2eaf0c.C1598x8de4afe7 a(java.nio.ByteBuffer byteBuffer, int i17, boolean z17) {
        long j17 = this.f125605a;
        if (j17 != 0) {
            return m17144xd6ff5d5c(j17, byteBuffer, i17, z17);
        }
        return null;
    }

    public void b() {
        long j17 = this.f125605a;
        if (j17 != 0) {
            m17145x23caefe3(j17);
        }
    }

    public void c() {
        if (this.f125605a != 0) {
            throw new java.lang.IllegalStateException("NativeImageJni not released last time");
        }
        this.f125605a = m17146xb90145c7();
    }

    public void d(long j17) {
        long j18 = this.f125605a;
        if (j18 != 0) {
            m17147x811531b3(j18, j17);
        }
    }
}

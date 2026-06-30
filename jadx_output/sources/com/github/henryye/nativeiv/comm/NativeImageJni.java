package com.github.henryye.nativeiv.comm;

/* loaded from: classes7.dex */
public class NativeImageJni {

    /* renamed from: a, reason: collision with root package name */
    public long f44072a = 0;

    static {
        g8.g.f269409a.d("NativeImageJni", "load library", new java.lang.Object[0]);
        g8.c.f269408a.loadLibrary("native-iv");
    }

    private native com.github.henryye.nativeiv.comm.CommNativeBitmapStruct nativeDecodeNative(long j17, java.nio.ByteBuffer byteBuffer, int i17, boolean z17);

    private native void nativeDestroy(long j17);

    private native long nativeInit();

    private native void nativeRecycleNative(long j17, long j18);

    public com.github.henryye.nativeiv.comm.CommNativeBitmapStruct a(java.nio.ByteBuffer byteBuffer, int i17, boolean z17) {
        long j17 = this.f44072a;
        if (j17 != 0) {
            return nativeDecodeNative(j17, byteBuffer, i17, z17);
        }
        return null;
    }

    public void b() {
        long j17 = this.f44072a;
        if (j17 != 0) {
            nativeDestroy(j17);
        }
    }

    public void c() {
        if (this.f44072a != 0) {
            throw new java.lang.IllegalStateException("NativeImageJni not released last time");
        }
        this.f44072a = nativeInit();
    }

    public void d(long j17) {
        long j18 = this.f44072a;
        if (j18 != 0) {
            nativeRecycleNative(j18, j17);
        }
    }
}

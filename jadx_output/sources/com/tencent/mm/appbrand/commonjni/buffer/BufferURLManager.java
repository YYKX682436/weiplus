package com.tencent.mm.appbrand.commonjni.buffer;

/* loaded from: classes7.dex */
public class BufferURLManager {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f53940a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f53941b = new java.util.LinkedHashSet();

    public BufferURLManager() {
        this.f53940a = 0L;
        this.f53940a = nativeCreate();
        bl.h.a("BufferURLManager", "BufferURLManager created %d", java.lang.Long.valueOf(this.f53940a));
    }

    private static native void nativeBindTo(long j17, long j18, long j19);

    private native long nativeCreate();

    private static native java.lang.String nativeCreateBufferURLWithDirectBuffer(long j17, java.nio.ByteBuffer byteBuffer);

    private static native java.lang.String nativeCreateBufferURLWithLegacyArrayBuffer(long j17, byte[] bArr, int i17);

    private static native void nativeDestroy(long j17);

    private static native java.nio.ByteBuffer nativeGetBuffer(long j17, java.lang.String str);

    private static native void nativeRevokeBufferURL(long j17, java.lang.String str);

    public void a(long j17, long j18) {
        bl.h.a("BufferURLManager", "BufferURLManager %d %d %d", java.lang.Long.valueOf(this.f53940a), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        nativeBindTo(this.f53940a, j17, j18);
    }

    public void b() {
        bl.h.a("BufferURLManager", "BufferURLManager destroying %d", java.lang.Long.valueOf(this.f53940a));
        nativeDestroy(this.f53940a);
        this.f53940a = 0L;
        synchronized (this.f53941b) {
            this.f53941b.clear();
        }
        bl.h.a("BufferURLManager", "BufferURLManager destroyed %d", java.lang.Long.valueOf(this.f53940a));
    }

    public java.nio.ByteBuffer c(java.lang.String str) {
        if (str != null) {
            return nativeGetBuffer(this.f53940a, str);
        }
        bl.h.f21675a.e("BufferURLManager", "BufferURLManager getBuffer but url is null", new java.lang.Object[0]);
        return null;
    }

    public void onJSRevoked(java.lang.String str) {
        java.util.LinkedList linkedList;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f53941b) {
            linkedList = new java.util.LinkedList(this.f53941b);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.appbrand.commonjni.buffer.a) it.next()).a(str);
        }
    }
}

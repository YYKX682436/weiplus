package com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440;

/* renamed from: com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager */
/* loaded from: classes7.dex */
public class C5136x9c8c9fbe {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f135473a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f135474b = new java.util.LinkedHashSet();

    public C5136x9c8c9fbe() {
        this.f135473a = 0L;
        this.f135473a = m43202x73c02ff3();
        bl.h.a("BufferURLManager", "BufferURLManager created %d", java.lang.Long.valueOf(this.f135473a));
    }

    /* renamed from: nativeBindTo */
    private static native void m43201x7190a28f(long j17, long j18, long j19);

    /* renamed from: nativeCreate */
    private native long m43202x73c02ff3();

    /* renamed from: nativeCreateBufferURLWithDirectBuffer */
    private static native java.lang.String m43203x68cb5feb(long j17, java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeCreateBufferURLWithLegacyArrayBuffer */
    private static native java.lang.String m43204x1dd8cf4e(long j17, byte[] bArr, int i17);

    /* renamed from: nativeDestroy */
    private static native void m43205x23caefe3(long j17);

    /* renamed from: nativeGetBuffer */
    private static native java.nio.ByteBuffer m43206xf955b0df(long j17, java.lang.String str);

    /* renamed from: nativeRevokeBufferURL */
    private static native void m43207x6ecfac12(long j17, java.lang.String str);

    public void a(long j17, long j18) {
        bl.h.a("BufferURLManager", "BufferURLManager %d %d %d", java.lang.Long.valueOf(this.f135473a), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        m43201x7190a28f(this.f135473a, j17, j18);
    }

    public void b() {
        bl.h.a("BufferURLManager", "BufferURLManager destroying %d", java.lang.Long.valueOf(this.f135473a));
        m43205x23caefe3(this.f135473a);
        this.f135473a = 0L;
        synchronized (this.f135474b) {
            this.f135474b.clear();
        }
        bl.h.a("BufferURLManager", "BufferURLManager destroyed %d", java.lang.Long.valueOf(this.f135473a));
    }

    public java.nio.ByteBuffer c(java.lang.String str) {
        if (str != null) {
            return m43206xf955b0df(this.f135473a, str);
        }
        bl.h.f103208a.e("BufferURLManager", "BufferURLManager getBuffer but url is null", new java.lang.Object[0]);
        return null;
    }

    /* renamed from: onJSRevoked */
    public void m43208xb54d1a16(java.lang.String str) {
        java.util.LinkedList linkedList;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f135474b) {
            linkedList = new java.util.LinkedList(this.f135474b);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.a) it.next()).a(str);
        }
    }
}

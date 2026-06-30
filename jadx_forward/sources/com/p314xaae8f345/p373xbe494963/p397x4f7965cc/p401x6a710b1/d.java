package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a f128354a = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(1000);

    public static byte[] a(int i17) {
        try {
            return new byte[i17];
        } catch (java.lang.OutOfMemoryError e17) {
            a(e17.getMessage());
            return null;
        }
    }

    public static java.nio.ByteBuffer b(int i17) {
        try {
            return java.nio.ByteBuffer.allocateDirect(i17);
        } catch (java.lang.OutOfMemoryError e17) {
            a(e17.getMessage());
            return null;
        }
    }

    private static synchronized void a(java.lang.String str) {
        synchronized (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.class) {
            if (f128354a.a()) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("MemoryAllocator", "allocate buffer failed with oom error, msg:".concat(java.lang.String.valueOf(str)));
                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.c.a().a(new android.content.Intent("com.tencent.liteav.video.action.OUT_OF_MEMORY"));
            }
        }
    }
}

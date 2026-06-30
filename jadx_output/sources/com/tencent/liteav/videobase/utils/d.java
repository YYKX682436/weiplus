package com.tencent.liteav.videobase.utils;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.b.a f46821a = new com.tencent.liteav.base.b.a(1000);

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
        synchronized (com.tencent.liteav.videobase.utils.d.class) {
            if (f46821a.a()) {
                com.tencent.liteav.base.util.LiteavLog.e("MemoryAllocator", "allocate buffer failed with oom error, msg:".concat(java.lang.String.valueOf(str)));
                com.tencent.liteav.videobase.utils.c.a().a(new android.content.Intent("com.tencent.liteav.video.action.OUT_OF_MEMORY"));
            }
        }
    }
}

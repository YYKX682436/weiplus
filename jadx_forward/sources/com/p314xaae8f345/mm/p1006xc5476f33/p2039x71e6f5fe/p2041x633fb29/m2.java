package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes8.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.m2 f240491d = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.m2();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n2.f240497a;
        java.util.Enumeration keys = concurrentHashMap.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(keys);
        while (keys.hasMoreElements()) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) concurrentHashMap.get((java.lang.String) keys.nextElement());
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        concurrentHashMap.clear();
    }
}

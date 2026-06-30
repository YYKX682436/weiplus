package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes14.dex */
public class c extends com.p314xaae8f345.mm.p872xbfc2bd01.a {

    /* renamed from: d, reason: collision with root package name */
    public static int f150488d = 20971520;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p872xbfc2bd01.c f150489e = new com.p314xaae8f345.mm.p872xbfc2bd01.c();

    public c() {
        int largeMemoryClass = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BitmapPool", "BitmapPool %dMB", java.lang.Integer.valueOf(largeMemoryClass));
        if (largeMemoryClass > 256) {
            f150488d = 20971520;
        } else if (largeMemoryClass > 128) {
            f150488d = 10485760;
        } else {
            f150488d = 5242880;
        }
        if (this.f150494b.size() > 0) {
            s75.d.b(new com.p314xaae8f345.mm.p872xbfc2bd01.e(this), "BucketPool_preload");
        }
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        int intValue = ((java.lang.Integer) comparable).intValue();
        android.graphics.Bitmap.Config config = com.p314xaae8f345.mm.p872xbfc2bd01.n.f150498a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        arrayList.add(1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/memory/BitmapPool", "alloc", "(Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/memory/BitmapPool", "alloc", "(Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public void c() {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_bitmap_pool_free_all_v2", "1", false, true), 0) == 1) {
                synchronized (this.f150493a) {
                    for (java.lang.Object obj : ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).keySet()) {
                        if (obj != null && (obj instanceof android.graphics.Bitmap) && !((android.graphics.Bitmap) obj).isRecycled()) {
                            ((android.graphics.Bitmap) obj).recycle();
                        }
                    }
                    ((java.util.concurrent.ConcurrentSkipListMap) this.f150493a).clear();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BitmapPool", e17, "", new java.lang.Object[0]);
        }
        super.c();
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long e(java.lang.Object obj) {
        if (((android.graphics.Bitmap) obj) == null) {
            return 0L;
        }
        return fp.h.a(19) ? r3.getByteCount() : r3.getAllocationByteCount();
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long g() {
        return 1048576L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long h() {
        return f150488d;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return java.lang.Integer.valueOf(((java.lang.Integer) comparable).intValue() * 4);
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public com.p314xaae8f345.mm.p872xbfc2bd01.d j(java.lang.Comparable comparable) {
        return new com.p314xaae8f345.mm.p872xbfc2bd01.b(((java.lang.Integer) comparable).intValue());
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer f(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return java.lang.Integer.valueOf(fp.h.a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount());
    }
}

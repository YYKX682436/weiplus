package com.tencent.mm.memory;

/* loaded from: classes14.dex */
public class c extends com.tencent.mm.memory.a {

    /* renamed from: d, reason: collision with root package name */
    public static int f68955d = 20971520;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.memory.c f68956e = new com.tencent.mm.memory.c();

    public c() {
        int largeMemoryClass = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BitmapPool", "BitmapPool %dMB", java.lang.Integer.valueOf(largeMemoryClass));
        if (largeMemoryClass > 256) {
            f68955d = 20971520;
        } else if (largeMemoryClass > 128) {
            f68955d = 10485760;
        } else {
            f68955d = 5242880;
        }
        if (this.f68961b.size() > 0) {
            s75.d.b(new com.tencent.mm.memory.e(this), "BucketPool_preload");
        }
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        int intValue = ((java.lang.Integer) comparable).intValue();
        android.graphics.Bitmap.Config config = com.tencent.mm.memory.n.f68965a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        arrayList.add(1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/memory/BitmapPool", "alloc", "(Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/memory/BitmapPool", "alloc", "(Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // com.tencent.mm.memory.g
    public void c() {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_bitmap_pool_free_all_v2", "1", false, true), 0) == 1) {
                synchronized (this.f68960a) {
                    for (java.lang.Object obj : ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).keySet()) {
                        if (obj != null && (obj instanceof android.graphics.Bitmap) && !((android.graphics.Bitmap) obj).isRecycled()) {
                            ((android.graphics.Bitmap) obj).recycle();
                        }
                    }
                    ((java.util.concurrent.ConcurrentSkipListMap) this.f68960a).clear();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BitmapPool", e17, "", new java.lang.Object[0]);
        }
        super.c();
    }

    @Override // com.tencent.mm.memory.g
    public long e(java.lang.Object obj) {
        if (((android.graphics.Bitmap) obj) == null) {
            return 0L;
        }
        return fp.h.a(19) ? r3.getByteCount() : r3.getAllocationByteCount();
    }

    @Override // com.tencent.mm.memory.g
    public long g() {
        return 1048576L;
    }

    @Override // com.tencent.mm.memory.g
    public long h() {
        return f68955d;
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return java.lang.Integer.valueOf(((java.lang.Integer) comparable).intValue() * 4);
    }

    @Override // com.tencent.mm.memory.g
    public com.tencent.mm.memory.d j(java.lang.Comparable comparable) {
        return new com.tencent.mm.memory.b(((java.lang.Integer) comparable).intValue());
    }

    @Override // com.tencent.mm.memory.g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer f(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return java.lang.Integer.valueOf(fp.h.a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount());
    }
}

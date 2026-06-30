package com.tencent.mm.memory;

/* loaded from: classes14.dex */
public class u extends com.tencent.mm.memory.g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.memory.u f68981d = new com.tencent.mm.memory.u();

    @Override // com.tencent.mm.memory.g
    public void c() {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_sight_bitmap_pool_free_all", "0", false, true), 0) == 1) {
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightBitmapPool", e17, "", new java.lang.Object[0]);
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
    public java.lang.Comparable f(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        return new com.tencent.mm.memory.t(bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // com.tencent.mm.memory.g
    public long g() {
        return 307200L;
    }

    @Override // com.tencent.mm.memory.g
    public long h() {
        return 1228800L;
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (com.tencent.mm.memory.t) comparable;
    }

    @Override // com.tencent.mm.memory.g
    public com.tencent.mm.memory.d j(java.lang.Comparable comparable) {
        return new com.tencent.mm.memory.s((com.tencent.mm.memory.t) comparable);
    }

    @Override // com.tencent.mm.memory.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public android.graphics.Bitmap b(com.tencent.mm.memory.t tVar) {
        int i17 = tVar.f68978d;
        android.graphics.Bitmap.Config config = com.tencent.mm.memory.n.f68965a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(tVar.f68979e));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/memory/SightBitmapPool", "alloc", "(Lcom/tencent/mm/memory/SightBitmapPool$SightBitmapSize;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/memory/SightBitmapPool", "alloc", "(Lcom/tencent/mm/memory/SightBitmapPool$SightBitmapSize;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public synchronized android.graphics.Bitmap m(com.tencent.mm.memory.t tVar) {
        android.graphics.Bitmap bitmap;
        bitmap = (android.graphics.Bitmap) d(tVar);
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = b(tVar);
        }
        return bitmap;
    }

    public synchronized void n(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                k(bitmap);
                try {
                    if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_sight_bitmap_pool_recycle", "0", false, true), 0) == 1) {
                        bitmap.recycle();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightBitmapPool", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}

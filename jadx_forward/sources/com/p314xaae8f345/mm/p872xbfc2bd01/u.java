package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes14.dex */
public class u extends com.p314xaae8f345.mm.p872xbfc2bd01.g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p872xbfc2bd01.u f150514d = new com.p314xaae8f345.mm.p872xbfc2bd01.u();

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public void c() {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_sight_bitmap_pool_free_all", "0", false, true), 0) == 1) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightBitmapPool", e17, "", new java.lang.Object[0]);
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
    public java.lang.Comparable f(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        return new com.p314xaae8f345.mm.p872xbfc2bd01.t(bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long g() {
        return 307200L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long h() {
        return 1228800L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (com.p314xaae8f345.mm.p872xbfc2bd01.t) comparable;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public com.p314xaae8f345.mm.p872xbfc2bd01.d j(java.lang.Comparable comparable) {
        return new com.p314xaae8f345.mm.p872xbfc2bd01.s((com.p314xaae8f345.mm.p872xbfc2bd01.t) comparable);
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public android.graphics.Bitmap b(com.p314xaae8f345.mm.p872xbfc2bd01.t tVar) {
        int i17 = tVar.f150511d;
        android.graphics.Bitmap.Config config = com.p314xaae8f345.mm.p872xbfc2bd01.n.f150498a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(tVar.f150512e));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/memory/SightBitmapPool", "alloc", "(Lcom/tencent/mm/memory/SightBitmapPool$SightBitmapSize;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/memory/SightBitmapPool", "alloc", "(Lcom/tencent/mm/memory/SightBitmapPool$SightBitmapSize;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public synchronized android.graphics.Bitmap m(com.p314xaae8f345.mm.p872xbfc2bd01.t tVar) {
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
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_sight_bitmap_pool_recycle", "0", false, true), 0) == 1) {
                        bitmap.recycle();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightBitmapPool", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}

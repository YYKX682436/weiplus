package zp;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f556434a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f556435b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final int f556436c;

    /* renamed from: d, reason: collision with root package name */
    public int f556437d;

    /* renamed from: e, reason: collision with root package name */
    public int f556438e;

    /* renamed from: f, reason: collision with root package name */
    public int f556439f;

    public c() {
        android.util.DisplayMetrics displayMetrics = xp.d.b().getResources().getDisplayMetrics();
        this.f556436c = displayMetrics.widthPixels * displayMetrics.heightPixels * 6;
    }

    public android.graphics.Bitmap a(int i17, int i18) {
        this.f556438e++;
        java.util.LinkedList linkedList = this.f556434a;
        java.util.Iterator it = linkedList.iterator();
        zp.b bVar = null;
        while (it.hasNext()) {
            zp.b bVar2 = (zp.b) it.next();
            if (bVar2.f556430b >= i17 && bVar2.f556431c >= i18 && (bVar == null || bVar.f556432d >= bVar2.f556432d)) {
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            linkedList.remove(bVar);
            this.f556437d -= bVar.f556433e;
            android.graphics.Bitmap bitmap = bVar.f556429a;
            bVar.a();
            this.f556435b.addLast(bVar);
            return bitmap;
        }
        try {
            this.f556439f++;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/danmaku/tool/BitmapCacheManager", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/danmaku/tool/BitmapCacheManager", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            return createBitmap;
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BitmapCacheManager", "create bitmap out of memory" + e17);
            return null;
        }
    }

    public void b(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f556437d += bitmap.getRowBytes() * bitmap.getHeight();
        java.util.LinkedList linkedList = this.f556435b;
        zp.b bVar = (zp.b) linkedList.poll();
        if (bVar == null) {
            bVar = new zp.b(null);
        }
        bVar.f556429a = bitmap;
        bVar.f556430b = bitmap.getWidth();
        bVar.f556431c = bitmap.getHeight();
        bVar.f556432d = bitmap.getHeight() * bitmap.getWidth();
        bVar.f556433e = bitmap.getRowBytes() * bitmap.getHeight();
        java.util.LinkedList linkedList2 = this.f556434a;
        linkedList2.addLast(bVar);
        while (this.f556437d > this.f556436c) {
            java.util.Iterator it = linkedList2.iterator();
            zp.b bVar2 = null;
            while (it.hasNext()) {
                zp.b bVar3 = (zp.b) it.next();
                if (bVar2 == null || bVar2.f556432d > bVar3.f556432d) {
                    bVar2 = bVar3;
                }
            }
            if (bVar2 != null) {
                linkedList2.remove(bVar2);
                this.f556437d -= bVar2.f556433e;
                bVar2.a();
                linkedList.addLast(bVar2);
            }
        }
    }
}

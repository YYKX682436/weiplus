package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes4.dex */
public abstract class ud {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f171793a;

    public static android.graphics.drawable.Drawable a() {
        android.graphics.Bitmap bitmap;
        if (f171793a == null || (bitmap = (android.graphics.Bitmap) f171793a.get()) == null || bitmap.isRecycled()) {
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cbh));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/WxaDefaultIcon", "get", "()Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/appbrand/ui/WxaDefaultIcon", "get", "()Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            f171793a = new java.lang.ref.WeakReference(decodeResource);
        }
        f3.i iVar = new f3.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, (android.graphics.Bitmap) f171793a.get());
        iVar.b(true);
        return iVar;
    }
}

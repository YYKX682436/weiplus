package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes4.dex */
public abstract class ud {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f90260a;

    public static android.graphics.drawable.Drawable a() {
        android.graphics.Bitmap bitmap;
        if (f90260a == null || (bitmap = (android.graphics.Bitmap) f90260a.get()) == null || bitmap.isRecycled()) {
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cbh));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/WxaDefaultIcon", "get", "()Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/appbrand/ui/WxaDefaultIcon", "get", "()Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            f90260a = new java.lang.ref.WeakReference(decodeResource);
        }
        f3.i iVar = new f3.i(com.tencent.mm.sdk.platformtools.x2.f193075e, (android.graphics.Bitmap) f90260a.get());
        iVar.b(true);
        return iVar;
    }
}

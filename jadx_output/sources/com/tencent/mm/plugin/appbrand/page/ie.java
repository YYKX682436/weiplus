package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class ie {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.view.View view, android.view.View view2, android.graphics.Canvas canvas) {
        boolean z17 = true;
        if (view2.getVisibility() == 0) {
            if (view2 instanceof pq5.a) {
                z17 = ((pq5.a) view2).c0(canvas);
            } else if (view2 instanceof android.view.ViewGroup) {
                z17 = false;
            } else {
                view2.draw(canvas);
            }
        }
        if (!z17 && (view2 instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
            viewGroup.draw(canvas);
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                float x17 = childAt.getX();
                float y17 = childAt.getY();
                canvas.save();
                canvas.translate(x17, y17);
                a(view, childAt, canvas);
                canvas.restore();
            }
        }
    }

    public static android.graphics.Bitmap b(android.view.View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/ScreenshotDrawableTraversal", "getScreenshotBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/page/ScreenshotDrawableTraversal", "getScreenshotBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        a(view, view, new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }
}

package uj5;

/* loaded from: classes8.dex */
public abstract class g {
    public static void a(android.graphics.Canvas canvas, android.view.View view, boolean z17) {
        android.view.TextureView textureView;
        java.util.List b17 = b(view, (int) view.getX(), (int) view.getY(), z17);
        view.draw(canvas);
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                uj5.f fVar = (uj5.f) it.next();
                if (fVar != null && (textureView = fVar.f509985a) != null) {
                    android.graphics.Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), textureView.getHeight());
                    if (bitmap == null || bitmap.isRecycled()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BitmapUtil", "get thumb bitmap null or is recycled");
                    } else {
                        canvas.drawBitmap(bitmap, fVar.f509987c, fVar.f509988d, (android.graphics.Paint) null);
                    }
                } else if (fVar != null) {
                    com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = fVar.f509986b;
                    if ((c27816xac2547f9 instanceof com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) && z17) {
                        android.graphics.Bitmap f17 = c27816xac2547f9.f();
                        if (f17 == null || f17.isRecycled()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BitmapUtil", "get thumb bitmap null or is recycled");
                        } else {
                            canvas.drawBitmap(f17, fVar.f509987c, fVar.f509988d, (android.graphics.Paint) null);
                        }
                    }
                }
            }
        }
    }

    public static java.util.List b(android.view.View view, int i17, int i18, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.TextureView) {
            uj5.f fVar = new uj5.f();
            fVar.f509985a = (android.view.TextureView) view;
            fVar.f509987c = i17;
            fVar.f509988d = i18;
            arrayList.add(fVar);
        } else if (z17 && (view instanceof com.p314xaae8f345.p3210x3857dc.C27816xac2547f9)) {
            uj5.f fVar2 = new uj5.f();
            fVar2.f509986b = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) view;
            fVar2.f509987c = i17;
            fVar2.f509988d = i18;
            arrayList.add(fVar2);
        } else if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i19 = 0; i19 < viewGroup.getChildCount(); i19++) {
                arrayList.addAll(b(viewGroup.getChildAt(i19), (int) (viewGroup.getX() + i17), (int) (viewGroup.getY() + i18), z17));
            }
        }
        return arrayList;
    }

    public static android.graphics.Bitmap c(android.view.View view) {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/snapshot/SnapShotUtil", "getBitmapFromTextureView", "(Landroid/view/View;ZLandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/snapshot/SnapShotUtil", "getBitmapFromTextureView", "(Landroid/view/View;ZLandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        a(canvas, view, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.H0(createBitmap);
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.t.f274510a;
        return createBitmap;
    }

    public static android.graphics.Bitmap d(android.view.View view, int i17, int i18, boolean z17, android.graphics.Bitmap.Config config) {
        if (view == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/snapshot/SnapShotUtil", "getBitmapFromTextureView", "(Landroid/view/View;IIZLandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/snapshot/SnapShotUtil", "getBitmapFromTextureView", "(Landroid/view/View;IIZLandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(i17 / view.getWidth(), i18 / view.getHeight());
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.setMatrix(matrix);
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        a(canvas, view, z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.H0(createBitmap);
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.t.f274510a;
        return createBitmap;
    }
}

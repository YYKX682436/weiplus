package pa3;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final pa3.w f434545a = new pa3.w();

    /* renamed from: b, reason: collision with root package name */
    public static android.os.HandlerThread f434546b;

    /* renamed from: c, reason: collision with root package name */
    public static long f434547c;

    public static android.graphics.Bitmap b(pa3.w wVar, android.view.View view, java.lang.Integer num, java.lang.Integer num2, android.graphics.Bitmap.Config config, int i17, java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        java.lang.Integer num3 = (i17 & 2) != 0 ? null : num;
        java.lang.Integer num4 = (i17 & 4) != 0 ? null : num2;
        android.graphics.Bitmap.Config config2 = (i17 & 8) != 0 ? android.graphics.Bitmap.Config.ARGB_8888 : config;
        wVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config2, "config");
        int intValue = num3 != null ? num3.intValue() : view.getWidth();
        int intValue2 = num4 != null ? num4.intValue() : view.getHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config2);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intValue2));
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "getBitmapFromSurfaceView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "getBitmapFromSurfaceView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        if (f434546b == null) {
            int i18 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("SnapShotUtil", 0);
            f434546b = a17;
            a17.start();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotUtilKt", "start thread SnapShotUtil");
        }
        java.util.List a18 = wVar.a(view, (int) view.getX(), (int) view.getY());
        view.draw(canvas);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) a18;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                android.view.SurfaceView surfaceView = ((pa3.t) it.next()).f434540a;
                if (surfaceView instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df mo137192x385aa5fd = ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56) surfaceView).mo137192x385aa5fd();
                    bitmap = mo137192x385aa5fd != null ? mo137192x385aa5fd.m138025x12501425() : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapShotUtilKt", "captureFlutterSurfaceView, result:" + bitmap);
                } else {
                    java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    int width = surfaceView.getWidth();
                    int height = surfaceView.getHeight();
                    android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(config3);
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(height));
                    arrayList3.add(java.lang.Integer.valueOf(width));
                    java.lang.Object obj3 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "captureSurfaceView", "(Landroid/view/SurfaceView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                    yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "captureSurfaceView", "(Landroid/view/SurfaceView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap2, "createBitmap(...)");
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        pa3.u uVar = new pa3.u(countDownLatch);
                        android.os.HandlerThread handlerThread = f434546b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handlerThread);
                        android.view.PixelCopy.request(surfaceView, createBitmap2, uVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(handlerThread.getLooper()));
                    } else {
                        countDownLatch.countDown();
                    }
                    countDownLatch.await();
                    bitmap = createBitmap2;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, r6.f434541b, r6.f434542c, (android.graphics.Paint) null);
                }
            }
        }
        f434547c = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f394148d;
        pa3.v vVar = pa3.v.f434544d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(vVar, 60000L, false);
        return createBitmap;
    }

    public final java.util.List a(android.view.View view, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.SurfaceView) {
            arrayList.add(new pa3.t((android.view.SurfaceView) view, i17, i18));
        } else if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                android.view.View childAt = viewGroup.getChildAt(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                arrayList.addAll(a(childAt, (int) (viewGroup.getX() + i17), (int) (viewGroup.getY() + i18)));
            }
        }
        return arrayList;
    }
}

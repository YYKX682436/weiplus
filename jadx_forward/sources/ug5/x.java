package ug5;

/* loaded from: classes3.dex */
public abstract class x {
    public static final int a(android.view.Window window) {
        float refreshRate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.Display display = window.getContext().getDisplay();
            refreshRate = display != null ? display.getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        return a06.d.b(refreshRate);
    }

    public static final android.graphics.Bitmap b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view instanceof android.widget.ImageView) {
            android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) view).getDrawable();
            android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
            android.graphics.Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        int width = view.getWidth();
        int height = view.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformerKt", "getDrawBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/fluent/ViewFluentPerformerKt", "getDrawBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        view.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    public static android.graphics.Rect c(android.view.View view, boolean z17, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.right = view.getWidth();
        rect.bottom = view.getHeight();
        rect.offsetTo(iArr[0], iArr[1]);
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(android.content.Intent r3, ug5.v r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "performer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "intent_key_support_performer"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "intent_key_ignore_back"
            r3.putExtra(r0, r1)
            if (r5 == 0) goto L26
            int r0 = r5.length()
            if (r0 <= 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L23
            r0 = r5
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L2a
        L26:
            java.lang.String r0 = r4.toString()
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "saveViewPerformer businessKey: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " params: "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "ViewFluentPerformer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            java.lang.String r5 = "intent_key_view_performer"
            r3.putExtra(r5, r0)
            ug5.f r3 = ug5.v.f509188g
            java.util.HashMap r3 = ug5.v.f509190i
            r3.put(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ug5.x.d(android.content.Intent, ug5.v, java.lang.String):void");
    }

    public static final void e(android.view.Window window, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "<this>");
        window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(i17));
    }

    public static final void f(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "<this>");
        window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        window.getDecorView().setBackgroundColor(0);
    }

    public static final android.graphics.RectF g(android.graphics.Rect rect, android.graphics.Rect rect2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect2, "rect");
        float width = rect.left / rect2.width();
        if (0.0f >= width) {
            width = 0.0f;
        }
        float height = rect.top / rect2.height();
        if (0.0f >= height) {
            height = 0.0f;
        }
        float width2 = rect.right / rect2.width();
        if (0.0f >= width2) {
            width2 = 0.0f;
        }
        float height2 = rect.bottom / rect2.height();
        return new android.graphics.RectF(width, height, width2, 0.0f < height2 ? height2 : 0.0f);
    }
}

package com.tencent.mm.plugin.appbrand.canvas.widget;

/* loaded from: classes13.dex */
public class MCanvasView extends android.view.View implements h91.b {

    /* renamed from: d, reason: collision with root package name */
    public final z81.g f77170d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f77171e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f77172f;

    public MCanvasView(android.content.Context context) {
        super(context);
        this.f77170d = new z81.g(this);
        this.f77171e = new java.util.LinkedHashSet();
        hashCode();
    }

    @Override // h91.b
    public void a() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.c(this)) {
            postInvalidate();
        } else {
            post(new h91.d(this));
        }
    }

    @Override // android.view.View
    public void addOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        java.util.Set set = this.f77171e;
        if (set.contains(onAttachStateChangeListener)) {
            return;
        }
        set.add(onAttachStateChangeListener);
        super.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Override // h91.b
    public void b(java.lang.Runnable runnable) {
        post(runnable);
    }

    @Override // h91.b
    public void c(org.json.JSONArray jSONArray, h91.a aVar) {
        this.f77170d.c(jSONArray, aVar);
    }

    @Override // h91.b
    public boolean d(android.graphics.Canvas canvas) {
        return this.f77170d.d(canvas);
    }

    @Override // h91.b
    public void e(org.json.JSONArray jSONArray, h91.a aVar) {
        this.f77170d.e(jSONArray, aVar);
    }

    public final void f() {
        android.graphics.Bitmap bitmap = this.f77172f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MCanvasView", "bitmap recycle %s %s", java.lang.Integer.valueOf(hashCode()), this.f77172f);
        this.f77172f.recycle();
    }

    public z81.i getDrawContext() {
        return this.f77170d.f470700g;
    }

    public java.lang.String getSessionId() {
        return this.f77170d.f470703m;
    }

    public java.lang.String getTraceId() {
        return this.f77170d.f470709s;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        android.graphics.Bitmap bitmap = this.f77172f;
        if (bitmap == null || bitmap.isRecycled() || this.f77172f.getWidth() != measuredWidth || this.f77172f.getHeight() != measuredHeight) {
            f();
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(measuredHeight));
                arrayList.add(java.lang.Integer.valueOf(measuredWidth));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                this.f77172f = createBitmap;
                hashCode();
            } catch (java.lang.OutOfMemoryError unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MCanvasView", "onDraw oom w:%d h:%d", java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight));
                this.f77172f = null;
            }
        }
        android.graphics.Bitmap bitmap2 = this.f77172f;
        if (bitmap2 == null) {
            return;
        }
        bitmap2.eraseColor(0);
        z81.l lVar = new z81.l(this.f77172f);
        d(lVar);
        try {
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            canvas.drawBitmap(lVar.f470720a, 0.0f, 0.0f, (android.graphics.Paint) null);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MCanvasView", e, "", new java.lang.Object[0]);
            d(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        f();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        try {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onSizeChanged", "(IIII)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onSizeChanged", "(IIII)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f77172f = createBitmap;
            hashCode();
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MCanvasView", "onSizeChanged oom w:%d h:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            this.f77172f = null;
        }
    }

    @Override // android.view.View
    public void removeOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f77171e.remove(onAttachStateChangeListener);
        super.removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public void setDrawActionReportable(g91.a aVar) {
        this.f77170d.getClass();
    }

    public void setSessionId(java.lang.String str) {
        this.f77170d.f470703m = str;
    }

    public void setStartTime(long j17) {
        z81.g gVar = this.f77170d;
        gVar.getClass();
        gVar.f470707q = j17;
    }

    public void setTraceId(java.lang.String str) {
        this.f77170d.f470709s = str;
    }

    public MCanvasView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f77170d = new z81.g(this);
        this.f77171e = new java.util.LinkedHashSet();
        hashCode();
    }

    public MCanvasView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f77170d = new z81.g(this);
        this.f77171e = new java.util.LinkedHashSet();
        hashCode();
    }
}

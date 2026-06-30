package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView */
/* loaded from: classes13.dex */
public class C11804x96d4584a extends android.view.View implements h91.b {

    /* renamed from: d, reason: collision with root package name */
    public final z81.g f158703d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f158704e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f158705f;

    public C11804x96d4584a(android.content.Context context) {
        super(context);
        this.f158703d = new z81.g(this);
        this.f158704e = new java.util.LinkedHashSet();
        hashCode();
    }

    @Override // h91.b
    public void a() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.c(this)) {
            postInvalidate();
        } else {
            post(new h91.d(this));
        }
    }

    @Override // android.view.View
    public void addOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        java.util.Set set = this.f158704e;
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
        this.f158703d.c(jSONArray, aVar);
    }

    @Override // h91.b
    public boolean d(android.graphics.Canvas canvas) {
        return this.f158703d.d(canvas);
    }

    @Override // h91.b
    public void e(org.json.JSONArray jSONArray, h91.a aVar) {
        this.f158703d.e(jSONArray, aVar);
    }

    public final void f() {
        android.graphics.Bitmap bitmap = this.f158705f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MCanvasView", "bitmap recycle %s %s", java.lang.Integer.valueOf(hashCode()), this.f158705f);
        this.f158705f.recycle();
    }

    /* renamed from: getDrawContext */
    public z81.i m50054xdf6a3295() {
        return this.f158703d.f552233g;
    }

    /* renamed from: getSessionId */
    public java.lang.String m50055x23a7af9b() {
        return this.f158703d.f552236m;
    }

    /* renamed from: getTraceId */
    public java.lang.String m50056xfe2df90a() {
        return this.f158703d.f552242s;
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
        android.graphics.Bitmap bitmap = this.f158705f;
        if (bitmap == null || bitmap.isRecycled() || this.f158705f.getWidth() != measuredWidth || this.f158705f.getHeight() != measuredHeight) {
            f();
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(measuredHeight));
                arrayList.add(java.lang.Integer.valueOf(measuredWidth));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                this.f158705f = createBitmap;
                hashCode();
            } catch (java.lang.OutOfMemoryError unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCanvasView", "onDraw oom w:%d h:%d", java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight));
                this.f158705f = null;
            }
        }
        android.graphics.Bitmap bitmap2 = this.f158705f;
        if (bitmap2 == null) {
            return;
        }
        bitmap2.eraseColor(0);
        z81.l lVar = new z81.l(this.f158705f);
        d(lVar);
        try {
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            canvas.drawBitmap(lVar.f552253a, 0.0f, 0.0f, (android.graphics.Paint) null);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MCanvasView", e, "", new java.lang.Object[0]);
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
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onSizeChanged", "(IIII)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/canvas/widget/MCanvasView", "onSizeChanged", "(IIII)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f158705f = createBitmap;
            hashCode();
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MCanvasView", "onSizeChanged oom w:%d h:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            this.f158705f = null;
        }
    }

    @Override // android.view.View
    public void removeOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f158704e.remove(onAttachStateChangeListener);
        super.removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* renamed from: setDrawActionReportable */
    public void m50057x9fd5144a(g91.a aVar) {
        this.f158703d.getClass();
    }

    /* renamed from: setSessionId */
    public void m50058x7ffb700f(java.lang.String str) {
        this.f158703d.f552236m = str;
    }

    /* renamed from: setStartTime */
    public void m50059xdcd6bc0d(long j17) {
        z81.g gVar = this.f158703d;
        gVar.getClass();
        gVar.f552240q = j17;
    }

    /* renamed from: setTraceId */
    public void m50060x719f467e(java.lang.String str) {
        this.f158703d.f552242s = str;
    }

    public C11804x96d4584a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f158703d = new z81.g(this);
        this.f158704e = new java.util.LinkedHashSet();
        hashCode();
    }

    public C11804x96d4584a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f158703d = new z81.g(this);
        this.f158704e = new java.util.LinkedHashSet();
        hashCode();
    }
}

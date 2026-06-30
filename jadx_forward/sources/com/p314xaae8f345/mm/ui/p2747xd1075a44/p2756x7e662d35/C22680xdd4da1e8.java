package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\f¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/RoundCropLayout;", "Landroid/widget/FrameLayout;", "", "ratio", "Ljz5/f0;", "setCropWidthRatio", "", "width", "setCropWidth", "colorValue", "setCropLineColor", "setCropLayerColor", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "setImagePath", "getCropBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ml5/f0", "ml5/g0", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.cropview.RoundCropLayout */
/* loaded from: classes10.dex */
public final class C22680xdd4da1e8 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f293202d;

    /* renamed from: e, reason: collision with root package name */
    public float f293203e;

    /* renamed from: f, reason: collision with root package name */
    public int f293204f;

    /* renamed from: g, reason: collision with root package name */
    public int f293205g;

    /* renamed from: h, reason: collision with root package name */
    public final int f293206h;

    /* renamed from: i, reason: collision with root package name */
    public int f293207i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f293208m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f293209n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f293210o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f293211p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.GestureDetector f293212q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ScaleGestureDetector f293213r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22680xdd4da1e8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.draw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawColor(this.f293207i);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (this.f293204f / 2) + this.f293206h, this.f293208m);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f293204f / 2, this.f293209n);
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: getCropBitmap */
    public final android.graphics.Bitmap m81933x131b23d5() {
        if (this.f293210o == null) {
            return null;
        }
        int width = (getWidth() - this.f293204f) / 2;
        int height = (getHeight() - this.f293204f) / 2;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f293211p.getImageMatrix().invert(matrix);
        android.graphics.RectF rectF = new android.graphics.RectF();
        matrix.mapRect(rectF, new android.graphics.RectF(width, height, getWidth() - width, getHeight() - height));
        java.lang.String str = this.f293202d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cropArea " + rectF);
        if (rectF.left < 0.0f) {
            rectF.left = 0.0f;
        }
        if (rectF.top < 0.0f) {
            rectF.top = 0.0f;
        }
        if (rectF.right > r0.getWidth()) {
            rectF.right = r0.getWidth();
        }
        if (rectF.bottom > r0.getHeight()) {
            rectF.bottom = r0.getHeight();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "fix cropArea " + rectF);
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return null;
        }
        android.graphics.Bitmap bitmap = this.f293210o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        int i17 = (int) rectF.left;
        int i18 = (int) rectF.top;
        int width2 = (int) rectF.width();
        int height2 = (int) rectF.height();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(bitmap);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/cropview/RoundCropLayout", "getCropBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/cropview/RoundCropLayout", "getCropBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f293204f == 0) {
            this.f293204f = (int) (this.f293203e * getWidth());
        }
    }

    /* renamed from: setBitmap */
    public final void m81934x5854831(android.graphics.Bitmap bitmap) {
        this.f293210o = bitmap;
        if (bitmap != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f293211p;
            c21524xecd57b9a.setImageBitmap(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
            c21524xecd57b9a.i();
        }
    }

    /* renamed from: setCropLayerColor */
    public final void m81935x322cec44(int i17) {
        this.f293207i = i17;
    }

    /* renamed from: setCropLineColor */
    public final void m81936x741fd1dd(int i17) {
        this.f293205g = i17;
    }

    /* renamed from: setCropWidth */
    public final void m81937xa86bced4(int i17) {
        this.f293204f = i17;
    }

    /* renamed from: setCropWidthRatio */
    public final void m81938xd739b597(float f17) {
        this.f293203e = f17;
    }

    /* renamed from: setImagePath */
    public final void m81939x27678dde(java.lang.String str) {
        nz5.b.a(false, false, null, null, 0, new ml5.i0(str, this), 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22680xdd4da1e8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f293202d = "MicroMsg.RoundCropLayout";
        this.f293205g = -1;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        this.f293206h = a17;
        this.f293207i = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f293208m = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f293209n = paint2;
        setWillNotDraw(false);
        paint.setColor(this.f293205g);
        paint.setStrokeWidth(a17);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(context, null);
        this.f293211p = c21524xecd57b9a;
        addView(c21524xecd57b9a, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ml5.f0 f0Var = new ml5.f0(this);
        this.f293212q = new android.view.GestureDetector(context, f0Var);
        android.view.ScaleGestureDetector scaleGestureDetector = new android.view.ScaleGestureDetector(context, f0Var);
        this.f293213r = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(true);
        c21524xecd57b9a.setOnTouchListener(new ml5.g0(this));
        m81938xd739b597(0.9f);
    }
}

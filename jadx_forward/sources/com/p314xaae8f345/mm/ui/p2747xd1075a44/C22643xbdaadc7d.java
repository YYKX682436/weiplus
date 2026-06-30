package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.RoundCornerImageView */
/* loaded from: classes4.dex */
public class C22643xbdaadc7d extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public int f292939f;

    /* renamed from: g, reason: collision with root package name */
    public int f292940g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f292941h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Path f292942i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f292943m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f292944n;

    /* renamed from: o, reason: collision with root package name */
    public int f292945o;

    /* renamed from: p, reason: collision with root package name */
    public int f292946p;

    public C22643xbdaadc7d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292939f = 8;
        this.f292940g = 8;
        this.f292941h = new android.graphics.Paint();
        this.f292942i = new android.graphics.Path();
        this.f292943m = new android.graphics.RectF();
        this.f292945o = 0;
        n(context, attributeSet);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            super.draw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        if (createBitmap.isRecycled()) {
            int width2 = getWidth();
            int height2 = getHeight();
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            arrayList2.add(java.lang.Integer.valueOf(height2));
            arrayList2.add(java.lang.Integer.valueOf(width2));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/ui/widget/RoundCornerImageView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            canvas2 = new android.graphics.Canvas(createBitmap);
        }
        super.draw(canvas2);
        android.graphics.Paint paint = this.f292941h;
        paint.setAntiAlias(true);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        float width3 = getWidth();
        float height3 = getHeight();
        android.graphics.RectF rectF = this.f292943m;
        rectF.set(0.0f, 0.0f, width3, height3);
        float f17 = this.f292939f;
        float f18 = this.f292940g;
        android.graphics.Path.Direction direction = android.graphics.Path.Direction.CW;
        android.graphics.Path path = this.f292942i;
        path.addRoundRect(rectF, f17, f18, direction);
        path.setFillType(android.graphics.Path.FillType.INVERSE_WINDING);
        canvas2.drawPath(path, paint);
        android.graphics.Paint paint2 = this.f292944n;
        if (paint2 != null) {
            float strokeWidth = paint2.getStrokeWidth() / 2.0f;
            canvas2.drawRoundRect(new android.graphics.RectF(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth), this.f292939f, this.f292940g, this.f292944n);
        }
        paint.reset();
        paint.setXfermode(null);
        int i17 = this.f292945o;
        if (i17 > 0) {
            float f19 = 0;
            paint.setShadowLayer(i17, f19, f19, this.f292946p);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        createBitmap.recycle();
    }

    public final void n(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            float f17 = context.getResources().getDisplayMetrics().density;
            this.f292939f = (int) (this.f292939f * f17);
            this.f292940g = (int) (this.f292940g * f17);
        } else {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.G);
            this.f292939f = obtainStyledAttributes.getDimensionPixelSize(1, this.f292939f);
            this.f292940g = obtainStyledAttributes.getDimensionPixelSize(0, this.f292940g);
            obtainStyledAttributes.recycle();
        }
    }

    public void r(int i17, int i18) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f292944n = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.f292944n.setStrokeWidth(i17);
        this.f292944n.setAntiAlias(true);
        this.f292944n.setColor(i18);
    }

    /* renamed from: setRoundHeight */
    public void m81433x3a800693(int i17) {
        this.f292940g = i17;
    }

    /* renamed from: setRoundWidth */
    public void m81434x133c5ada(int i17) {
        this.f292939f = i17;
    }

    public C22643xbdaadc7d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292939f = 8;
        this.f292940g = 8;
        this.f292941h = new android.graphics.Paint();
        this.f292942i = new android.graphics.Path();
        this.f292943m = new android.graphics.RectF();
        this.f292945o = 0;
        n(context, attributeSet);
    }

    public C22643xbdaadc7d(android.content.Context context) {
        super(context, null);
        this.f292939f = 8;
        this.f292940g = 8;
        this.f292941h = new android.graphics.Paint();
        this.f292942i = new android.graphics.Path();
        this.f292943m = new android.graphics.RectF();
        this.f292945o = 0;
        n(context, null);
    }
}

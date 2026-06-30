package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

/* renamed from: com.tencent.mm.plugin.ball.view.CircleAnimateView */
/* loaded from: classes4.dex */
public class C12912x4d989216 extends com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 {

    /* renamed from: n, reason: collision with root package name */
    public int f174912n;

    /* renamed from: o, reason: collision with root package name */
    public int f174913o;

    /* renamed from: p, reason: collision with root package name */
    public long f174914p;

    public C12912x4d989216(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f174914p = -2147483648L;
        this.f174912n = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a0_);
        this.f174913o = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a0_);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int width = getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f174912n;
        int width2 = getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f174913o;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(width2));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/CircleAnimateView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/ball/view/CircleAnimateView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        if (createBitmap.isRecycled()) {
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            arrayList2.add(java.lang.Integer.valueOf(width2));
            arrayList2.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/CircleAnimateView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/ball/view/CircleAnimateView", "draw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            canvas2 = new android.graphics.Canvas(createBitmap);
        }
        super.draw(canvas2);
        if (this.f174914p >= 0) {
            float width3 = getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f174912n;
            float f17 = width3 / 2.0f;
            float width4 = (getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f174913o) / 2.0f;
            float a17 = i65.a.a(getContext(), 1.5f);
            float f18 = ((width3 * 0.9166667f) / 2.0f) - a17;
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth(a17);
            paint.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
            canvas2.drawCircle(f17, width4, f18, paint);
            paint.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
            canvas2.drawArc(f17 - f18, width4 - f18, f17 + f18, f18 + width4, -90.0f, (((float) this.f174914p) / 100.0f) * 360.0f, false, paint);
        }
        int width5 = getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : this.f174912n;
        int width6 = getWidth() > 0 ? getWidth() : getMeasuredHeight() > 0 ? getMeasuredHeight() : this.f174913o;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        android.graphics.Path path = new android.graphics.Path();
        float f19 = width5;
        float f27 = width6;
        path.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, f19, f27), f19, f27, android.graphics.Path.Direction.CW);
        path.setFillType(android.graphics.Path.FillType.INVERSE_WINDING);
        canvas2.drawPath(path, paint2);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setXfermode(null);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint3);
        createBitmap.recycle();
    }

    /* renamed from: setProgress */
    public void m54085x3ae760af(long j17) {
        this.f174914p = j17;
        postInvalidate();
    }

    public C12912x4d989216(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f174914p = -2147483648L;
        this.f174912n = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a0_);
        this.f174913o = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a0_);
    }
}

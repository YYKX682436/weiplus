package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView */
/* loaded from: classes4.dex */
public class C17929xb50e8ea1 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f247406d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f247407e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f247408f;

    /* renamed from: g, reason: collision with root package name */
    public int f247409g;

    /* renamed from: h, reason: collision with root package name */
    public int f247410h;

    /* renamed from: i, reason: collision with root package name */
    public int f247411i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f247412m;

    /* renamed from: n, reason: collision with root package name */
    public float f247413n;

    /* renamed from: o, reason: collision with root package name */
    public float f247414o;

    /* renamed from: p, reason: collision with root package name */
    public float f247415p;

    /* renamed from: q, reason: collision with root package name */
    public int f247416q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.BitmapShader f247417r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Bitmap f247418s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f247419t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Paint f247420u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Paint f247421v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.ColorFilter f247422w;

    public C17929xb50e8ea1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (drawable == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return bitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return null;
        }
        try {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
            arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/CircularImageView", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/CircularImageView", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return createBitmap;
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawableToBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return null;
        }
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (this.f247418s == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return;
        }
        android.graphics.Bitmap bitmap = this.f247418s;
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        this.f247417r = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        if (this.f247410h != this.f247418s.getWidth() || this.f247410h != this.f247418s.getHeight()) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            float width = this.f247410h / this.f247418s.getWidth();
            matrix.setScale(width, width);
            this.f247417r.setLocalMatrix(matrix);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBitmapShader", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        if (!isClickable()) {
            this.f247408f = false;
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return onTouchEvent;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f247408f = true;
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            this.f247408f = false;
        }
        invalidate();
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        return dispatchTouchEvent;
    }

    @Override // android.view.View
    public boolean isSelected() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        boolean z17 = this.f247408f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        return z17;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Bitmap bitmap = this.f247418s;
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return;
        }
        if (bitmap.getHeight() == 0 || this.f247418s.getWidth() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            return;
        }
        int i27 = this.f247410h;
        int width = getWidth() < getHeight() ? getWidth() : getHeight();
        this.f247410h = width;
        if (i27 != width) {
            b();
        }
        this.f247419t.setShader(this.f247417r);
        int i28 = this.f247410h;
        int i29 = i28 / 2;
        if (this.f247407e && this.f247408f) {
            i18 = this.f247411i;
            i19 = (i28 - (i18 * 2)) / 2;
            this.f247419t.setColorFilter(this.f247422w);
            float f17 = i19 + i18;
            canvas.drawCircle(f17, f17, (((this.f247410h - r4) / 2) + i18) - 4.0f, this.f247421v);
        } else {
            if (!this.f247406d) {
                this.f247419t.setColorFilter(null);
                i17 = 0;
                float f18 = i29 + i17;
                canvas.drawCircle(f18, f18, (this.f247410h - (i17 * 2)) / 2, this.f247419t);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
            }
            i18 = this.f247409g;
            i19 = (i28 - (i18 * 2)) / 2;
            this.f247419t.setColorFilter(null);
            float f19 = (i18 / 2) + 0;
            int i37 = this.f247410h;
            canvas.drawArc(new android.graphics.RectF(f19, f19, i37 - r4, i37 - r4), 360.0f, 360.0f, false, this.f247420u);
        }
        int i38 = i18;
        i29 = i19;
        i17 = i38;
        float f182 = i29 + i17;
        canvas.drawCircle(f182, f182, (this.f247410h - (i17 * 2)) / 2, this.f247419t);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measureWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = this.f247410h;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measureWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measureHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 != 1073741824 && mode2 != Integer.MIN_VALUE) {
            size2 = this.f247410h;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measureHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        setMeasuredDimension(size, size2 + 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    /* renamed from: setBorderColor */
    public void m70266x9b5140d5(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Paint paint = this.f247420u;
        if (paint != null) {
            paint.setColor(i17);
        }
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    /* renamed from: setBorderWidth */
    public void m70267x9c683f38(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f247409g = i17;
        android.graphics.Paint paint = this.f247420u;
        if (paint != null) {
            paint.setStrokeWidth(i17);
        }
        requestLayout();
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    /* renamed from: setIconModeEnabled */
    public void m70268xa69cdd23(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIconModeEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIconModeEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageBitmap(bitmap);
        this.f247418s = bitmap;
        if (this.f247410h > 0) {
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageDrawable(drawable);
        this.f247418s = a(getDrawable());
        if (this.f247410h > 0) {
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageResource(i17);
        this.f247418s = a(getDrawable());
        if (this.f247410h > 0) {
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageURI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        super.setImageURI(uri);
        this.f247418s = a(getDrawable());
        if (this.f247410h > 0) {
            b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageURI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    /* renamed from: setSelectorColor */
    public void m70269xce5d0182(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectorColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f247422w = new android.graphics.PorterDuffColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectorColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    /* renamed from: setSelectorStrokeColor */
    public void m70270x63096aea(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectorStrokeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Paint paint = this.f247421v;
        if (paint != null) {
            paint.setColor(i17);
        }
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectorStrokeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    /* renamed from: setSelectorStrokeWidth */
    public void m70271x6420694d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectorStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f247411i = i17;
        requestLayout();
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectorStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    /* renamed from: setShadowEnabled */
    public void m70272x33548bf(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShadowEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        this.f247412m = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateShadow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        float f17 = this.f247412m ? this.f247413n : 0.0f;
        this.f247420u.setShadowLayer(f17, this.f247414o, this.f247415p, this.f247416q);
        this.f247421v.setShadowLayer(f17, this.f247414o, this.f247415p, this.f247416q);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateShadow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShadowEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }

    public C17929xb50e8ea1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f247419t = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f247420u = paint2;
        paint2.setAntiAlias(true);
        this.f247420u.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f247421v = paint3;
        paint3.setAntiAlias(true);
        setLayerType(1, null);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n34.w2.f416297a, i17, 0);
        this.f247406d = obtainStyledAttributes.getBoolean(0, false);
        this.f247407e = obtainStyledAttributes.getBoolean(3, false);
        this.f247412m = obtainStyledAttributes.getBoolean(7, false);
        if (this.f247406d) {
            m70267x9c683f38(obtainStyledAttributes.getDimensionPixelOffset(2, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            m70266x9b5140d5(obtainStyledAttributes.getColor(1, -1));
        }
        if (this.f247407e) {
            int i18 = (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
            m70269xce5d0182(obtainStyledAttributes.getColor(4, 0));
            m70271x6420694d(obtainStyledAttributes.getDimensionPixelOffset(6, i18));
            m70270x63096aea(obtainStyledAttributes.getColor(5, -16776961));
        }
        if (this.f247412m) {
            this.f247413n = obtainStyledAttributes.getFloat(11, 4.0f);
            this.f247414o = obtainStyledAttributes.getFloat(9, 0.0f);
            this.f247415p = obtainStyledAttributes.getFloat(10, 2.0f);
            this.f247416q = obtainStyledAttributes.getColor(8, -16777216);
            m70272x33548bf(true);
        }
        obtainStyledAttributes.recycle();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.CircleImageView */
/* loaded from: classes4.dex */
public class C16033xcd00b790 extends android.widget.ImageView {

    /* renamed from: x, reason: collision with root package name */
    public static final android.widget.ImageView.ScaleType f223466x = android.widget.ImageView.ScaleType.CENTER_CROP;

    /* renamed from: y, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config f223467y = android.graphics.Bitmap.Config.ARGB_8888;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f223468d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f223469e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f223470f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f223471g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f223472h;

    /* renamed from: i, reason: collision with root package name */
    public int f223473i;

    /* renamed from: m, reason: collision with root package name */
    public int f223474m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f223475n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.BitmapShader f223476o;

    /* renamed from: p, reason: collision with root package name */
    public int f223477p;

    /* renamed from: q, reason: collision with root package name */
    public int f223478q;

    /* renamed from: r, reason: collision with root package name */
    public float f223479r;

    /* renamed from: s, reason: collision with root package name */
    public float f223480s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.ColorFilter f223481t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f223482u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f223483v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f223484w;

    public C16033xcd00b790(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        try {
            boolean z17 = drawable instanceof android.graphics.drawable.ColorDrawable;
            android.graphics.Bitmap.Config config = f223467y;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(2);
                arrayList.add(2);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(intrinsicHeight));
                arrayList2.add(java.lang.Integer.valueOf(intrinsicWidth));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/game/widget/CircleImageView", "getBitmapFromDrawable", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = createBitmap;
            }
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    public final void b() {
        float width;
        float height;
        if (!this.f223482u) {
            this.f223483v = true;
            return;
        }
        if (this.f223475n == null) {
            return;
        }
        android.graphics.Bitmap bitmap = this.f223475n;
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        this.f223476o = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Paint paint = this.f223471g;
        paint.setAntiAlias(true);
        paint.setShader(this.f223476o);
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint2 = this.f223472h;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f223473i);
        paint2.setStrokeWidth(this.f223474m);
        this.f223478q = this.f223475n.getHeight();
        this.f223477p = this.f223475n.getWidth();
        float width2 = getWidth();
        float height2 = getHeight();
        android.graphics.RectF rectF = this.f223469e;
        float f17 = 0.0f;
        rectF.set(0.0f, 0.0f, width2, height2);
        this.f223480s = java.lang.Math.min((rectF.height() - this.f223474m) / 2.0f, (rectF.width() - this.f223474m) / 2.0f);
        android.graphics.RectF rectF2 = this.f223468d;
        rectF2.set(rectF);
        if (!this.f223484w) {
            int i17 = this.f223474m;
            rectF2.inset(i17, i17);
        }
        this.f223479r = java.lang.Math.min(rectF2.height() / 2.0f, rectF2.width() / 2.0f);
        android.graphics.Matrix matrix = this.f223470f;
        matrix.set(null);
        if (this.f223477p * rectF2.height() > rectF2.width() * this.f223478q) {
            width = rectF2.height() / this.f223478q;
            height = 0.0f;
            f17 = (rectF2.width() - (this.f223477p * width)) * 0.5f;
        } else {
            width = rectF2.width() / this.f223477p;
            height = (rectF2.height() - (this.f223478q * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate(((int) (f17 + 0.5f)) + rectF2.left, ((int) (height + 0.5f)) + rectF2.top);
        this.f223476o.setLocalMatrix(matrix);
        invalidate();
    }

    /* renamed from: getBorderColor */
    public int m64844x4ebcd61() {
        return this.f223473i;
    }

    /* renamed from: getBorderWidth */
    public int m64845x602cbc4() {
        return this.f223474m;
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
        return f223466x;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f223479r, this.f223471g);
        if (this.f223474m != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f223480s, this.f223472h);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        b();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z17) {
        if (z17) {
            throw new java.lang.IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    /* renamed from: setBorderColor */
    public void m64846x9b5140d5(int i17) {
        if (i17 == this.f223473i) {
            return;
        }
        this.f223473i = i17;
        this.f223472h.setColor(i17);
        invalidate();
    }

    /* renamed from: setBorderColorResource */
    public void m64847x2287c403(int i17) {
        m64846x9b5140d5(getContext().getResources().getColor(i17));
    }

    /* renamed from: setBorderOverlay */
    public void m64848x925fc142(boolean z17) {
        if (z17 == this.f223484w) {
            return;
        }
        this.f223484w = z17;
        b();
    }

    /* renamed from: setBorderWidth */
    public void m64849x9c683f38(int i17) {
        if (i17 == this.f223474m) {
            return;
        }
        this.f223474m = i17;
        b();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (colorFilter == this.f223481t) {
            return;
        }
        this.f223481t = colorFilter;
        this.f223471g.setColorFilter(colorFilter);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f223475n = bitmap;
        b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f223475n = a(drawable);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
        this.f223475n = a(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        this.f223475n = a(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (scaleType != f223466x) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public C16033xcd00b790(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f223468d = new android.graphics.RectF();
        this.f223469e = new android.graphics.RectF();
        this.f223470f = new android.graphics.Matrix();
        this.f223471g = new android.graphics.Paint();
        this.f223472h = new android.graphics.Paint();
        this.f223473i = -16777216;
        this.f223474m = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.d2.f220971a, i17, 0);
        this.f223474m = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f223473i = obtainStyledAttributes.getColor(0, -16777216);
        this.f223484w = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        super.setScaleType(f223466x);
        this.f223482u = true;
        if (this.f223483v) {
            b();
            this.f223483v = false;
        }
    }
}

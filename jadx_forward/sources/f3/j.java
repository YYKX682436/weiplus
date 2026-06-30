package f3;

/* loaded from: classes13.dex */
public abstract class j extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f340779a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340780b;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.BitmapShader f340783e;

    /* renamed from: g, reason: collision with root package name */
    public float f340785g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f340789k;

    /* renamed from: l, reason: collision with root package name */
    public int f340790l;

    /* renamed from: m, reason: collision with root package name */
    public int f340791m;

    /* renamed from: c, reason: collision with root package name */
    public final int f340781c = 119;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f340782d = new android.graphics.Paint(3);

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f340784f = new android.graphics.Matrix();

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f340786h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f340787i = new android.graphics.RectF();

    /* renamed from: j, reason: collision with root package name */
    public boolean f340788j = true;

    public j(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        this.f340780b = 160;
        if (resources != null) {
            this.f340780b = resources.getDisplayMetrics().densityDpi;
        }
        this.f340779a = bitmap;
        if (bitmap == null) {
            this.f340791m = -1;
            this.f340790l = -1;
            this.f340783e = null;
        } else {
            int i17 = this.f340780b;
            this.f340790l = bitmap.getScaledWidth(i17);
            this.f340791m = bitmap.getScaledHeight(i17);
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
            this.f340783e = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public abstract void a(int i17, int i18, int i19, android.graphics.Rect rect, android.graphics.Rect rect2);

    public void b(boolean z17) {
        this.f340789k = z17;
        this.f340788j = true;
        if (!z17) {
            c(0.0f);
            return;
        }
        this.f340785g = java.lang.Math.min(this.f340791m, this.f340790l) / 2;
        this.f340782d.setShader(this.f340783e);
        invalidateSelf();
    }

    public void c(float f17) {
        if (this.f340785g == f17) {
            return;
        }
        this.f340789k = false;
        boolean z17 = f17 > 0.05f;
        android.graphics.Paint paint = this.f340782d;
        if (z17) {
            paint.setShader(this.f340783e);
        } else {
            paint.setShader(null);
        }
        this.f340785g = f17;
        invalidateSelf();
    }

    public void d() {
        if (this.f340788j) {
            boolean z17 = this.f340789k;
            android.graphics.Rect rect = this.f340786h;
            if (z17) {
                int min = java.lang.Math.min(this.f340790l, this.f340791m);
                a(this.f340781c, min, min, getBounds(), this.f340786h);
                int min2 = java.lang.Math.min(rect.width(), rect.height());
                rect.inset(java.lang.Math.max(0, (rect.width() - min2) / 2), java.lang.Math.max(0, (rect.height() - min2) / 2));
                this.f340785g = min2 * 0.5f;
            } else {
                a(this.f340781c, this.f340790l, this.f340791m, getBounds(), this.f340786h);
            }
            android.graphics.RectF rectF = this.f340787i;
            rectF.set(rect);
            android.graphics.BitmapShader bitmapShader = this.f340783e;
            if (bitmapShader != null) {
                android.graphics.Matrix matrix = this.f340784f;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                android.graphics.Bitmap bitmap = this.f340779a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f340782d.setShader(bitmapShader);
            }
            this.f340788j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f340779a;
        if (bitmap == null) {
            return;
        }
        d();
        android.graphics.Paint paint = this.f340782d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, this.f340786h, paint);
            return;
        }
        android.graphics.RectF rectF = this.f340787i;
        float f17 = this.f340785g;
        canvas.drawRoundRect(rectF, f17, f17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f340782d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        return this.f340782d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f340791m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f340790l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.Bitmap bitmap;
        if (this.f340781c == 119 && !this.f340789k && (bitmap = this.f340779a) != null && !bitmap.hasAlpha() && this.f340782d.getAlpha() >= 255) {
            if (!(this.f340785g > 0.05f)) {
                return -1;
            }
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        if (this.f340789k) {
            this.f340785g = java.lang.Math.min(this.f340791m, this.f340790l) / 2;
        }
        this.f340788j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.Paint paint = this.f340782d;
        if (i17 != paint.getAlpha()) {
            paint.setAlpha(i17);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f340782d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z17) {
        this.f340782d.setDither(z17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z17) {
        this.f340782d.setFilterBitmap(z17);
        invalidateSelf();
    }
}

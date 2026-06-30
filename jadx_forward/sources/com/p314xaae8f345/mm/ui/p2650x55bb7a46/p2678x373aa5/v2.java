package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes5.dex */
public final class v2 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f284650a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f284651b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f284652c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f284653d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f284654e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f284655f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f284656g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f284657h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f284658i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.RectF f284659j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Rect f284660k;

    /* renamed from: l, reason: collision with root package name */
    public int f284661l;

    /* renamed from: m, reason: collision with root package name */
    public int f284662m;

    /* renamed from: n, reason: collision with root package name */
    public float f284663n;

    /* renamed from: o, reason: collision with root package name */
    public float f284664o;

    /* renamed from: p, reason: collision with root package name */
    public float f284665p;

    public v2(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f284650a = bitmap;
        this.f284651b = new android.graphics.Paint(3);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f284652c = paint;
        this.f284653d = new android.graphics.Matrix();
        this.f284654e = new android.graphics.RectF();
        this.f284655f = new android.graphics.Path();
        this.f284656g = new float[9];
        this.f284657h = new float[9];
        this.f284659j = new android.graphics.RectF();
        this.f284660k = new android.graphics.Rect();
        this.f284661l = bitmap.getWidth();
        this.f284662m = bitmap.getHeight();
        this.f284664o = 1.0f;
        this.f284665p = 1.0f;
    }

    public final void a(android.graphics.Matrix m17, int i17, int i18, float f17) {
        boolean z17;
        float width;
        float height;
        android.graphics.Path path;
        android.graphics.RectF rectF;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        float[] fArr = this.f284656g;
        m17.getValues(fArr);
        boolean z18 = this.f284661l == i17 && this.f284662m == i18;
        boolean z19 = java.lang.Math.abs(this.f284663n - f17) < 0.1f;
        if (this.f284658i) {
            int[] iArr = {0, 4, 2, 5};
            for (int i19 = 0; i19 < 4; i19++) {
                int i27 = iArr[i19];
                if (java.lang.Math.abs(fArr[i27] - this.f284657h[i27]) <= 0.001f) {
                }
            }
            z17 = true;
            if (!z18 && z19 && z17) {
                return;
            }
            android.graphics.Matrix matrix = this.f284653d;
            matrix.set(m17);
            this.f284661l = i17;
            this.f284662m = i18;
            this.f284663n = f17;
            this.f284658i = true;
            kz5.v.m(this.f284656g, this.f284657h, 0, 0, 0, 14, null);
            android.graphics.Bitmap bitmap = this.f284650a;
            width = bitmap.getWidth();
            height = bitmap.getHeight();
            path = this.f284655f;
            rectF = this.f284654e;
            if (width > 0.0f || height <= 0.0f || this.f284661l <= 0 || this.f284662m <= 0) {
                rectF.set(0.0f, 0.0f, width, height);
                path.reset();
            } else {
                matrix.getValues(fArr);
                float abs = java.lang.Math.abs(fArr[0]);
                float abs2 = java.lang.Math.abs(fArr[4]);
                this.f284664o = (abs > 0.0f ? 1 : (abs == 0.0f ? 0 : -1)) == 0 ? 1.0f : abs;
                this.f284665p = (abs2 > 0.0f ? 1 : (abs2 == 0.0f ? 0 : -1)) == 0 ? 1.0f : abs2;
                if (!(abs == 0.0f)) {
                    if (!(abs2 == 0.0f)) {
                        float f18 = this.f284661l / abs;
                        if (f18 > width) {
                            f18 = width;
                        }
                        float f19 = this.f284662m / abs2;
                        if (f19 > height) {
                            f19 = height;
                        }
                        float f27 = (width - f18) / 2.0f;
                        float f28 = (height - f19) / 2.0f;
                        rectF.set(f27, f28, f18 + f27, f19 + f28);
                        path.reset();
                        float f29 = this.f284663n;
                        if (f29 > 0.0f) {
                            float f37 = f29 / this.f284664o;
                            if (f37 < 0.0f) {
                                f37 = 0.0f;
                            }
                            float f38 = f29 / this.f284665p;
                            float f39 = f38 >= 0.0f ? f38 : 0.0f;
                            float width2 = rectF.width() / 2.0f;
                            float height2 = rectF.height() / 2.0f;
                            if (f37 > width2) {
                                f37 = width2;
                            }
                            if (f39 > height2) {
                                f39 = height2;
                            }
                            path.addRoundRect(rectF, f37, f39, android.graphics.Path.Direction.CW);
                        }
                    }
                }
                rectF.set(0.0f, 0.0f, width, height);
                path.reset();
            }
            invalidateSelf();
        }
        z17 = false;
        if (!z18) {
        }
        android.graphics.Matrix matrix2 = this.f284653d;
        matrix2.set(m17);
        this.f284661l = i17;
        this.f284662m = i18;
        this.f284663n = f17;
        this.f284658i = true;
        kz5.v.m(this.f284656g, this.f284657h, 0, 0, 0, 14, null);
        android.graphics.Bitmap bitmap2 = this.f284650a;
        width = bitmap2.getWidth();
        height = bitmap2.getHeight();
        path = this.f284655f;
        rectF = this.f284654e;
        if (width > 0.0f) {
        }
        rectF.set(0.0f, 0.0f, width, height);
        path.reset();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int save = canvas.save();
        canvas.concat(this.f284653d);
        android.graphics.Path path = this.f284655f;
        boolean isEmpty = path.isEmpty();
        android.graphics.RectF rectF = this.f284654e;
        if (isEmpty) {
            canvas.clipRect(rectF);
        } else {
            canvas.clipPath(path);
        }
        android.graphics.Bitmap bitmap = this.f284650a;
        if (bitmap.hasAlpha()) {
            boolean isEmpty2 = path.isEmpty();
            android.graphics.Paint paint = this.f284652c;
            if (isEmpty2) {
                canvas.drawRect(rectF, paint);
            } else {
                canvas.drawPaint(paint);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f284651b);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
        android.graphics.RectF rectF = this.f284654e;
        if (rectF.isEmpty()) {
            android.graphics.Rect dirtyBounds = super.getDirtyBounds();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dirtyBounds, "getDirtyBounds(...)");
            return dirtyBounds;
        }
        android.graphics.RectF rectF2 = this.f284659j;
        rectF2.set(rectF);
        this.f284653d.mapRect(rectF2);
        int floor = ((int) java.lang.Math.floor(rectF2.left)) - 2;
        int floor2 = ((int) java.lang.Math.floor(rectF2.top)) - 2;
        int ceil = ((int) java.lang.Math.ceil(rectF2.right)) + 2;
        int ceil2 = ((int) java.lang.Math.ceil(rectF2.bottom)) + 2;
        android.graphics.Rect rect = this.f284660k;
        rect.set(floor, floor2, ceil, ceil2);
        return rect;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f284651b.setAlpha(i17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f284651b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

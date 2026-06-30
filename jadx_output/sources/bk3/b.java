package bk3;

/* loaded from: classes10.dex */
public final class b extends bk3.a {

    /* renamed from: v, reason: collision with root package name */
    public static final int f21373v = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f21374d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f21375e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f21376f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f21377g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f21378h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Path f21379i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f21380m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f21381n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f21382o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f21383p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.RectF f21384q;

    /* renamed from: r, reason: collision with root package name */
    public int f21385r;

    /* renamed from: s, reason: collision with root package name */
    public int f21386s;

    /* renamed from: t, reason: collision with root package name */
    public int f21387t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f21388u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, android.graphics.Bitmap contentBitmap, android.graphics.Bitmap bitmap) {
        super(context);
        kotlin.jvm.internal.o.g(contentBitmap, "contentBitmap");
        int i17 = f21373v;
        this.f21388u = new float[]{0.0f, 0.0f, 0.0f, 0.0f, i17, i17, i17, i17};
        this.f21377g = new android.graphics.Paint();
        this.f21379i = new android.graphics.Path();
        this.f21378h = new android.graphics.Paint();
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f21378h;
        if (paint == null) {
            kotlin.jvm.internal.o.o("mMaskPaint");
            throw null;
        }
        paint.setXfermode(porterDuffXfermode);
        this.f21374d = contentBitmap;
        this.f21375e = bitmap;
        this.f21385r = (int) (contentBitmap.getWidth() * 1.0f);
        this.f21386s = (int) (contentBitmap.getHeight() * 1.0f);
        this.f21380m = new android.graphics.Rect(0, 0, contentBitmap.getWidth(), contentBitmap.getHeight());
        this.f21381n = new android.graphics.Rect(0, 0, bitmap != null ? bitmap.getWidth() : 0, bitmap != null ? bitmap.getHeight() : 0);
        this.f21382o = new android.graphics.Rect(0, 0, this.f21385r, this.f21386s);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f21384q = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f21385r;
        rectF.bottom = this.f21386s;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(230, 0, 0, 0), android.graphics.Color.argb(76, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f21376f = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f21376f;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f21376f;
        if (gradientDrawable3 != null) {
            android.graphics.Rect rect = this.f21382o;
            if (rect == null) {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
            gradientDrawable3.setBounds(rect);
        }
        java.lang.String format = java.lang.String.format("default init: mWidth:%d mHeight:%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f21385r), java.lang.Integer.valueOf(this.f21386s)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
    }

    @Override // bk3.a
    public void a(float f17, float f18, float f19, float f27) {
        android.graphics.RectF rectF = this.f21384q;
        if (rectF != null) {
            rectF.set(f17, f18, f19, f27);
        } else {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
    }

    @Override // bk3.a
    public void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        float[] fArr = this.f21388u;
        fArr[0] = f17;
        fArr[1] = f18;
        fArr[2] = f19;
        fArr[3] = f27;
        fArr[4] = f28;
        fArr[5] = f29;
        fArr[6] = f37;
        fArr[7] = f38;
    }

    @Override // bk3.a
    public void c(int i17, int i18) {
        this.f21385r = i17;
        this.f21386s = i18;
    }

    public final android.graphics.Bitmap getContentBitmap() {
        return this.f21374d;
    }

    public final android.graphics.Bitmap getDefaultIcon() {
        return this.f21375e;
    }

    public final android.graphics.drawable.GradientDrawable getGradientDrawable() {
        return this.f21376f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = this.f21379i;
        if (path == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        path.reset();
        android.graphics.Path path2 = this.f21379i;
        if (path2 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        android.graphics.RectF rectF = this.f21384q;
        if (rectF == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        path2.addRoundRect(rectF, this.f21388u, android.graphics.Path.Direction.CW);
        android.graphics.Path path3 = this.f21379i;
        if (path3 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        canvas.clipPath(path3);
        android.graphics.Bitmap bitmap = this.f21374d;
        if (bitmap != null) {
            android.graphics.Rect rect = this.f21380m;
            if (rect == null) {
                kotlin.jvm.internal.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f21382o;
            if (rect2 == null) {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
            android.graphics.Paint paint = this.f21377g;
            if (paint == null) {
                kotlin.jvm.internal.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        }
        android.graphics.Bitmap bitmap2 = this.f21375e;
        if (bitmap2 != null) {
            android.graphics.Rect rect3 = this.f21381n;
            if (rect3 == null) {
                kotlin.jvm.internal.o.o("mDrawDefaultRect");
                throw null;
            }
            android.graphics.Rect rect4 = this.f21383p;
            if (rect4 == null) {
                kotlin.jvm.internal.o.o("mDstDefaultRect");
                throw null;
            }
            android.graphics.Paint paint2 = this.f21377g;
            if (paint2 == null) {
                kotlin.jvm.internal.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap2, rect3, rect4, paint2);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f21376f;
        if (gradientDrawable != null) {
            gradientDrawable.setAlpha(this.f21387t);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f21385r, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f21386s, 1073741824));
    }

    @Override // bk3.a
    public void setDefaultDstRect(android.graphics.Rect dstRect) {
        kotlin.jvm.internal.o.g(dstRect, "dstRect");
        this.f21383p = dstRect;
    }

    @Override // bk3.a
    public void setDrawRect(android.graphics.Rect srcRect) {
        kotlin.jvm.internal.o.g(srcRect, "srcRect");
        this.f21380m = srcRect;
    }

    @Override // bk3.a
    public void setDstRect(android.graphics.Rect dstRect) {
        kotlin.jvm.internal.o.g(dstRect, "dstRect");
        this.f21382o = dstRect;
    }

    @Override // bk3.a
    public void setMaskAlpha(int i17) {
        this.f21387t = i17;
    }
}

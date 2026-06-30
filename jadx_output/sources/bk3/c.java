package bk3;

/* loaded from: classes10.dex */
public final class c extends bk3.a {

    /* renamed from: s, reason: collision with root package name */
    public static final int f21389s = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f21390d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f21391e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f21392f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f21393g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f21394h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f21395i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f21396m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f21397n;

    /* renamed from: o, reason: collision with root package name */
    public int f21398o;

    /* renamed from: p, reason: collision with root package name */
    public int f21399p;

    /* renamed from: q, reason: collision with root package name */
    public int f21400q;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f21401r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, android.graphics.Bitmap contentBitmap) {
        super(context);
        kotlin.jvm.internal.o.g(contentBitmap, "contentBitmap");
        int i17 = f21389s;
        this.f21401r = new float[]{0.0f, 0.0f, 0.0f, 0.0f, i17, i17, i17, i17};
        this.f21392f = new android.graphics.Paint();
        this.f21394h = new android.graphics.Path();
        this.f21393g = new android.graphics.Paint();
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f21393g;
        if (paint == null) {
            kotlin.jvm.internal.o.o("mMaskPaint");
            throw null;
        }
        paint.setXfermode(porterDuffXfermode);
        this.f21390d = contentBitmap;
        this.f21398o = (int) (contentBitmap.getWidth() * 1.0f);
        this.f21399p = (int) (contentBitmap.getHeight() * 1.0f);
        this.f21395i = new android.graphics.Rect(0, 0, contentBitmap.getWidth(), contentBitmap.getHeight());
        this.f21396m = new android.graphics.Rect(0, 0, this.f21398o, this.f21399p);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f21397n = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f21398o;
        rectF.bottom = this.f21399p;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(230, 0, 0, 0), android.graphics.Color.argb(76, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f21391e = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f21391e;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f21391e;
        if (gradientDrawable3 != null) {
            android.graphics.Rect rect = this.f21396m;
            if (rect == null) {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
            gradientDrawable3.setBounds(rect);
        }
        java.lang.String format = java.lang.String.format("default init: mWidth:%d mHeight:%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f21398o), java.lang.Integer.valueOf(this.f21399p)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
    }

    @Override // bk3.a
    public void a(float f17, float f18, float f19, float f27) {
        android.graphics.RectF rectF = this.f21397n;
        if (rectF != null) {
            rectF.set(f17, f18, f19, f27);
        } else {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
    }

    @Override // bk3.a
    public void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        float[] fArr = this.f21401r;
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
        this.f21398o = i17;
        this.f21399p = i18;
    }

    public final android.graphics.Bitmap getContentBitmap() {
        return this.f21390d;
    }

    public final android.graphics.drawable.GradientDrawable getGradientDrawable() {
        return this.f21391e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = this.f21394h;
        if (path == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        path.reset();
        android.graphics.Path path2 = this.f21394h;
        if (path2 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        android.graphics.RectF rectF = this.f21397n;
        if (rectF == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        path2.addRoundRect(rectF, this.f21401r, android.graphics.Path.Direction.CW);
        android.graphics.Path path3 = this.f21394h;
        if (path3 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        canvas.clipPath(path3);
        android.graphics.Bitmap bitmap = this.f21390d;
        if (bitmap != null) {
            android.graphics.Rect rect = this.f21395i;
            if (rect == null) {
                kotlin.jvm.internal.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f21396m;
            if (rect2 == null) {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
            android.graphics.Paint paint = this.f21392f;
            if (paint == null) {
                kotlin.jvm.internal.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f21391e;
        if (gradientDrawable != null) {
            android.graphics.Rect rect3 = new android.graphics.Rect();
            android.graphics.RectF rectF2 = this.f21397n;
            if (rectF2 == null) {
                kotlin.jvm.internal.o.o("mMaskRect");
                throw null;
            }
            rectF2.round(rect3);
            gradientDrawable.setBounds(rect3);
            gradientDrawable.setAlpha(this.f21400q);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f21398o, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f21399p, 1073741824));
    }

    @Override // bk3.a
    public void setDrawRect(android.graphics.Rect srcRect) {
        kotlin.jvm.internal.o.g(srcRect, "srcRect");
        this.f21395i = srcRect;
    }

    @Override // bk3.a
    public void setDstRect(android.graphics.Rect dstRect) {
        kotlin.jvm.internal.o.g(dstRect, "dstRect");
        this.f21396m = dstRect;
    }

    @Override // bk3.a
    public void setMaskAlpha(int i17) {
        this.f21400q = i17;
    }
}

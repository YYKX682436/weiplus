package bk3;

/* loaded from: classes10.dex */
public final class b extends bk3.a {

    /* renamed from: v, reason: collision with root package name */
    public static final int f102906v = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f102907d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f102908e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f102909f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f102910g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f102911h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Path f102912i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f102913m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f102914n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f102915o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f102916p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.RectF f102917q;

    /* renamed from: r, reason: collision with root package name */
    public int f102918r;

    /* renamed from: s, reason: collision with root package name */
    public int f102919s;

    /* renamed from: t, reason: collision with root package name */
    public int f102920t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f102921u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, android.graphics.Bitmap contentBitmap, android.graphics.Bitmap bitmap) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentBitmap, "contentBitmap");
        int i17 = f102906v;
        this.f102921u = new float[]{0.0f, 0.0f, 0.0f, 0.0f, i17, i17, i17, i17};
        this.f102910g = new android.graphics.Paint();
        this.f102912i = new android.graphics.Path();
        this.f102911h = new android.graphics.Paint();
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f102911h;
        if (paint == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskPaint");
            throw null;
        }
        paint.setXfermode(porterDuffXfermode);
        this.f102907d = contentBitmap;
        this.f102908e = bitmap;
        this.f102918r = (int) (contentBitmap.getWidth() * 1.0f);
        this.f102919s = (int) (contentBitmap.getHeight() * 1.0f);
        this.f102913m = new android.graphics.Rect(0, 0, contentBitmap.getWidth(), contentBitmap.getHeight());
        this.f102914n = new android.graphics.Rect(0, 0, bitmap != null ? bitmap.getWidth() : 0, bitmap != null ? bitmap.getHeight() : 0);
        this.f102915o = new android.graphics.Rect(0, 0, this.f102918r, this.f102919s);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f102917q = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f102918r;
        rectF.bottom = this.f102919s;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(230, 0, 0, 0), android.graphics.Color.argb(76, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f102909f = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f102909f;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f102909f;
        if (gradientDrawable3 != null) {
            android.graphics.Rect rect = this.f102915o;
            if (rect == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDstRect");
                throw null;
            }
            gradientDrawable3.setBounds(rect);
        }
        java.lang.String format = java.lang.String.format("default init: mWidth:%d mHeight:%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f102918r), java.lang.Integer.valueOf(this.f102919s)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
    }

    @Override // bk3.a
    public void a(float f17, float f18, float f19, float f27) {
        android.graphics.RectF rectF = this.f102917q;
        if (rectF != null) {
            rectF.set(f17, f18, f19, f27);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
    }

    @Override // bk3.a
    public void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        float[] fArr = this.f102921u;
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
        this.f102918r = i17;
        this.f102919s = i18;
    }

    /* renamed from: getContentBitmap */
    public final android.graphics.Bitmap m10676x8c4fcf52() {
        return this.f102907d;
    }

    /* renamed from: getDefaultIcon */
    public final android.graphics.Bitmap m10677xbfc5c524() {
        return this.f102908e;
    }

    /* renamed from: getGradientDrawable */
    public final android.graphics.drawable.GradientDrawable m10678xcb51364() {
        return this.f102909f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.f102912i;
        if (path == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        path.reset();
        android.graphics.Path path2 = this.f102912i;
        if (path2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        android.graphics.RectF rectF = this.f102917q;
        if (rectF == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        path2.addRoundRect(rectF, this.f102921u, android.graphics.Path.Direction.CW);
        android.graphics.Path path3 = this.f102912i;
        if (path3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        canvas.clipPath(path3);
        android.graphics.Bitmap bitmap = this.f102907d;
        if (bitmap != null) {
            android.graphics.Rect rect = this.f102913m;
            if (rect == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f102915o;
            if (rect2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDstRect");
                throw null;
            }
            android.graphics.Paint paint = this.f102910g;
            if (paint == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        }
        android.graphics.Bitmap bitmap2 = this.f102908e;
        if (bitmap2 != null) {
            android.graphics.Rect rect3 = this.f102914n;
            if (rect3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDrawDefaultRect");
                throw null;
            }
            android.graphics.Rect rect4 = this.f102916p;
            if (rect4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDstDefaultRect");
                throw null;
            }
            android.graphics.Paint paint2 = this.f102910g;
            if (paint2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap2, rect3, rect4, paint2);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f102909f;
        if (gradientDrawable != null) {
            gradientDrawable.setAlpha(this.f102920t);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f102918r, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f102919s, 1073741824));
    }

    @Override // bk3.a
    /* renamed from: setDefaultDstRect */
    public void mo10671xa2b884ca(android.graphics.Rect dstRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstRect, "dstRect");
        this.f102916p = dstRect;
    }

    @Override // bk3.a
    /* renamed from: setDrawRect */
    public void mo10672x454857ca(android.graphics.Rect srcRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcRect, "srcRect");
        this.f102913m = srcRect;
    }

    @Override // bk3.a
    /* renamed from: setDstRect */
    public void mo10673x25f47287(android.graphics.Rect dstRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstRect, "dstRect");
        this.f102915o = dstRect;
    }

    @Override // bk3.a
    /* renamed from: setMaskAlpha */
    public void mo10674x57005f90(int i17) {
        this.f102920t = i17;
    }
}

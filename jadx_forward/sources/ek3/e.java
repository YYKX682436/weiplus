package ek3;

/* loaded from: classes10.dex */
public final class e extends android.view.View {

    /* renamed from: u, reason: collision with root package name */
    public static final int f335142u = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f335143d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f335144e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f335145f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f335146g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f335147h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f335148i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f335149m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f335150n;

    /* renamed from: o, reason: collision with root package name */
    public int f335151o;

    /* renamed from: p, reason: collision with root package name */
    public int f335152p;

    /* renamed from: q, reason: collision with root package name */
    public int f335153q;

    /* renamed from: r, reason: collision with root package name */
    public float f335154r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f335155s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f335156t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, android.graphics.Bitmap contentBitmap) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentBitmap, "contentBitmap");
        this.f335155s = true;
        int i17 = f335142u;
        this.f335156t = new float[]{0.0f, 0.0f, 0.0f, 0.0f, i17, i17, i17, i17};
        this.f335145f = new android.graphics.Paint();
        this.f335147h = new android.graphics.Path();
        this.f335146g = new android.graphics.Paint();
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f335146g;
        if (paint == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskPaint");
            throw null;
        }
        paint.setXfermode(porterDuffXfermode);
        this.f335143d = contentBitmap;
        this.f335151o = (int) (contentBitmap.getWidth() * 1.0f);
        this.f335152p = (int) (contentBitmap.getHeight() * 1.0f);
        this.f335148i = new android.graphics.Rect(0, 0, contentBitmap.getWidth(), contentBitmap.getHeight());
        this.f335149m = new android.graphics.Rect(0, 0, this.f335151o, this.f335152p);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f335150n = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f335151o;
        rectF.bottom = this.f335152p;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(230, 0, 0, 0), android.graphics.Color.argb(76, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f335144e = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f335144e;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f335144e;
        if (gradientDrawable3 != null) {
            android.graphics.Rect rect = this.f335149m;
            if (rect == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDstRect");
                throw null;
            }
            gradientDrawable3.setBounds(rect);
        }
        java.lang.String format = java.lang.String.format("default init: mWidth:%d mHeight:%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f335151o), java.lang.Integer.valueOf(this.f335152p)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
    }

    public final void a(float f17, float f18, float f19, float f27) {
        android.graphics.RectF rectF = this.f335150n;
        if (rectF != null) {
            rectF.set(f17, f18, f19, f27);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
    }

    public final void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        float[] fArr = this.f335156t;
        fArr[0] = f17;
        fArr[1] = f18;
        fArr[2] = f19;
        fArr[3] = f27;
        fArr[4] = f28;
        fArr[5] = f29;
        fArr[6] = f37;
        fArr[7] = f38;
    }

    /* renamed from: getContentBitmap */
    public final android.graphics.Bitmap m127794x8c4fcf52() {
        return this.f335143d;
    }

    /* renamed from: getGradientDrawable */
    public final android.graphics.drawable.GradientDrawable m127795xcb51364() {
        return this.f335144e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.f335147h;
        if (path == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        path.reset();
        android.graphics.Path path2 = this.f335147h;
        if (path2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        android.graphics.RectF rectF = this.f335150n;
        if (rectF == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        path2.addRoundRect(rectF, this.f335156t, android.graphics.Path.Direction.CW);
        android.graphics.Path path3 = this.f335147h;
        if (path3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        canvas.clipPath(path3);
        android.graphics.Bitmap bitmap = this.f335143d;
        if (bitmap != null) {
            int save = canvas.save();
            float f17 = this.f335154r;
            android.graphics.RectF rectF2 = this.f335150n;
            if (rectF2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
                throw null;
            }
            float centerX = rectF2.centerX();
            android.graphics.RectF rectF3 = this.f335150n;
            if (rectF3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
                throw null;
            }
            canvas.rotate(f17, centerX, rectF3.centerY());
            android.graphics.Rect rect = this.f335148i;
            if (rect == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f335149m;
            if (rect2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDstRect");
                throw null;
            }
            android.graphics.Paint paint = this.f335145f;
            if (paint == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (this.f335155s && (gradientDrawable = this.f335144e) != null) {
                gradientDrawable.setAlpha(this.f335153q);
                gradientDrawable.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f335151o, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f335152p, 1073741824));
    }

    /* renamed from: setGradientOrientation */
    public final void m127796x9a37e4be(android.graphics.drawable.GradientDrawable.Orientation orientation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f335144e;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setOrientation(orientation);
    }

    /* renamed from: setMaskAlpha */
    public final void m127797x57005f90(int i17) {
        this.f335153q = i17;
    }

    /* renamed from: setRotate */
    public final void m127798x2127345d(float f17) {
        this.f335154r = f17;
    }
}

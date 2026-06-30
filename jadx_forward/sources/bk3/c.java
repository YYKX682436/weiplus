package bk3;

/* loaded from: classes10.dex */
public final class c extends bk3.a {

    /* renamed from: s, reason: collision with root package name */
    public static final int f102922s = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f102923d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f102924e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f102925f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f102926g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f102927h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f102928i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Rect f102929m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f102930n;

    /* renamed from: o, reason: collision with root package name */
    public int f102931o;

    /* renamed from: p, reason: collision with root package name */
    public int f102932p;

    /* renamed from: q, reason: collision with root package name */
    public int f102933q;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f102934r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, android.graphics.Bitmap contentBitmap) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentBitmap, "contentBitmap");
        int i17 = f102922s;
        this.f102934r = new float[]{0.0f, 0.0f, 0.0f, 0.0f, i17, i17, i17, i17};
        this.f102925f = new android.graphics.Paint();
        this.f102927h = new android.graphics.Path();
        this.f102926g = new android.graphics.Paint();
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f102926g;
        if (paint == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskPaint");
            throw null;
        }
        paint.setXfermode(porterDuffXfermode);
        this.f102923d = contentBitmap;
        this.f102931o = (int) (contentBitmap.getWidth() * 1.0f);
        this.f102932p = (int) (contentBitmap.getHeight() * 1.0f);
        this.f102928i = new android.graphics.Rect(0, 0, contentBitmap.getWidth(), contentBitmap.getHeight());
        this.f102929m = new android.graphics.Rect(0, 0, this.f102931o, this.f102932p);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f102930n = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f102931o;
        rectF.bottom = this.f102932p;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(230, 0, 0, 0), android.graphics.Color.argb(76, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f102924e = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f102924e;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f102924e;
        if (gradientDrawable3 != null) {
            android.graphics.Rect rect = this.f102929m;
            if (rect == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDstRect");
                throw null;
            }
            gradientDrawable3.setBounds(rect);
        }
        java.lang.String format = java.lang.String.format("default init: mWidth:%d mHeight:%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f102931o), java.lang.Integer.valueOf(this.f102932p)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
    }

    @Override // bk3.a
    public void a(float f17, float f18, float f19, float f27) {
        android.graphics.RectF rectF = this.f102930n;
        if (rectF != null) {
            rectF.set(f17, f18, f19, f27);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
    }

    @Override // bk3.a
    public void b(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        float[] fArr = this.f102934r;
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
        this.f102931o = i17;
        this.f102932p = i18;
    }

    /* renamed from: getContentBitmap */
    public final android.graphics.Bitmap m10680x8c4fcf52() {
        return this.f102923d;
    }

    /* renamed from: getGradientDrawable */
    public final android.graphics.drawable.GradientDrawable m10681xcb51364() {
        return this.f102924e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.f102927h;
        if (path == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        path.reset();
        android.graphics.Path path2 = this.f102927h;
        if (path2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        android.graphics.RectF rectF = this.f102930n;
        if (rectF == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
            throw null;
        }
        path2.addRoundRect(rectF, this.f102934r, android.graphics.Path.Direction.CW);
        android.graphics.Path path3 = this.f102927h;
        if (path3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mClipPath");
            throw null;
        }
        canvas.clipPath(path3);
        android.graphics.Bitmap bitmap = this.f102923d;
        if (bitmap != null) {
            android.graphics.Rect rect = this.f102928i;
            if (rect == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f102929m;
            if (rect2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDstRect");
                throw null;
            }
            android.graphics.Paint paint = this.f102925f;
            if (paint == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPaint");
                throw null;
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f102924e;
        if (gradientDrawable != null) {
            android.graphics.Rect rect3 = new android.graphics.Rect();
            android.graphics.RectF rectF2 = this.f102930n;
            if (rectF2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMaskRect");
                throw null;
            }
            rectF2.round(rect3);
            gradientDrawable.setBounds(rect3);
            gradientDrawable.setAlpha(this.f102933q);
            gradientDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f102931o, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f102932p, 1073741824));
    }

    @Override // bk3.a
    /* renamed from: setDrawRect */
    public void mo10672x454857ca(android.graphics.Rect srcRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcRect, "srcRect");
        this.f102928i = srcRect;
    }

    @Override // bk3.a
    /* renamed from: setDstRect */
    public void mo10673x25f47287(android.graphics.Rect dstRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstRect, "dstRect");
        this.f102929m = dstRect;
    }

    @Override // bk3.a
    /* renamed from: setMaskAlpha */
    public void mo10674x57005f90(int i17) {
        this.f102933q = i17;
    }
}

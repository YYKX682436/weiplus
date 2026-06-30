package ck3;

/* loaded from: classes14.dex */
public final class a0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f42444d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f42445e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f42446f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Path f42447g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f42448h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f42449i;

    /* renamed from: m, reason: collision with root package name */
    public int f42450m;

    /* renamed from: n, reason: collision with root package name */
    public int f42451n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.RectF f42452o;

    /* renamed from: p, reason: collision with root package name */
    public int f42453p;

    /* renamed from: q, reason: collision with root package name */
    public int f42454q;

    /* renamed from: r, reason: collision with root package name */
    public int f42455r;

    /* renamed from: s, reason: collision with root package name */
    public int f42456s;

    /* renamed from: t, reason: collision with root package name */
    public int f42457t;

    /* renamed from: u, reason: collision with root package name */
    public int f42458u;

    /* renamed from: v, reason: collision with root package name */
    public int f42459v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f42460w;

    /* renamed from: x, reason: collision with root package name */
    public int f42461x;

    /* renamed from: y, reason: collision with root package name */
    public android.animation.AnimatorListenerAdapter f42462y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42463z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context, android.graphics.Bitmap contentBitmap, android.graphics.Rect rect, java.lang.Integer num, java.lang.Integer num2) {
        super(context);
        android.graphics.RectF rectF;
        kotlin.jvm.internal.o.g(contentBitmap, "contentBitmap");
        new android.graphics.Paint();
        this.f42459v = -1;
        this.f42463z = true;
        int intValue = num != null ? num.intValue() : 0;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        this.f42445e = new android.graphics.Paint();
        this.f42447g = new android.graphics.Path();
        this.f42446f = new android.graphics.Paint();
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f42446f;
        if (paint == null) {
            kotlin.jvm.internal.o.o("mMaskPaint");
            throw null;
        }
        paint.setXfermode(porterDuffXfermode);
        android.graphics.Paint paint2 = this.f42446f;
        if (paint2 == null) {
            kotlin.jvm.internal.o.o("mMaskPaint");
            throw null;
        }
        paint2.setColor(-1);
        this.f42444d = contentBitmap;
        this.f42457t = (int) (contentBitmap.getWidth() * 1.0f);
        this.f42458u = (int) (contentBitmap.getHeight() * 1.0f);
        this.f42448h = new android.graphics.Rect(0, 0, contentBitmap.getWidth(), contentBitmap.getHeight());
        this.f42449i = new android.graphics.Rect(0, 0, this.f42457t, this.f42458u);
        this.f42450m = intValue;
        this.f42451n = intValue2;
        if (rect != null) {
            rectF = new android.graphics.RectF(rect);
        } else {
            rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, this.f42457t, this.f42458u);
        }
        this.f42452o = rectF;
        java.lang.String format = java.lang.String.format("init: mWidth:%d mHeight:%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f42457t), java.lang.Integer.valueOf(this.f42458u)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformToMultiTaskFBAnimationMaskView", format);
    }

    public final void a(int i17, android.animation.TimeInterpolator timeInterpolator, boolean z17) {
        if (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            int i18 = this.f42459v;
            this.f42460w = i18 > 0;
            int i19 = this.f42455r;
            if (i18 < i19) {
                i19 = i18;
            }
            android.animation.PropertyValuesHolder ofInt = android.animation.PropertyValuesHolder.ofInt("canvasTranslationX", i19, -i18);
            int i27 = this.f42455r;
            if (this.f42460w) {
                int i28 = this.f42459v;
                i27 = i28 < i27 ? i27 - i28 : i28;
            }
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("translationX", i27, i27), android.animation.PropertyValuesHolder.ofInt("translationY", 0, this.f42456s), android.animation.PropertyValuesHolder.ofFloat("scaleX", 1.0f, (this.f42454q * 2.0f) / this.f42457t), android.animation.PropertyValuesHolder.ofFloat("scaleY", 1.0f, (this.f42454q * 2.0f) / this.f42458u), ofInt, android.animation.PropertyValuesHolder.ofInt("bgAlpha", 255, 0));
            ofPropertyValuesHolder.setDuration(i17);
            if (timeInterpolator != null) {
                ofPropertyValuesHolder.setInterpolator(timeInterpolator);
            }
            ofPropertyValuesHolder.addUpdateListener(new ck3.y(this));
            ofPropertyValuesHolder.addListener(new ck3.z(this));
            ofPropertyValuesHolder.start();
            return;
        }
        this.f42463z = z17;
        if (z17) {
            int i29 = this.f42459v;
            this.f42460w = i29 > 0;
            int i37 = this.f42455r;
            if (i29 < i37) {
                i37 = i29;
            }
            android.animation.PropertyValuesHolder ofInt2 = android.animation.PropertyValuesHolder.ofInt("canvasTranslationX", i37, (-i29) + i65.a.b(getContext(), 6));
            int i38 = this.f42455r;
            if (this.f42460w) {
                int i39 = this.f42459v;
                if (i39 < i38) {
                    i39 = i38 - i39;
                }
                if (i38 <= this.f42457t / 2) {
                    i38 = i39;
                }
            }
            android.animation.ValueAnimator ofPropertyValuesHolder2 = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("translationX", 0, i38), android.animation.PropertyValuesHolder.ofInt("translationY", 0, this.f42456s), android.animation.PropertyValuesHolder.ofFloat("scaleX", 1.0f, (this.f42454q * 2.0f) / this.f42457t), android.animation.PropertyValuesHolder.ofFloat("scaleY", 1.0f, (this.f42454q * 2.0f) / this.f42458u), ofInt2, android.animation.PropertyValuesHolder.ofInt("bgAlpha", 255, 0));
            ofPropertyValuesHolder2.setDuration(i17);
            if (timeInterpolator != null) {
                ofPropertyValuesHolder2.setInterpolator(timeInterpolator);
            }
            ofPropertyValuesHolder2.addUpdateListener(new ck3.w(this));
            ofPropertyValuesHolder2.addListener(new ck3.x(this));
            ofPropertyValuesHolder2.start();
            return;
        }
        int i47 = this.f42459v;
        this.f42460w = i47 > 0;
        int i48 = this.f42455r;
        if (i47 < i48) {
            i48 = i47;
        }
        android.animation.PropertyValuesHolder ofInt3 = android.animation.PropertyValuesHolder.ofInt("canvasTranslationX", i48, -i47);
        int i49 = this.f42455r;
        if (this.f42460w) {
            int i57 = this.f42459v;
            i49 = i57 < i49 ? i49 - i57 : i57;
        }
        int[] iArr = new int[2];
        android.graphics.RectF rectF = this.f42452o;
        if (rectF == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        iArr[0] = (int) rectF.left;
        iArr[1] = i49;
        android.animation.PropertyValuesHolder ofInt4 = android.animation.PropertyValuesHolder.ofInt("translationX", iArr);
        int[] iArr2 = new int[2];
        android.graphics.RectF rectF2 = this.f42452o;
        if (rectF2 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        iArr2[0] = (int) rectF2.top;
        iArr2[1] = this.f42456s;
        android.animation.ValueAnimator ofPropertyValuesHolder3 = android.animation.ValueAnimator.ofPropertyValuesHolder(ofInt4, android.animation.PropertyValuesHolder.ofInt("translationY", iArr2), android.animation.PropertyValuesHolder.ofFloat("scaleX", 1.0f, (this.f42454q * 2.0f) / this.f42457t), android.animation.PropertyValuesHolder.ofFloat("scaleY", 1.0f, (this.f42454q * 2.0f) / this.f42458u), ofInt3, android.animation.PropertyValuesHolder.ofFloat("curPageAlpha", 1.0f, 0.0f));
        ofPropertyValuesHolder3.setDuration(i17);
        if (timeInterpolator != null) {
            ofPropertyValuesHolder3.setInterpolator(timeInterpolator);
        }
        ofPropertyValuesHolder3.addUpdateListener(new ck3.u(this));
        ofPropertyValuesHolder3.addListener(new ck3.v(this));
        ofPropertyValuesHolder3.start();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            if (this.f42460w) {
                canvas.translate(this.f42453p, 0.0f);
            } else {
                canvas.drawColor(android.graphics.Color.argb(this.f42461x, 0, 0, 0));
            }
            android.graphics.Path path = this.f42447g;
            if (path == null) {
                kotlin.jvm.internal.o.o("mClipPath");
                throw null;
            }
            path.reset();
            android.graphics.Path path2 = this.f42447g;
            if (path2 == null) {
                kotlin.jvm.internal.o.o("mClipPath");
                throw null;
            }
            android.graphics.RectF rectF = this.f42452o;
            if (rectF == null) {
                kotlin.jvm.internal.o.o("mMaskRect");
                throw null;
            }
            float f17 = this.f42454q;
            path2.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
            android.graphics.Path path3 = this.f42447g;
            if (path3 == null) {
                kotlin.jvm.internal.o.o("mClipPath");
                throw null;
            }
            canvas.clipPath(path3);
            android.graphics.Bitmap bitmap = this.f42444d;
            if (bitmap == null) {
                kotlin.jvm.internal.o.o("mContentBitmap");
                throw null;
            }
            android.graphics.Rect rect = this.f42448h;
            if (rect == null) {
                kotlin.jvm.internal.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect2 = this.f42449i;
            if (rect2 != null) {
                canvas.drawBitmap(bitmap, rect, rect2, this.f42445e);
                return;
            } else {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
        }
        if (this.f42463z) {
            if (this.f42460w) {
                canvas.translate(this.f42453p, 0.0f);
            } else {
                canvas.drawColor(android.graphics.Color.argb(this.f42461x, 0, 0, 0));
            }
            android.graphics.Path path4 = this.f42447g;
            if (path4 == null) {
                kotlin.jvm.internal.o.o("mClipPath");
                throw null;
            }
            path4.reset();
            android.graphics.Path path5 = this.f42447g;
            if (path5 == null) {
                kotlin.jvm.internal.o.o("mClipPath");
                throw null;
            }
            android.graphics.RectF rectF2 = this.f42452o;
            if (rectF2 == null) {
                kotlin.jvm.internal.o.o("mMaskRect");
                throw null;
            }
            path5.addRoundRect(rectF2, i65.a.b(getContext(), 8), i65.a.b(getContext(), 8), android.graphics.Path.Direction.CW);
            android.graphics.Path path6 = this.f42447g;
            if (path6 == null) {
                kotlin.jvm.internal.o.o("mClipPath");
                throw null;
            }
            canvas.clipPath(path6);
            android.graphics.Bitmap bitmap2 = this.f42444d;
            if (bitmap2 == null) {
                kotlin.jvm.internal.o.o("mContentBitmap");
                throw null;
            }
            android.graphics.Rect rect3 = this.f42448h;
            if (rect3 == null) {
                kotlin.jvm.internal.o.o("mDrawRect");
                throw null;
            }
            android.graphics.Rect rect4 = this.f42449i;
            if (rect4 != null) {
                canvas.drawBitmap(bitmap2, rect3, rect4, this.f42445e);
                return;
            } else {
                kotlin.jvm.internal.o.o("mDstRect");
                throw null;
            }
        }
        if (this.f42460w) {
            canvas.translate(this.f42453p, 0.0f);
        } else {
            canvas.drawColor(android.graphics.Color.argb(this.f42461x, 0, 0, 0));
        }
        android.graphics.RectF rectF3 = this.f42452o;
        if (rectF3 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        float width = rectF3.width();
        float f18 = this.f42457t;
        float f19 = width / f18;
        int i17 = (int) (f18 * f19);
        int i18 = (int) (this.f42458u * f19);
        android.graphics.RectF rectF4 = this.f42452o;
        if (rectF4 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        int centerX = (int) rectF4.centerX();
        android.graphics.RectF rectF5 = this.f42452o;
        if (rectF5 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        int centerY = (int) rectF5.centerY();
        android.graphics.Rect rect5 = this.f42449i;
        if (rect5 == null) {
            kotlin.jvm.internal.o.o("mDstRect");
            throw null;
        }
        int i19 = i17 / 2;
        int i27 = i18 / 2;
        rect5.set(centerX - i19, centerY - i27, centerX + i19, centerY + i27);
        android.graphics.Path path7 = this.f42447g;
        if (path7 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        path7.reset();
        android.graphics.Path path8 = this.f42447g;
        if (path8 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        android.graphics.RectF rectF6 = this.f42452o;
        if (rectF6 == null) {
            kotlin.jvm.internal.o.o("mMaskRect");
            throw null;
        }
        path8.addRoundRect(rectF6, i65.a.b(getContext(), 8), i65.a.b(getContext(), 8), android.graphics.Path.Direction.CW);
        android.graphics.Path path9 = this.f42447g;
        if (path9 == null) {
            kotlin.jvm.internal.o.o("mClipPath");
            throw null;
        }
        canvas.clipPath(path9);
        android.graphics.Bitmap bitmap3 = this.f42444d;
        if (bitmap3 == null) {
            kotlin.jvm.internal.o.o("mContentBitmap");
            throw null;
        }
        android.graphics.Rect rect6 = this.f42448h;
        if (rect6 == null) {
            kotlin.jvm.internal.o.o("mDrawRect");
            throw null;
        }
        android.graphics.Rect rect7 = this.f42449i;
        if (rect7 != null) {
            canvas.drawBitmap(bitmap3, rect6, rect7, this.f42445e);
        } else {
            kotlin.jvm.internal.o.o("mDstRect");
            throw null;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Integer.max(this.f42457t, this.f42450m), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Integer.max(this.f42458u, this.f42451n), 1073741824));
    }

    public final void setContentStartPosX(int i17) {
        this.f42459v = i17;
    }

    public final void setListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f42462y = animatorListenerAdapter;
    }
}

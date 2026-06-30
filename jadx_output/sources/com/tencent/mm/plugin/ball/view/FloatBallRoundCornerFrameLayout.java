package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,B#\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b+\u0010.J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\"¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallRoundCornerFrameLayout;", "Landroid/widget/FrameLayout;", "", "radius", "Ljz5/f0;", "setRadius", "", "round", "setRoundCorner", "", "color", "setBackgroundColorMask", "Landroid/graphics/Path;", "d", "Ljz5/g;", "getMPath", "()Landroid/graphics/Path;", "mPath", "e", "getMStrokePath", "mStrokePath", "Landroid/graphics/RectF;", "f", "getMRectF", "()Landroid/graphics/RectF;", "mRectF", "", "g", "getRoundRadiusArray", "()[F", "roundRadiusArray", "Landroid/graphics/Paint;", "h", "getMPaint", "()Landroid/graphics/Paint;", "mPaint", "i", "getMStrokePaint", "mStrokePaint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FloatBallRoundCornerFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mPath;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mStrokePath;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mRectF;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g roundRadiusArray;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mPaint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mStrokePaint;

    /* renamed from: m, reason: collision with root package name */
    public float f93503m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f93504n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93505o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93506p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f93507q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f93508r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallRoundCornerFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final android.graphics.Paint getMPaint() {
        return (android.graphics.Paint) ((jz5.n) this.mPaint).getValue();
    }

    private final android.graphics.Path getMPath() {
        return (android.graphics.Path) ((jz5.n) this.mPath).getValue();
    }

    private final android.graphics.RectF getMRectF() {
        return (android.graphics.RectF) ((jz5.n) this.mRectF).getValue();
    }

    private final android.graphics.Paint getMStrokePaint() {
        return (android.graphics.Paint) ((jz5.n) this.mStrokePaint).getValue();
    }

    private final android.graphics.Path getMStrokePath() {
        return (android.graphics.Path) ((jz5.n) this.mStrokePath).getValue();
    }

    private final float[] getRoundRadiusArray() {
        return (float[]) ((jz5.n) this.roundRadiusArray).getValue();
    }

    public final void a(float f17, int i17) {
        this.f93508r = true;
        if (getMStrokePaint().getStrokeWidth() == f17) {
            return;
        }
        getMStrokePaint().setAntiAlias(true);
        getMStrokePaint().setStrokeWidth(f17);
        getMStrokePaint().setColor(i17);
        getMStrokePaint().setStyle(android.graphics.Paint.Style.STROKE);
        if (this.f93508r) {
            android.graphics.RectF rectF = new android.graphics.RectF(getMRectF());
            rectF.inset(0.0f, 0.0f);
            b(getMStrokePath(), rectF);
        }
        invalidate();
    }

    public final void b(android.graphics.Path path, android.graphics.RectF rectF) {
        path.reset();
        if (this.f93504n) {
            float height = rectF.height() / 2;
            path.addRoundRect(rectF, height, height, android.graphics.Path.Direction.CCW);
            return;
        }
        boolean z17 = this.f93505o;
        if (!z17 && !this.f93506p) {
            float f17 = this.f93503m;
            path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CCW);
            return;
        }
        float height2 = z17 ? rectF.height() / 2 : 0.0f;
        getRoundRadiusArray()[0] = height2;
        getRoundRadiusArray()[1] = height2;
        getRoundRadiusArray()[6] = height2;
        getRoundRadiusArray()[7] = height2;
        float height3 = this.f93506p ? rectF.height() / 2 : 0.0f;
        getRoundRadiusArray()[2] = height3;
        getRoundRadiusArray()[3] = height3;
        getRoundRadiusArray()[4] = height3;
        getRoundRadiusArray()[5] = height3;
        path.addRoundRect(rectF, getRoundRadiusArray(), android.graphics.Path.Direction.CCW);
    }

    public final void c() {
        b(getMPath(), getMRectF());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        try {
            canvas.save();
            canvas.clipPath(getMPath());
            java.lang.Integer num = this.f93507q;
            if (num != null) {
                num.intValue();
                canvas.drawPaint(getMPaint());
            }
            if (this.f93508r) {
                canvas.drawPath(getMStrokePath(), getMStrokePaint());
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallRoundFrameLayout", th6, "dispatchDraw exception", new java.lang.Object[0]);
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        canvas.clipPath(getMPath());
        java.lang.Integer num = this.f93507q;
        if (num != null) {
            num.intValue();
            canvas.drawPaint(getMPaint());
        }
        if (this.f93508r) {
            canvas.drawPath(getMStrokePath(), getMStrokePaint());
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 == i19 && i18 == i27) {
            return;
        }
        getMRectF().set(0.0f, 0.0f, i17, i18);
        c();
        if (this.f93508r) {
            android.graphics.RectF rectF = new android.graphics.RectF(getMRectF());
            rectF.inset(0.0f, 0.0f);
            b(getMStrokePath(), rectF);
        }
    }

    public final void setBackgroundColorMask(int i17) {
        java.lang.Integer num = this.f93507q;
        if (num != null && num.intValue() == i17) {
            return;
        }
        this.f93507q = java.lang.Integer.valueOf(i17);
        getMPaint().setColor(i17);
        getMPaint().setAntiAlias(true);
        getMPaint().setStyle(android.graphics.Paint.Style.FILL);
        invalidate();
    }

    public final void setRadius(float f17) {
        if (this.f93503m == f17) {
            return;
        }
        this.f93503m = f17;
        c();
    }

    public final void setRoundCorner(boolean z17) {
        this.f93505o = false;
        this.f93506p = false;
        if (this.f93504n != z17) {
            this.f93504n = z17;
            c();
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallRoundCornerFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.mPath = jz5.h.b(rp1.y0.f398558d);
        this.mStrokePath = jz5.h.b(rp1.b1.f398359d);
        this.mRectF = jz5.h.b(rp1.z0.f398564d);
        this.roundRadiusArray = jz5.h.b(rp1.c1.f398365d);
        this.mPaint = jz5.h.b(rp1.x0.f398555d);
        this.mStrokePaint = jz5.h.b(rp1.a1.f398354d);
        setWillNotDraw(false);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cp1.h.f220769a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f93503m = obtainStyledAttributes.getDimension(1, 0.0f);
        this.f93504n = obtainStyledAttributes.getBoolean(3, false);
        this.f93505o = obtainStyledAttributes.getBoolean(0, false);
        this.f93506p = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }
}

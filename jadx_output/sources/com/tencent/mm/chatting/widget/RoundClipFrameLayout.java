package com.tencent.mm.chatting.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR*\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR*\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R*\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0005\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\t¨\u0006."}, d2 = {"Lcom/tencent/mm/chatting/widget/RoundClipFrameLayout;", "Landroid/widget/FrameLayout;", "", "value", "d", "F", "getClipRadius", "()F", "setClipRadius", "(F)V", "clipRadius", "", "e", "I", "getInnerStrokeColor", "()I", "setInnerStrokeColor", "(I)V", "innerStrokeColor", "f", "getInnerStrokeWidth", "setInnerStrokeWidth", "innerStrokeWidth", "g", "getOuterStrokeColor", "setOuterStrokeColor", "outerStrokeColor", "h", "getOuterStrokeWidth", "setOuterStrokeWidth", "outerStrokeWidth", "i", "getMaskColor", "setMaskColor", "maskColor", "m", "getMaskAlpha", "setMaskAlpha", "maskAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-chatting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class RoundClipFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float clipRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int innerStrokeColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float innerStrokeWidth;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int outerStrokeColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float outerStrokeWidth;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int maskColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float maskAlpha;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f64755n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f64756o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.RectF f64757p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f64758q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f64759r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Path f64760s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundClipFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final float a(int i17) {
        return getContext().getResources().getDisplayMetrics().density * i17;
    }

    public final void b() {
        int i17 = this.maskColor;
        android.graphics.Paint paint = this.f64759r;
        if (i17 != 0) {
            float f17 = this.maskAlpha;
            if (f17 > 0.0f) {
                int e17 = (int) ((e06.p.e(f17, 0.0f, 1.0f) * 255.0f) + 0.5f);
                paint.setColor(this.maskColor);
                paint.setAlpha(e17);
                invalidate();
            }
        }
        paint.setColor(0);
        paint.setAlpha(0);
        invalidate();
    }

    public final void c() {
        android.graphics.Paint paint = this.f64756o;
        paint.setColor(this.outerStrokeColor);
        paint.setStrokeWidth(this.outerStrokeWidth * 2.0f);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        invalidate();
    }

    public final void d() {
        android.graphics.Paint paint = this.f64758q;
        paint.setColor(this.innerStrokeColor);
        paint.setStrokeWidth(this.innerStrokeWidth * 2.0f);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int save = canvas.save();
        int width = getWidth();
        android.graphics.RectF rectF = this.f64757p;
        if (width > 0 && getHeight() > 0) {
            float min = java.lang.Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f);
            float f17 = this.clipRadius;
            if (f17 > min) {
                f17 = min;
            }
            if (!rectF.isEmpty() && min > 0.0f) {
                android.graphics.Path path = this.f64760s;
                path.reset();
                path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
        super.dispatchDraw(canvas);
        if (this.maskAlpha > 0.0f && this.maskColor != 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f64759r);
        }
        if (this.innerStrokeWidth > 0.0f && this.innerStrokeColor != 0) {
            float f18 = this.clipRadius;
            canvas.drawRoundRect(rectF, f18, f18, this.f64758q);
        }
        canvas.restoreToCount(save);
        float f19 = this.outerStrokeWidth;
        if (f19 > 0.0f && this.outerStrokeColor != 0) {
            float f27 = this.clipRadius + f19;
            canvas.drawRoundRect(this.f64755n, f27, f27, this.f64756o);
        }
    }

    public final float getClipRadius() {
        return this.clipRadius;
    }

    public final int getInnerStrokeColor() {
        return this.innerStrokeColor;
    }

    public final float getInnerStrokeWidth() {
        return this.innerStrokeWidth;
    }

    public final float getMaskAlpha() {
        return this.maskAlpha;
    }

    public final int getMaskColor() {
        return this.maskColor;
    }

    public final int getOuterStrokeColor() {
        return this.outerStrokeColor;
    }

    public final float getOuterStrokeWidth() {
        return this.outerStrokeWidth;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float f17 = i17;
        float f18 = i18;
        this.f64755n.set(0.0f, 0.0f, f17, f18);
        float f19 = this.outerStrokeWidth;
        this.f64757p.set(f19, f19, f17 - f19, f18 - f19);
        invalidateOutline();
    }

    public final void setClipRadius(float f17) {
        if (this.clipRadius == f17) {
            return;
        }
        this.clipRadius = f17;
        invalidateOutline();
        invalidate();
    }

    public final void setInnerStrokeColor(int i17) {
        if (this.innerStrokeColor == i17) {
            return;
        }
        this.innerStrokeColor = i17;
        d();
    }

    public final void setInnerStrokeWidth(float f17) {
        if (this.innerStrokeWidth == f17) {
            return;
        }
        this.innerStrokeWidth = f17;
        int width = getWidth();
        int height = getHeight();
        float f18 = this.outerStrokeWidth;
        this.f64757p.set(f18, f18, width - f18, height - f18);
        d();
    }

    public final void setMaskAlpha(float f17) {
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        if (this.maskAlpha == e17) {
            return;
        }
        this.maskAlpha = e17;
        b();
    }

    public final void setMaskColor(int i17) {
        if (this.maskColor == i17) {
            return;
        }
        this.maskColor = i17;
        b();
    }

    public final void setOuterStrokeColor(int i17) {
        if (this.outerStrokeColor == i17) {
            return;
        }
        this.outerStrokeColor = i17;
        c();
    }

    public final void setOuterStrokeWidth(float f17) {
        if (this.outerStrokeWidth == f17) {
            return;
        }
        this.outerStrokeWidth = f17;
        this.f64755n.set(0.0f, 0.0f, getWidth(), getHeight());
        int width = getWidth();
        int height = getHeight();
        float f18 = this.outerStrokeWidth;
        this.f64757p.set(f18, f18, width - f18, height - f18);
        invalidateOutline();
        c();
        invalidate();
    }

    public /* synthetic */ RoundClipFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundClipFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.clipRadius = a(2);
        this.innerStrokeWidth = a(0);
        this.outerStrokeWidth = a(0);
        this.f64755n = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(0);
        paint.setStrokeWidth(0.0f);
        this.f64756o = paint;
        this.f64757p = new android.graphics.RectF();
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(0);
        paint2.setStrokeWidth(0.0f);
        this.f64758q = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setColor(0);
        this.f64759r = paint3;
        this.f64760s = new android.graphics.Path();
        setClipToOutline(true);
        setOutlineProvider(new jo.f(this));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sy.e0.f413803a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setClipRadius(obtainStyledAttributes.getDimension(0, a(2)));
        setInnerStrokeColor(obtainStyledAttributes.getColor(1, 0));
        setInnerStrokeWidth(obtainStyledAttributes.getDimension(2, a(0)));
        setOuterStrokeColor(obtainStyledAttributes.getColor(5, 0));
        setOuterStrokeWidth(obtainStyledAttributes.getDimension(6, a(0)));
        setMaskColor(obtainStyledAttributes.getColor(4, 0));
        setMaskAlpha(obtainStyledAttributes.getFloat(3, 0.0f));
        obtainStyledAttributes.recycle();
    }
}

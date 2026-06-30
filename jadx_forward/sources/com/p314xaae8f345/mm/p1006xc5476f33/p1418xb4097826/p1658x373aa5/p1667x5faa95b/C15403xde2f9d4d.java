package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/image/FinderRoundedBorderImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "radius", "Ljz5/f0;", "setCornerRadius", "width", "setBorderWidth", "", "color", "setBorderColor", "getCornerRadius", "getBorderWidth", "getBorderColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.image.FinderRoundedBorderImageView */
/* loaded from: classes3.dex */
public final class C15403xde2f9d4d extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public float f213871f;

    /* renamed from: g, reason: collision with root package name */
    public float f213872g;

    /* renamed from: h, reason: collision with root package name */
    public int f213873h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Path f213874i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f213875m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f213876n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Path f213877o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15403xde2f9d4d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getBorderColor, reason: from getter */
    public final int getF213873h() {
        return this.f213873h;
    }

    /* renamed from: getBorderWidth, reason: from getter */
    public final float getF213872g() {
        return this.f213872g;
    }

    /* renamed from: getCornerRadius, reason: from getter */
    public final float getF213871f() {
        return this.f213871f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.f213874i);
        super.onDraw(canvas);
        canvas.restore();
        if (this.f213872g > 0.0f) {
            canvas.drawPath(this.f213877o, this.f213875m);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float f17 = i17;
        float f18 = 2;
        float f19 = this.f213872g;
        float f27 = i18;
        android.graphics.RectF rectF = this.f213876n;
        rectF.set(f19, f19, (f17 - (f18 * f19)) + f19, (f27 - (f18 * f19)) + f19);
        android.graphics.Path path = this.f213874i;
        path.reset();
        float f28 = this.f213871f;
        path.addRoundRect(rectF, f28, f28, android.graphics.Path.Direction.CW);
        android.graphics.Path path2 = this.f213877o;
        path2.reset();
        float f29 = this.f213872g;
        android.graphics.RectF rectF2 = new android.graphics.RectF(f29 / f18, f29 / f18, f17 - (f29 / f18), f27 - (f29 / f18));
        float f37 = this.f213871f;
        float f38 = this.f213872g;
        path2.addRoundRect(rectF2, (f38 / f18) + f37, f37 + (f38 / f18), android.graphics.Path.Direction.CW);
    }

    /* renamed from: setBorderColor */
    public final void m62742x9b5140d5(int i17) {
        this.f213873h = i17;
        this.f213875m.setColor(i17);
        invalidate();
    }

    /* renamed from: setBorderWidth */
    public final void m62743x9c683f38(float f17) {
        this.f213872g = f17;
        this.f213875m.setStrokeWidth(f17);
        invalidate();
        requestLayout();
    }

    /* renamed from: setCornerRadius */
    public final void m62744xba0484c9(float f17) {
        this.f213871f = f17;
        invalidate();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15403xde2f9d4d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213873h = -1;
        this.f213874i = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f213875m = paint;
        this.f213876n = new android.graphics.RectF();
        this.f213877o = new android.graphics.Path();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f100084h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f213871f = obtainStyledAttributes.getDimension(2, android.util.TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
        this.f213872g = obtainStyledAttributes.getDimension(1, android.util.TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.f213873h = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        paint.setStrokeWidth(this.f213872g);
        paint.setColor(this.f213873h);
        setClipToOutline(true);
    }
}

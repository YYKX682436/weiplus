package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/view/StickerEditText;", "Lcom/tencent/mm/view/PhotoEditText;", "", "maxLength", "Ljz5/f0;", "setupInputFilter", "color", "setTextBackground", "", "getRoundRectRadius", "alpha", "setBgColorAlpha", "limit", "setLineBreakCountLimit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-photoedit-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.StickerEditText */
/* loaded from: classes5.dex */
public final class C22810x4e74aa94 extends com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 {

    /* renamed from: i, reason: collision with root package name */
    public int f295028i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Path f295029m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f295030n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f295031o;

    /* renamed from: p, reason: collision with root package name */
    public android.text.TextWatcher f295032p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22810x4e74aa94(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f295028i = -1;
        this.f295029m = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f295030n = paint;
        this.f295031o = new android.graphics.RectF();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    /* renamed from: setupInputFilter */
    private final void m82756xba917d25(int i17) {
        if (i17 > 0) {
            setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289
    public void c(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float m82757xc52efd8e = m82757xc52efd8e();
        android.graphics.Paint paint = this.f295030n;
        paint.setColor(this.f294909f);
        float f17 = 2 * m82757xc52efd8e;
        android.graphics.Path path = this.f295029m;
        path.reset();
        if (getLineCount() == 0) {
            return;
        }
        float lineBottom = getLayout().getLineBottom(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
        int lineCount = getLineCount();
        android.graphics.RectF rectF = this.f295031o;
        if (lineCount == 1) {
            rectF.set(0.0f, 0.0f, getLayout().getLineWidth(0) + getPaddingLeft() + getPaddingRight(), lineBottom);
            path.addRoundRect(rectF, m82757xc52efd8e, m82757xc52efd8e, android.graphics.Path.Direction.CW);
        } else {
            float measuredWidth = getMeasuredWidth();
            float lineWidth = getLayout().getLineWidth(getLineCount() - 1);
            float f18 = measuredWidth - f17;
            if (lineWidth >= (f18 - getPaddingLeft()) - getPaddingRight()) {
                rectF.set(0.0f, 0.0f, measuredWidth, lineBottom);
                path.addRoundRect(rectF, m82757xc52efd8e, m82757xc52efd8e, android.graphics.Path.Direction.CW);
            } else {
                float lineTop = getLayout().getLineTop(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                float paddingRight = lineWidth + getPaddingRight() + getPaddingLeft();
                path.moveTo(0.0f, m82757xc52efd8e);
                rectF.set(0.0f, 0.0f, f17, f17);
                path.arcTo(rectF, 180.0f, 90.0f);
                path.lineTo(f18, 0.0f);
                rectF.set(f18, 0.0f, measuredWidth, f17);
                path.arcTo(rectF, 270.0f, 90.0f);
                path.lineTo(measuredWidth, lineTop - m82757xc52efd8e);
                rectF.set(f18, lineTop - f17, measuredWidth, lineTop);
                path.arcTo(rectF, 0.0f, 90.0f);
                path.lineTo(paddingRight + m82757xc52efd8e, lineTop);
                rectF.set(paddingRight, lineTop, paddingRight + f17, lineTop + f17);
                path.arcTo(rectF, 270.0f, -90.0f);
                path.lineTo(paddingRight, lineBottom - m82757xc52efd8e);
                float f19 = lineBottom - f17;
                rectF.set(paddingRight - f17, f19, paddingRight, lineBottom);
                path.arcTo(rectF, 0.0f, 90.0f);
                path.lineTo(m82757xc52efd8e, lineBottom);
                rectF.set(0.0f, f19, f17, lineBottom);
                path.arcTo(rectF, 90.0f, 90.0f);
                path.lineTo(0.0f, m82757xc52efd8e);
            }
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    public final void d(int i17) {
        m82756xba917d25(i17);
    }

    /* renamed from: getRoundRectRadius */
    public final float m82757xc52efd8e() {
        return i65.a.b(getContext(), 8);
    }

    /* renamed from: setBgColorAlpha */
    public final void m82758x33475b62(int i17) {
        this.f295028i = i17;
    }

    /* renamed from: setLineBreakCountLimit */
    public final void m82759xe8b0dbf5(int i17) {
        android.text.TextWatcher textWatcher = this.f295032p;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
            this.f295032p = null;
        }
        if (i17 > 0) {
            ym5.z5 z5Var = new ym5.z5(this, i17);
            this.f295032p = z5Var;
            addTextChangedListener(z5Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289
    /* renamed from: setTextBackground */
    public void mo82626x630fd73d(int i17) {
        int i18 = this.f295028i;
        if (i18 != -1) {
            i17 &= i18;
        }
        super.mo82626x630fd73d(i17);
    }
}

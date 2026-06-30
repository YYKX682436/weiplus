package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorEditableText;", "Lcom/tencent/mm/ui/widget/cedit/edit/AppCompatEditTextCompatHeight;", "", "color", "Ljz5/f0;", "setTextBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorEditableText */
/* loaded from: classes5.dex */
public final class C13257xd7c65e84 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22666xcf3be4c3 {

    /* renamed from: d, reason: collision with root package name */
    public int f179005d;

    /* renamed from: e, reason: collision with root package name */
    public final float f179006e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f179007f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f179008g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f179009h;

    /* renamed from: i, reason: collision with root package name */
    public float f179010i;

    /* renamed from: m, reason: collision with root package name */
    public int f179011m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13257xd7c65e84(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f179007f = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f179008g = paint;
        this.f179009h = new android.graphics.RectF();
        this.f179006e = i65.a.b(context, 12);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        setGravity(1);
        setFilters(new android.text.InputFilter.LengthFilter[]{new android.text.InputFilter.LengthFilter(80)});
        setBackground(null);
        jg5.c.f381198a.b(this, 1);
        setTextSize(1, 32.0f);
        int a17 = ym5.x.a(context, 16.0f);
        int a18 = ym5.x.a(context, 8.0f);
        setPadding(a17, a18, a17, a18);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f179005d != 0) {
            android.text.Editable text = getText();
            if (!(text == null || text.length() == 0)) {
                android.graphics.Paint paint = this.f179008g;
                paint.setColor(this.f179005d);
                float f18 = 2;
                float f19 = this.f179006e;
                float f27 = f19 * f18;
                android.graphics.Path path = this.f179007f;
                path.reset();
                if (getLineCount() != 0) {
                    float lineBottom = getLayout().getLineBottom(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                    int lineCount = getLineCount();
                    android.graphics.RectF rectF = this.f179009h;
                    if (lineCount == 1) {
                        rectF.set(0.0f, 0.0f, getLayout().getLineWidth(0) + getPaddingLeft() + getPaddingRight(), lineBottom);
                        path.addRoundRect(rectF, f19, f19, android.graphics.Path.Direction.CW);
                    } else {
                        float measuredWidth = getMeasuredWidth();
                        float lineWidth = getLayout().getLineWidth(getLineCount() - 1);
                        float f28 = measuredWidth - f27;
                        if (lineWidth >= (f28 - getPaddingLeft()) - getPaddingRight()) {
                            rectF.set(0.0f, 0.0f, measuredWidth, lineBottom);
                            path.addRoundRect(rectF, f19, f19, android.graphics.Path.Direction.CW);
                        } else {
                            float lineTop = getLayout().getLineTop(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                            float paddingLeft = ((getPaddingLeft() + (((measuredWidth - getPaddingLeft()) - getPaddingRight()) / f18)) - (lineWidth / f18)) - getPaddingLeft();
                            float paddingLeft2 = getPaddingLeft() + paddingLeft + lineWidth + getPaddingRight();
                            path.moveTo(0.0f, f19);
                            rectF.set(0.0f, 0.0f, f27, f27);
                            path.arcTo(rectF, 180.0f, 90.0f);
                            path.lineTo(f28, 0.0f);
                            rectF.set(f28, 0.0f, measuredWidth, f27);
                            path.arcTo(rectF, 270.0f, 90.0f);
                            if (lineWidth > ((measuredWidth - getPaddingLeft()) - getPaddingRight()) - (f18 * f27)) {
                                path.lineTo(measuredWidth, lineBottom - f19);
                                float f29 = lineBottom - f27;
                                rectF.set(f28, f29, measuredWidth, lineBottom);
                                path.arcTo(rectF, 0.0f, 90.0f);
                                path.lineTo(f19, lineBottom);
                                rectF.set(0.0f, f29, f27, lineBottom);
                                path.arcTo(rectF, 90.0f, 90.0f);
                                f17 = 0.0f;
                            } else {
                                path.lineTo(measuredWidth, lineTop - f19);
                                float f37 = lineTop - f27;
                                rectF.set(f28, f37, measuredWidth, lineTop);
                                path.arcTo(rectF, 0.0f, 90.0f);
                                path.lineTo(paddingLeft2 + f19, lineTop);
                                float f38 = lineTop + f27;
                                rectF.set(paddingLeft2, lineTop, paddingLeft2 + f27, f38);
                                path.arcTo(rectF, 270.0f, -90.0f);
                                path.lineTo(paddingLeft2, lineBottom - f19);
                                float f39 = lineBottom - f27;
                                rectF.set(paddingLeft2 - f27, f39, paddingLeft2, lineBottom);
                                f17 = 0.0f;
                                path.arcTo(rectF, 0.0f, 90.0f);
                                path.lineTo(paddingLeft + f19, lineBottom);
                                rectF.set(paddingLeft, f39, paddingLeft + f27, lineBottom);
                                path.arcTo(rectF, 90.0f, 90.0f);
                                path.lineTo(paddingLeft, lineTop + f19);
                                rectF.set(paddingLeft - f27, lineTop, paddingLeft, f38);
                                path.arcTo(rectF, 0.0f, -90.0f);
                                path.lineTo(f19, lineTop);
                                rectF.set(0.0f, f37, f27, lineTop);
                                path.arcTo(rectF, 90.0f, 90.0f);
                            }
                            path.lineTo(f17, f19);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, paint);
                }
            }
        }
        if (this.f179011m != 0) {
            getPaint().setStrokeWidth(this.f179010i);
            getPaint().setColor(this.f179011m);
            getPaint().setStyle(android.graphics.Paint.Style.STROKE);
            int save = canvas.save();
            canvas.translate(getPaddingLeft() + ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - getLayout().getWidth()) / 2.0f), getExtendedPaddingTop());
            getLayout().draw(canvas);
            canvas.restoreToCount(save);
            getPaint().setStyle(android.graphics.Paint.Style.FILL);
        }
        super.onDraw(canvas);
    }

    /* renamed from: setTextBackground */
    public final void m54740x630fd73d(int i17) {
        this.f179005d = i17;
        invalidate();
    }
}

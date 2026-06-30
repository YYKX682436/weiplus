package com.tencent.mm.plugin.emojicapture.ui.editor;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/FontTextView;", "Landroid/view/View;", "", "width", "Ljz5/f0;", "setMaxWidth", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "Lc32/e;", "s", "Lc32/e;", "getTextDrawer", "()Lc32/e;", "setTextDrawer", "(Lc32/e;)V", "textDrawer", "", "t", "Z", "getDrawStroke", "()Z", "setDrawStroke", "(Z)V", "drawStroke", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FontTextView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98741d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.Layout.Alignment f98742e;

    /* renamed from: f, reason: collision with root package name */
    public final float f98743f;

    /* renamed from: g, reason: collision with root package name */
    public final android.text.TextPaint f98744g;

    /* renamed from: h, reason: collision with root package name */
    public final android.text.TextPaint f98745h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.StaticLayout f98746i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f98747m;

    /* renamed from: n, reason: collision with root package name */
    public final int f98748n;

    /* renamed from: o, reason: collision with root package name */
    public float f98749o;

    /* renamed from: p, reason: collision with root package name */
    public float f98750p;

    /* renamed from: q, reason: collision with root package name */
    public float f98751q;

    /* renamed from: r, reason: collision with root package name */
    public final float f98752r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public c32.e textDrawer;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean drawStroke;

    public FontTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        this.f98742e = alignment;
        this.f98743f = 1.0f;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f98744g = textPaint;
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        this.f98745h = textPaint2;
        this.f98747m = "";
        kotlin.jvm.internal.o.d(context);
        float dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f480340v1);
        this.f98751q = context.getResources().getDimension(com.tencent.mm.R.dimen.f480342v3);
        this.f98752r = context.getResources().getDimension(com.tencent.mm.R.dimen.f480343v4);
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.aqm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f98741d = string;
        this.f98748n = i65.a.b(context, 2);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(dimension);
        textPaint.setColor(Integer.MAX_VALUE);
        float b17 = i65.a.b(context, 1);
        textPaint.setShadowLayer(b17, 0.0f, b17, -16777216);
        textPaint2.setStrokeWidth(context.getResources().getDimension(com.tencent.mm.R.dimen.f480344v5));
        textPaint2.setAntiAlias(true);
        textPaint2.setTextSize(textPaint.getTextSize());
        textPaint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f98746i = new android.text.StaticLayout(this.f98747m, textPaint, getWidth(), alignment, 1.0f, 0.0f, false);
        c32.a aVar = new c32.a();
        this.textDrawer = aVar;
        this.f98747m = string;
        aVar.setText(string);
    }

    public final void a(android.graphics.Canvas canvas, int i17, float f17) {
        c32.e eVar;
        if (i17 < 0 || i17 >= this.f98746i.getLineCount()) {
            return;
        }
        float lineLeft = this.f98746i.getLineLeft(i17) + getPaddingLeft();
        float paddingTop = getPaddingTop() + this.f98746i.getLineBaseline(i17) + f17;
        boolean z17 = this.f98746i.getEllipsisCount(i17) > 0;
        android.text.StaticLayout staticLayout = this.f98746i;
        int lineStart = z17 ? staticLayout.getLineStart(i17) + this.f98746i.getEllipsisStart(i17) : staticLayout.getLineEnd(i17);
        if (this.drawStroke && (eVar = this.textDrawer) != null) {
            eVar.c(canvas, this.f98746i.getLineStart(i17), lineStart, lineLeft, paddingTop, this.f98745h, z17);
        }
        c32.e eVar2 = this.textDrawer;
        if (eVar2 != null) {
            eVar2.c(canvas, this.f98746i.getLineStart(i17), lineStart, lineLeft, paddingTop, this.f98744g, z17);
        }
    }

    public final void b(java.lang.CharSequence charSequence, int i17, int i18, boolean z17) {
        if (z17) {
            boolean z18 = charSequence == null || charSequence.length() == 0;
            android.text.TextPaint textPaint = this.f98744g;
            if (z18) {
                this.drawStroke = false;
                this.f98747m = this.f98741d;
                textPaint.setColor(Integer.MAX_VALUE);
                float b17 = i65.a.b(getContext(), 1);
                textPaint.setShadowLayer(b17, 0.0f, b17, -16777216);
            } else {
                this.drawStroke = true;
                kotlin.jvm.internal.o.d(charSequence);
                this.f98747m = charSequence;
                textPaint.setColor(i17);
                textPaint.clearShadowLayer();
            }
            this.f98745h.setColor(i18);
            c32.e eVar = this.textDrawer;
            if (eVar != null) {
                eVar.setText(this.f98747m);
            }
            c32.e eVar2 = this.textDrawer;
            if (eVar2 != null) {
                eVar2.a();
            }
        }
    }

    public final boolean getDrawStroke() {
        return this.drawStroke;
    }

    public final c32.e getTextDrawer() {
        return this.textDrawer;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        canvas.translate(-this.f98749o, 0.0f);
        a(canvas, 0, 0.0f);
        a(canvas, 1, this.f98752r);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        float f17 = size;
        float f18 = this.f98750p;
        if (f17 > f18) {
            size = (int) f18;
        }
        int i19 = this.f98748n;
        int i27 = i19 * 2;
        int i28 = size - i27;
        android.text.StaticLayout staticLayout = this.f98746i;
        if (i28 >= 0) {
            c32.e eVar = this.textDrawer;
            if (eVar != null) {
                eVar.a();
            }
            java.lang.CharSequence charSequence = this.f98747m;
            staticLayout = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f98744g, i28).setAlignment(this.f98742e).setIncludePad(false).setMaxLines(2).setLineSpacing(0.0f, this.f98743f).setEllipsize(android.text.TextUtils.TruncateAt.END).build();
            kotlin.jvm.internal.o.f(staticLayout, "build(...)");
        }
        this.f98746i = staticLayout;
        float lineBottom = staticLayout.getLineBottom(0) - this.f98746i.getLineTop(0);
        if (lineBottom > this.f98751q) {
            this.f98751q = lineBottom;
        }
        int paddingBottom = ((int) (this.f98746i.getLineCount() <= 1 ? this.f98751q : (2 * this.f98751q) + this.f98752r)) + getPaddingBottom() + getPaddingTop();
        float lineLeft = this.f98746i.getLineLeft(0);
        float lineRight = this.f98746i.getLineRight(0);
        if (this.f98746i.getLineCount() > 1) {
            if (lineLeft > this.f98746i.getLineLeft(1)) {
                lineLeft = this.f98746i.getLineLeft(1);
            }
            if (lineRight < this.f98746i.getLineRight(1)) {
                lineRight = this.f98746i.getLineRight(1);
            }
        }
        this.f98749o = lineLeft - i19;
        setMeasuredDimension((int) ((lineRight - lineLeft) + i27), paddingBottom);
    }

    public final void setDrawStroke(boolean z17) {
        this.drawStroke = z17;
    }

    public final void setMaxWidth(float f17) {
        this.f98750p = f17;
    }

    public final void setTextDrawer(c32.e eVar) {
        this.textDrawer = eVar;
    }

    public final void setTypeface(android.graphics.Typeface typeface) {
        this.f98744g.setTypeface(typeface);
        this.f98745h.setTypeface(typeface);
    }

    public FontTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

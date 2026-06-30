package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/FontTextView;", "Landroid/view/View;", "", "width", "Ljz5/f0;", "setMaxWidth", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "Lc32/e;", "s", "Lc32/e;", "getTextDrawer", "()Lc32/e;", "setTextDrawer", "(Lc32/e;)V", "textDrawer", "", "t", "Z", "getDrawStroke", "()Z", "setDrawStroke", "(Z)V", "drawStroke", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.FontTextView */
/* loaded from: classes10.dex */
public final class C13402x98569b01 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180274d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.Layout.Alignment f180275e;

    /* renamed from: f, reason: collision with root package name */
    public final float f180276f;

    /* renamed from: g, reason: collision with root package name */
    public final android.text.TextPaint f180277g;

    /* renamed from: h, reason: collision with root package name */
    public final android.text.TextPaint f180278h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.StaticLayout f180279i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f180280m;

    /* renamed from: n, reason: collision with root package name */
    public final int f180281n;

    /* renamed from: o, reason: collision with root package name */
    public float f180282o;

    /* renamed from: p, reason: collision with root package name */
    public float f180283p;

    /* renamed from: q, reason: collision with root package name */
    public float f180284q;

    /* renamed from: r, reason: collision with root package name */
    public final float f180285r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public c32.e textDrawer;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean drawStroke;

    public C13402x98569b01(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        this.f180275e = alignment;
        this.f180276f = 1.0f;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f180277g = textPaint;
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        this.f180278h = textPaint2;
        this.f180280m = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        float dimension = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561873v1);
        this.f180284q = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561875v3);
        this.f180285r = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561876v4);
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f180274d = string;
        this.f180281n = i65.a.b(context, 2);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(dimension);
        textPaint.setColor(Integer.MAX_VALUE);
        float b17 = i65.a.b(context, 1);
        textPaint.setShadowLayer(b17, 0.0f, b17, -16777216);
        textPaint2.setStrokeWidth(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561877v5));
        textPaint2.setAntiAlias(true);
        textPaint2.setTextSize(textPaint.getTextSize());
        textPaint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f180279i = new android.text.StaticLayout(this.f180280m, textPaint, getWidth(), alignment, 1.0f, 0.0f, false);
        c32.a aVar = new c32.a();
        this.textDrawer = aVar;
        this.f180280m = string;
        aVar.mo14070x765074af(string);
    }

    public final void a(android.graphics.Canvas canvas, int i17, float f17) {
        c32.e eVar;
        if (i17 < 0 || i17 >= this.f180279i.getLineCount()) {
            return;
        }
        float lineLeft = this.f180279i.getLineLeft(i17) + getPaddingLeft();
        float paddingTop = getPaddingTop() + this.f180279i.getLineBaseline(i17) + f17;
        boolean z17 = this.f180279i.getEllipsisCount(i17) > 0;
        android.text.StaticLayout staticLayout = this.f180279i;
        int lineStart = z17 ? staticLayout.getLineStart(i17) + this.f180279i.getEllipsisStart(i17) : staticLayout.getLineEnd(i17);
        if (this.drawStroke && (eVar = this.textDrawer) != null) {
            eVar.c(canvas, this.f180279i.getLineStart(i17), lineStart, lineLeft, paddingTop, this.f180278h, z17);
        }
        c32.e eVar2 = this.textDrawer;
        if (eVar2 != null) {
            eVar2.c(canvas, this.f180279i.getLineStart(i17), lineStart, lineLeft, paddingTop, this.f180277g, z17);
        }
    }

    public final void b(java.lang.CharSequence charSequence, int i17, int i18, boolean z17) {
        if (z17) {
            boolean z18 = charSequence == null || charSequence.length() == 0;
            android.text.TextPaint textPaint = this.f180277g;
            if (z18) {
                this.drawStroke = false;
                this.f180280m = this.f180274d;
                textPaint.setColor(Integer.MAX_VALUE);
                float b17 = i65.a.b(getContext(), 1);
                textPaint.setShadowLayer(b17, 0.0f, b17, -16777216);
            } else {
                this.drawStroke = true;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
                this.f180280m = charSequence;
                textPaint.setColor(i17);
                textPaint.clearShadowLayer();
            }
            this.f180278h.setColor(i18);
            c32.e eVar = this.textDrawer;
            if (eVar != null) {
                eVar.mo14070x765074af(this.f180280m);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        canvas.translate(-this.f180282o, 0.0f);
        a(canvas, 0, 0.0f);
        a(canvas, 1, this.f180285r);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        float f17 = size;
        float f18 = this.f180283p;
        if (f17 > f18) {
            size = (int) f18;
        }
        int i19 = this.f180281n;
        int i27 = i19 * 2;
        int i28 = size - i27;
        android.text.StaticLayout staticLayout = this.f180279i;
        if (i28 >= 0) {
            c32.e eVar = this.textDrawer;
            if (eVar != null) {
                eVar.a();
            }
            java.lang.CharSequence charSequence = this.f180280m;
            staticLayout = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f180277g, i28).setAlignment(this.f180275e).setIncludePad(false).setMaxLines(2).setLineSpacing(0.0f, this.f180276f).setEllipsize(android.text.TextUtils.TruncateAt.END).build();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(staticLayout, "build(...)");
        }
        this.f180279i = staticLayout;
        float lineBottom = staticLayout.getLineBottom(0) - this.f180279i.getLineTop(0);
        if (lineBottom > this.f180284q) {
            this.f180284q = lineBottom;
        }
        int paddingBottom = ((int) (this.f180279i.getLineCount() <= 1 ? this.f180284q : (2 * this.f180284q) + this.f180285r)) + getPaddingBottom() + getPaddingTop();
        float lineLeft = this.f180279i.getLineLeft(0);
        float lineRight = this.f180279i.getLineRight(0);
        if (this.f180279i.getLineCount() > 1) {
            if (lineLeft > this.f180279i.getLineLeft(1)) {
                lineLeft = this.f180279i.getLineLeft(1);
            }
            if (lineRight < this.f180279i.getLineRight(1)) {
                lineRight = this.f180279i.getLineRight(1);
            }
        }
        this.f180282o = lineLeft - i19;
        setMeasuredDimension((int) ((lineRight - lineLeft) + i27), paddingBottom);
    }

    /* renamed from: setDrawStroke */
    public final void m54957x1720929e(boolean z17) {
        this.drawStroke = z17;
    }

    /* renamed from: setMaxWidth */
    public final void m54958x8e6ff544(float f17) {
        this.f180283p = f17;
    }

    /* renamed from: setTextDrawer */
    public final void m54959x7109da80(c32.e eVar) {
        this.textDrawer = eVar;
    }

    /* renamed from: setTypeface */
    public final void m54960x4e4ad719(android.graphics.Typeface typeface) {
        this.f180277g.setTypeface(typeface);
        this.f180278h.setTypeface(typeface);
    }

    public C13402x98569b01(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

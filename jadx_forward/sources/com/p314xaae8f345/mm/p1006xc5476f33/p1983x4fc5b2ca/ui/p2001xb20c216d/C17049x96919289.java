package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/PhotoEditText;", "Lcom/tencent/mm/ui/widget/cedit/edit/AppCompatEditTextCompatHeight;", "", "color", "Ljz5/f0;", "setTextBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText */
/* loaded from: classes5.dex */
public final class C17049x96919289 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22666xcf3be4c3 {

    /* renamed from: d, reason: collision with root package name */
    public int f237598d;

    /* renamed from: e, reason: collision with root package name */
    public final float f237599e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f237600f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f237601g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f237602h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17049x96919289(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237600f = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f237601g = paint;
        this.f237602h = new android.graphics.RectF();
        this.f237599e = i65.a.b(context, 12);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f237598d != 0) {
            android.text.Editable text = getText();
            if (!(text == null || text.length() == 0)) {
                android.graphics.Paint paint = this.f237601g;
                paint.setColor(this.f237598d);
                float f17 = this.f237599e;
                float f18 = 2 * f17;
                android.graphics.Path path = this.f237600f;
                path.reset();
                if (getLineCount() != 0) {
                    float lineBottom = getLayout().getLineBottom(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                    int lineCount = getLineCount();
                    android.graphics.RectF rectF = this.f237602h;
                    if (lineCount == 1) {
                        rectF.set(0.0f, 0.0f, getLayout().getLineWidth(0) + getPaddingLeft() + getPaddingRight(), lineBottom);
                        path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
                    } else {
                        float measuredWidth = getMeasuredWidth();
                        float lineWidth = getLayout().getLineWidth(getLineCount() - 1);
                        float f19 = measuredWidth - f18;
                        if (lineWidth >= (f19 - getPaddingLeft()) - getPaddingRight()) {
                            rectF.set(0.0f, 0.0f, measuredWidth, lineBottom);
                            path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
                        } else {
                            float lineTop = getLayout().getLineTop(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                            float paddingRight = lineWidth + getPaddingRight() + getPaddingLeft();
                            path.moveTo(0.0f, f17);
                            rectF.set(0.0f, 0.0f, f18, f18);
                            path.arcTo(rectF, 180.0f, 90.0f);
                            path.lineTo(f19, 0.0f);
                            rectF.set(f19, 0.0f, measuredWidth, f18);
                            path.arcTo(rectF, 270.0f, 90.0f);
                            path.lineTo(measuredWidth, lineTop - f17);
                            rectF.set(f19, lineTop - f18, measuredWidth, lineTop);
                            path.arcTo(rectF, 0.0f, 90.0f);
                            path.lineTo(paddingRight + f17, lineTop);
                            rectF.set(paddingRight, lineTop, paddingRight + f18, lineTop + f18);
                            path.arcTo(rectF, 270.0f, -90.0f);
                            path.lineTo(paddingRight, lineBottom - f17);
                            float f27 = lineBottom - f18;
                            rectF.set(paddingRight - f18, f27, paddingRight, lineBottom);
                            path.arcTo(rectF, 0.0f, 90.0f);
                            path.lineTo(f17, lineBottom);
                            rectF.set(0.0f, f27, f18, lineBottom);
                            path.arcTo(rectF, 90.0f, 90.0f);
                            path.lineTo(0.0f, f17);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, paint);
                }
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: setTextBackground */
    public final void m68263x630fd73d(int i17) {
        this.f237598d = i17;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17049x96919289(android.content.Context context) {
        this(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}

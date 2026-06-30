package com.tencent.mm.plugin.emoji.editor.widgets;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/CircularProgressBar;", "Landroid/view/View;", "", "progress", "Ljz5/f0;", "setProgress", "max", "setMax", "", "color", "setProgressColor", nd1.s0.NAME, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CircularProgressBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f97446d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f97447e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f97448f;

    /* renamed from: g, reason: collision with root package name */
    public float f97449g;

    /* renamed from: h, reason: collision with root package name */
    public float f97450h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = java.lang.Math.min(width, height) - (this.f97446d / 2.0f);
        float f17 = (this.f97449g * 360.0f) / this.f97450h;
        canvas.drawCircle(width, height, min, this.f97448f);
        canvas.drawArc(width - min, height - min, width + min, height + min, -90.0f, f17, false, this.f97447e);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int min = java.lang.Math.min(android.view.View.resolveSize(getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), i17), android.view.View.resolveSize(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), i18));
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        this.f97448f.setColor(i17);
        invalidate();
    }

    public final void setMax(float f17) {
        this.f97450h = f17;
        invalidate();
    }

    public final void setProgress(float f17) {
        this.f97449g = f17;
        invalidate();
    }

    public final void setProgressColor(int i17) {
        this.f97447e.setColor(i17);
        invalidate();
    }

    public /* synthetic */ CircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        int a17 = ym5.x.a(context, 4.0f);
        this.f97446d = a17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(a17);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f97447e = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(a17);
        this.f97448f = paint2;
        this.f97450h = 100.0f;
    }
}

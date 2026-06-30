package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/CircularProgressBar;", "Landroid/view/View;", "", "progress", "Ljz5/f0;", "setProgress", "max", "setMax", "", "color", "setProgressColor", nd1.s0.f72974x24728b, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.editor.widgets.CircularProgressBar */
/* loaded from: classes10.dex */
public final class C13255x68efd667 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f178979d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f178980e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f178981f;

    /* renamed from: g, reason: collision with root package name */
    public float f178982g;

    /* renamed from: h, reason: collision with root package name */
    public float f178983h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13255x68efd667(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = java.lang.Math.min(width, height) - (this.f178979d / 2.0f);
        float f17 = (this.f178982g * 360.0f) / this.f178983h;
        canvas.drawCircle(width, height, min, this.f178981f);
        canvas.drawArc(width - min, height - min, width + min, height + min, -90.0f, f17, false, this.f178980e);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int min = java.lang.Math.min(android.view.View.resolveSize(getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), i17), android.view.View.resolveSize(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), i18));
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        this.f178981f.setColor(i17);
        invalidate();
    }

    /* renamed from: setMax */
    public final void m54730xca027da2(float f17) {
        this.f178983h = f17;
        invalidate();
    }

    /* renamed from: setProgress */
    public final void m54731x3ae760af(float f17) {
        this.f178982g = f17;
        invalidate();
    }

    /* renamed from: setProgressColor */
    public final void m54732x7d38f3f4(int i17) {
        this.f178980e.setColor(i17);
        invalidate();
    }

    public /* synthetic */ C13255x68efd667(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13255x68efd667(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int a17 = ym5.x.a(context, 4.0f);
        this.f178979d = a17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(a17);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f178980e = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(a17);
        this.f178981f = paint2;
        this.f178983h = 100.0f;
    }
}

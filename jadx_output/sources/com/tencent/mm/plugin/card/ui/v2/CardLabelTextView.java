package com.tencent.mm.plugin.card.ui.v2;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardLabelTextView;", "Landroid/widget/TextView;", "", "color", "Ljz5/f0;", "setFillColor", "", "radius", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CardLabelTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public float f95209d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f95210e;

    /* renamed from: f, reason: collision with root package name */
    public int f95211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLabelTextView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f95209d = i65.a.b(getContext(), 1);
        this.f95210e = new android.graphics.Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = 0.0f;
        rectF.right = getWidth();
        rectF.top = 0.0f;
        rectF.bottom = getHeight();
        android.graphics.Paint paint = this.f95210e;
        paint.setAntiAlias(true);
        paint.setColor(this.f95211f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        float f17 = this.f95209d;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        super.onDraw(canvas);
    }

    public final void setFillColor(int i17) {
        this.f95211f = i17;
    }

    public final void setRadius(float f17) {
        this.f95209d = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLabelTextView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f95209d = i65.a.b(getContext(), 1);
        this.f95210e = new android.graphics.Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLabelTextView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f95209d = i65.a.b(getContext(), 1);
        this.f95210e = new android.graphics.Paint();
    }
}

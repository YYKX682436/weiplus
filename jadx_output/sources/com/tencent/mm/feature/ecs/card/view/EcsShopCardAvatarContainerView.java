package com.tencent.mm.feature.ecs.card.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/ecs/card/view/EcsShopCardAvatarContainerView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcsShopCardAvatarContainerView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public final float f65592f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f65593g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f65594h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f65595i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsShopCardAvatarContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i17 = measuredWidth > measuredHeight ? measuredHeight : measuredWidth;
        float f17 = 2;
        float f18 = this.f65592f;
        float f19 = (i17 / 2.0f) - (f18 / f17);
        android.graphics.RectF rectF = this.f65595i;
        float f27 = measuredWidth;
        float f28 = measuredHeight;
        rectF.set(f18 / f17, f18 / f17, f27 - (f18 / f17), f28 - (f18 / f17));
        canvas.drawRoundRect(rectF, f19, f19, this.f65593g);
        android.graphics.Path path = this.f65594h;
        path.addCircle(f27 / 2.0f, f28 / 2.0f, f19, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            measuredWidth = measuredHeight;
        }
        setMeasuredDimension(measuredWidth, measuredWidth);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsShopCardAvatarContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f65592f = 0.5f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(-5592406);
        paint.setStrokeWidth(0.5f);
        this.f65593g = paint;
        this.f65594h = new android.graphics.Path();
        this.f65595i = new android.graphics.RectF();
    }
}

package com.tencent.mm.mj_publisher.finder.widgets;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/MCProgressImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "progress", "Ljz5/f0;", "setProgress", "colorRes", "setProgressColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MCProgressImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f69682f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f69683g;

    /* renamed from: h, reason: collision with root package name */
    public int f69684h;

    public MCProgressImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69682f = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f69683g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f69682f == -1 || this.f69684h == 0) {
            return;
        }
        float b17 = i65.a.b(getContext(), 2);
        android.graphics.Paint paint = this.f69683g;
        paint.setStrokeWidth(b17);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        float width2 = (getWidth() / 2) - (b17 / 2);
        paint.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f479398pp));
        canvas.drawCircle(width, height, width2, paint);
        paint.setColor(b3.l.getColor(getContext(), this.f69684h));
        canvas.drawArc(width - width2, height - width2, width + width2, height + width2, -90.0f, (this.f69682f / 100) * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1, false, paint);
    }

    public final void setProgress(int i17) {
        this.f69682f = i17;
        postInvalidate();
    }

    public final void setProgressColor(int i17) {
        this.f69684h = i17;
    }
}

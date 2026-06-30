package com.tencent.mm.media.camera.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/media/camera/view/CKNineGridLayout;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CKNineGridLayout extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f68864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CKNineGridLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f68864d = paint;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i17 = width / 3;
        int i18 = height / 3;
        for (int i19 = 1; i19 < 3; i19++) {
            float f17 = i19 * i18;
            canvas.drawLine(0.0f, f17, width, f17, this.f68864d);
        }
        for (int i27 = 1; i27 < 3; i27++) {
            float f18 = i27 * i17;
            canvas.drawLine(f18, 0.0f, f18, height, this.f68864d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CKNineGridLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f68864d = paint;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }
}

package com.tencent.mm.plugin.emojicapture.ui.editor;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorOutsideView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EditorOutsideView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f98737d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f98738e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f98739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorOutsideView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98737d = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f98738e = paint;
        this.f98739f = new android.graphics.Path();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        paint.setAlpha(127);
    }

    public final void a(android.graphics.RectF bounds, float f17) {
        kotlin.jvm.internal.o.g(bounds, "bounds");
        android.graphics.Path path = this.f98737d;
        path.reset();
        path.addRoundRect(new android.graphics.RectF(bounds.left, bounds.top, bounds.right, bounds.bottom), f17, f17, android.graphics.Path.Direction.CW);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Path path = this.f98739f;
        path.reset();
        path.addPath(this.f98737d);
        path.addRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), android.graphics.Path.Direction.CCW);
        canvas.drawPath(path, this.f98738e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorOutsideView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}

package com.tencent.mm.plugin.finder.convert;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/convert/PathView;", "Landroid/view/View;", "Landroid/graphics/Point;", "d", "Landroid/graphics/Point;", "getStartPoint", "()Landroid/graphics/Point;", "setStartPoint", "(Landroid/graphics/Point;)V", "startPoint", "e", "getMiddlePoint", "setMiddlePoint", "middlePoint", "f", "getEndPoint", "setEndPoint", "endPoint", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PathView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Point startPoint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Point middlePoint;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Point endPoint;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint = paint;
    }

    public final android.graphics.Point getEndPoint() {
        return this.endPoint;
    }

    public final android.graphics.Point getMiddlePoint() {
        return this.middlePoint;
    }

    public final android.graphics.Paint getPaint() {
        return this.paint;
    }

    public final android.graphics.Point getStartPoint() {
        return this.startPoint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.startPoint == null || this.middlePoint == null || this.endPoint == null) {
            return;
        }
        android.graphics.Path path = new android.graphics.Path();
        android.graphics.Point point = this.startPoint;
        kotlin.jvm.internal.o.d(point);
        float f17 = point.x;
        kotlin.jvm.internal.o.d(this.startPoint);
        path.moveTo(f17, r2.y);
        android.graphics.Point point2 = this.middlePoint;
        kotlin.jvm.internal.o.d(point2);
        float f18 = point2.x;
        android.graphics.Point point3 = this.middlePoint;
        kotlin.jvm.internal.o.d(point3);
        float f19 = point3.y;
        android.graphics.Point point4 = this.endPoint;
        kotlin.jvm.internal.o.d(point4);
        float f27 = point4.x;
        kotlin.jvm.internal.o.d(this.endPoint);
        path.quadTo(f18, f19, f27, r4.y);
        canvas.drawPath(path, this.paint);
    }

    public final void setEndPoint(android.graphics.Point point) {
        this.endPoint = point;
    }

    public final void setMiddlePoint(android.graphics.Point point) {
        this.middlePoint = point;
    }

    public final void setStartPoint(android.graphics.Point point) {
        this.startPoint = point;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint = paint;
    }
}

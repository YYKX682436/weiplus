package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/live/core/view/DebugCanvasView;", "Landroid/view/View;", "", "Landroid/graphics/RectF;", "rectList", "Ljz5/f0;", "setRectList", "([Landroid/graphics/RectF;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.view.DebugCanvasView */
/* loaded from: classes3.dex */
public final class C10845x833056b0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF[] f150115d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f150116e;

    public C10845x833056b0(android.content.Context context) {
        super(context);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-65536);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(i65.a.b(getContext(), 4));
        this.f150116e = paint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.RectF[] rectFArr = this.f150115d;
        if (rectFArr != null) {
            for (android.graphics.RectF rectF : rectFArr) {
                if (rectF != null) {
                    canvas.drawRect(rectF, this.f150116e);
                }
            }
        }
    }

    /* renamed from: setRectList */
    public final void m46519x47248b24(android.graphics.RectF[] rectList) {
        this.f150115d = rectList;
        postInvalidate();
    }

    public C10845x833056b0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-65536);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(i65.a.b(getContext(), 4));
        this.f150116e = paint;
    }

    public C10845x833056b0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-65536);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(i65.a.b(getContext(), 4));
        this.f150116e = paint;
    }
}

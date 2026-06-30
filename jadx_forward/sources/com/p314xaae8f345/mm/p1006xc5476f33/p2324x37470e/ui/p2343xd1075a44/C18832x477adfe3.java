package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/PhotoMaskView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "rect", "Ljz5/f0;", "setVisibleRect", "Landroid/graphics/Rect;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PhotoMaskView */
/* loaded from: classes5.dex */
public final class C18832x477adfe3 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f257663d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f257664e;

    public C18832x477adfe3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f257663d = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f257664e = paint;
        paint.setColor(-16777216);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.RectF rectF = this.f257663d;
        if (rectF.isEmpty()) {
            return;
        }
        float width = getWidth();
        float f17 = rectF.top;
        android.graphics.Paint paint = this.f257664e;
        canvas.drawRect(0.0f, 0.0f, width, f17, paint);
        canvas.drawRect(0.0f, rectF.bottom, getWidth(), getHeight(), paint);
    }

    /* renamed from: setVisibleRect */
    public final void m72706x7802efb4(android.graphics.RectF rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f257663d.set(rect);
        invalidate();
    }

    /* renamed from: setVisibleRect */
    public final void m72705x7802efb4(android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f257663d.set(rect);
        invalidate();
    }

    public C18832x477adfe3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f257663d = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f257664e = paint;
        paint.setColor(-16777216);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }
}

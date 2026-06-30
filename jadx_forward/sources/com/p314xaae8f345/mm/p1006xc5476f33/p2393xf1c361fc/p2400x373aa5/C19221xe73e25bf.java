package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2400x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/websearch/view/CircleToSearchCropperView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "getRect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.view.CircleToSearchCropperView */
/* loaded from: classes4.dex */
public final class C19221xe73e25bf extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f263219d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f263220e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f263221f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f263222g;

    public C19221xe73e25bf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
        this.f263219d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.f263220e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        paint3.setStrokeWidth(ym5.x.a(getContext(), 2.0f));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f263221f = paint3;
        setLayerType(1, null);
    }

    /* renamed from: getRect, reason: from getter */
    public final android.graphics.RectF getF263222g() {
        return this.f263222g;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float a17 = ym5.x.a(getContext(), 8.0f);
        android.graphics.RectF rectF = this.f263222g;
        if (rectF != null) {
            canvas.drawRect(0.0f, 0.0f, width, height, this.f263219d);
            canvas.drawRoundRect(rectF, a17, a17, this.f263220e);
            canvas.drawRoundRect(rectF, a17, a17, this.f263221f);
        }
    }

    public C19221xe73e25bf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
        this.f263219d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.f263220e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        paint3.setStrokeWidth(ym5.x.a(getContext(), 2.0f));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        this.f263221f = paint3;
        setLayerType(1, null);
    }
}

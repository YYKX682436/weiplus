package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006 "}, d2 = {"Lcom/tencent/mm/view/RecordUploadProgressView;", "Landroid/view/View;", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "paint", "", "e", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "f", "getBackColor", "setBackColor", "backColor", "g", "getForeColor", "setForeColor", "foreColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-selectcontact_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.RecordUploadProgressView */
/* loaded from: classes3.dex */
public final class C22799x99f23564 extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Paint paint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int backColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int foreColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22799x99f23564(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        m82648x5383b91c(new android.graphics.Paint());
        m82644x74f59ea8().setStyle(android.graphics.Paint.Style.STROKE);
        m82644x74f59ea8().setStrokeWidth(getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9l));
        m82644x74f59ea8().setAntiAlias(true);
        this.backColor = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        this.foreColor = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.draw(canvas);
        int width = getWidth() / 2;
        float f17 = width;
        int strokeWidth = (int) (f17 - (m82644x74f59ea8().getStrokeWidth() / 2));
        m82644x74f59ea8().setColor(this.backColor);
        m82644x74f59ea8().setAntiAlias(true);
        m82644x74f59ea8().setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f17, f17, strokeWidth, m82644x74f59ea8());
        m82644x74f59ea8().setColor(this.foreColor);
        float f18 = width - strokeWidth;
        float f19 = width + strokeWidth;
        canvas.drawArc(new android.graphics.RectF(f18, f18, f19, f19), -90.0f, (this.progress * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 100.0f, false, m82644x74f59ea8());
    }

    public final int getBackColor() {
        return this.backColor;
    }

    public final int getForeColor() {
        return this.foreColor;
    }

    /* renamed from: getPaint */
    public final android.graphics.Paint m82644x74f59ea8() {
        android.graphics.Paint paint = this.paint;
        if (paint != null) {
            return paint;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("paint");
        throw null;
    }

    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: setBackColor */
    public final void m82646xa9c9647a(int i17) {
        this.backColor = i17;
    }

    /* renamed from: setForeColor */
    public final void m82647xb86bf9c5(int i17) {
        this.foreColor = i17;
    }

    /* renamed from: setPaint */
    public final void m82648x5383b91c(android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<set-?>");
        this.paint = paint;
    }

    /* renamed from: setProgress */
    public final void m82649x3ae760af(int i17) {
        this.progress = i17;
    }
}

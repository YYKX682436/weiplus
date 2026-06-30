package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/MCProgressImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "progress", "Ljz5/f0;", "setProgress", "colorRes", "setProgressColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.widgets.MCProgressImageView */
/* loaded from: classes4.dex */
public final class C10995xef1b87fd extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public int f151215f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f151216g;

    /* renamed from: h, reason: collision with root package name */
    public int f151217h;

    public C10995xef1b87fd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151215f = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f151216g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f151215f == -1 || this.f151217h == 0) {
            return;
        }
        float b17 = i65.a.b(getContext(), 2);
        android.graphics.Paint paint = this.f151216g;
        paint.setStrokeWidth(b17);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        float width2 = (getWidth() / 2) - (b17 / 2);
        paint.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560931pp));
        canvas.drawCircle(width, height, width2, paint);
        paint.setColor(b3.l.m9702x7444d5ad(getContext(), this.f151217h));
        canvas.drawArc(width - width2, height - width2, width + width2, height + width2, -90.0f, (this.f151215f / 100) * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3, false, paint);
    }

    /* renamed from: setProgress */
    public final void m47416x3ae760af(int i17) {
        this.f151215f = i17;
        postInvalidate();
    }

    /* renamed from: setProgressColor */
    public final void m47417x7d38f3f4(int i17) {
        this.f151217h = i17;
    }
}

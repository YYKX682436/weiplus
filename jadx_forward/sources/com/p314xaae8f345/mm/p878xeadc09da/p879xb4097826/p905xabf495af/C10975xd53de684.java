package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/RecordButtonCircularProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar */
/* loaded from: classes3.dex */
public final class C10975xd53de684 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f151061d;

    /* renamed from: e, reason: collision with root package name */
    public final int f151062e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f151063f;

    /* renamed from: g, reason: collision with root package name */
    public float f151064g;

    /* renamed from: h, reason: collision with root package name */
    public float f151065h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f151066i;

    /* renamed from: m, reason: collision with root package name */
    public float f151067m;

    /* renamed from: n, reason: collision with root package name */
    public float f151068n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f151069o;

    public C10975xd53de684(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151061d = android.graphics.Color.parseColor("#07C160");
        this.f151062e = 255;
        this.f151066i = new android.graphics.RectF();
        this.f151068n = 100.0f;
        this.f151069o = context;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Paint paint = this.f151063f;
        if (paint != null) {
            canvas.drawArc(this.f151066i, -90.0f, (this.f151067m / this.f151068n) * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3, false, paint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.content.res.Resources resources;
        super.onLayout(z17, i17, i18, i19, i27);
        android.content.Context context = this.f151069o;
        float dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0.0f : resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        this.f151064g = dimensionPixelSize;
        float f17 = dimensionPixelSize / 2;
        this.f151065h = f17;
        android.graphics.RectF rectF = this.f151066i;
        rectF.top = f17;
        rectF.left = f17;
        rectF.right = getWidth() - this.f151065h;
        rectF.bottom = getHeight() - this.f151065h;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f151063f = paint;
        paint.setColor(this.f151061d);
        paint.setAlpha(this.f151062e);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f151064g);
        paint.setAntiAlias(true);
    }

    public C10975xd53de684(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f151061d = android.graphics.Color.parseColor("#07C160");
        this.f151062e = 255;
        this.f151066i = new android.graphics.RectF();
        this.f151068n = 100.0f;
        this.f151069o = context;
    }
}

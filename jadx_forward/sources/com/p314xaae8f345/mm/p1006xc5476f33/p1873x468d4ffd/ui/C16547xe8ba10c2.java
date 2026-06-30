package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightCircularProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar */
/* loaded from: classes5.dex */
public final class C16547xe8ba10c2 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f230668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f230669e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f230670f;

    /* renamed from: g, reason: collision with root package name */
    public float f230671g;

    /* renamed from: h, reason: collision with root package name */
    public float f230672h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f230673i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b2 f230674m;

    /* renamed from: n, reason: collision with root package name */
    public float f230675n;

    /* renamed from: o, reason: collision with root package name */
    public float f230676o;

    /* renamed from: p, reason: collision with root package name */
    public float f230677p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f230678q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q f230679r;

    public C16547xe8ba10c2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230668d = android.graphics.Color.parseColor("#07C160");
        this.f230669e = 255;
        this.f230673i = new android.graphics.RectF();
        this.f230676o = 100.0f;
        this.f230678q = context;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Paint paint = this.f230670f;
        if (paint != null) {
            canvas.drawArc(this.f230673i, -90.0f, (this.f230675n / this.f230676o) * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3, false, paint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.content.res.Resources resources;
        super.onLayout(z17, i17, i18, i19, i27);
        android.content.Context context = this.f230678q;
        float dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0.0f : resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        this.f230671g = dimensionPixelSize;
        float f17 = dimensionPixelSize / 2;
        this.f230672h = f17;
        android.graphics.RectF rectF = this.f230673i;
        rectF.top = f17;
        rectF.left = f17;
        rectF.right = getWidth() - this.f230672h;
        rectF.bottom = getHeight() - this.f230672h;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f230670f = paint;
        paint.setColor(this.f230668d);
        paint.setAlpha(this.f230669e);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f230671g);
        paint.setAntiAlias(true);
    }

    public C16547xe8ba10c2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230668d = android.graphics.Color.parseColor("#07C160");
        this.f230669e = 255;
        this.f230673i = new android.graphics.RectF();
        this.f230676o = 100.0f;
        this.f230678q = context;
    }
}

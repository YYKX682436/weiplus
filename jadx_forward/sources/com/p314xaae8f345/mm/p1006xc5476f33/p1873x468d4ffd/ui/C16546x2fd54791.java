package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightCircularCustomProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularCustomProgressBar */
/* loaded from: classes3.dex */
public final class C16546x2fd54791 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f230661d;

    /* renamed from: e, reason: collision with root package name */
    public final int f230662e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f230663f;

    /* renamed from: g, reason: collision with root package name */
    public float f230664g;

    /* renamed from: h, reason: collision with root package name */
    public float f230665h;

    /* renamed from: i, reason: collision with root package name */
    public float f230666i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f230667m;

    public C16546x2fd54791(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230661d = android.graphics.Color.parseColor("#FFFFFF");
        this.f230662e = 102;
        this.f230667m = context;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.Paint paint = this.f230663f;
        if (paint != null) {
            canvas.drawCircle(width, height, this.f230666i, paint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.content.res.Resources resources;
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightCircularCustomProgressBar", "initData " + getWidth() + ", " + getHeight());
        android.content.Context context = this.f230667m;
        float dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0.0f : resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        this.f230664g = dimensionPixelSize;
        this.f230665h = dimensionPixelSize / 2;
        this.f230666i = (getWidth() / 2.0f) - this.f230665h;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f230663f = paint;
        paint.setColor(this.f230661d);
        paint.setAlpha(this.f230662e);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f230664g);
        paint.setAntiAlias(true);
    }

    public C16546x2fd54791(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230661d = android.graphics.Color.parseColor("#FFFFFF");
        this.f230662e = 102;
        this.f230667m = context;
    }
}

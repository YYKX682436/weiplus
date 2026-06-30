package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c;

/* renamed from: com.tencent.mm.ui.widget.loading.MMProgressLoading */
/* loaded from: classes5.dex */
public class C22703xb395948f extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f293711d;

    /* renamed from: e, reason: collision with root package name */
    public int f293712e;

    /* renamed from: f, reason: collision with root package name */
    public int f293713f;

    /* renamed from: g, reason: collision with root package name */
    public int f293714g;

    /* renamed from: h, reason: collision with root package name */
    public int f293715h;

    public C22703xb395948f(android.content.Context context) {
        super(context);
        a(context, null, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f293711d = new android.graphics.Paint();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544642p, i17, 0);
            this.f293712e = obtainStyledAttributes.getColor(1, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            this.f293713f = obtainStyledAttributes.getInt(0, 100);
            this.f293715h = obtainStyledAttributes.getInt(3, 0);
            this.f293714g = obtainStyledAttributes.getInt(2, -90);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: getProgress */
    public int m82048x402effa3() {
        return this.f293715h;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int width2 = (int) ((getWidth() / 2) * 0.175d);
        int i17 = (width - (width2 / 2)) - 1;
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560075ad);
        float f17 = width2;
        this.f293711d.setStrokeWidth(f17);
        this.f293711d.setColor(color);
        this.f293711d.setAlpha(127);
        this.f293711d.setAntiAlias(true);
        this.f293711d.setStyle(android.graphics.Paint.Style.STROKE);
        float f18 = width;
        float f19 = i17;
        canvas.drawCircle(f18, f18, f19, this.f293711d);
        this.f293711d.setStrokeWidth(f17);
        this.f293711d.setColor(this.f293712e);
        this.f293711d.setAlpha(51);
        this.f293711d.setAntiAlias(true);
        this.f293711d.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f18, f18, f19, this.f293711d);
        this.f293711d.setStrokeWidth(f17);
        this.f293711d.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f293711d.setColor(this.f293712e);
        float f27 = width - i17;
        float f28 = width + i17;
        canvas.drawArc(new android.graphics.RectF(f27, f27, f28, f28), this.f293714g, (this.f293715h * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / this.f293713f, false, this.f293711d);
    }

    /* renamed from: setProgress */
    public void m82049x3ae760af(int i17) {
        this.f293715h = java.lang.Math.max(0, i17);
        this.f293715h = java.lang.Math.min(i17, this.f293713f);
        invalidate();
    }

    public C22703xb395948f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public C22703xb395948f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1286x59692e7.p1287xd1075a44;

/* renamed from: com.tencent.mm.plugin.bizui.widget.BizTagTextView */
/* loaded from: classes3.dex */
public class C12959x94049c39 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f175436g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f175437h;

    /* renamed from: i, reason: collision with root package name */
    public int f175438i;

    /* renamed from: m, reason: collision with root package name */
    public int f175439m;

    /* renamed from: n, reason: collision with root package name */
    public int f175440n;

    public C12959x94049c39(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175436g = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f175437h = new android.graphics.Paint();
        this.f175438i = 3;
        this.f175439m = 9;
        this.f175440n = 0;
        b();
    }

    public void b() {
        this.f175438i = java.lang.Math.round(i65.a.g(getContext()) * 1.0f);
        this.f175439m = i65.a.b(getContext(), 3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.f175436g;
        rectF.left = 0.0f;
        rectF.top = this.f175438i;
        rectF.right = getWidth();
        rectF.bottom = getHeight() - this.f175438i;
        android.graphics.Paint paint = this.f175437h;
        paint.setAntiAlias(true);
        int i17 = this.f175440n;
        if (i17 != 0) {
            paint.setColor(i17);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            int i18 = this.f175439m;
            canvas.drawRoundRect(rectF, i18, i18, paint);
        }
        super.onDraw(canvas);
    }

    /* renamed from: setFillColor */
    public void m54247x17b1755e(int i17) {
        this.f175440n = i17;
    }

    public C12959x94049c39(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175436g = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f175437h = new android.graphics.Paint();
        this.f175438i = 3;
        this.f175439m = 9;
        this.f175440n = 0;
        b();
    }
}

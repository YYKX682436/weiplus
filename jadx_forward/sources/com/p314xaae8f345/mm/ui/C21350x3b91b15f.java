package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.BorderNumView */
/* loaded from: classes3.dex */
public class C21350x3b91b15f extends android.view.View {

    /* renamed from: g, reason: collision with root package name */
    public static int f278140g = 22;

    /* renamed from: h, reason: collision with root package name */
    public static int f278141h = 100;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f278142d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f278143e;

    /* renamed from: f, reason: collision with root package name */
    public int f278144f;

    public C21350x3b91b15f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278142d = null;
        this.f278144f = 100;
        this.f278142d = context;
        this.f278143e = new android.graphics.Paint();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i17 = this.f278144f;
        if (i17 < 100) {
            f278140g += 15;
        }
        if (i17 >= 1000) {
            f278141h -= 20;
        }
        float f17 = f278140g;
        android.content.Context context = this.f278142d;
        float d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, f17);
        float d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 105);
        java.lang.String str = this.f278144f + "";
        this.f278143e.setAntiAlias(true);
        this.f278143e.setTextSize(f278141h);
        this.f278143e.setColor(-11491572);
        this.f278143e.setStyle(android.graphics.Paint.Style.STROKE);
        this.f278143e.setStrokeWidth(8.0f);
        canvas.drawText(str, d17, d18, this.f278143e);
        this.f278143e.setTextSize(f278141h);
        this.f278143e.setColor(-1770573);
        this.f278143e.setStyle(android.graphics.Paint.Style.FILL);
        this.f278143e.setStrokeWidth(8.0f);
        canvas.drawText(str, d17, d18, this.f278143e);
    }

    /* renamed from: setPaintNum */
    public void m78372xadc394ca(int i17) {
        this.f278144f = i17;
    }

    public C21350x3b91b15f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278142d = null;
        this.f278144f = 100;
        this.f278142d = context;
        this.f278143e = new android.graphics.Paint();
    }
}

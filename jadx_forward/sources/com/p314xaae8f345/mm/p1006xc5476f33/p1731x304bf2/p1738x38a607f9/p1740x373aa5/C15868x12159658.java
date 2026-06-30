package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5;

/* renamed from: com.tencent.mm.plugin.game.commlib.view.CycleProgressView */
/* loaded from: classes3.dex */
public class C15868x12159658 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f220954d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f220955e;

    /* renamed from: f, reason: collision with root package name */
    public float f220956f;

    public C15868x12159658(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220954d = 0;
        this.f220955e = new android.graphics.Paint();
    }

    /* renamed from: getProgress */
    public int m64483x402effa3() {
        return this.f220954d;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        if (this.f220956f == 0.0f) {
            this.f220956f = (int) ((getWidth() / 2) * 0.167d);
        }
        float f17 = width;
        float f18 = this.f220956f;
        int i17 = (int) (f17 - (f18 / 2.0f));
        this.f220955e.setStrokeWidth(f18);
        this.f220955e.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        this.f220955e.setAntiAlias(true);
        this.f220955e.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f17, f17, i17, this.f220955e);
        this.f220955e.setStrokeWidth(this.f220956f);
        this.f220955e.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        float f19 = width - i17;
        float f27 = width + i17;
        canvas.drawArc(new android.graphics.RectF(f19, f19, f27, f27), -90.0f, (this.f220954d * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 100, false, this.f220955e);
        this.f220955e.setStrokeWidth(0.0f);
        this.f220955e.setStyle(android.graphics.Paint.Style.FILL);
    }

    /* renamed from: setProgress */
    public void m64484x3ae760af(int i17) {
        this.f220954d = java.lang.Math.max(0, i17);
        this.f220954d = java.lang.Math.min(i17, 100);
        invalidate();
    }

    public C15868x12159658(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220954d = 0;
        this.f220955e = new android.graphics.Paint();
    }
}

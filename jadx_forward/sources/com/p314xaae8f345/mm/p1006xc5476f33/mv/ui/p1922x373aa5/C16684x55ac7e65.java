package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.LyricFadeLayout */
/* loaded from: classes2.dex */
public class C16684x55ac7e65 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f233147d;

    /* renamed from: e, reason: collision with root package name */
    public int f233148e;

    /* renamed from: f, reason: collision with root package name */
    public int f233149f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f233150g;

    public C16684x55ac7e65(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        if (!this.f233150g) {
            return super.drawChild(canvas, view, j17);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.drawRect(0.0f, 0.0f, this.f233148e, this.f233149f, this.f233147d);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f233147d.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, new int[]{-1, 0, -1}, new float[]{0.0f, 0.4f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.f233148e = i17;
        this.f233149f = i18;
    }

    /* renamed from: setFade */
    public void m67306x764a05fe(boolean z17) {
        this.f233150g = z17;
        invalidate();
    }

    public C16684x55ac7e65(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f233147d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f233147d.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
    }
}

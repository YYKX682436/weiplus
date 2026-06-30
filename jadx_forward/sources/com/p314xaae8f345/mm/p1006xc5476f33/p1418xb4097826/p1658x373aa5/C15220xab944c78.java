package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FadeNeatTextView;", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "", "getFadeWidth", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f, "F", "getDrawSize", "()F", "setDrawSize", "(F)V", "drawSize", "", "p0", "I", "getLimitLine", "()I", "setLimitLine", "(I)V", "limitLine", "", "value", "x0", "Z", "getEnableFade", "()Z", "setEnableFade", "(Z)V", "enableFade", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FadeNeatTextView */
/* loaded from: classes10.dex */
public final class C15220xab944c78 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 {
    public final android.graphics.Paint V;

    /* renamed from: W, reason: from kotlin metadata */
    public float drawSize;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public int limitLine;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public boolean enableFade;

    /* renamed from: y0, reason: collision with root package name */
    public final android.graphics.RectF f212384y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15220xab944c78(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.V = paint;
        this.drawSize = ym5.x.a(context, 32.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, this.drawSize, 0.0f, new int[]{0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.limitLine = 4;
        this.f212384y0 = new android.graphics.RectF();
    }

    public final float getDrawSize() {
        return this.drawSize;
    }

    public final boolean getEnableFade() {
        return this.enableFade;
    }

    /* renamed from: getFadeWidth */
    public final float m61634xca4785f4() {
        return this.f212384y0.width();
    }

    public final int getLimitLine() {
        return this.limitLine;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableFade ");
        sb6.append(this.enableFade);
        sb6.append(" left ");
        android.graphics.RectF rectF = this.f212384y0;
        sb6.append(rectF.left);
        sb6.append(" right ");
        sb6.append(rectF.right);
        sb6.append(" top ");
        sb6.append(rectF.top);
        sb6.append(" bottom ");
        sb6.append(rectF.bottom);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FadeNeatTextView", sb6.toString());
        if (!this.enableFade) {
            super.onDraw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRect(0.0f, 0.0f, rectF.width(), rectF.height(), this.V);
        canvas.restore();
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: setDrawSize */
    public final void m61636x4548dde7(float f17) {
        this.drawSize = f17;
    }

    /* renamed from: setEnableFade */
    public final void m61637x8d36fca1(boolean z17) {
        boolean z18 = this.enableFade;
        this.enableFade = z17;
        if (z18 != z17) {
            postInvalidate();
        }
    }

    /* renamed from: setLimitLine */
    public final void m61638xc3b64c0d(int i17) {
        this.limitLine = i17;
    }
}

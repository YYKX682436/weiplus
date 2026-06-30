package com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006%"}, d2 = {"Lcom/tencent/mm/feature/chatbot/brand/ui/view/FadeEdgeLayout;", "Landroid/widget/FrameLayout;", "", "value", "d", "I", "getTopFadeHeightPx", "()I", "setTopFadeHeightPx", "(I)V", "topFadeHeightPx", "e", "getBottomFadeHeightPx", "setBottomFadeHeightPx", "bottomFadeHeightPx", "", "f", "Z", "getTopFadeEnabled", "()Z", "setTopFadeEnabled", "(Z)V", "topFadeEnabled", "g", "getBottomFadeEnabled", "setBottomFadeEnabled", "bottomFadeEnabled", "h", "getFadeColor", "setFadeColor", "fadeColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.chatbot.brand.ui.view.FadeEdgeLayout */
/* loaded from: classes4.dex */
public final class C10503xd61ee703 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int topFadeHeightPx;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int bottomFadeHeightPx;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean topFadeEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean bottomFadeEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int fadeColor;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f146850i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f146851m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10503xd61ee703(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.topFadeHeightPx = 120;
        this.bottomFadeHeightPx = 120;
        this.topFadeEnabled = true;
        this.bottomFadeEnabled = true;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        this.f146850i = paint;
        this.f146851m = new android.graphics.RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!((this.topFadeEnabled && this.topFadeHeightPx > 0) || (this.bottomFadeEnabled && this.bottomFadeHeightPx > 0))) {
            super.dispatchDraw(canvas);
            return;
        }
        float f17 = width;
        float f18 = height;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f17, f18, null);
        super.dispatchDraw(canvas);
        boolean z17 = this.topFadeEnabled;
        android.graphics.RectF rectF = this.f146851m;
        android.graphics.Paint paint2 = this.f146850i;
        if (z17 && (i18 = this.topFadeHeightPx) > 0) {
            if (i18 > height) {
                i18 = height;
            }
            float f19 = i18;
            paint2.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, f19, new int[]{0, -1}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            rectF.set(0.0f, 0.0f, f17, f19);
            canvas.drawRect(rectF, paint2);
        }
        if (!this.bottomFadeEnabled || (i17 = this.bottomFadeHeightPx) <= 0) {
            paint = paint2;
        } else {
            if (i17 > height) {
                i17 = height;
            }
            float f27 = height - i17;
            paint = paint2;
            paint.setShader(new android.graphics.LinearGradient(0.0f, f27, 0.0f, f18, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            rectF.set(0.0f, f27, f17, f18);
            canvas.drawRect(rectF, paint);
        }
        paint.setShader(null);
        canvas.restoreToCount(saveLayer);
    }

    public final boolean getBottomFadeEnabled() {
        return this.bottomFadeEnabled;
    }

    public final int getBottomFadeHeightPx() {
        return this.bottomFadeHeightPx;
    }

    public final int getFadeColor() {
        return this.fadeColor;
    }

    public final boolean getTopFadeEnabled() {
        return this.topFadeEnabled;
    }

    public final int getTopFadeHeightPx() {
        return this.topFadeHeightPx;
    }

    /* renamed from: setBottomFadeEnabled */
    public final void m44118xcfa671b8(boolean z17) {
        this.bottomFadeEnabled = z17;
        invalidate();
    }

    /* renamed from: setBottomFadeHeightPx */
    public final void m44119x8e9ed5f8(int i17) {
        this.bottomFadeHeightPx = i17;
        invalidate();
    }

    /* renamed from: setFadeColor */
    public final void m44120x25844805(int i17) {
        this.fadeColor = i17;
        invalidate();
    }

    /* renamed from: setTopFadeEnabled */
    public final void m44121x7ccad92(boolean z17) {
        this.topFadeEnabled = z17;
        invalidate();
    }

    /* renamed from: setTopFadeHeightPx */
    public final void m44122x5b40155e(int i17) {
        this.topFadeHeightPx = i17;
        invalidate();
    }
}

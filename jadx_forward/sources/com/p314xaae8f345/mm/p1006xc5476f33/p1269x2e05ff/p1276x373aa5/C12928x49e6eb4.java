package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallRoundGradientFrameLayout;", "Landroid/widget/FrameLayout;", "", "bottomGradient", "Ljz5/f0;", "setUseBottomGradient", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallRoundGradientFrameLayout */
/* loaded from: classes4.dex */
public final class C12928x49e6eb4 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f175042d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f175043e;

    /* renamed from: f, reason: collision with root package name */
    public final int f175044f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175045g;

    /* renamed from: h, reason: collision with root package name */
    public final float f175046h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12928x49e6eb4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f175044f = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 18);
        this.f175046h = 0.3f;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(51, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f175042d = gradientDrawable;
        gradientDrawable.setGradientType(0);
        gradientDrawable.setGradientCenter(0.5f, 0.4f);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f175043e = gradientDrawable2;
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setGradientCenter(0.5f, 0.6f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        int i17 = this.f175044f;
        float f17 = this.f175046h;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f175042d;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), ((int) (getHeight() * f17)) + i17);
        }
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        if (this.f175045g) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f175043e;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setBounds(0, ((int) (getHeight() * (1 - f17))) - i17, getWidth(), getHeight());
            }
            if (gradientDrawable2 != null) {
                gradientDrawable2.draw(canvas);
            }
        }
    }

    /* renamed from: setUseBottomGradient */
    public final void m54166x84d007a0(boolean z17) {
        this.f175045g = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12928x49e6eb4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f175044f = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 18);
        this.f175046h = 0.3f;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(51, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f175042d = gradientDrawable;
        gradientDrawable.setGradientType(0);
        gradientDrawable.setGradientCenter(0.5f, 0.4f);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f175043e = gradientDrawable2;
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setGradientCenter(0.5f, 0.6f);
    }
}

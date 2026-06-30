package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallRoundGradientFrameLayout;", "Landroid/widget/FrameLayout;", "", "bottomGradient", "Ljz5/f0;", "setUseBottomGradient", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FloatBallRoundGradientFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f93509d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f93510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93511f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93512g;

    /* renamed from: h, reason: collision with root package name */
    public final float f93513h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallRoundGradientFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f93511f = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 18);
        this.f93513h = 0.3f;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(51, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f93509d = gradientDrawable;
        gradientDrawable.setGradientType(0);
        gradientDrawable.setGradientCenter(0.5f, 0.4f);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f93510e = gradientDrawable2;
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setGradientCenter(0.5f, 0.6f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        int i17 = this.f93511f;
        float f17 = this.f93513h;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f93509d;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), ((int) (getHeight() * f17)) + i17);
        }
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        if (this.f93512g) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f93510e;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setBounds(0, ((int) (getHeight() * (1 - f17))) - i17, getWidth(), getHeight());
            }
            if (gradientDrawable2 != null) {
                gradientDrawable2.draw(canvas);
            }
        }
    }

    public final void setUseBottomGradient(boolean z17) {
        this.f93512g = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallRoundGradientFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f93511f = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 18);
        this.f93513h = 0.3f;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(51, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f93509d = gradientDrawable;
        gradientDrawable.setGradientType(0);
        gradientDrawable.setGradientCenter(0.5f, 0.4f);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(102, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.f93510e = gradientDrawable2;
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setGradientCenter(0.5f, 0.6f);
    }
}

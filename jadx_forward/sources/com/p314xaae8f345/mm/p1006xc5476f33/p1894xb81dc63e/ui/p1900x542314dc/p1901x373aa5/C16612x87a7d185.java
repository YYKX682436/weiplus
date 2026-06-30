package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B#\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010*\u001a\u00020\u0012¢\u0006\u0004\b(\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundFrameLayout;", "Landroid/widget/FrameLayout;", "", "bottomGradient", "Ljz5/f0;", "setUseBottomGradient", "Landroid/graphics/drawable/GradientDrawable;", "d", "Landroid/graphics/drawable/GradientDrawable;", "getGradientTopDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "setGradientTopDrawable", "(Landroid/graphics/drawable/GradientDrawable;)V", "gradientTopDrawable", "e", "getGradientButtomDrawable", "setGradientButtomDrawable", "gradientButtomDrawable", "", "f", "I", "getButtomOffset", "()I", "buttomOffset", "g", "Z", "getUseButtomGradient", "()Z", "setUseButtomGradient", "(Z)V", "useButtomGradient", "h", "getTopOffset", "setTopOffset", "(I)V", "topOffset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout */
/* loaded from: classes4.dex */
public final class C16612x87a7d185 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.drawable.GradientDrawable gradientTopDrawable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.graphics.drawable.GradientDrawable gradientButtomDrawable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int buttomOffset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean useButtomGradient;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int topOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16612x87a7d185(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.buttomOffset = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(166, 0, 0, 0), android.graphics.Color.argb(51, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.gradientTopDrawable = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.gradientTopDrawable;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(128, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.gradientButtomDrawable = gradientDrawable3;
        gradientDrawable3.setGradientType(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        android.graphics.drawable.GradientDrawable gradientDrawable = this.gradientTopDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, this.topOffset, getWidth(), getHeight());
        }
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.gradientTopDrawable;
        if (gradientDrawable2 != null) {
            gradientDrawable2.draw(canvas);
        }
        if (this.useButtomGradient) {
            android.graphics.drawable.GradientDrawable gradientDrawable3 = this.gradientButtomDrawable;
            if (gradientDrawable3 != null) {
                gradientDrawable3.setBounds(0, getHeight() - this.buttomOffset, getWidth(), getHeight());
            }
            android.graphics.drawable.GradientDrawable gradientDrawable4 = this.gradientButtomDrawable;
            if (gradientDrawable4 != null) {
                gradientDrawable4.draw(canvas);
            }
        }
    }

    public final int getButtomOffset() {
        return this.buttomOffset;
    }

    public final android.graphics.drawable.GradientDrawable getGradientButtomDrawable() {
        return this.gradientButtomDrawable;
    }

    public final android.graphics.drawable.GradientDrawable getGradientTopDrawable() {
        return this.gradientTopDrawable;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }

    public final boolean getUseButtomGradient() {
        return this.useButtomGradient;
    }

    /* renamed from: setGradientButtomDrawable */
    public final void m67199x9a93cd41(android.graphics.drawable.GradientDrawable gradientDrawable) {
        this.gradientButtomDrawable = gradientDrawable;
    }

    /* renamed from: setGradientTopDrawable */
    public final void m67200x4057001(android.graphics.drawable.GradientDrawable gradientDrawable) {
        this.gradientTopDrawable = gradientDrawable;
    }

    /* renamed from: setTopOffset */
    public final void m67201x46bc3006(int i17) {
        this.topOffset = i17;
    }

    /* renamed from: setUseBottomGradient */
    public final void m67202x84d007a0(boolean z17) {
        this.useButtomGradient = z17;
    }

    /* renamed from: setUseButtomGradient */
    public final void m67203x1be22ea6(boolean z17) {
        this.useButtomGradient = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16612x87a7d185(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.buttomOffset = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(166, 0, 0, 0), android.graphics.Color.argb(51, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.gradientTopDrawable = gradientDrawable;
        gradientDrawable.setGradientType(0);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = this.gradientTopDrawable;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(128, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
        this.gradientButtomDrawable = gradientDrawable3;
        gradientDrawable3.setGradientType(0);
    }
}

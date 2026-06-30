package com.tencent.kinda.framework.widget.base;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaDashLineBoarderLineView;", "Lcom/tencent/kinda/framework/widget/base/MMKViewLayout;", "Lcom/facebook/yoga/android/YogaLayout;", "Lcom/tencent/kinda/gen/KDashLineBoarderLineView;", "Ljz5/f0;", "updateBackgroundDrawable", "Landroid/content/Context;", "context", "createView", "", "value", "setDashWidth", "getDashWidth", "Lcom/tencent/kinda/gen/DynamicColor;", "setDashColor", "getDashColor", "dashWidth", "F", "dashColor", "Lcom/tencent/kinda/gen/DynamicColor;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class KindaDashLineBoarderLineView extends com.tencent.kinda.framework.widget.base.MMKViewLayout<com.facebook.yoga.android.YogaLayout> implements com.tencent.kinda.gen.KDashLineBoarderLineView {
    private com.tencent.kinda.gen.DynamicColor dashColor;
    private float dashWidth;

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateBackgroundDrawable() {
        float f17 = this.dashWidth;
        if ((f17 == 0.0f) || this.dashColor == null) {
            return;
        }
        float a17 = i65.a.a(this.mContext, f17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(i65.a.b(this.mContext, 4));
        gradientDrawable.setStroke(i65.a.h(this.mContext, com.tencent.mm.R.dimen.f479642bh), (int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.dashColor), a17, a17);
        ((com.facebook.yoga.android.YogaLayout) getView()).setBackground(gradientDrawable);
    }

    @Override // com.tencent.kinda.gen.KDashLineBoarderLineView
    public com.tencent.kinda.gen.DynamicColor getDashColor() {
        return this.dashColor;
    }

    @Override // com.tencent.kinda.gen.KDashLineBoarderLineView
    public float getDashWidth() {
        return this.dashWidth;
    }

    @Override // com.tencent.kinda.gen.KDashLineBoarderLineView
    public void setDashColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.dashColor = dynamicColor;
        updateBackgroundDrawable();
    }

    @Override // com.tencent.kinda.gen.KDashLineBoarderLineView
    public void setDashWidth(float f17) {
        this.dashWidth = f17;
        updateBackgroundDrawable();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKViewLayout, com.tencent.kinda.framework.widget.base.MMKView
    public com.facebook.yoga.android.YogaLayout createView(android.content.Context context) {
        com.facebook.yoga.android.YogaLayout yogaLayout = (com.facebook.yoga.android.YogaLayout) super.createView(context);
        updateBackgroundDrawable();
        kotlin.jvm.internal.o.d(yogaLayout);
        return yogaLayout;
    }
}

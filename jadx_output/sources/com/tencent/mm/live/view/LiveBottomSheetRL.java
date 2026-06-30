package com.tencent.mm.live.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/live/view/LiveBottomSheetRL;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "contentView", "Ljz5/f0;", "setContentView", "Landroid/graphics/drawable/Drawable;", "background", "setContentBg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class LiveBottomSheetRL extends android.widget.RelativeLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBottomSheetRL(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.bqm, this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(target, "target");
        android.view.ViewConfiguration.getMinimumFlingVelocity();
        int i17 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        return super.onNestedFling(target, f17, f18, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View target, int i17, int i18, int[] consumed) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        target.toString();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View target, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(target, "target");
        target.toString();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        target.toString();
        return (i17 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        child.toString();
    }

    public final void setContentBg(android.graphics.drawable.Drawable drawable) {
        setBackground(drawable);
    }

    public final void setContentView(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        addView(contentView);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveBottomSheetRL(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}

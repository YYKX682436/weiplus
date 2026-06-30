package com.tencent.mm.plugin.fav.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/widget/FavSpaceUsageBar;", "Landroid/widget/FrameLayout;", "", "progress", "Ljz5/f0;", "setProgress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FavSpaceUsageBar extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public double f101555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavSpaceUsageBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e57, (android.view.ViewGroup) this, true);
        ((com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById(com.tencent.mm.R.id.cg7)).setRadius(java.lang.Math.round(es.h.b(getContext()) * 2.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        findViewById(com.tencent.mm.R.id.lbi).getLayoutParams().width = (int) (this.f101555d * android.view.View.MeasureSpec.getSize(i17));
    }

    public final void setProgress(double d17) {
        this.f101555d = d17;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavSpaceUsageBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e57, (android.view.ViewGroup) this, true);
        ((com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById(com.tencent.mm.R.id.cg7)).setRadius(java.lang.Math.round(es.h.b(getContext()) * 2.0f));
    }
}

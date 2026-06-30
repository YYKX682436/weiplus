package com.tencent.mm.plugin.fav.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/MaxHeightFrameLayout;", "Landroid/widget/FrameLayout;", "", "height", "Ljz5/f0;", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MaxHeightFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f100446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightFrameLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f100446d > 0) {
            int size = android.view.View.MeasureSpec.getSize(i18);
            int mode = android.view.View.MeasureSpec.getMode(i18);
            if (mode == Integer.MIN_VALUE) {
                int i19 = this.f100446d;
                if (size > i19) {
                    size = i19;
                }
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            } else if (mode == 0) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(this.f100446d, Integer.MIN_VALUE);
            } else if (mode == 1073741824) {
                int i27 = this.f100446d;
                if (size > i27) {
                    size = i27;
                }
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            }
        }
        super.onMeasure(i17, i18);
    }

    public final void setMaxHeight(int i17) {
        this.f100446d = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightFrameLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}

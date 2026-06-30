package com.tencent.mm.plugin.brandservice.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/widget/BizMaxSizeLinearLayout;", "Landroid/widget/LinearLayout;", "", "maxHeight", "Ljz5/f0;", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BizMaxSizeLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f94583d;

    /* renamed from: e, reason: collision with root package name */
    public int f94584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizMaxSizeLinearLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f94583d = "MicroMsg.BizMaxSizeLinearLayout";
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f94584e;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    public final void setMaxHeight(int i17) {
        this.f94584e = i17;
        com.tencent.mars.xlog.Log.i(this.f94583d, "[setMaxHeight],maxHeight:" + this.f94584e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizMaxSizeLinearLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f94583d = "MicroMsg.BizMaxSizeLinearLayout";
    }
}

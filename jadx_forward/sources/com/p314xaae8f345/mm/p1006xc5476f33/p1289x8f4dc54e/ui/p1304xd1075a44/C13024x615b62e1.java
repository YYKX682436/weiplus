package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/widget/BizMaxSizeLinearLayout;", "Landroid/widget/LinearLayout;", "", "maxHeight", "Ljz5/f0;", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.BizMaxSizeLinearLayout */
/* loaded from: classes2.dex */
public final class C13024x615b62e1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f176116d;

    /* renamed from: e, reason: collision with root package name */
    public int f176117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13024x615b62e1(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f176116d = "MicroMsg.BizMaxSizeLinearLayout";
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f176117e;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setMaxHeight */
    public final void m54421x25bfb969(int i17) {
        this.f176117e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f176116d, "[setMaxHeight],maxHeight:" + this.f176117e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13024x615b62e1(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f176116d = "MicroMsg.BizMaxSizeLinearLayout";
    }
}

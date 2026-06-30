package com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/view/recyclerview/MaxWidthRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "value", "j2", "I", "getMaxWidth", "()I", "setMaxWidth", "(I)V", "maxWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.recyclerview.MaxWidthRecyclerView */
/* loaded from: classes3.dex */
public final class C22844xf57b2386 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public int maxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22844xf57b2386(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.maxWidth;
        if (i19 > 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setMaxWidth */
    public final void m82897x8e6ff544(int i17) {
        this.maxWidth = i17;
        invalidate();
        requestLayout();
    }
}

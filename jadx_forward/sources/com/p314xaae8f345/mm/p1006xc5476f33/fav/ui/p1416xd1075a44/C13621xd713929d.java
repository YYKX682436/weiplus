package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/widget/FavSpaceUsageBar;", "Landroid/widget/FrameLayout;", "", "progress", "Ljz5/f0;", "setProgress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavSpaceUsageBar */
/* loaded from: classes3.dex */
public final class C13621xd713929d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public double f183088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13621xd713929d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e57, (android.view.ViewGroup) this, true);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById(com.p314xaae8f345.mm.R.id.cg7)).m81436x205ac394(java.lang.Math.round(es.h.b(getContext()) * 2.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        findViewById(com.p314xaae8f345.mm.R.id.lbi).getLayoutParams().width = (int) (this.f183088d * android.view.View.MeasureSpec.getSize(i17));
    }

    /* renamed from: setProgress */
    public final void m55397x3ae760af(double d17) {
        this.f183088d = d17;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13621xd713929d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e57, (android.view.ViewGroup) this, true);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById(com.p314xaae8f345.mm.R.id.cg7)).m81436x205ac394(java.lang.Math.round(es.h.b(getContext()) * 2.0f));
    }
}

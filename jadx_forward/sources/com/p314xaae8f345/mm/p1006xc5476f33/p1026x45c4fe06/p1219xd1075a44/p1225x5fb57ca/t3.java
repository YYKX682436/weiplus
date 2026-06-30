package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class t3 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f173195d;

    public t3(android.content.Context context) {
        super(context);
        this.f173195d = false;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569680ih, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n3
    public void a(boolean z17) {
        boolean z18 = z17 != this.f173195d;
        this.f173195d = z17;
        if (!z18 || isInLayout()) {
            return;
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f173195d || !isShown()) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i17 = makeMeasureSpec;
        }
        super.onMeasure(i17, i18);
    }
}

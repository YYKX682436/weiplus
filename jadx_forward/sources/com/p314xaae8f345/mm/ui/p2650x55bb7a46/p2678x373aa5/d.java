package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes5.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 f284432d;

    public d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601) {
        this.f284432d = c21894x47dd8601;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        this.f284432d.getLocationOnScreen(iArr);
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.leftMargin = dimensionPixelSize;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601 = this.f284432d;
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601.f284352p;
        android.view.View contentView = c21894x47dd8601.f234428i.getContentView();
        contentView.measure(0, 0);
        boolean z17 = iArr[0] > com.p314xaae8f345.mm.ui.zk.e(this.f284432d.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561216ci);
        if (iArr[1] < com.p314xaae8f345.mm.ui.bl.a(this.f284432d.getContext()) + com.p314xaae8f345.mm.ui.bl.h(this.f284432d.getContext()) + contentView.getMeasuredHeight()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd86012 = this.f284432d;
            c21894x47dd86012.f284354n = true;
            c21894x47dd86012.f234428i.a(c21894x47dd86012, 0, 2, layoutParams, z17, true, false);
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd86013 = this.f284432d;
            c21894x47dd86013.f284354n = false;
            c21894x47dd86013.f234428i.a(c21894x47dd86013, 0, 1, layoutParams, z17, true, false);
        }
        this.f284432d.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c(this, iArr));
    }
}

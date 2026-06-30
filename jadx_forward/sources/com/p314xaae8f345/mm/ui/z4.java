package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21446xfcab30d8 f294133d;

    public z4(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.C21446xfcab30d8 c21446xfcab30d8) {
        this.f294133d = c21446xfcab30d8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21446xfcab30d8 c21446xfcab30d8 = this.f294133d;
        android.view.View view = c21446xfcab30d8.Z1;
        android.content.Context context = c21446xfcab30d8.f278230j2;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(view, "backgroundColor", context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561035a45), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        ofInt.setDuration(1000L);
        ofInt.setEvaluator(new v4.b());
        ofInt.addListener(new com.p314xaae8f345.mm.ui.wj(c21446xfcab30d8));
        ofInt.start();
    }
}

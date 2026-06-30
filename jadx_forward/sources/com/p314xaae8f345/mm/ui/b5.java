package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee.C22403x4aa43f4a f278744d;

    public b5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee.C22403x4aa43f4a c22403x4aa43f4a) {
        this.f278744d = c22403x4aa43f4a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee.C22403x4aa43f4a c22403x4aa43f4a = this.f278744d;
        if (c22403x4aa43f4a.h() == null) {
            return;
        }
        android.view.View h17 = c22403x4aa43f4a.h();
        android.content.Context context = c22403x4aa43f4a.Y1;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(h17, "backgroundColor", context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561035a45), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        ofInt.setDuration(1000L);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.addListener(new tg5.a(c22403x4aa43f4a));
        ofInt.start();
    }
}

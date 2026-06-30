package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a f278651d;

    public a5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a) {
        this.f278651d = c22594xcb88ef3a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a = this.f278651d;
        android.view.View h17 = c22594xcb88ef3a.h();
        android.content.Context context = c22594xcb88ef3a.Y1;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(h17, "backgroundColor", context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561035a45), context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        ofInt.setDuration(1000L);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.addListener(new zk5.a(c22594xcb88ef3a));
        ofInt.start();
    }
}

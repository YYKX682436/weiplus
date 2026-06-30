package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f241481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n f241483g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n nVar, android.view.View view, android.widget.TextView textView, android.view.View view2) {
        this.f241483g = nVar;
        this.f241480d = view;
        this.f241481e = textView;
        this.f241482f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n nVar = this.f241483g;
        if (nVar.f241494c.intValue() == 1) {
            return;
        }
        nVar.f241494c = 1;
        android.view.View view = this.f241480d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(333L);
        animatorSet.playSequentially(ofFloat, ofFloat2);
        ofFloat2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.j(this));
        animatorSet.start();
    }
}

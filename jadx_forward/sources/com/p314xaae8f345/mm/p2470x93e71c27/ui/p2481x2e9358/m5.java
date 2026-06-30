package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f272018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f272019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19678x1ab789dd f272020f;

    public m5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19678x1ab789dd c19678x1ab789dd, int i17, boolean z17) {
        this.f272020f = c19678x1ab789dd;
        this.f272018d = i17;
        this.f272019e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rc5.m mVar;
        rc5.m mVar2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19678x1ab789dd c19678x1ab789dd = this.f272020f;
        c19678x1ab789dd.f271656e = null;
        int i17 = c19678x1ab789dd.f271658g - c19678x1ab789dd.f271657f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingScrollLayout", "scrollContentTo: in runnable " + i17);
        int i18 = this.f272018d == 0 ? com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a : 175;
        android.widget.OverScroller overScroller = c19678x1ab789dd.f271655d;
        int i19 = c19678x1ab789dd.f271657f;
        if (!this.f272019e) {
            i18 = 0;
        }
        overScroller.startScroll(0, i19, 0, i17, i18);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(c19678x1ab789dd);
        int i27 = c19678x1ab789dd.f271658g;
        c19678x1ab789dd.getClass();
        java.util.Iterator it = new java.util.ArrayList(c19678x1ab789dd.f271667s).iterator();
        while (it.hasNext()) {
            rc5.x xVar = ((rc5.t) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.o5) it.next())).f475725a;
            if (i27 > 0) {
                java.lang.ref.WeakReference weakReference = xVar.A;
                if (weakReference != null && (mVar = (rc5.m) weakReference.get()) != null && !mVar.f475716v && !mVar.f475715u) {
                    android.animation.Animator animator = mVar.A;
                    if (animator != null) {
                        animator.cancel();
                    }
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(mVar.getLayoutParams().height, mVar.f475705h);
                    ofInt.setInterpolator(mVar.f475718x);
                    ofInt.addUpdateListener(new rc5.w(mVar.f475720z));
                    ofInt.addListener(new rc5.j(mVar));
                    android.animation.ValueAnimator duration = ofInt.setDuration(200L);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
                    duration.start();
                    mVar.A = duration;
                }
            } else {
                java.lang.ref.WeakReference weakReference2 = xVar.A;
                if (weakReference2 != null && (mVar2 = (rc5.m) weakReference2.get()) != null && mVar2.f475716v && !mVar2.f475715u) {
                    android.animation.Animator animator2 = mVar2.A;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(mVar2.getLayoutParams().height, mVar2.f475706i);
                    ofInt2.setInterpolator(mVar2.f475718x);
                    ofInt2.addListener(new rc5.g(new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), mVar2));
                    ofInt2.addUpdateListener(new rc5.i(mVar2));
                    android.animation.ValueAnimator duration2 = ofInt2.setDuration(200L);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration2, "setDuration(...)");
                    duration2.start();
                    mVar2.A = duration2;
                }
            }
        }
    }
}

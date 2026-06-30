package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class r9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f190431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 f190432e;

    public r9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var, long j17) {
        this.f190432e = v9Var;
        this.f190431d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator translationY2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator translationY3;
        android.view.ViewPropertyAnimator duration3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var = this.f190432e;
        v9Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "startAdAnimView invoke");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 h17 = v9Var.h(this.f190431d);
        if (h17 != null && (view = h17.f3639x46306858) != null) {
            android.view.View findViewById = !v9Var.i() ? view.findViewById(com.p314xaae8f345.mm.R.id.e9w) : ((bw2.t) bw2.o.f106402a.a().mo146xb9724478(h17)).a();
            if (findViewById != null) {
                if (findViewById.getVisibility() != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "finder_ad_feed_hint_container not visible");
                    v9Var.f192422r = null;
                    v9Var.f192424t = null;
                } else {
                    float dimension = view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "startAdAnimView");
                    android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
                    if (findViewById2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "startAdAnimView footer translationY " + findViewById2.getTranslationY() + " footer :0.0");
                        android.view.ViewPropertyAnimator animate = findViewById2.animate();
                        if (animate != null && (translationY3 = animate.translationY(dimension + 0.0f)) != null && (duration3 = translationY3.setDuration(300L)) != null) {
                            duration3.start();
                        }
                    }
                    android.view.View findViewById3 = view.findViewById(v9Var.f192415k);
                    if (findViewById3 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "startAdAnimView seekLayoutId translationY " + findViewById3.getTranslationY() + " seekLayoutId :0.0");
                        android.view.ViewPropertyAnimator animate2 = findViewById3.animate();
                        if (animate2 != null && (translationY2 = animate2.translationY(0.0f + dimension)) != null && (duration2 = translationY2.setDuration(300L)) != null) {
                            duration2.start();
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "startAdAnimView adTip translationY " + findViewById.getTranslationY() + " adTip :0.0");
                    android.view.ViewPropertyAnimator animate3 = findViewById.animate();
                    if (animate3 != null && (translationY = animate3.translationY(0.0f + dimension)) != null && (duration = translationY.setDuration(300L)) != null && (listener = duration.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t9(v9Var))) != null) {
                        listener.start();
                    }
                    if (v9Var.i()) {
                        v9Var.f192424t = new java.lang.ref.WeakReference(h17);
                    } else {
                        v9Var.f192422r = view;
                    }
                }
            }
        }
        v9Var.f192418n = null;
    }
}

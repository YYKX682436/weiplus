package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class r9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f108898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v9 f108899e;

    public r9(com.tencent.mm.plugin.finder.feed.v9 v9Var, long j17) {
        this.f108899e = v9Var;
        this.f108898d = j17;
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
        com.tencent.mm.plugin.finder.feed.v9 v9Var = this.f108899e;
        v9Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "startAdAnimView invoke");
        androidx.recyclerview.widget.k3 h17 = v9Var.h(this.f108898d);
        if (h17 != null && (view = h17.itemView) != null) {
            android.view.View findViewById = !v9Var.i() ? view.findViewById(com.tencent.mm.R.id.e9w) : ((bw2.t) bw2.o.f24869a.a().invoke(h17)).a();
            if (findViewById != null) {
                if (findViewById.getVisibility() != 0) {
                    com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "finder_ad_feed_hint_container not visible");
                    v9Var.f110889r = null;
                    v9Var.f110891t = null;
                } else {
                    float dimension = view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
                    com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "startAdAnimView");
                    android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f484486ee3);
                    if (findViewById2 != null) {
                        com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "startAdAnimView footer translationY " + findViewById2.getTranslationY() + " footer :0.0");
                        android.view.ViewPropertyAnimator animate = findViewById2.animate();
                        if (animate != null && (translationY3 = animate.translationY(dimension + 0.0f)) != null && (duration3 = translationY3.setDuration(300L)) != null) {
                            duration3.start();
                        }
                    }
                    android.view.View findViewById3 = view.findViewById(v9Var.f110882k);
                    if (findViewById3 != null) {
                        com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "startAdAnimView seekLayoutId translationY " + findViewById3.getTranslationY() + " seekLayoutId :0.0");
                        android.view.ViewPropertyAnimator animate2 = findViewById3.animate();
                        if (animate2 != null && (translationY2 = animate2.translationY(0.0f + dimension)) != null && (duration2 = translationY2.setDuration(300L)) != null) {
                            duration2.start();
                        }
                    }
                    com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "startAdAnimView adTip translationY " + findViewById.getTranslationY() + " adTip :0.0");
                    android.view.ViewPropertyAnimator animate3 = findViewById.animate();
                    if (animate3 != null && (translationY = animate3.translationY(0.0f + dimension)) != null && (duration = translationY.setDuration(300L)) != null && (listener = duration.setListener(new com.tencent.mm.plugin.finder.feed.t9(v9Var))) != null) {
                        listener.start();
                    }
                    if (v9Var.i()) {
                        v9Var.f110891t = new java.lang.ref.WeakReference(h17);
                    } else {
                        v9Var.f110889r = view;
                    }
                }
            }
        }
        v9Var.f110885n = null;
    }
}

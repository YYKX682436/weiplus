package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gb1.n f80693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.coverview.n f80694e;

    public k(com.tencent.mm.plugin.appbrand.jsapi.coverview.n nVar, final com.tencent.mm.plugin.appbrand.jsapi.t tVar, final android.animation.AnimatorSet animatorSet, gb1.n nVar2) {
        this.f80694e = nVar;
        this.f80693d = nVar2;
        tVar.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.coverview.k$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.jsapi.coverview.k.this.b(tVar, animatorSet, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.tencent.mm.plugin.appbrand.jsapi.t tVar, final android.animation.AnimatorSet animatorSet, final android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (tVar.getLifecycleOwner() != null) {
            tVar.getLifecycleOwner().mo133getLifecycle().a(new androidx.lifecycle.x(this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.coverview.JsApiAnimateCoverView$1$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public void onDestroyed() {
                    animatorSet.removeListener(animatorListenerAdapter);
                }
            });
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f80693d.a(this.f80694e.o("ok"));
    }
}

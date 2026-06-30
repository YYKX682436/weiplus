package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gb1.n f162226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.n f162227e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.n nVar, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, final android.animation.AnimatorSet animatorSet, gb1.n nVar2) {
        this.f162227e = nVar;
        this.f162226d = nVar2;
        tVar.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.coverview.k$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.k.this.b(tVar, animatorSet, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, final android.animation.AnimatorSet animatorSet, final android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (tVar.mo50358x95c7fa5f() != null) {
            tVar.mo50358x95c7fa5f().mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x(this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.coverview.JsApiAnimateCoverView$1$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroyed */
                public void m50862x7495d2fa() {
                    animatorSet.removeListener(animatorListenerAdapter);
                }
            });
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f162226d.a(this.f162227e.o("ok"));
    }
}

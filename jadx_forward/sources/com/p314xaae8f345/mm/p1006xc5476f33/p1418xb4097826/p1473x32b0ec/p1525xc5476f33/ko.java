package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ko implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f194831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f194832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f194834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f194835h;

    public ko(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, android.view.ViewGroup viewGroup, android.animation.ValueAnimator valueAnimator, boolean z17) {
        this.f194832e = apVar;
        this.f194833f = viewGroup;
        this.f194834g = valueAnimator;
        this.f194835h = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f194831d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "BulletInAnimator onAnimationCancel: isCancel=" + this.f194831d + ", bulletShowInfo:" + this.f194832e.A.get(this.f194833f));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        sj2.m mVar;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "BulletInAnimator onAnimationEnd: isCancel=" + this.f194831d + ", bulletShowInfo: " + this.f194832e.A.get(this.f194833f));
        boolean z17 = false;
        if (this.f194831d) {
            this.f194831d = false;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.f194832e.A.get(this.f194833f);
        if (tnVar != null) {
            tnVar.f195971e = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.f194832e.A.get(this.f194833f);
        if (tnVar2 != null && (atomicBoolean = tnVar2.f195972f) != null && true == atomicBoolean.get()) {
            z17 = true;
        }
        if (!z17) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f194832e.C).get(this.f194833f);
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
        android.animation.ValueAnimator valueAnimator2 = this.f194834g;
        if (valueAnimator2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f194832e;
            long duration = valueAnimator2.getDuration();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.N;
            if (duration != i17 + 500) {
                valueAnimator2.setDuration(i17 + 500);
                valueAnimator2.setEvaluator(new cn2.m(500, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.io(apVar)));
            }
        }
        if (!this.f194832e.G.containsKey(this.f194833f) || (mVar = (sj2.m) this.f194832e.G.get(this.f194833f)) == null) {
            return;
        }
        mVar.d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        sj2.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BulletInAnimator onAnimationStart: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f194832e;
        java.util.Map map = apVar.A;
        android.view.ViewGroup viewGroup = this.f194833f;
        sb6.append(map.get(viewGroup));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jo(this.f194835h, viewGroup));
        if (!apVar.G.containsKey(viewGroup) || (mVar = (sj2.m) apVar.G.get(viewGroup)) == null) {
            return;
        }
        mVar.a();
    }
}

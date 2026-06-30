package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class oo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f195306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f195307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f195308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 f195309g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var) {
        super(0);
        this.f195306d = apVar;
        this.f195307e = h0Var;
        this.f195308f = viewGroup;
        this.f195309g = l1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet ui thread: target BulletShowingInfo=" + this.f195306d.A.get(this.f195307e.f391656d) + ", origin BulletShowingInfo=" + this.f195306d.A.get(this.f195308f) + ", giftShowInfo=" + this.f195309g);
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f195306d.B).get(this.f195307e.f391656d);
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f195306d.C).get(this.f195307e.f391656d);
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            valueAnimator2.cancel();
        }
        this.f195306d.I.mo50302x6b17ad39(this.f195307e.f391656d);
        boolean z17 = false;
        this.f195306d.f193447J = false;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f195307e.f391656d, this.f195308f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.f195306d.A.get(this.f195308f);
            if (tnVar != null && (atomicBoolean = tnVar.f195970d) != null && atomicBoolean.get()) {
                z17 = true;
            }
            if (!z17) {
                android.animation.ValueAnimator valueAnimator3 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f195306d.B).get(this.f195308f);
                if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                    valueAnimator3.cancel();
                }
                android.animation.ValueAnimator valueAnimator4 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f195306d.C).get(this.f195308f);
                if (valueAnimator4 != null && !valueAnimator4.isRunning()) {
                    valueAnimator4.start();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f195306d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.V1(apVar, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) apVar.A.get(this.f195307e.f391656d), this.f195309g, false, 4, null);
        android.animation.ValueAnimator valueAnimator5 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f195306d.B).get(this.f195307e.f391656d);
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.f195306d.A.get(this.f195307e.f391656d);
        if (tnVar2 != null) {
            tnVar2.f195984r = c01.id.c();
        }
        this.f195306d.w1(null);
        return jz5.f0.f384359a;
    }
}

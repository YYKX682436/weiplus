package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class so extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f195824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f195825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        super(0);
        this.f195824d = apVar;
        this.f195825e = c19786x6a1e2862;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.widget.ImageView imageView;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f195824d;
        java.lang.Object obj = apVar.A.get(apVar.f193454v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) obj;
        if (!((tnVar == null || (atomicBoolean = tnVar.f195970d) == null || atomicBoolean.get()) ? false : true)) {
            obj = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) obj;
        if (tnVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar2 = this.f195824d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f195825e;
            apVar2.K0(0);
            ((je2.t) apVar2.P0(je2.t.class)).f380797g.mo7808x76db6cb1(null);
            tnVar2.f195970d.getAndSet(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "[showGiftAllLiveNotify], ");
            tnVar2.c();
            r45.bm1 b17 = dk2.i.f315129a.b(c19786x6a1e2862.m76489xefafd82());
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m76488xef7e927 = c19786x6a1e2862.m76488xef7e927();
            if (m76488xef7e927 != null) {
                r45.cj1 cj1Var = new r45.cj1();
                cj1Var.mo11468x92b714fd(m76488xef7e927.g());
                android.widget.TextView textView = tnVar2.f195981o.f196504c;
                if (textView != null) {
                    textView.setText(cj1Var.m75945x2fec8307(4));
                }
                r45.kv1 kv1Var = (r45.kv1) cj1Var.m75936x14adae67(3);
                if (kv1Var != null && (imageView = tnVar2.f195981o.f196503b) != null) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.e().c(new mn2.q3(kv1Var.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411490h));
                }
            }
            android.view.View view = tnVar2.f195981o.f196502a;
            if (view != null) {
                view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qo(b17, c19786x6a1e2862, apVar2));
            }
            te2.u3 u3Var = te2.u3.f500001a;
            if (b17 == null || (str = b17.m75945x2fec8307(0)) == null) {
                str = "";
            }
            u3Var.a(1, str);
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar2.B).get(apVar2.f193454v);
            if (valueAnimator != null) {
                valueAnimator.setDuration(5500L);
                valueAnimator.setEvaluator(new cn2.m(500, 5000, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ro(apVar2)));
            }
            android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar2.B).get(apVar2.f193454v);
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            tnVar2.f195984r = c01.id.c();
        }
        return jz5.f0.f384359a;
    }
}

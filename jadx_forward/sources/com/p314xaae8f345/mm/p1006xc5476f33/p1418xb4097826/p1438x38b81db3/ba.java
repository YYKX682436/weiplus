package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ba extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f184483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f184484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184487i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.zu0 f184488m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, r45.zu0 zu0Var) {
        super(1);
        this.f184482d = z17;
        this.f184483e = z18;
        this.f184484f = qeVar;
        this.f184485g = view;
        this.f184486h = abstractC14490x69736cb5;
        this.f184487i = s0Var;
        this.f184488m = zu0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.AnimatorSet W;
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) obj;
        if (animatorSet != null) {
            boolean z17 = this.f184482d;
            boolean z18 = this.f184483e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f184484f;
            if (z17 || z18) {
                boolean U = qeVar.U();
                android.view.View videoMask = this.f184485g;
                if (U) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar2 = this.f184484f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoMask, "$videoMask");
                    W = qeVar2.W(videoMask, 300L, 300L, 0L, 1200L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar3 = this.f184484f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoMask, "$videoMask");
                    W = qeVar3.W(videoMask, 200L, 200L, 0L, 800L);
                }
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                animatorSet2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.aa(qeVar, qeVar));
                animatorSet2.playTogether(animatorSet);
                if (((java.lang.Boolean) ((jz5.n) qeVar.H).mo141623x754a37bb()).booleanValue()) {
                    animatorSet2.playTogether(W);
                }
                animatorSet2.start();
                qeVar.f185899q = animatorSet2;
                if (z18) {
                    ro2.u uVar = this.f184486h.getFeedObject().getFeedObject().m76805x2dd7a70f() == 1 ? ro2.u.f479637g : ro2.u.f479635e;
                    r45.zu0 zu0Var = this.f184488m;
                    ro2.s.c(qeVar, this.f184487i, uVar, zu0Var != null ? java.lang.Integer.valueOf(zu0Var.m75939xb282bd08(0)) : null);
                }
            } else {
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.O1().r()).booleanValue()) {
                    android.animation.AnimatorSet animatorSet3 = qeVar.f185900r;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    qeVar.f185900r = animatorSet;
                    animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z9(qeVar, qeVar));
                }
                animatorSet.start();
            }
        }
        return jz5.f0.f384359a;
    }
}

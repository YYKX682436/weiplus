package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ba extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f102949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f102950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f102951f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102952g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102953h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102954i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.zu0 f102955m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(boolean z17, boolean z18, com.tencent.mm.plugin.finder.convert.qe qeVar, android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, r45.zu0 zu0Var) {
        super(1);
        this.f102949d = z17;
        this.f102950e = z18;
        this.f102951f = qeVar;
        this.f102952g = view;
        this.f102953h = baseFinderFeed;
        this.f102954i = s0Var;
        this.f102955m = zu0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.AnimatorSet W;
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) obj;
        if (animatorSet != null) {
            boolean z17 = this.f102949d;
            boolean z18 = this.f102950e;
            com.tencent.mm.plugin.finder.convert.qe qeVar = this.f102951f;
            if (z17 || z18) {
                boolean U = qeVar.U();
                android.view.View videoMask = this.f102952g;
                if (U) {
                    com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f102951f;
                    kotlin.jvm.internal.o.f(videoMask, "$videoMask");
                    W = qeVar2.W(videoMask, 300L, 300L, 0L, 1200L);
                } else {
                    com.tencent.mm.plugin.finder.convert.qe qeVar3 = this.f102951f;
                    kotlin.jvm.internal.o.f(videoMask, "$videoMask");
                    W = qeVar3.W(videoMask, 200L, 200L, 0L, 800L);
                }
                android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                animatorSet2.addListener(new com.tencent.mm.plugin.finder.convert.aa(qeVar, qeVar));
                animatorSet2.playTogether(animatorSet);
                if (((java.lang.Boolean) ((jz5.n) qeVar.H).getValue()).booleanValue()) {
                    animatorSet2.playTogether(W);
                }
                animatorSet2.start();
                qeVar.f104366q = animatorSet2;
                if (z18) {
                    ro2.u uVar = this.f102953h.getFeedObject().getFeedObject().getObjectType() == 1 ? ro2.u.f398104g : ro2.u.f398102e;
                    r45.zu0 zu0Var = this.f102955m;
                    ro2.s.c(qeVar, this.f102954i, uVar, zu0Var != null ? java.lang.Integer.valueOf(zu0Var.getInteger(0)) : null);
                }
            } else {
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.O1().r()).booleanValue()) {
                    android.animation.AnimatorSet animatorSet3 = qeVar.f104367r;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    qeVar.f104367r = animatorSet;
                    animatorSet.addListener(new com.tencent.mm.plugin.finder.convert.z9(qeVar, qeVar));
                }
                animatorSet.start();
            }
        }
        return jz5.f0.f302826a;
    }
}

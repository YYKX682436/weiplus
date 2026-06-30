package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class jc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f160010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f160011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f160012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f160013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mc f160014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(android.animation.ObjectAnimator objectAnimator, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mc mcVar) {
        super(0);
        this.f160010d = objectAnimator;
        this.f160011e = n7Var;
        this.f160012f = i17;
        this.f160013g = i18;
        this.f160014h = mcVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f160010d.cancel();
        al1.n P3 = this.f160011e.P3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P3);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(P3.m2248xff253ca0(), "textColor", this.f160012f, this.f160013g);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.setDuration(300L);
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ic(ofInt, this.f160014h));
        ofInt.start();
        return jz5.f0.f384359a;
    }
}

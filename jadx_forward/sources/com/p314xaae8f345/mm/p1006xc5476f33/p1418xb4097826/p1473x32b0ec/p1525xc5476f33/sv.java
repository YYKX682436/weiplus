package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class sv extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f195843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f195844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f195845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(android.animation.AnimatorSet animatorSet, android.animation.ObjectAnimator objectAnimator, yz5.a aVar) {
        super(1);
        this.f195843d = animatorSet;
        this.f195844e = objectAnimator;
        this.f195845f = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f195843d.cancel();
        this.f195844e.cancel();
        this.f195845f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}

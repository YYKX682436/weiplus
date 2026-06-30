package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 f171281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12640x8cdfe408 c12640x8cdfe408) {
        super(0);
        this.f171281d = c12640x8cdfe408;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(-1.5707964f, 4.712389f);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(this.f171281d.getAnimDuration());
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        return ofFloat;
    }
}

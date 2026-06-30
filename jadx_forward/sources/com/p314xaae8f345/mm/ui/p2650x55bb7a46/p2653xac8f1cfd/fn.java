package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class fn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21677x4f89192f f280601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21677x4f89192f c21677x4f89192f) {
        super(0);
        this.f280601d = c21677x4f89192f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimator.setDuration(200L);
        valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.en(this.f280601d));
        return valueAnimator;
    }
}

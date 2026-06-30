package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class za extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.db f287819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar) {
        super(0);
        this.f287819d = dbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ya(this.f287819d));
        return ofFloat;
    }
}

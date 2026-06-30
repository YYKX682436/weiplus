package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes5.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 f273631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32) {
        super(0);
        this.f273631d = c19651x7fe9d32;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = this.f273631d;
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(c19651x7fe9d32.f271360i, android.animation.PropertyValuesHolder.ofFloat("scaleX", 0.5f, 1.1f, 1.0f), android.animation.PropertyValuesHolder.ofFloat("scaleY", 0.5f, 1.1f, 1.0f));
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofPropertyValuesHolder.addListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.x2(c19651x7fe9d32));
        return ofPropertyValuesHolder;
    }
}

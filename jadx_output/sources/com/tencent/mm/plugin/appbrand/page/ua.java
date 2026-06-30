package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ua implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wa f87144d;

    public ua(com.tencent.mm.plugin.appbrand.page.wa waVar) {
        this.f87144d = waVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f87144d.getContentView().setScrollY(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

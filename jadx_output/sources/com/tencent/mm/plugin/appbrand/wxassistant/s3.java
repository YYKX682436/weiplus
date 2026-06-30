package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class s3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.w3 f92307d;

    public s3(com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var) {
        this.f92307d = w3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var = this.f92307d;
        if (w3Var.getContext().getResources().getConfiguration().orientation != 2) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WxAssistantWindow");
            android.view.WindowManager.LayoutParams layoutParams = w3Var.f92334h;
            M.putInt(w3Var.f92332f, layoutParams.x);
            M.putInt(w3Var.f92333g, layoutParams.y);
        }
    }
}

package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.v f77713d;

    public u(com.tencent.mm.plugin.appbrand.debugger.console.v vVar) {
        this.f77713d = vVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationCancel#show");
        com.tencent.mm.plugin.appbrand.debugger.console.v vVar = this.f77713d;
        vVar.f77716f = false;
        yz5.a aVar = vVar.f77714d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationEnd#show");
        com.tencent.mm.plugin.appbrand.debugger.console.v vVar = this.f77713d;
        vVar.f77716f = false;
        yz5.a aVar = vVar.f77714d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationRepeat#show");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationStart#show");
    }
}

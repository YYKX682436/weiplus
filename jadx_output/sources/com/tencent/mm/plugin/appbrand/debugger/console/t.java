package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class t implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.v f77712d;

    public t(com.tencent.mm.plugin.appbrand.debugger.console.v vVar) {
        this.f77712d = vVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationCancel#hide");
        com.tencent.mm.plugin.appbrand.debugger.console.v vVar = this.f77712d;
        vVar.f77716f = false;
        yz5.a aVar = vVar.f77715e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationEnd#hide");
        com.tencent.mm.plugin.appbrand.debugger.console.v vVar = this.f77712d;
        vVar.f77716f = false;
        yz5.a aVar = vVar.f77715e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationRepeat#hide");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "onAnimationStart#hide");
    }
}

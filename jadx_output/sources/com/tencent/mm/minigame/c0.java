package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.f0 f69002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.minigame.f0 f0Var) {
        super(0);
        this.f69002d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pa1.t tVar;
        nk5.c cVar;
        com.tencent.mars.xlog.Log.i("WVA.WVAActivityDelegate", "initVASContainerIfNeeded() in");
        com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.minigame.f0.f69069b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            tVar = null;
        } else {
            com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
            kotlin.jvm.internal.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
            tVar = ((pa1.o) N2).o4();
        }
        kotlin.jvm.internal.o.d(tVar);
        tVar.f40697u = this.f69002d;
        if (!android.os.Looper.getMainLooper().isCurrentThread()) {
            throw new java.lang.IllegalStateException("AppBrandVASHandle: Thread Checking not in UIThread");
        }
        com.tencent.mm.ui.vas.VASActivity.Companion.getClass();
        cVar = com.tencent.mm.ui.vas.VASActivity.vasController;
        if (!cVar.e()) {
            com.tencent.mm.ui.vas.VASActivity.vasController = new com.tencent.mm.minigame.d();
        }
        if (tVar.f40699w.getChildCount() == 0) {
            com.tencent.mars.xlog.Log.i("WVA.WVAActivityDelegate", "initVASContainerIfNeeded() called real create container inflate activity_common_vas_for_launcher");
            android.view.View inflate = android.view.LayoutInflater.from(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.f487929bu, (android.view.ViewGroup) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/minigame/WVAActivityDelegate$initVASContainerIfNeeded$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/minigame/WVAActivityDelegate$initVASContainerIfNeeded$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.f40699w.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        return jz5.f0.f302826a;
    }
}

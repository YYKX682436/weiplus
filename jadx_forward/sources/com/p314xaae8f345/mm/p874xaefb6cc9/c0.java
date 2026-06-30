package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.f0 f150535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p874xaefb6cc9.f0 f0Var) {
        super(0);
        this.f150535d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pa1.t tVar;
        nk5.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAActivityDelegate", "initVASContainerIfNeeded() in");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = com.p314xaae8f345.mm.p874xaefb6cc9.f0.f150602b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            tVar = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = o6Var.N2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
            tVar = ((pa1.o) N2).o4();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        tVar.f122230u = this.f150535d;
        if (!android.os.Looper.getMainLooper().isCurrentThread()) {
            throw new java.lang.IllegalStateException("AppBrandVASHandle: Thread Checking not in UIThread");
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39695x233c02ec.getClass();
        cVar = com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39716x5a4134e4;
        if (!cVar.e()) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39716x5a4134e4 = new com.p314xaae8f345.mm.p874xaefb6cc9.d();
        }
        if (tVar.f122232w.getChildCount() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAActivityDelegate", "initVASContainerIfNeeded() called real create container inflate activity_common_vas_for_launcher");
            android.view.View inflate = android.view.LayoutInflater.from(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569462bu, (android.view.ViewGroup) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/minigame/WVAActivityDelegate$initVASContainerIfNeeded$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/minigame/WVAActivityDelegate$initVASContainerIfNeeded$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.f122232w.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        return jz5.f0.f384359a;
    }
}

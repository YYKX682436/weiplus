package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class h4 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f105550d;

    public h4(java.lang.ref.WeakReference rFreqController) {
        kotlin.jvm.internal.o.g(rFreqController, "rFreqController");
        this.f105550d = rFreqController;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var = (com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105550d.get();
        if (l5Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "onAppBackground " + str);
            com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = l5Var.f105671w;
            if (l6Var != null) {
                l6Var.d();
            }
            com.tencent.mm.plugin.finder.extension.reddot.z5 A = l5Var.A();
            A.f106062p = A.h() ? c01.id.c() : 0L;
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var = (com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105550d.get();
        if (l5Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "onAppForeground " + str);
            com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = l5Var.f105671w;
            if (l6Var != null) {
                l6Var.f();
            }
            l5Var.A().i(str);
        }
    }
}

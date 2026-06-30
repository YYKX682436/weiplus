package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class o1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f105734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.w1 f105735e;

    public o1(com.tencent.mm.plugin.finder.extension.reddot.w1 w1Var) {
        this.f105735e = w1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 it = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.extension.reddot.w1 w1Var = this.f105735e;
        boolean z17 = it.f105327a;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = it.f105329c;
        if (!z17 || this.f105734d) {
            if (!z17) {
                w1Var.f105952p = null;
                w1Var.f105953q = com.tencent.mm.plugin.finder.extension.reddot.i1.f105577d;
            }
            if (jbVar != null && jbVar.y0("FinderEntrance")) {
                w1Var.f105949m |= 256;
            } else {
                if (jbVar != null && jbVar.y0("FinderLiveEntrance")) {
                    w1Var.f105949m |= 512;
                }
            }
        } else {
            w1Var.Ni("tabChange");
            jz5.l Di = w1Var.Di(true);
            w1Var.f105952p = (com.tencent.mm.plugin.finder.extension.reddot.jb) Di.f302833d;
            w1Var.f105953q = (com.tencent.mm.plugin.finder.extension.reddot.i1) Di.f302834e;
            com.tencent.mars.xlog.Log.i("Finder.NewDiscoveryRedDotHandler", java.lang.String.valueOf(jbVar));
        }
        this.f105734d = z17;
    }
}

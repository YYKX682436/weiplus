package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class u3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.w3 f105885d;

    public u3(com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var) {
        this.f105885d = w3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        if ((z9Var == null || z9Var.f105327a) ? false : true) {
            com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var = this.f105885d;
            w3Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.RedDotExpiredHandler", "clearCheckDoSync");
            w3Var.f105959e.post(com.tencent.mm.plugin.finder.extension.reddot.t3.f105871d);
        }
    }
}

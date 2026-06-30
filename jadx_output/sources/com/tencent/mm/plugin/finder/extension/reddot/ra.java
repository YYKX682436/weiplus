package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class ra extends ym5.m0 {
    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
                if (j5Var != null) {
                    com.tencent.mars.xlog.Log.i("FinderShareStreamRedDotHelper", "feed " + pm0.v.u(j5Var.getItemId()) + " exposed!");
                    java.util.HashSet hashSet = com.tencent.mm.plugin.finder.extension.reddot.sa.f105864b;
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    com.tencent.mm.plugin.finder.extension.reddot.sa.f105864b = hashSet;
                    hashSet.add(java.lang.Long.valueOf(j5Var.getItemId()));
                }
            }
        }
    }
}

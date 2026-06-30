package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class f6 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.p6 f110006a;

    public f6(com.tencent.mm.plugin.finder.feed.ui.p6 p6Var) {
        this.f110006a = p6Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        so2.j5 j5Var;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = this.f110006a;
            androidx.recyclerview.widget.RecyclerView recyclerView = p6Var.getRecyclerView();
            int u07 = recyclerView != null ? recyclerView.u0(k3Var.itemView) : 0;
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            long itemId = (s0Var == null || (j5Var = (so2.j5) s0Var.f293125i) == null) ? 0L : j5Var.getItemId();
            com.tencent.mm.plugin.finder.feed.ui.a6 a6Var = p6Var.f110399e;
            com.tencent.mm.ui.MMFragmentActivity activity = a6Var.f109650d;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            int i17 = a6Var.f109652f == 2 ? 1 : 2;
            java.lang.String str = (java.lang.String) kz5.n0.Z(a6Var.f109662s);
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.pj((com.tencent.mm.plugin.finder.report.o3) c17, V6, a6Var.f109661r, 2, i17, str2, a6Var.f109660q, 0, itemId, u07, 64, null);
        }
    }
}

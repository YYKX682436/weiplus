package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jn implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rn f107121d;

    public jn(com.tencent.mm.plugin.finder.feed.rn rnVar) {
        this.f107121d = rnVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.k4 k4Var = (so2.k4) holder.f293125i;
        if (k4Var == null || k4Var.f410455e != 2) {
            return false;
        }
        r45.ub ubVar = (r45.ub) k4Var.f410454d.getCustom(2);
        if (ubVar != null && ubVar.getInteger(0) == 1) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.rn rnVar = this.f107121d;
        rl5.r rVar = rnVar.f108931g;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = rnVar.f108931g;
        if (rVar2 != null) {
            rVar2.h(view, new com.tencent.mm.plugin.finder.feed.pn(rnVar), new com.tencent.mm.plugin.finder.feed.qn(rnVar, k4Var, adapter, i17), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            return true;
        }
        kotlin.jvm.internal.o.o("popupMenu");
        throw null;
    }
}

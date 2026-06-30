package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ja implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f107092d;

    public ja(com.tencent.mm.plugin.finder.feed.oa oaVar) {
        this.f107092d = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.o Z6;
        androidx.recyclerview.widget.h2 h2Var;
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f107092d;
        com.tencent.mm.ui.MMActivity context = oaVar.f107155d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(oaVar.f108627m)) == null || (h2Var = Z6.f260970o) == null) {
            return;
        }
        h2Var.b();
    }
}

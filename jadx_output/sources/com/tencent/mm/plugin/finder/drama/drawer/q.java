package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class q implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f105269e;

    public q(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, r45.qj2 qj2Var) {
        this.f105268d = e0Var;
        this.f105269e = qj2Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var = this.f105268d;
        r45.ft4 ft4Var = (r45.ft4) ((zb2.c) e0Var.f105225o.get(i17)).f471259d.getCustom(0);
        e0Var.P6(ft4Var != null ? ft4Var.getInteger(0) : 0);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Map c17 = d2Var.c(context);
        c17.put("native_drama_id", pm0.v.u(this.f105269e.getLong(0)));
        c17.put("feed_id", java.lang.Long.valueOf(e0Var.f105232v));
        hc2.v0.b(view, "native_drama_collection_tab", "view_clk", 0, c17, null, 20, null);
    }
}

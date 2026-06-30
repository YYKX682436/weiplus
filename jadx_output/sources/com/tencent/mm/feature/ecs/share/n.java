package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f65992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f65993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f65994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.share.a f65995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f65996h;

    public n(android.content.Context context, java.util.List list, java.util.List list2, com.tencent.mm.feature.ecs.share.a aVar, java.lang.Object obj) {
        this.f65992d = context;
        this.f65993e = list;
        this.f65994f = list2;
        this.f65995g = aVar;
        this.f65996h = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f65992d;
        boolean z17 = false;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 0, false);
        java.util.List list = this.f65993e;
        k0Var.f211872n = new com.tencent.mm.feature.ecs.share.d(context, list);
        java.lang.Object obj = this.f65996h;
        k0Var.f211880r = new com.tencent.mm.feature.ecs.share.g(obj);
        com.tencent.mm.feature.ecs.share.a aVar = this.f65995g;
        k0Var.f211881s = new com.tencent.mm.feature.ecs.share.h(aVar);
        java.util.List list2 = this.f65994f;
        k0Var.f211874o = new com.tencent.mm.feature.ecs.share.e(context, list2, aVar);
        k0Var.f211884v = new com.tencent.mm.feature.ecs.share.i(aVar);
        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.t0(list, list2)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.feature.ecs.share.p pVar = (com.tencent.mm.feature.ecs.share.p) it.next();
            if (pVar.f65998a == com.tencent.mm.feature.ecs.share.b.f65971f && !pVar.f66000c) {
                z17 = true;
                break;
            }
        }
        if (z17 && ((o25.y1) i95.n0.c(o25.y1.class)) != null) {
            new com.tencent.mm.pluginsdk.forward.m().Di(this.f65992d, k0Var, 1, com.tencent.mm.feature.ecs.share.j.f65987d, new com.tencent.mm.feature.ecs.share.k(aVar));
        }
        k0Var.f211860g = new com.tencent.mm.feature.ecs.share.l(obj, aVar);
        k0Var.f211856e = new com.tencent.mm.feature.ecs.share.m(aVar);
        k0Var.v();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Bj("ecs_share_dialog", "page_enter", kz5.b1.e(new jz5.l("source_report_data", obj)), 12, false);
        }
    }
}

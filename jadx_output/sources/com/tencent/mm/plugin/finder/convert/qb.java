package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104352f;

    public qb(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f104350d = qeVar;
        this.f104351e = s0Var;
        this.f104352f = baseFinderFeed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.dm2 object_extend;
        r45.bn2 bn2Var;
        r45.qj2 qj2Var;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104350d;
        com.tencent.mm.ui.MMActivity activity = qeVar.f104358f.getF122643d();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.playlist.w1 w1Var = (com.tencent.mm.plugin.finder.playlist.w1) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.playlist.w1.class);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f104352f;
        in5.s0 holder = this.f104351e;
        if (w1Var != null) {
            com.tencent.mm.plugin.finder.feed.k8 k8Var = qeVar.f104358f;
            kotlin.jvm.internal.o.f(item, "$item");
            w1Var.O6(k8Var, holder, item);
        }
        com.tencent.mm.ui.MMActivity activity2 = qeVar.f104358f.getF122643d();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.drama.detail.y yVar = (com.tencent.mm.plugin.finder.drama.detail.y) pf5.z.f353948a.a(activity2).e(com.tencent.mm.plugin.finder.drama.detail.y.class);
        if (yVar != null) {
            com.tencent.mm.plugin.finder.feed.k8 contract = qeVar.f104358f;
            kotlin.jvm.internal.o.f(item, "$item");
            kotlin.jvm.internal.o.g(contract, "contract");
            kotlin.jvm.internal.o.g(holder, "holder");
            if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() || (object_extend = item.getFeedObject().getFeedObject().getObject_extend()) == null || (bn2Var = (r45.bn2) object_extend.getCustom(51)) == null || (qj2Var = (r45.qj2) bn2Var.getCustom(0)) == null) {
                return;
            }
            int integer = bn2Var.getInteger(2);
            if (yVar.f105191i) {
                yVar.f105191i = false;
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
                com.tencent.mm.plugin.finder.feed.pz pzVar = contract instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) contract : null;
                a4Var.V6(pzVar != null ? pzVar.f108756h : null, item, holder, yVar);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Zj(yVar.getContext(), qj2Var, item.getFeedObject().getId(), item.w(), true, java.lang.Integer.valueOf(integer), -1, null);
            }
        }
    }
}

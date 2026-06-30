package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hb implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103568c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103570e;

    public hb(android.view.View view, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        this.f103566a = view;
        this.f103567b = s0Var;
        this.f103568c = qeVar;
        this.f103569d = baseFinderFeed;
        this.f103570e = i17;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        this.f103566a.setTag(java.lang.Boolean.FALSE);
        in5.s0 s0Var = this.f103567b;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Vj((com.tencent.mm.plugin.finder.report.o3) c17, baseFinderFeed.getFeedObject().getId(), baseFinderFeed.w(), 2, 3L, "", V6, 0L, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) eVar).Ai(context2, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f383132d = 1;
            pk5Var.f383140o = (int) (android.os.SystemClock.elapsedRealtime() - pk5Var.f383143r);
            pk5Var.f383137i = 1;
        }
        l35.a aVar = l35.a.f315443a;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        aVar.a(context3);
        com.tencent.mm.plugin.finder.assist.n7.f102407b = 0;
        com.tencent.mm.plugin.finder.report.x3.f125433b = 0L;
        android.content.Context context4 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context4).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
        if (finderDescPanelUIC != null) {
            finderDescPanelUIC.c7(s0Var);
        }
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103568c;
        com.tencent.mm.ui.MMActivity f122643d = qeVar.f104358f.getF122643d();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f103569d;
        x3Var.c(f122643d, "menu_outside", baseFinderFeed2.getItemId(), this.f103570e);
        x3Var.d(qeVar.f104358f.getF122643d(), baseFinderFeed2.getItemId(), this.f103570e);
    }
}

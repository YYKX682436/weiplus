package aw2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(aw2.n nVar) {
        super(0);
        this.f14747d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        aw2.n nVar = this.f14747d;
        com.tencent.mm.ui.MMActivity activity = nVar.f14776d;
        kotlin.jvm.internal.o.g(activity, "activity");
        sr2.o1 o1Var = (sr2.o1) pf5.z.f353948a.a(activity).a(sr2.o1.class);
        if (o1Var.T6() && !o1Var.R6()) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) nVar.f14776d, 1, true);
            k0Var.f211872n = new aw2.j(nVar);
            k0Var.f211881s = new aw2.k(nVar);
            k0Var.v();
        } else {
            rx2.p pVar = nVar.f14779g;
            pVar.f400984e.invoke(java.lang.Boolean.TRUE);
            pVar.f400989m = true;
            pVar.f400986g.setVisibility(0);
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView = nVar.f14783n;
            kotlin.jvm.internal.o.f(finderExtendReadingView, "<get-extendReadingView>(...)");
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("if_clk_empty", 1);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject == null || (str = finderFeedReportObject.getSessionId()) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("finder_post_sessionid", str);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr[2] = new jz5.l("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject2 != null ? finderFeedReportObject2.getEnterScene() : 0));
            hc2.v0.b(finderExtendReadingView, "link_or_product", "view_clk", 0, kz5.c1.k(lVarArr), null, 20, null);
        }
        return jz5.f0.f302826a;
    }
}

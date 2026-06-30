package x94;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.ActivityC17853xb21c8b97 f534259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f534260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f534261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f534262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f534263h;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.ActivityC17853xb21c8b97 activityC17853xb21c8b97, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, int i18, int i19) {
        this.f534259d = activityC17853xb21c8b97;
        this.f534260e = c19792x256d2725;
        this.f534261f = i17;
        this.f534262g = i18;
        this.f534263h = i19;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.ActivityC17853xb21c8b97 activityC17853xb21c8b97 = this.f534259d;
        activityC17853xb21c8b97.setResult(-1, activityC17853xb21c8b97.getIntent());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6888x4b0e6734 A = s0Var.A();
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f534260e;
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        ((m30.m) rVar).getClass();
        A.f142049g = A.b("FinderFeedID", b52.b.q(m76784x5db1b11), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6888x4b0e6734 A2 = s0Var.A();
        int i17 = this.f534261f;
        A2.f142047e = i17;
        int i18 = this.f534262g;
        if (i18 != 0) {
            s0Var.A().f142046d = i18;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsCoverPostSelectTabType", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i19 = this.f534263h;
            if (i19 == 1) {
                s0Var.V.f142046d = 7;
            } else if (i19 == 2) {
                s0Var.V.f142046d = 6;
            } else if (i19 == 3) {
                s0Var.V.f142046d = 4;
            } else if (i19 == 4) {
                s0Var.V.f142046d = 5;
            } else if (i19 == 5) {
                s0Var.V.f142046d = 3;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsCoverPostSelectTabType", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6887xd297188a z17 = s0Var.z();
        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
        long m76784x5db1b112 = c19792x256d2725.m76784x5db1b11();
        ((m30.m) rVar2).getClass();
        z17.f142045h = z17.b("FinderFeedID", b52.b.q(m76784x5db1b112), true);
        s0Var.z().f142042e = i17;
        activityC17853xb21c8b97.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$2");
    }
}

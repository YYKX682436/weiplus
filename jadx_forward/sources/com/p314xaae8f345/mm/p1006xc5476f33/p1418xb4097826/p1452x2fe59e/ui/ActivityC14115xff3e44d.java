package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI26;", "Lcom/tencent/mm/plugin/sns/ui/visiblerange/BaseSelectVisibleRangeUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/go", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI26 */
/* loaded from: classes11.dex */
public final class ActivityC14115xff3e44d extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c {
    public static final /* synthetic */ int E = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x6 Y6(android.content.Context context, zd4.o oVar) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u2(context, oVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public zd4.o Z6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.go(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f252214o = true;
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.lwa);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSettingPrivacyDetailUI);
        aVar.Rj(this, iy1.a.Finder);
        ((cy1.a) aVar.ik(this, 12, 27010)).gk(this, kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(getIntent().getIntExtra("key_to_comment_scene", 0))), new jz5.l("finder_tab_context_id", getIntent().getStringExtra("key_click_tab_context_id")), new jz5.l("finder_context_id", getIntent().getStringExtra("key_context_id"))));
    }
}

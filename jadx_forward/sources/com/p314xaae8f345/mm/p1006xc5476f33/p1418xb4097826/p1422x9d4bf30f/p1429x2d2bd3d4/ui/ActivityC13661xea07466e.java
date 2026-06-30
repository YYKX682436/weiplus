package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/postplay/ui/FinderPostPlayUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/l91;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI */
/* loaded from: classes2.dex */
public final class ActivityC13661xea07466e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c<r45.l91> {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f183333u = kz5.c0.d(0L, 0L);

    /* renamed from: v, reason: collision with root package name */
    public int f183334v;

    /* renamed from: w, reason: collision with root package name */
    public long f183335w;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c, t92.b
    public int N2() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eda;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return getIntent().getIntExtra("double_comment_scene", 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{na2.n.class, na2.c.class, na2.k.class, na2.o.class, na2.f.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c, t92.a
    /* renamed from: o6 */
    public x92.f getF183273t() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("topic_id", 0L);
        long longExtra2 = getIntent().getLongExtra("from_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("by_pass");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("source_session_buffer");
        java.lang.String str = stringExtra2 == null ? "" : stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String str2 = stringExtra3 == null ? "" : stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("sub_title");
        java.lang.String str3 = stringExtra4 == null ? "" : stringExtra4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlayNewUI", "onCreate topicId:" + longExtra + ", fromObjectId:" + longExtra2 + ", byPass:" + stringExtra);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderPostPlayPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "cluster_feature_page");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 1, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new ma2.a(this, longExtra, str2, str3, longExtra2, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f183335w = java.lang.System.currentTimeMillis();
        this.f183333u.replaceAll(ma2.b.f406742a);
        this.f183334v = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        long longExtra = getIntent().getLongExtra("from_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("source_session_buffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("by_pass");
        java.util.Map k17 = kz5.c1.k(new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("source_comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(7))), new jz5.l("source_feedid", pm0.v.u(longExtra)), new jz5.l("source_session_buffer", stringExtra), new jz5.l("start_expose_time_ms", java.lang.Long.valueOf(this.f183335w)), new jz5.l("end_expose_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new jz5.l("jump_info_by_pass_info", stringExtra2 != null ? stringExtra2 : ""), new jz5.l("jump_dstream_unexp_reason", java.lang.Integer.valueOf(this.f183334v)));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Aj(50401, "page_out", k17, 1, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlayNewUI", "reportHalfScreenExit: exitReason=" + this.f183334v);
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlayNewUI", "onStop");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        this.f183334v = 1;
        super.mo2295x59cfc822();
    }
}

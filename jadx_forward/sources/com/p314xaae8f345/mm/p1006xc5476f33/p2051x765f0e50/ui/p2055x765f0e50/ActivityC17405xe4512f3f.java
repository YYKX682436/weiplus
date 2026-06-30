package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutTimelineUI */
/* loaded from: classes4.dex */
public class ActivityC17405xe4512f3f extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241815e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f241814d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f241816f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241817g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241818h = true;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576461bu;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f241815e = m79336x8b97809d();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iwh);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n6(this));
        this.f241814d = c01.z1.r();
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ForbidSnsStranger", 0) == 0;
        this.f241818h = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAboutTimelineUI", "showStranger:%s", java.lang.Boolean.valueOf(z17));
        if (this.f241818h) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241815e).m("timeline_stranger_show", false);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241815e).m("timeline_stranger_show", true);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241815e).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f241816f || p94.w0.c() == null) {
            return;
        }
        r45.cb6 P0 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).P0(this.f241814d, this.f241817g);
        if (P0 == null) {
            return;
        }
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, P0));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("timline_outside_permiss")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("k_sns_tag_id", 4L);
            intent.putExtra("k_sns_from_settings_about_sns", 1);
            j45.l.j(this, "sns", ".ui.SnsBlackDetailUI", intent, null);
        }
        if (str.equals("timeline_black_permiss")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("k_sns_tag_id", 5L);
            intent2.putExtra("k_sns_from_settings_about_sns", 2);
            j45.l.j(this, "sns", ".ui.SnsTagDetailUI", intent2, null);
        }
        if (!str.equals("timeline_stranger_show")) {
            return false;
        }
        this.f241817g = !this.f241817g;
        if (p94.w0.c() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).C1(this.f241814d, this.f241817g);
        }
        this.f241816f = true;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        super.onResume();
        r45.cb6 cb6Var = new r45.cb6();
        if (p94.w0.c() != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(this.f241814d);
        }
        if (cb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsAboutTimelineUI", "userinfo is null");
        } else {
            int i17 = cb6Var.f452964g;
            if (this.f241818h && (c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241815e).h("timeline_stranger_show")) != null) {
                this.f241817g = (i17 & 1) > 0;
                android.content.SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
                if (this.f241817g) {
                    c21541x1c1b08fe.O(false);
                    sharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
                } else {
                    c21541x1c1b08fe.O(true);
                    sharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
                }
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241815e).notifyDataSetChanged();
    }
}

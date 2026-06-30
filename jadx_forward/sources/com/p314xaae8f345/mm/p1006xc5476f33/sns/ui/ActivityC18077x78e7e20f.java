package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr */
/* loaded from: classes4.dex */
public class ActivityC18077x78e7e20f extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f248796d;

    /* renamed from: e, reason: collision with root package name */
    public long f248797e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f248798f = false;

    public static java.lang.Boolean W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableSnsMsgUIWithRelevance", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_msg_ui_with_relevance, true));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableSnsMsgUIWithRelevance", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return valueOf;
    }

    public static java.lang.Boolean X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOnlyReminderMyInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        if (W6().booleanValue()) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf((c01.z1.i() & 274877906944L) != 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyReminderMyInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            return valueOf;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyReminderMyInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return bool;
    }

    public final void V6(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_clear_all_msg", z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        setResult(i17, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishWithResult", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return com.p314xaae8f345.mm.R.xml.f576485dp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ojr));
        this.f248796d = m79336x8b97809d();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gl(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgInteractionMgr", "onBackPressed");
        V6(-1, this.f248798f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        super.onCreate(bundle);
        this.f248797e = c01.z1.i();
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMsgManagementPageReport", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SNSMessageManagementPage);
        aVar.dk(this, "SNSMessageManagementPage");
        aVar.ik(this, 12, 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMsgManagementPageReport", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgInteractionMgr", "onPreferenceTreeClick key:%s", str);
        str.getClass();
        if (!str.equals("settings_mutual_interaction_switch")) {
            if (!str.equals("settings_clear_all_msg")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearAllMessage", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            this.f248798f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
            Aj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            Aj.f247689d.A("SnsComment", "delete from SnsComment");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgInteractionMgr", "clear all msg");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearAllMessage", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goToSwitchMsgInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248796d).h("settings_mutual_interaction_switch");
        if (c21541x1c1b08fe != null) {
            boolean N = c21541x1c1b08fe.N();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMutualInteractionStatus", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgInteractionMgr", "updateMutualInteractionStatus, lastExtStatus2:" + this.f248797e + " onlyReminderMyInteraction:" + N);
            if (N) {
                this.f248797e |= 274877906944L;
            } else {
                this.f248797e &= -274877906945L;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f248797e));
            bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f248797e);
            int i17 = N ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 98;
            p53Var.f464295e = i17;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgInteractionMgr", "switch ext change : onlyReminderMyInteraction = " + N + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMutualInteractionStatus", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("mutual_interact_switch_type", java.lang.Integer.valueOf(c21541x1c1b08fe.N() ? 1 : 0));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_mutual_interact_switch", "view_clk", hashMap, 33050);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goToSwitchMsgInteraction", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        super.onResume();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248796d).h("settings_mutual_interaction_switch");
        if (c21541x1c1b08fe != null) {
            boolean z17 = (this.f248797e & 274877906944L) != 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgInteractionMgr", "onResume only reminder my interaction:%s", java.lang.Boolean.valueOf(z17));
            c21541x1c1b08fe.O(z17);
            c21541x1c1b08fe.f279318v = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
    }
}

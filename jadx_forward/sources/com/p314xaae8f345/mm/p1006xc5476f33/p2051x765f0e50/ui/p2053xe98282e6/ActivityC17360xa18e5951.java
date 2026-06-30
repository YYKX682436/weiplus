package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6;

/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI */
/* loaded from: classes11.dex */
public class ActivityC17360xa18e5951 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f241591h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241592d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f241593e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f241594f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f241595g;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576425as;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f241592d = m79336x8b97809d();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fa6);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17401xed12d392 c17401xed12d392 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17401xed12d392) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241592d).h("fix_tools_micromsg_header");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(mo55332x76847179(), o45.wf.f424562g);
        if (o45.wf.f424566k) {
            a17 = a17 + " " + j65.v.b(this);
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        c17401xed12d392.L = a17;
        mo54448x9c8c0d33(new o14.b(this));
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241592d).m("fix_tools_chatroom_nickname", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241592d).m("fix_tools_setting_ringtone", true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q.equals("fix_tools_fts")) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f241593e;
            if (j0Var == null) {
                j0Var = db5.e1.H(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573658fa4), "", true, new o14.c(this), null);
                this.f241593e = j0Var;
            }
            j0Var.show();
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("fix_tools_websearch")) {
            if (this.f241594f == null) {
                this.f241594f = db5.e1.H(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fak), "", true, new o14.d(this), null);
            }
            this.f241594f.show();
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("fix_tools_topstory")) {
            if (this.f241595g == null) {
                this.f241595g = db5.e1.H(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fak), "", true, new o14.e(this), null);
            }
            this.f241595g.show();
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("fix_tools_trigger_build_message")) {
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Di(1);
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("fix_tools_setting_ringtone")) {
            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().getClass();
            java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(96, 1);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
            if (l0Var.f271219e) {
                l0Var.f271215a.d(c17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteResDbRecord resType:%s subType:%s", 96, 1);
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
            e4Var.f293309c = "已修复";
            e4Var.c();
            return true;
        }
        if (!c21560x1fce98fb.f279313q.equals("fix_tools_chatroom_nickname")) {
            return false;
        }
        o13.p.e(30);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0l));
        intent.putExtra("key_confirm_menu_name", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 82);
        intent.putExtra("max_limit_num", 1);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = this;
        cVar.d(intent);
        cVar.a("com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22425xfe2690a6.class);
        cVar.i(new o14.C29240x2ca3e0());
        return false;
    }
}

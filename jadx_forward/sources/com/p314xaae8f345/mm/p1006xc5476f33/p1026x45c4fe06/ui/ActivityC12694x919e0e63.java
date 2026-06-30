package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI */
/* loaded from: classes8.dex */
public class ActivityC12694x919e0e63 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f171018d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f171019e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f171020f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f171021g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f171022h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f171023i = new java.util.ArrayList();

    public final java.lang.String V6(r45.ie0 ie0Var) {
        java.lang.String str = ie0Var.f458495e;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = ie0Var.f458494d;
        return str + (str2 != null ? str2 : "");
    }

    public final void W6(r45.ie0 ie0Var, r45.g27 g27Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.je7();
        lVar.f152198b = new r45.ke7();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp_modvoipdeviceauth";
        lVar.f152200d = 2522;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        r45.je7 je7Var = new r45.je7();
        je7Var.f459302d = this.f171019e;
        if (ie0Var != null) {
            java.lang.String str = ie0Var.f458494d;
            je7Var.f459303e = str;
            java.lang.String str2 = ie0Var.f458495e;
            je7Var.f459304f = str2;
            int i17 = ie0Var.f458497g;
            je7Var.f459305g = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "modifyAuthVoipDevice model_id:%s, name:%s, sn:%s, status:%d", str, ie0Var.f458496f, str2, java.lang.Integer.valueOf(i17));
        }
        if (g27Var != null) {
            java.lang.String str3 = g27Var.f456376d;
            je7Var.f459306h = str3;
            int i18 = g27Var.f456379g;
            je7Var.f459307i = i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "modifyAuthVoipDevice template_id:%s, name:%s, status:%d", str3, g27Var.f456377e, java.lang.Integer.valueOf(i18));
        }
        lVar.f152197a = je7Var;
        com.p314xaae8f345.mm.p944x882e457a.z2.e(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wb(this), true, this);
    }

    public final void X6(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "reportOperate opType:%d, templateId:%s, sessionId:%s, enterSource:%d", java.lang.Integer.valueOf(i17), str, this.f171020f, java.lang.Integer.valueOf(this.f171021g));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7042x2f2641d3 c7042x2f2641d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7042x2f2641d3();
        c7042x2f2641d3.f143594f = this.f171021g;
        c7042x2f2641d3.f143593e = c7042x2f2641d3.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f171020f, true);
        c7042x2f2641d3.f143592d = c7042x2f2641d3.b("pageId", "" + hashCode(), true);
        c7042x2f2641d3.f143595g = (long) i17;
        c7042x2f2641d3.f143596h = c7042x2f2641d3.b("templateId", str, true);
        c7042x2f2641d3.k();
    }

    public final void Y6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f171018d = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).t();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
        c21560x1fce98fb.f279318v = false;
        c21560x1fce98fb.C("key_voip_auth_tips");
        c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569543ec;
        c21560x1fce98fb.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n89));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f171018d).d(c21560x1fce98fb, -1);
        java.util.Iterator it = this.f171022h.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            r45.ie0 ie0Var = (r45.ie0) it.next();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(this);
            c21541x1c1b08fe.f279318v = false;
            c21541x1c1b08fe.C(V6(ie0Var));
            c21541x1c1b08fe.L(ie0Var.f458496f);
            if (ie0Var.f458497g != 1) {
                z17 = false;
            }
            c21541x1c1b08fe.L = z17;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f171018d).d(c21541x1c1b08fe, -1);
        }
        java.util.Iterator it6 = this.f171023i.iterator();
        while (it6.hasNext()) {
            r45.g27 g27Var = (r45.g27) it6.next();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(this);
            c21541x1c1b08fe2.f279318v = false;
            c21541x1c1b08fe2.C(g27Var.f456376d);
            c21541x1c1b08fe2.L(g27Var.f456377e);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27Var.f456378f)) {
                c21541x1c1b08fe2.H(g27Var.f456378f);
            }
            c21541x1c1b08fe2.L = g27Var.f456379g == 1;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f171018d).d(c21541x1c1b08fe2, -1);
        }
        if (!this.f171023i.isEmpty()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            c21560x1fce98fb2.f279318v = false;
            c21560x1fce98fb2.C("key_check_voip_record");
            c21560x1fce98fb2.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.dyq;
            c21560x1fce98fb2.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n88));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f171018d).d(c21560x1fce98fb2, -1);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f171018d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576364d;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        this.f171019e = getIntent().getStringExtra("key_appid");
        getIntent().getStringExtra("key_username");
        this.f171020f = getIntent().getStringExtra("key_session_id");
        this.f171021g = getIntent().getIntExtra("key_enter_source", 0);
        java.lang.String str = this.f171019e;
        ak1.e eVar = ak1.e.f87105a;
        if (str.equals(ak1.e.f87108d)) {
            this.f171022h = ak1.e.f87106b;
            this.f171023i = ak1.e.f87107c;
        } else {
            java.lang.String str2 = this.f171019e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "getAuthVoipDeviceList appId:%s", str2);
            eVar.a(str2, this, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xb(this));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vb(this));
        if (getIntent() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("key_title"))) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a5k);
        } else {
            mo54450xbf7c1df6(getIntent().getStringExtra("key_title"));
        }
        Y6();
        X6(0, "");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        r45.ie0 ie0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "click key :%s", c21560x1fce98fb.f279313q);
        java.util.Iterator it = this.f171022h.iterator();
        do {
            if (!it.hasNext()) {
                java.util.Iterator it6 = this.f171023i.iterator();
                while (it6.hasNext()) {
                    r45.g27 g27Var = (r45.g27) it6.next();
                    if (g27Var.f456376d.equals(c21560x1fce98fb.f279313q)) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                        g27Var.f456379g = c21541x1c1b08fe.N() ? 1 : 0;
                        W6(null, g27Var);
                        X6(c21541x1c1b08fe.N() ? 1 : 2, g27Var.f456376d);
                        return true;
                    }
                }
                if (!"key_check_voip_record".equals(c21560x1fce98fb.f279313q)) {
                    return false;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", "notifymessage");
                intent.putExtra("key_biz_half_screen_chat_style", true);
                intent.putExtra("key_template_history_msg", true);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_template_msg_id", "");
                intent.putExtra("key_template_msg_username", "notifymessage");
                intent.putExtra("key_is_service_voip_template_msg", true);
                j45.l.u(this, "com.tencent.mm.ui.chatting.BizHalfScreenChattingUI", intent, null);
                X6(3, "");
                return false;
            }
            ie0Var = (r45.ie0) it.next();
        } while (!V6(ie0Var).equals(c21560x1fce98fb.f279313q));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
        ie0Var.f458497g = c21541x1c1b08fe2.N() ? 1 : 0;
        W6(ie0Var, null);
        X6(c21541x1c1b08fe2.N() ? 1 : 2, ie0Var.f458494d);
        return true;
    }
}

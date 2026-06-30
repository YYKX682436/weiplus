package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsAdLBSAuthManagerUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI */
/* loaded from: classes4.dex */
public final class ActivityC18003xecfa9537 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: e, reason: collision with root package name */
    public int f248208e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f248207d = "SnsAdLBSAuthManagerUI";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f248209f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f248210g = "";

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResourceId", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        return com.p314xaae8f345.mm.R.xml.f576491co;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.j7o);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sa(this));
        this.f248208e = getIntent().getIntExtra("sns_landig_pages_from_source", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("sns_landing_pages_rawSnsId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f248209f = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("sns_landing_pages_ux_info");
        this.f248210g = stringExtra2 != null ? stringExtra2 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", this.f248209f);
        jSONObject.put("uxinfo", this.f248210g);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f248208e);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("action", "exposed");
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("location_ad_auth_ui_report", jSONObject3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        java.lang.String str = c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        if (rVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f248207d, "onPreferenceTreeClick() called with: screen = " + rVar + ", pref = " + c21560x1fce98fb);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "sns_ad_can_request_lbs")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("sns_ad_can_request_lbs");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
            boolean N = c21541x1c1b08fe != null ? c21541x1c1b08fe.N() : false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_landing_page_key");
            if (M == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
                return false;
            }
            M.putBoolean("canRequestLBS", N);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", this.f248209f);
            jSONObject.put("uxinfo", this.f248210g);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f248208e);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("action", N ? "click_to_enable" : "click_to_disable");
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "lbs_auth");
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("location_ad_auth_ui_report", jSONObject3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return true;
        }
        if (!str.equals("sns_ad_can_auto_fill_data")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("sns_ad_can_auto_fill_data");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18 : null;
        boolean N2 = c21541x1c1b08fe2 != null ? c21541x1c1b08fe2.N() : false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_landing_page_key");
        if (M2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return false;
        }
        M2.putBoolean("canAutoFillData", N2);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put("snsid", this.f248209f);
        jSONObject4.put("uxinfo", this.f248210g);
        jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f248208e);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        jSONObject5.put("action", N2 ? "click_to_enable" : "click_to_disable");
        jSONObject5.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "auto_fill");
        jSONObject4.put("extInfo", jSONObject5);
        java.lang.String jSONObject6 = jSONObject4.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
        ca4.m0.a("location_ad_auth_ui_report", jSONObject6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
        super.onResume();
        java.lang.String str = this.f248207d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onResume() called");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
            return;
        }
        boolean z17 = M.getBoolean("canRequestLBS", false);
        boolean z18 = M.getBoolean("canAutoFillData", false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = m79336x8b97809d != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("sns_ad_can_request_lbs") : null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(z17);
        }
        java.lang.Object h18 = m79336x8b97809d != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("sns_ad_can_auto_fill_data") : null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18 : null;
        if (c21541x1c1b08fe2 != null) {
            c21541x1c1b08fe2.O(z18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init data canAutoFillData= " + z18 + " canRequestLBS= " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdLBSAuthManagerUI");
    }
}

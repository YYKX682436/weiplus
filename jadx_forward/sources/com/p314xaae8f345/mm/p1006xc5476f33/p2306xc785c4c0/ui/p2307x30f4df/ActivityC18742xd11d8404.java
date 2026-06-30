package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI */
/* loaded from: classes11.dex */
public class ActivityC18742xd11d8404 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f256423p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f256424d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f256425e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f256426f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f256427g;

    /* renamed from: h, reason: collision with root package name */
    public int f256428h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f256429i = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f256430m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f256431n = true;

    /* renamed from: o, reason: collision with root package name */
    public final mf0.g0 f256432o = (mf0.g0) i95.n0.c(mf0.g0.class);

    public final boolean V6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "goDetailSettingUI, type:%s", java.lang.Integer.valueOf(i17));
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1) {
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(rm4.c.b().f478976e, ",");
            intent.putExtra("k_topstory_type", 1);
            intent.putExtra("k_topstory_user_list", c17);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(rm4.c.b().f478975d, ",");
            intent.putExtra("k_topstory_type", 2);
            intent.putExtra("k_topstory_user_list", c18);
            intent.setClassName(this, "com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/topstory/ui/home/TopStorySettingUI", "goDetailPrivacySettingUI", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    public final boolean W6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "goDetailSettingUI, type:%s", java.lang.Integer.valueOf(i17));
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1) {
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(rm4.c.b().f478976e, ",");
            intent.putExtra("k_topstory_type", 1);
            intent.putExtra("k_topstory_user_list", c17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.i(this, ".ui.home.TopStorySettingVisibilityDetailUI", intent);
        } else {
            java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(rm4.c.b().f478975d, ",");
            intent.putExtra("k_topstory_type", 2);
            intent.putExtra("k_topstory_user_list", c18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.i(this, ".ui.home.TopStorySettingVisibilityDetailUI", intent);
        }
        return true;
    }

    public final void X6() {
        this.f256429i = rm4.c.b().f478975d.size();
        this.f256428h = rm4.c.b().f478976e.size();
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "updateSummary %s, %s", java.lang.Integer.valueOf(this.f256428h), java.lang.Integer.valueOf(this.f256429i));
        if (this.f256428h <= 0) {
            this.f256425e.H("");
        } else {
            this.f256425e.H("" + this.f256428h);
        }
        if (this.f256429i <= 0) {
            this.f256426f.H("");
        } else {
            this.f256426f.H("" + this.f256429i);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return ((lf0.h0) this.f256432o).Ai() ? com.p314xaae8f345.mm.R.xml.f576497dq : com.p314xaae8f345.mm.R.xml.f576496ct;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("setting_mode");
        if (stringExtra == null) {
            stringExtra = "normal";
        }
        boolean equals = "heartLike".equals(stringExtra);
        mf0.f0 f0Var = mf0.f0.Medium;
        if (equals) {
            mo56583xbf7c1df6(((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).wi(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.omw), "#", getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b), f0Var, getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
        } else {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0w));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.f1(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f256424d = m79336x8b97809d;
        this.f256425e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("unlike");
        this.f256426f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).h("black");
        if (((lf0.h0) this.f256432o).Ai()) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r);
            int color = getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            this.f256425e.L(((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).wi(this, this.f256425e.f279307h.toString(), "#", dimensionPixelSize, f0Var, color));
            this.f256426f.L(((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).wi(this, this.f256426f.f279307h.toString(), "#", dimensionPixelSize, f0Var, color));
        }
        this.f256430m = getIntent().getBooleanExtra("intent_status_from_privacy_to_tophistory_setting", false);
        rm4.c b17 = rm4.c.b();
        b17.e(b17.f478977f, 0);
        rm4.c b18 = rm4.c.b();
        b18.f(b18.f478978g, 0);
        X6();
        Y6();
        rm4.c.b().f478983o = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.g1(this);
        rm4.c.b().f478984p = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.h1(this);
        if (this.f256430m) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("feedback", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("not_be_seen_desc", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("unlike_desc", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("unlike_empty", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("black_empty", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("settings_top_story_setting_recommend", true);
        }
        if ("heartLike".equals(stringExtra)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("feedback", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).m("settings_top_story_setting_recommend", true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256424d).h("settings_top_story_setting_recommend");
        this.f256427g = c21541x1c1b08fe;
        if (this.f256430m || c21541x1c1b08fe == null) {
            return;
        }
        this.f256427g.S(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("TopStorySettingUI_settings_top_story_recommend", true));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "onCreate, KEY_TOP_STORY_RECOMMEND = " + this.f256427g.N());
        this.f256431n = this.f256427g.N();
        om4.u uVar = new om4.u(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.i1(this));
        synchronized (om4.w.class) {
            om4.e eVar = new om4.e(this, 0, uVar);
            eVar.f427950g = true;
            eVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rm4.c.b().f478984p = null;
        rm4.c.b().f478983o = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if ("unlike".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17080, 1, 2, "" + this.f256428h);
            return this.f256430m ? V6(1) : W6(1);
        }
        if ("black".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17080, 2, 2, "" + this.f256429i);
            return this.f256430m ? V6(2) : W6(2);
        }
        if ("settings_top_story_setting_recommend".equals(str)) {
            boolean z17 = !((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_top_story_setting_recommend")).N();
            this.f256431n = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "onPreferenceTreeClick, lastRecommendSwithIsChecked = %s, isCheck = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(!this.f256431n));
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f256427g;
            if (c21541x1c1b08fe == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "doRecommandStateAction, checkBoxRcmPreference checkBoxRcmPreference, lastRecommendSwithIsChecked = " + this.f256431n);
            } else {
                int i17 = c21541x1c1b08fe.N() ? 2 : 1;
                om4.u uVar = new om4.u(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.e1(this));
                synchronized (om4.w.class) {
                    om4.e eVar = new om4.e(this, i17, uVar);
                    eVar.f427950g = true;
                    eVar.a();
                }
            }
        } else if ("feedback".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17080, 18, 2, "0");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index");
            try {
                sb6.append("&deviceName=");
                sb6.append(fp.s0.b(o45.wf.f424559d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.lang.Exception unused) {
            }
            sb6.append("&imei=");
            try {
                sb6.append("&deviceBrand=");
                sb6.append(fp.s0.b(android.os.Build.BRAND, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.lang.Exception unused2) {
            }
            try {
                sb6.append("&deviceModel=");
                sb6.append(fp.s0.b(wo.w0.m(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.lang.Exception unused3) {
            }
            sb6.append("&from=settingPage&uin=");
            sb6.append(gm0.j1.b().j());
            sb6.append("&version=");
            sb6.append(o45.wf.f424562g);
            sb6.append("&rev=");
            sb6.append(java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e).trim());
            try {
                sb6.append("&lang=");
                sb6.append(fp.s0.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.lang.Exception unused4) {
            }
            try {
                sb6.append("&ostype=");
                sb6.append(fp.s0.b(wo.q.f529317e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.lang.Exception unused5) {
            }
            sb6.append("&scene=32&timeZone=");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0());
            sb6.append("&templateVersion=");
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1));
            sb6.append("#/list/4155");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "url is:" + sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", sb6.toString());
            intent.putExtra("convertActivityFromTranslucent", false);
            intent.putExtra("customize_status_bar_color", 0);
            intent.putExtra("status_bar_style", (java.lang.String) null);
            intent.putExtra("prePublishId", "wes##2##1");
            intent.putExtra("KPublisherId", "wes##2##1");
            intent.putExtra("preChatTYPE", 10);
            j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        Y6();
    }
}

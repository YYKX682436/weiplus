package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView */
/* loaded from: classes4.dex */
public class C17821xa501ffb5 extends android.widget.FrameLayout implements p012xc85e97e9.p093xedfae76a.x {
    public static final /* synthetic */ int C = 0;
    public final q44.a A;
    public e94.v B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17822xa8f63df8 f245449d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f245450e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f245451f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f245452g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f245453h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r f245454i;

    /* renamed from: m, reason: collision with root package name */
    public q44.g f245455m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.AnimatorSet f245456n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f245457o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f245458p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f245459q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f245460r;

    /* renamed from: s, reason: collision with root package name */
    public int f245461s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f245462t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f245463u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f245464v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f245465w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f245466x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f245467y;

    /* renamed from: z, reason: collision with root package name */
    public float f245468z;

    public C17821xa501ffb5(android.content.Context context) {
        super(context);
        this.f245457o = false;
        this.f245458p = false;
        this.f245459q = false;
        this.f245460r = false;
        this.f245462t = true;
        this.f245463u = false;
        this.f245464v = false;
        this.f245465w = false;
        this.f245466x = false;
        this.f245467y = new e94.r(this);
        this.f245468z = 0.0f;
        this.A = new e94.t(this);
        c(context);
    }

    public static void g(ab4.n0 n0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (n0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView_report", "reportGetTwistIdResult, landingPageData==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        java.lang.String j17 = n0Var.j();
        java.lang.String o17 = n0Var.o();
        int l17 = n0Var.l();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (j17 == null) {
                j17 = "";
            }
            jSONObject.put("snsid", j17);
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_twistad_canvas_get_twist_cardId_result", jSONObject3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView_report", "reportGetTwistIdResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView_report", "reportGetTwistIdResult exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetTwistIdResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f245459q = false;
        this.f245454i = null;
        this.f245453h = null;
        this.f245468z = 0.0f;
        this.f245461s = -1;
        m69703xc4a52ce5(false);
        b();
        this.f245467y.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (!this.f245458p) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        this.f245458p = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "hide");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f245456n != null) {
            this.f245467y.removeMessages(4);
            this.f245456n.removeAllListeners();
            this.f245456n.end();
            this.f245456n.setTarget(null);
            this.f245456n = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.addListener(new e94.s(this));
        ofFloat.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqi, (android.view.ViewGroup) this, true);
        this.f245449d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17822xa8f63df8) findViewById(com.p314xaae8f345.mm.R.id.f569012or4);
        this.f245450e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567831ku4);
        this.f245451f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odh);
        this.f245452g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cuv);
        ca4.m0.y0(this.f245451f, com.p314xaae8f345.mm.R.C30860x5b28f31.f562137aa3);
        ca4.m0.y0(this.f245452g, com.p314xaae8f345.mm.R.C30860x5b28f31.f562136aa2);
        setBackgroundColor(android.graphics.Color.parseColor("#CC000000"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4().a(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        q44.g gVar = this.f245455m;
        boolean z17 = false;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "isSensorEnabled, sensorMgr==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return false;
        }
        gVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        q44.b bVar = gVar.f441652a;
        if (bVar != null) {
            z17 = bVar.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        return z17;
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTwistActionSucc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        e94.v vVar = this.B;
        if (vVar != null && !this.f245457o) {
            fd4.s sVar = (fd4.s) vVar;
            sVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            fd4.t tVar = sVar.f342868a;
            tVar.f342822f.T.f506665b = true;
            if (tVar.f342825i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistAdBusiness", "onTwist, mSnsInfo==null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("ad_no_click_anim", true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r rVar = tVar.f342825i.m70354x74235b3e().f38216x44a94f92;
                if (rVar != null) {
                    bundle.putBoolean("isSimpleTwistAnim", rVar.f247648o);
                    bundle.putBoolean("isTwistClockwise", rVar.f247645i);
                    if (rVar.f247648o) {
                        ca4.z0.I0(new long[]{0, 80});
                    }
                }
                tVar.r(bundle);
                tVar.l();
                tVar.k(29);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTwist", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness$1");
            }
            this.f245457o = true;
        }
        this.f245465w = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTwistActionSucc", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f245467y.removeMessages(4);
        android.animation.AnimatorSet animatorSet = this.f245456n;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f245456n.pause();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void h(int i17, boolean z17, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f245453h;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView_report", "reportTwistActionResult, snsInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        java.lang.String m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7();
        int i18 = this.f245461s;
        if (android.text.TextUtils.isEmpty(t07)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView_report", "reportTwistActionResult, snsId==null, source=" + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        if (android.text.TextUtils.isEmpty(t07)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView_report", "reportTwistActionResult, snsId==null, source=" + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", t07);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            jSONObject.put("uxinfo", m70375x338a8cc7);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i18);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject2.put("triggerByAcceleration", z17 ? 1 : 0);
            jSONObject2.put("failedMaxDegree", java.lang.Math.round(f17));
            if (!this.f245466x) {
                jSONObject2.put("sensorDisable", 1);
            }
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_twistad_twist_result", jSONObject3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView_report", "reportTwistActionResult, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView_report", "reportTwistActionResult exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTwistActionResult", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTwistAngle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetTwistAngle, sensorMgr==null?");
        sb6.append(this.f245455m == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", sb6.toString());
        q44.g gVar = this.f245455m;
        if (gVar != null) {
            gVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            q44.b bVar = gVar.f441652a;
            if (bVar != null) {
                bVar.mo159512x6761d4f();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17822xa8f63df8 c17822xa8f63df8 = this.f245449d;
        c17822xa8f63df8.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetWithAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new e94.x(c17822xa8f63df8));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetWithAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView");
        this.f245457o = false;
        this.f245468z = 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTwistAngle", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f245467y.removeMessages(4);
        android.animation.AnimatorSet animatorSet = this.f245456n;
        if (animatorSet != null) {
            animatorSet.isPaused();
        }
        android.animation.AnimatorSet animatorSet2 = this.f245456n;
        if (animatorSet2 != null && !this.f245460r) {
            if (animatorSet2.isPaused()) {
                this.f245456n.resume();
            } else {
                k();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.f245467y.removeMessages(4);
        android.animation.AnimatorSet animatorSet = this.f245456n;
        if (animatorSet != null && !animatorSet.isRunning()) {
            this.f245456n.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "onDetachedFromWindow");
        if (this.f245464v && !this.f245465w) {
            h(2, false, this.f245468z);
        }
        a();
        this.f245462t = true;
        this.f245463u = false;
        this.f245465w = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        super.onStartTemporaryDetach();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onUIPause */
    public void m69701xfe061103() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f245454i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "onUIPause");
        this.f245460r = true;
        m69703xc4a52ce5(false);
        if (this.f245458p) {
            f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onUIResume */
    public void m69702xc65d3ec0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f245454i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "onUIResume, isTwistActionCalled=" + this.f245457o);
        this.f245460r = false;
        if (this.f245457o && getVisibility() == 0) {
            j();
        }
        i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: setSensorEnabled */
    public void m69703xc4a52ce5(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (this.f245454i == null && z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        if ((this.f245459q || this.f245460r) && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView", "setSensorEnabled to true when isUIPaused=" + this.f245460r + ", isPlayerPaused=" + this.f245459q);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSensorEnabled, enabled=");
        sb6.append(z17);
        sb6.append(", sensorMgr==null?");
        sb6.append(this.f245455m == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", sb6.toString());
        q44.g gVar = this.f245455m;
        if (gVar != null) {
            gVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
            q44.b bVar = gVar.f441652a;
            if (bVar != null) {
                bVar.mo159513x514e147f(z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistSensorManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorEnabled", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    /* renamed from: setTwistActionListener */
    public void m69704x72b6c04f(e94.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTwistActionListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        this.B = vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTwistActionListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
    }

    public C17821xa501ffb5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245457o = false;
        this.f245458p = false;
        this.f245459q = false;
        this.f245460r = false;
        this.f245462t = true;
        this.f245463u = false;
        this.f245464v = false;
        this.f245465w = false;
        this.f245466x = false;
        this.f245467y = new e94.r(this);
        this.f245468z = 0.0f;
        this.A = new e94.t(this);
        c(context);
    }
}

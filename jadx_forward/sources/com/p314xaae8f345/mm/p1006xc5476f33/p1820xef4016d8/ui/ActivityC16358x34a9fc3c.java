package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI */
/* loaded from: classes9.dex */
public class ActivityC16358x34a9fc3c extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f227508u = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f227509g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f227510h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227511i;

    /* renamed from: m, reason: collision with root package name */
    public int f227512m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f227513n;

    /* renamed from: o, reason: collision with root package name */
    public cc3.b f227514o;

    /* renamed from: p, reason: collision with root package name */
    public int f227515p;

    /* renamed from: q, reason: collision with root package name */
    public int f227516q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f227517r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f227518s;

    /* renamed from: t, reason: collision with root package name */
    public int f227519t;

    public final void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q6 a18;
        r45.wv3 wv3Var;
        boolean booleanExtra = getIntent().getBooleanExtra("key_has_story", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "try fetch story info : %s", java.lang.Boolean.valueOf(booleanExtra));
        if (!booleanExtra) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "no story, don't fetch data");
            W6(false);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_packet_id");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (a17 = gb3.l.a(this.f227510h)) != null && (a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q6.a(a17.T)) != null && (wv3Var = a18.f227098b) != null) {
            stringExtra = wv3Var.f471033f;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "no packet id");
            W6(false);
            return;
        }
        dc3.a aVar = new dc3.a();
        aVar.f68306x645a32d = stringExtra;
        boolean z17 = hb3.o.Ni().Vi().get(aVar, new java.lang.String[0]);
        long j17 = aVar.f68310x499140be;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "has story info: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        if (java.lang.System.currentTimeMillis() - j17 > 86400000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyBeforeDetailUI", "need refetch story");
            z17 = false;
        }
        if (z17) {
            r45.nm5 t07 = dc3.a.t0(aVar);
            t07.f463036i.addAll(hb3.o.Ni().aj().y0(stringExtra));
            ((java.util.HashMap) gb3.l.f351551b).put(stringExtra, t07);
            W6(false);
            return;
        }
        if (this.f227509g == null) {
            this.f227509g = db5.e1.O(mo55332x76847179(), null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.m(this));
        }
        cc3.b bVar = new cc3.b();
        this.f227514o = bVar;
        bVar.f295418c = new cc3.a(stringExtra, true, this.f227513n);
        this.f227514o.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.n(this, stringExtra), true);
    }

    public final void W6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "go to detail ui");
        android.app.Dialog dialog = this.f227509g;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p(this);
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(pVar, 100L);
        } else {
            pVar.run();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p944x882e457a.m1 w5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var;
        super.onCreate(bundle);
        overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559400dq);
        com.p314xaae8f345.mm.ui.bk.p0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo67598xf0aced2e(8);
        this.f227510h = getIntent().getStringExtra("key_sendid");
        this.f227511i = getIntent().getStringExtra("key_receiveid");
        this.f227512m = getIntent().getIntExtra("scene_id", 0);
        getIntent().getStringExtra("key_username");
        this.f227513n = getIntent().getStringExtra("key_from_username");
        this.f227515p = getIntent().getIntExtra("key_hb_kind", 1);
        this.f227516q = getIntent().getIntExtra("key_from", 0);
        this.f227517r = getIntent().getStringExtra("key_live_id");
        this.f227518s = getIntent().getStringExtra("key_live_attach");
        this.f227519t = getIntent().getIntExtra("key_live_anchor_type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("key_native_url");
        int intExtra = getIntent().getIntExtra("key_jump_from", 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "[onCreate] mFromScene: %s ，mJumpFrom：%s ,mSendId:%s ", java.lang.Integer.valueOf(this.f227516q), java.lang.Integer.valueOf(intExtra), this.f227510h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "[onCreate] mNativeUrl : %s", stringExtra);
        if (intExtra == 2) {
            if (gb3.l.a(this.f227510h) != null) {
                V6();
                return;
            }
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_detail_info");
                if (byteArrayExtra != null && (e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1) new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1().mo11468x92b714fd(byteArrayExtra)) != null) {
                    gb3.l.b(this.f227510h, e1Var);
                    V6();
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyBeforeDetailUI", "Parse LuckyMoneyDetail fail!" + e17.getLocalizedMessage());
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f227510h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            try {
                this.f227510h = android.net.Uri.parse(stringExtra).getQueryParameter("sendid");
            } catch (java.lang.Exception unused) {
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f227510h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyBeforeDetailUI", "sendid null or nil, finish");
            finish();
            return;
        }
        java.lang.String str = this.f227510h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "get recordList");
        this.f227509g = db5.e1.O(mo55332x76847179(), null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.q(this));
        int i17 = this.f227512m;
        if (i17 != 0) {
            w5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.t(i17) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w5(str, 11, 0, stringExtra, "v1.0", "") : this.f227516q == 3 ? new yb3.d(str, 11, 0, stringExtra, "v1.0", "", this.f227517r, this.f227518s, this.f227519t) : new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(str, 11, 0, stringExtra, "v1.0", "", this.f227511i);
        } else {
            int i18 = this.f227515p;
            w5Var = i18 == 5 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w5(str, 11, 0, stringExtra, "v1.0", "") : (this.f227516q == 3 || i18 == 7) ? new yb3.d(str, 11, 0, stringExtra, "v1.0", "", this.f227517r, this.f227518s, this.f227519t) : new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(str, 11, 0, stringExtra, "v1.0", "", this.f227511i);
        }
        m66165x5406100e(w5Var, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.mo808xfb85f7b0());
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5)) {
            return false;
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            finish();
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) m1Var;
        gb3.l.b(this.f227510h, v5Var.f227198h);
        getIntent().putExtra("key_process_content", v5Var.f227199i);
        getIntent().putExtra("key_detail_emoji_md5", v5Var.f227200m);
        getIntent().putExtra("key_detail_emoji_type", v5Var.f227201n);
        getIntent().putExtra("key_emoji_switch", v5Var.f227202o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = v5Var.f227198h;
        if (e1Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.Q)) {
            this.f227513n = v5Var.f227198h.Q;
        }
        V6();
        return true;
    }
}

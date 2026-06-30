package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI */
/* loaded from: classes8.dex */
public class ActivityC18998x659d8488 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f259303d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f259304e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f259305f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f259306g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f259307h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f259308i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f259309m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f259310n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f259311o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f259312p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f259313q;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18998x659d8488 activityC18998x659d8488) {
        if (!activityC18998x659d8488.m83105x7498fe14().containsKey("key_realname_guide_helper")) {
            activityC18998x659d8488.m83108x2b5a5a39().o(activityC18998x659d8488, 0, activityC18998x659d8488.m83105x7498fe14());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1) activityC18998x659d8488.m83105x7498fe14().getParcelable("key_realname_guide_helper");
        if (c19088xa4b300c1 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "wallet");
            c19088xa4b300c1.a(activityC18998x659d8488, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.e(activityC18998x659d8488), null);
            activityC18998x659d8488.m83105x7498fe14().remove("key_realname_guide_helper");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569715js;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f259303d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.axk);
        this.f259304e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.axl);
        this.f259305f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.axm);
        this.f259303d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562421er);
        this.f259304e.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f259304e.setImageResource(com.p314xaae8f345.mm.R.raw.f80970xf648b976);
        this.f259305f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562422es);
        this.f259306g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axv);
        this.f259307h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axw);
        this.f259308i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axx);
        this.f259306g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kex);
        this.f259307h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kev);
        this.f259307h.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f259308i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kes);
        this.f259309m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axh);
        this.f259310n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axi);
        this.f259311o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axj);
        this.f259309m.setVisibility(8);
        this.f259310n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kem, new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm").format(new java.util.Date(this.f259313q.E))));
        this.f259310n.setVisibility(0);
        this.f259311o.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.axb);
        this.f259312p = linearLayout;
        linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562420eq);
        java.lang.String string = m83105x7498fe14().getString("key_fetch_result_show_info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.a a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.a.a(jSONArray.optJSONObject(i17));
                    if (a17 != null) {
                        arrayList.add(a17);
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletBalanceFetchResultUI", e17, "", new java.lang.Object[0]);
            }
        }
        arrayList.size();
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c c18997x8359ff6c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c((android.content.Context) this, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f259313q;
            c18997x8359ff6c.b(com.p314xaae8f345.mm.R.C30867xcad56011.kfg, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c19099x8d444f05.f261211h, c19099x8d444f05.f261214m));
            this.f259312p.addView(c18997x8359ff6c);
            if (this.f259313q.f261215n > 0.0d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c c18997x8359ff6c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c((android.content.Context) this, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = this.f259313q;
                c18997x8359ff6c2.b(com.p314xaae8f345.mm.R.C30867xcad56011.kfa, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c19099x8d444f052.f261215n, c19099x8d444f052.f261214m));
                this.f259312p.addView(c18997x8359ff6c2);
            }
            java.util.List list = this.f259313q.M;
            if (list != null && ((java.util.ArrayList) list).size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f259313q.M).get(0);
                java.lang.String str = commodity.f261248s;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(commodity.f261253x)) {
                    str = str + " " + getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvh) + commodity.f261253x;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c c18997x8359ff6c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c((android.content.Context) this, false);
                c18997x8359ff6c3.b(com.p314xaae8f345.mm.R.C30867xcad56011.kek, str);
                this.f259312p.addView(c18997x8359ff6c3);
            }
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.a) it.next();
                if (aVar.f261351b != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c c18997x8359ff6c4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c(this, aVar.f261350a != 3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo showInfo = aVar.f261351b;
                    c18997x8359ff6c4.c(showInfo.f261338d, showInfo.f261339e, showInfo.f261340f, showInfo.f261341g, aVar.f261350a == 3);
                    this.f259312p.addView(c18997x8359ff6c4);
                }
            }
        }
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.axe)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.d(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.axz);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.axc);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        android.view.View j17 = mo2533x106ab264().j();
        if (j17 != null) {
            android.view.View findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
            }
            android.view.View findViewById2 = j17.findViewById(android.R.id.text1);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            }
        }
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78513xc2a54588().setFitsSystemWindows(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
        this.f259313q = c19099x8d444f05;
        if (c19099x8d444f05 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBalanceFetchResultUI", "order is null!");
            finish();
        } else {
            mo43517x10010bd5();
            mo54450xbf7c1df6((java.lang.String) m83106x57340563().a(0));
            mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}

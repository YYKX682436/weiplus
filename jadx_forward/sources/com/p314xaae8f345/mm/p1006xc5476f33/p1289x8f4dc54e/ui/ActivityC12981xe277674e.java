package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI */
/* loaded from: classes9.dex */
public class ActivityC12981xe277674e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public or1.f1 f175555d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f175556e;

    /* renamed from: f, reason: collision with root package name */
    public int f175557f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f175558g;

    /* renamed from: h, reason: collision with root package name */
    public long f175559h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f175560i;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e activityC12981xe277674e, int i17) {
        java.lang.String str;
        qk.g d17;
        r45.co coVar = (r45.co) activityC12981xe277674e.f175555d.getItem(i17);
        if (coVar == null || (str = coVar.f453209d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "item is null.");
            return;
        }
        int i18 = activityC12981xe277674e.f175557f;
        if (i18 == 1) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = coVar.f453209d;
            ((sg3.a) v0Var).getClass();
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).wi(activityC12981xe277674e.f39322x2305be9, null, coVar.f453209d, activityC12981xe277674e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i28), c01.a2.b(str2), null, activityC12981xe277674e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new or1.z0(activityC12981xe277674e, coVar));
            return;
        }
        if (i18 == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", coVar.f453209d);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, activityC12981xe277674e);
            return;
        }
        if (i18 == 3) {
            java.util.HashMap hashMap = (java.util.HashMap) activityC12981xe277674e.getIntent().getSerializableExtra("enterprise_extra_params");
            java.lang.String str3 = (java.lang.String) hashMap.get("img_url");
            java.lang.String str4 = (java.lang.String) hashMap.get("desc");
            java.lang.String str5 = (java.lang.String) hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            java.lang.String str6 = coVar.f453209d;
            r35.u3 u3Var = r35.t3.f450796a;
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = activityC12981xe277674e.mo78514x143f1b92();
            java.lang.String string = activityC12981xe277674e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
            or1.a1 a1Var = new or1.a1(activityC12981xe277674e, str6);
            ((ez.z0) u3Var).getClass();
            r35.j1.j(mo78514x143f1b92, str5, str3, str4, null, false, string, a1Var);
            return;
        }
        if (i18 == 4) {
            qk.o b17 = r01.z.b(str);
            java.lang.String str7 = null;
            if (b17 != null) {
                b17.A0();
                qk.n nVar = b17.f445834x1;
                if (nVar != null && (d17 = nVar.d()) != null) {
                    str7 = d17.f445652d;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                return;
            }
            r01.m y07 = r01.q3.bj().y0(b17.y0());
            int i19 = y07 != null ? y07.f66038x29b98d8d : 0;
            int i27 = y07 != null ? y07.f66045x6bcd764a : 0;
            r01.m y08 = r01.q3.bj().y0(b17.f66748xdec927b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13419, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(y08 != null ? y08.f66038x29b98d8d : 0), java.lang.Integer.valueOf(i27), 1);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str7);
            intent2.putExtra("useJs", true);
            intent2.putExtra("srcUsername", coVar.f453209d);
            intent2.putExtra("enterprise_biz_name", activityC12981xe277674e.f175558g);
            intent2.putExtra("biz_chat_chat_id", activityC12981xe277674e.f175559h);
            j45.l.n(activityC12981xe277674e.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent2, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570275a93;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f175556e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f565766dh2);
        if (this.f175555d == null) {
            this.f175555d = new or1.f1(this, this);
            this.f175560i = new or1.w0(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "count = %s", java.lang.Integer.valueOf(this.f175555d.getCount()));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f175558g, true);
        if (this.f175557f == 2) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c1_);
        } else if (n17 != null) {
            mo54450xbf7c1df6(n17.f2());
        }
        if (n17 == null || !n17.r2() || this.f175555d.getCount() <= 0) {
            this.f175556e.setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565767dh3);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c1g);
            textView.setVisibility(0);
        } else {
            this.f175556e.setVisibility(0);
            this.f175556e.setAdapter((android.widget.ListAdapter) this.f175555d);
            this.f175556e.setOnItemClickListener(this.f175560i);
        }
        mo54448x9c8c0d33(new or1.x0(this));
        m78597x53c22598(new or1.y0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (this.f175557f == 4) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f175557f = getIntent().getIntExtra("enterprise_scene", 2);
        this.f175558g = getIntent().getStringExtra("enterprise_biz_name");
        this.f175559h = getIntent().getLongExtra("biz_chat_chat_id", -1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "bizName = %s", this.f175558g);
        mo43517x10010bd5();
        r01.q3.cj().add(this.f175555d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f175555d);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        r01.q3.cj().mo49775xc84af884(this.f175555d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f175555d);
        this.f175555d.c();
        or1.f1 f1Var = this.f175555d;
        bb5.g gVar = f1Var.f429024p;
        if (gVar != null) {
            gVar.a();
            f1Var.f429024p = null;
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (c01.e2.J(this.f175558g)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "%s !isContact", this.f175558g);
        finish();
    }
}

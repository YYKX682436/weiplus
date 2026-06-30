package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect */
/* loaded from: classes9.dex */
public class ActivityC17143x1f122c1e extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f239089d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f239090e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78596x71afbec8(8);
        this.f239090e = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f239089d = getIntent().getStringExtra("receiver_name");
        int i17 = this.f239090e;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceOSRedirect", "error scene: %s", java.lang.Integer.valueOf(i17));
            finish();
        } else if (i17 == 5) {
            this.f39904x9eeebfc.c(1574);
            m83098x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i1(c01.z1.m()));
        } else if (i17 == 6) {
            this.f39904x9eeebfc.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
            m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a0(this.f239089d), true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i17 = this.f239090e;
        if (i17 == 5) {
            m83121xf6ff5b27(1574);
        } else if (i17 == 6) {
            m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, np5.f
    /* renamed from: onSceneEnd */
    public void mo66167x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i1) m1Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceOSRedirect", "indexScene  %s", i1Var.f238390g);
                android.content.Intent intent = getIntent();
                if (i1Var.f238389f == 1) {
                    h45.a0.i(this, 2, this.f239089d, 11, null);
                } else {
                    intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17144x715a1c36.class);
                    intent.putExtra("os_currency", i1Var.f238389f);
                    intent.putExtra("os_currencyuint", i1Var.f238390g);
                    intent.putExtra("os_currencywording", i1Var.f238391h);
                    intent.putExtra("os_notice", i1Var.f238392i);
                    intent.putExtra("os_notice_url", i1Var.f238393m);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                finish();
                return;
            }
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a0) m1Var;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17136x7156cf95.class);
                this.f239089d = a0Var.f238307f;
                intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f239090e);
                intent2.putExtra("fee", a0Var.f238311m / 100.0d);
                intent2.putExtra("desc", a0Var.f238310i);
                intent2.putExtra("scan_remittance_id", a0Var.f238315q);
                intent2.putExtra("receiver_name", a0Var.f238307f);
                intent2.putExtra("receiver_true_name", a0Var.f238308g);
                intent2.putExtra("receiver_nick_name", a0Var.f238309h);
                intent2.putExtra("hk_currency", a0Var.f238313o);
                intent2.putExtra("hk_currencyuint", a0Var.f238314p);
                intent2.putExtra("hk_notice", a0Var.f238316r);
                intent2.putExtra("hk_notice_url", a0Var.f238317s);
                intent2.putExtra("recv_headimgurl", a0Var.f238318t);
                int i19 = a0Var.f238312n;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceOSRedirect", "setAmount: %d", java.lang.Integer.valueOf(i19));
                intent2.putExtra("pay_scene", i19 == 1 ? 33 : 32);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                return;
            }
            return;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceOSRedirect", "indexScene  errMsg %s", str);
            db5.e1.t(this, str, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e7(this));
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a0) {
            db5.e1.t(this, str, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f7(this));
        }
    }
}

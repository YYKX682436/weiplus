package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI */
/* loaded from: classes13.dex */
public class ActivityC13476xfb15ef0e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f180862f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f180863d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q5 f180864e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a_a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f180863d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a_c, null);
        android.view.View inflate2 = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a_b, null);
        this.f180863d.addHeaderView(inflate, null, false);
        this.f180863d.addFooterView(inflate2, null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q5();
        this.f180864e = q5Var;
        this.f180863d.setAdapter((android.widget.ListAdapter) q5Var);
        ((android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcq)).scrollTo(0, 0);
        inflate2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5 o5Var;
        if (i17 == 1 && i18 == -1 && intent != null) {
            long longExtra = intent.getLongExtra("device_mac", 0L);
            intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0, 0);
            if (longExtra == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankDataSourceUI", "onActivityResult, mac is nil.");
                return;
            }
            java.lang.String f17 = a42.i.f(longExtra);
            if (f17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankDataSourceUI", "invalid mac(%s).", f17);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q5 q5Var = this.f180864e;
            synchronized (q5Var) {
                o5Var = null;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5 o5Var2 : q5Var.f181164d) {
                        o5Var2.getClass();
                        if (f17.equals(null)) {
                            break;
                        }
                    }
                }
                o5Var2 = null;
            }
            if (o5Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
                return;
            }
            v32.b W0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().W0(longExtra);
            if (W0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankDataSourceUI", "hard device info is null.(mac : %s)", java.lang.Long.valueOf(longExtra));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q5 q5Var2 = this.f180864e;
            java.lang.String str = W0.f66606x5fdff396;
            java.lang.String str2 = W0.f66607xe7b73b15;
            synchronized (q5Var2) {
                java.util.Iterator it = q5Var2.f181164d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5 o5Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5) it.next();
                    if (o5Var3 != null) {
                        r45.rw6 rw6Var = o5Var3.f181140a;
                        if ((rw6Var == null || str == null || str2 == null || !str.equals(rw6Var.f466780d) || !str2.equals(rw6Var.f466781e)) ? false : true) {
                            o5Var = o5Var3;
                            break;
                        }
                    }
                }
            }
            if (o5Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
            } else {
                gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.m1.f34628x366c91de, this);
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.i2());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.l5(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bgi);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.m1.f34628x366c91de, this);
        mo43517x10010bd5();
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.i2());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.m1.f34628x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankDataSourceUI", "onSceneEnd, scene is null.");
            return;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.i2) {
            gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.m1.f34628x366c91de, this);
            if (i17 == 0 && i18 == 0) {
                r45.ko3 ko3Var = (r45.ko3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.i2) m1Var).f180454e.f152244b.f152233a;
                java.util.LinkedList linkedList = ko3Var.f460409d;
                if (linkedList != null) {
                    linkedList.size();
                }
                runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n5(this, ko3Var.f460409d));
            }
        }
    }
}

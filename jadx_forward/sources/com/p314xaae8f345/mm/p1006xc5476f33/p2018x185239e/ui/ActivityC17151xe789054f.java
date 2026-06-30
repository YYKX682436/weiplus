package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultUI */
/* loaded from: classes9.dex */
public class ActivityC17151xe789054f extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f239127d;

    public boolean U6() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379);
    }

    public final void V6(java.lang.Class cls) {
        if (m83108x2b5a5a39() == null) {
            m78604xa4df9991((java.lang.Class<?>) cls, getIntent());
        } else {
            m83108x2b5a5a39().B(this, cls, m83105x7498fe14());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (U6()) {
            mo67598xf0aced2e(4);
            getWindow().setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            this.f239127d = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
            int i17 = c19760x34448d56 != null ? c19760x34448d56.f273642e : 0;
            boolean z17 = (i17 == 31 || i17 == 5) ? false : true;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(this.f239127d == null);
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Boolean.valueOf(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultUI", "orders==null:%s, paysScene: %s, needFetchF2fData: %s", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f239127d;
            if (c19099x8d444f05 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultUI", "is_use_new_paid_succ_page: %s", java.lang.Integer.valueOf(c19099x8d444f05.V));
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = this.f239127d;
                if (c19099x8d444f052.V != 1) {
                    V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17150x1fda240.class);
                } else if (!z17) {
                    V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.class);
                    finish();
                } else if (c19760x34448d56 == null || c19760x34448d56.f273655u == null) {
                    V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.class);
                    finish();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultUI", "fetch f2f data");
                    java.lang.String string = c19760x34448d56.f273655u.getString("extinfo_key_11");
                    java.lang.String str = (c19099x8d444f052 == null || ((java.util.ArrayList) c19099x8d444f052.M).size() <= 0) ? "" : ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) c19099x8d444f052.M).get(0)).f261247r;
                    int i18 = c19760x34448d56.f273655u.getInt("extinfo_key_15", 0);
                    java.lang.String string2 = c19760x34448d56.f273655u.getString("extinfo_key_7");
                    java.lang.String string3 = c19760x34448d56.f273655u.getString("extinfo_key_3");
                    int i19 = c19760x34448d56.f273655u.getInt("extinfo_key_12", 0);
                    java.lang.String string4 = c19760x34448d56.f273655u.getString("extinfo_key_13");
                    java.lang.String string5 = c19760x34448d56.f273655u.getString("extinfo_key_14");
                    java.lang.String string6 = c19760x34448d56.f273655u.getString("extinfo_key_16");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string6)) {
                        str = string6;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultUI", "fetchF2fData, f2fid: %s, transid: %s, amount: %s, payerDesc: %s, recvDesc: %s, scanScene: %s, paySuccSign: %s, paySuccExtend: %s, channel: %s, payscene: %s", string, str, java.lang.Integer.valueOf(i18), string2, string3, java.lang.Integer.valueOf(i19), string4, string5, java.lang.Integer.valueOf(c19760x34448d56.f273644g), java.lang.Integer.valueOf(c19760x34448d56.f273642e));
                    m83090x14f40144(2773);
                    m83098x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x(string, str, i18, string2, string3, c19760x34448d56.f273644g, i19, string4, string5, c19760x34448d56.f273642e));
                }
            } else {
                V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.class);
                finish();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
            int i27 = c19760x34448d562 != null ? c19760x34448d562.f273642e : 0;
            if (i27 == 33 || i27 == 32 || i27 == 48 || i27 == 31) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5411x62f54e20 c5411x62f54e20 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5411x62f54e20();
                java.lang.String str2 = c19760x34448d562.f273647m;
                am.g9 g9Var = c5411x62f54e20.f135757g;
                g9Var.f88276a = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f053 = this.f239127d;
                if (c19099x8d444f053 != null && !((java.util.ArrayList) c19099x8d444f053.M).isEmpty()) {
                    g9Var.f88277b = ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f239127d.M).get(0)).f261247r;
                }
                c5411x62f54e20.e();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2773);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x) m1Var;
        if (i17 == 0 && i18 == 0) {
            r45.zv zvVar = xVar.f238590d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, retcode: %s, retmsg: %s, exposesureInfo: %s", java.lang.Integer.valueOf(zvVar.f473914d), zvVar.f473915e, zvVar.f473917g);
            if (zvVar.f473914d == 0) {
                try {
                    m83105x7498fe14().putByteArray("key_succpage_resp", zvVar.mo14344x5f01b1f6());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceResultUI", e17, "pass succ page resp error: %s", e17.getMessage());
                }
                V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.class);
            } else {
                dp.a.m125854x26a183b(this, zvVar.f473915e, 1).show();
                V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.class);
            }
        } else {
            V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379.class);
        }
        finish();
        return true;
    }
}

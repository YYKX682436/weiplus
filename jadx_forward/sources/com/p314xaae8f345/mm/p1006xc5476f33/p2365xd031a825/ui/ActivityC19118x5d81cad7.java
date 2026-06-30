package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI */
/* loaded from: classes9.dex */
public class ActivityC19118x5d81cad7 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f261605d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261606e;

    /* renamed from: f, reason: collision with root package name */
    public final c01.o8 f261607f = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a7(this);

    public java.lang.String U6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String encode;
        try {
            encode = java.net.URLEncoder.encode(java.net.URLEncoder.encode(str5, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletOrderInfoUI", e17, "", new java.lang.Object[0]);
        }
        if (str.indexOf("%7Breqkey%7D") <= 0 && str.indexOf("%7Btransid%7D") <= 0 && str.indexOf("%7Bphone%7D") <= 0 && str.indexOf("%7Bremark%7D") <= 0) {
            if (str.indexOf("{reqkey}") <= 0 && str.indexOf("{transid}") <= 0 && str.indexOf("{phone}") <= 0 && str.indexOf("{remark}") <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoUI", "concat url 3: ");
                str = str + java.lang.String.format("?reqkey=%s&transid=%s&phone=%s&remark=%s", str2, str3, str4, encode);
                return str;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoUI", "concat url 2: ");
            str = str.replace("{reqkey}", str2).replace("{transid}", str3).replace("{phone}", str4).replace("{remark}", encode);
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoUI", "concat url 1: ");
        str = str.replace("%7Breqkey%7D", str2).replace("%7Btransid%7D", str3).replace("%7Bphone%7D", str4).replace("%7Bremark%7D", encode);
        return str;
    }

    public void V6(java.lang.String str) {
        m83098x5406100e(new ss4.f0(str));
    }

    public void W6(java.lang.String str, int i17) {
        m83098x5406100e(new ss4.f0(str, i17));
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 X6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
    }

    public void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WalletOrderInfoUI", "goToOrderInfoUI, is_use_new_paid_succ_page: %d", java.lang.Integer.valueOf(c19099x8d444f05.V));
        if (c19099x8d444f05.V == 1) {
            m83108x2b5a5a39().B(this, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1.class, m83105x7498fe14());
        } else {
            m83108x2b5a5a39().B(this, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8.class, m83105x7498fe14());
        }
        finish();
    }

    public boolean Z6() {
        return true;
    }

    public void a7(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var == null || ((int) z3Var.E2) == 0) {
            return;
        }
        java.lang.String f27 = z3Var.f2();
        java.util.List list = this.f261605d.M;
        if (list == null || ((java.util.ArrayList) list).size() <= 0) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f261605d.M).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) it.next()).f261250u = f27;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d2d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (Z6()) {
            this.f261605d = X6();
            this.f261606e = m83105x7498fe14().getString("key_trans_id");
            int i17 = m83105x7498fe14().getInt("key_pay_type", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoUI", "mTransId %s", this.f261606e);
            java.lang.String str = this.f261606e;
            if (str != null) {
                if (i17 == -1) {
                    V6(str);
                    return;
                } else {
                    W6(str, i17);
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f261605d;
            if (c19099x8d444f05 != null) {
                Y6(c19099x8d444f05);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f261605d;
        if (c19099x8d444f05 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19099x8d444f05.f261224u)) {
            return;
        }
        ((c01.k7) c01.n8.a()).f(this.f261605d.f261224u);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ss4.f0) || i17 != 0 || i18 != 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = ((ss4.f0) m1Var).f493591d;
        this.f261605d = c19099x8d444f05;
        if (c19099x8d444f05 != null) {
            java.util.List list = c19099x8d444f05.M;
            if (list != null && ((java.util.ArrayList) list).size() != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f261605d.M).get(0);
                this.f261606e = commodity.f261247r;
                commodity.toString();
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(commodity.f261250u, true);
                if (n17 == null || ((int) n17.E2) == 0) {
                    ((c01.k7) c01.n8.a()).b(commodity.f261250u, 4, this.f261607f);
                } else {
                    a7(n17);
                }
            }
            Y6(this.f261605d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOrderInfoUI", "cannot get orders");
            db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ks_, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b7(this));
        }
        return true;
    }
}

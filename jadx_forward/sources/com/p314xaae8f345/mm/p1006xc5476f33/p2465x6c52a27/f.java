package com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5221x93792074 f270100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.C19562x5c61ba02 f270101e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.C19562x5c61ba02 c19562x5c61ba02, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5221x93792074 c5221x93792074) {
        this.f270101e = c19562x5c61ba02;
        this.f270100d = c5221x93792074;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        this.f270101e.f270095d.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5221x93792074 c5221x93792074 = this.f270100d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5221x93792074.f135554g.f88742b);
        int i18 = 0;
        am.l1 l1Var = c5221x93792074.f135554g;
        if (!K0) {
            for (java.lang.String str : l1Var.f88742b.split("\\|")) {
                int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
                if (D1 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(2050L, D1, 1L);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f88747g)) {
            int i19 = l1Var.f88745e;
            i18 = l1Var.f88746f;
            i17 = i19;
        } else {
            ot0.q v17 = ot0.q.v(l1Var.f88747g);
            if (v17 != null) {
                java.util.Map map = v17.G2;
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.ext_pay_info.business_type"), 0);
                java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_type");
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals("wx_f2f") || str2.equals("wx_md")) {
                    int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_fee"), 0);
                    java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_feetype");
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_outtradeno");
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (P2 > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        i18 = 1;
                    }
                }
                i17 = i18;
                i18 = P;
            } else {
                i17 = 0;
            }
        }
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "business type is 0, ignore report");
            return;
        }
        java.lang.String str5 = (((("" + l1Var.f88743c + ",") + l1Var.f88741a + ",") + l1Var.f88744d + ",") + i17 + ",") + i18 + "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "byp report: %s", str5);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68478xbd3cda5f(31619, str5);
        if (l1Var.f88741a == 1) {
            if (l1Var.f88744d == 1) {
                g0Var.C(2050L, 4L, 1L);
                return;
            } else {
                g0Var.C(2050L, 7L, 1L);
                return;
            }
        }
        if (l1Var.f88744d == 1) {
            g0Var.C(2050L, 5L, 1L);
            if (i17 == 1) {
                g0Var.C(2050L, 6L, 1L);
                return;
            }
            return;
        }
        g0Var.C(2050L, 8L, 1L);
        if (i17 == 1) {
            g0Var.C(2050L, 9L, 1L);
        }
    }
}

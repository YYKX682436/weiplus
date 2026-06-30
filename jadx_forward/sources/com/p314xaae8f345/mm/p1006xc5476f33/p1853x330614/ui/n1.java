package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public abstract class n1 {
    public static int a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c) {
        if (c19100xad1ade2c == null) {
            return 3;
        }
        bt4.f.b().f(c19100xad1ade2c.f261352d);
        bt4.g.b().d(c19100xad1ade2c.f261352d);
        if (c19100xad1ade2c.f261360o != null) {
            bt4.f.b().d(c19100xad1ade2c);
        }
        if ("wxpay://bizmall/mobile_recharge".equals(c19100xad1ade2c.f261357i)) {
            return 0;
        }
        if ("wxpay://bizmall/weixin_hongbao".equals(c19100xad1ade2c.f261357i)) {
            return 4;
        }
        if ("wxpay://bizmall/weixin_scan_qrcode".equals(c19100xad1ade2c.f261357i)) {
            return 8;
        }
        if ("wxpay://bizmall/weixin_transfer".equals(c19100xad1ade2c.f261357i)) {
            return 5;
        }
        if ("wxpay://bizmall/weixin_offline_pay".equals(c19100xad1ade2c.f261357i)) {
            return 6;
        }
        if ("wxpay://bizmall/old_mobile_recharge".equals(c19100xad1ade2c.f261357i)) {
            return 7;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19100xad1ade2c.f261358m)) {
            return 1;
        }
        if ("wxpay://bizmall/f2f_hongbao".equals(c19100xad1ade2c.f261357i)) {
            return 9;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallIndexUIHelper", "doSelectFunction no jump");
        return 2;
    }
}

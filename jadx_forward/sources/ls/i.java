package ls;

/* loaded from: classes5.dex */
public final class i implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            r45.j4 j4Var = addMsgInfo.f152259a;
            if (j4Var.f459093g == 10002) {
                java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GatewayLoginConfigSysCmdMsgNewXmlListener", "msg content is empty");
                    return;
                }
                try {
                    java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
                    if (d17 == null || !(!d17.isEmpty())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GatewayLoginConfigSysCmdMsgNewXmlListener", "values is null or empty");
                        return;
                    }
                    java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GatewayLoginConfigSysCmdMsgNewXmlListener", "type:" + str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        return;
                    }
                    if (r26.i0.q(str, "GatewayLoginConfig", false, 2, null)) {
                        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.GatewayLoginConfig.ShowGatewayLogin");
                        if (ot5.h.f430410a.a((java.lang.String) d17.get(".sysmsg.GatewayLoginConfig.DeviceUUID"), wo.w0.k(), "GatewayLoginConfig", false)) {
                            java.lang.String str3 = "key_show_gateway_flag_" + gm0.j1.b().k();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GatewayLoginConfigSysCmdMsgNewXmlListener", "gateway login config:" + str2);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("GatewayLoginConfigSysCmdMsgNewXmlListener").G(str3, str2 != null ? str2.equals("1") : false);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GatewayLoginConfigSysCmdMsgNewXmlListener", "parse gatewayloginconfig sysmsg fail:" + e17.getMessage());
                }
            }
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }
}

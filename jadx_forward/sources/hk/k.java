package hk;

/* loaded from: classes7.dex */
public final class k implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "admsg")) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_push_msg_clear_day_threshold, 7);
            hk.n nVar = hk.n.f363216a;
            hk.b b17 = nVar.b();
            if (b17 != null) {
                b17.m145252xb06685ab("AdvertisePushDBInfo", "timestamp<?", new java.lang.String[]{"" + ((java.lang.System.currentTimeMillis() / 1000) - (((Ni * 24) * 60) * 60))});
            }
            hk.a aVar = new hk.a();
            aVar.A0(java.lang.String.valueOf(addMsgInfo.f152259a.f459101r));
            aVar.L0(r9.f459098o);
            java.lang.String str2 = (java.lang.String) values.get(".sysmsg.opcode");
            aVar.J0(str2 != null ? java.lang.Integer.parseInt(str2) : 0);
            java.lang.String str3 = (java.lang.String) values.get(".sysmsg.message.aid");
            aVar.D0(str3 != null ? java.lang.Long.parseLong(str3) : 0L);
            java.lang.String str4 = (java.lang.String) values.get(".sysmsg.message.slotid");
            aVar.G0(str4 != null ? java.lang.Long.parseLong(str4) : 0L);
            java.lang.String str5 = (java.lang.String) values.get(".sysmsg.message.op_time");
            aVar.F0(str5 != null ? java.lang.Long.parseLong(str5) : 0L);
            aVar.I0((java.lang.String) values.get(".sysmsg.message.traceid"));
            hk.b b18 = nVar.b();
            if (b18 != null) {
                b18.mo51731x24249762(aVar, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicADPushMsgLogic", "get newXmlReceived," + values);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27059, java.lang.Long.valueOf(aVar.z0()), java.lang.Integer.valueOf(aVar.y0()), java.lang.Long.valueOf(aVar.t0()), java.lang.Long.valueOf(aVar.v0()), java.lang.Long.valueOf(aVar.u0()));
        }
    }
}

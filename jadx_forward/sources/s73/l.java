package s73;

/* loaded from: classes9.dex */
public class l implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), 0) == 35) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HoneyPayNewXmlListener", "receive honey pay newxml");
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.paymsg.appmsgcontent");
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.paymsg.fromusername");
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.paymsg.tousername");
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.paymsg.paymsgid");
            java.lang.String str6 = (java.lang.String) map.get(".sysmsg.paymsg.systip");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                u73.h.k(str5, java.net.URLDecoder.decode(str2), str4, str3);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                return;
            }
            java.lang.String decode = java.net.URLDecoder.decode(str6);
            u73.b bVar = new u73.b();
            bVar.f67674x6e706659 = str5;
            ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f441914d.a()).get(bVar, new java.lang.String[0]);
            if (bVar.f67673x297eb4f7 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HoneyPayNewXmlListener", "can not found honey pay record, will not insert sysmsg");
                return;
            }
            if (pt0.f0.Li((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || str3.equals(c01.z1.r())) ? str4 : str3, bVar.f67673x297eb4f7).m124847x74d37ac6() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HoneyPayNewXmlListener", "can not found honey bubble, will not insert sysmsg");
            } else if (c01.z1.J(str3)) {
                u73.h.f(str4, decode, str3);
            } else {
                u73.h.f(str3, decode, str4);
            }
        }
    }
}

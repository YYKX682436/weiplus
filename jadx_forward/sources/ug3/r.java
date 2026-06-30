package ug3;

/* loaded from: classes5.dex */
public final class r implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("PushLoginUrlAutoLoginSwitchUpdate", str) || map == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLoginSwitchUpdate.deviceid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLoginSwitchUpdate.setting"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushLoginUrlAutoLoginSwitchUpdateNewXmlReceived", "receive xml, deviceid:" + str2 + ", setting:" + D1);
        boolean z18 = D1 == 1;
        try {
            java.util.Iterator it = ug3.i.K().iterator();
            while (it.hasNext()) {
                ug3.k kVar = (ug3.k) it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(android.util.Base64.encodeToString(kVar.f473998e.f273689a, 2), str2)) {
                    kVar.L = z18;
                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6191x1700be4c().e();
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetOnlineInfo", "updateAutoLoginStatus %s, %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}

package vh0;

/* loaded from: classes.dex */
public final class q1 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "weclawbot_statusnotify")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawBotStatusNewXmlReceived", "onNewXmlReceived, values: " + map);
            java.lang.String str2 = map != null ? (java.lang.String) map.get(".sysmsg.username") : null;
            java.lang.String str3 = map != null ? (java.lang.String) map.get(".sysmsg.onlinestatus") : null;
            if (!(str2 == null || str2.length() == 0)) {
                if (!(str3 == null || str3.length() == 0)) {
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "1");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawBotStatusNewXmlReceived", "parsed weclawbot_statusnotify, username=" + str2 + ", isConnected=" + b17);
                    vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
                    if (n1Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawBotStatusNewXmlReceived", "IYuanBaoRoutine service is null, skip updateClawStatus");
                        return;
                    } else {
                        ((vh0.f3) n1Var).nj(str2, b17);
                        return;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawBotStatusNewXmlReceived", "username or onlinestatus is empty, username=" + str2 + ", onlinestatus=" + str3);
        }
    }
}

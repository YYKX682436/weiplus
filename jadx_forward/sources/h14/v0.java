package h14;

/* loaded from: classes.dex */
public class v0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (map != null) {
            if (!c01.e2.a0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatServiceChooseListener", "showWCOpenService onNewXmlReceived, isWeChatUser = no.");
                return;
            }
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.showWCOpenService.deviceid");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatServiceChooseListener", "showWCOpenService onNewXmlReceived, deviceUUIdStr = null.");
                return;
            }
            if (ot5.h.f430410a.a(str2, wo.w0.k(), "showWCOpenService", false)) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a.f242042w) {
                    j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "setting", ".ui.setting.SettingsManageFindOtherServiceUI", new android.content.Intent(), null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeChatServiceChooseListener", "showWCOpenService deviceId already handled, skip startActivity. deviceId = " + str2);
                }
            }
        }
    }
}

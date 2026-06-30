package ab5;

@j95.b
/* loaded from: classes9.dex */
public class j extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j5 {
    public boolean wi() {
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNotifyMsgService", "get info storage fail");
            return false;
        }
        int x76 = cj6.x7("appbrand_notify_message");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNotifyMsgService", "conversation count: %d", java.lang.Integer.valueOf(x76));
        if (x76 <= 1) {
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_notify_msg_enable, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNotifyMsgService", "showNotifyMsgPreference, isABtestEnable: %b", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }
}

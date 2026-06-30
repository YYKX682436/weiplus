package nf0;

/* loaded from: classes.dex */
public class q implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (map != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.reddot_type"), 0) == 9;
            if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri() && !z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewLife.FtsRedPointNewXmlReceiver", "onNewXmlReceived: showNewK1KEntry ,return ");
            } else {
                if (str == null || !str.equals("mmsearch_reddot_new")) {
                    return;
                }
                ((om4.m) i95.n0.c(om4.m.class)).wi().n(map, "");
            }
        }
    }
}

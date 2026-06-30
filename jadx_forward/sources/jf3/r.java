package jf3;

/* loaded from: classes5.dex */
public final class r implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MassSendTipNewXmlConsumer", "consumeNewXml start!!");
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MassSendTipNewXmlConsumer", "values is null");
            return null;
        }
        if (!c01.z1.x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MassSendTipNewXmlConsumer", "is not ExDeviceEnv");
            return null;
        }
        q15.b bVar = new q15.b();
        bVar.m126732x88c2ee0f(map);
        q15.c j18 = bVar.j();
        if (j18 == null || (j17 = j18.j()) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("masMsgId");
            q15.c j19 = bVar.j();
            sb6.append(j19 != null ? j19.j() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MassSendTipNewXmlConsumer", sb6.toString());
        } else {
            long c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(j17);
            java.util.LinkedList<q15.d> k17 = bVar.k();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
            for (q15.d dVar : k17) {
                java.lang.String m159401x3092e94f = dVar.m159401x3092e94f();
                if (m159401x3092e94f == null) {
                    m159401x3092e94f = "";
                }
                java.lang.String j27 = dVar.j();
                arrayList.add(new jz5.l(m159401x3092e94f, java.lang.Long.valueOf(j27 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(j27) : 0L)));
            }
            java.util.Map q17 = kz5.c1.q(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MassSysTipHelper", "insertSysTip talkerMap:" + q17 + ", masMsgId:" + c17);
            ((ku5.t0) ku5.t0.f394148d).g(new if3.d0(q17, c17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MassSendTipNewXmlConsumer", "consumeNewXml success!!");
        return null;
    }
}

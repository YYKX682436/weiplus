package sj;

/* loaded from: classes11.dex */
public final class b implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml start!!");
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "values is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml start!!: ".concat(kz5.n0.g0(map.entrySet(), null, null, null, 0, null, sj.a.f489864d, 31, null)));
        q15.a aVar = new q15.a();
        aVar.m126732x88c2ee0f(map);
        if (!ot5.h.f430410a.a(aVar.l(), wo.w0.k(), "MicroMsg.AccStrikeNewXmlConsumer", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml err!! deviceId check fail");
            return null;
        }
        ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42705xa13e4acb(aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml success!!");
        return null;
    }
}

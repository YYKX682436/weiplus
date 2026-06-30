package w61;

/* loaded from: classes5.dex */
public final class k implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtensionsForUnavailableAccountTip", "consumeNewXml " + str);
        if (map == null || (str2 = (java.lang.String) map.get(".sysmsg.to_username")) == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtensionsForUnavailableAccountTip", "consumeNewXml toUser:".concat(str2));
        v61.w0 w0Var = (v61.w0) ((com.p314xaae8f345.mm.p670x38b72420.m) i95.n0.c(com.p314xaae8f345.mm.p670x38b72420.m.class));
        w0Var.getClass();
        pm0.v.O("UnAvailableAccountTips", new v61.v0(str2, w0Var));
        return null;
    }
}

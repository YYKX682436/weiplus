package aq5;

/* loaded from: classes5.dex */
public final class t0 implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (map == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.MigrateID");
        byte[] decode = android.util.Base64.decode((java.lang.String) map.get(".sysmsg.Base64Msg"), 2);
        bw5.as0 as0Var = new bw5.as0();
        as0Var.mo11468x92b714fd(decode);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MigrateMsgSendMsgXMLConsumer", "consumeNewXml() called with: subType = " + str + ", values = " + map + " migrateID:" + str2);
        aq5.p0 p0Var2 = aq5.p0.f94806a;
        bw5.ge0 ge0Var = as0Var.f106960f[2] ? as0Var.f106959e : new bw5.ge0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ge0Var, "getUserInfo(...)");
        p0Var2.d(ge0Var, str2);
        return null;
    }
}

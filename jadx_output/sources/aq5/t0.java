package aq5;

/* loaded from: classes5.dex */
public final class t0 implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (map == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.MigrateID");
        byte[] decode = android.util.Base64.decode((java.lang.String) map.get(".sysmsg.Base64Msg"), 2);
        bw5.as0 as0Var = new bw5.as0();
        as0Var.parseFrom(decode);
        com.tencent.mars.xlog.Log.i("MicroMsg.MigrateMsgSendMsgXMLConsumer", "consumeNewXml() called with: subType = " + str + ", values = " + map + " migrateID:" + str2);
        aq5.p0 p0Var2 = aq5.p0.f13273a;
        bw5.ge0 ge0Var = as0Var.f25427f[2] ? as0Var.f25426e : new bw5.ge0();
        kotlin.jvm.internal.o.f(ge0Var, "getUserInfo(...)");
        p0Var2.d(ge0Var, str2);
        return null;
    }
}

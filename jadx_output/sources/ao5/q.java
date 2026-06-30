package ao5;

/* loaded from: classes14.dex */
public final class q implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        if (p0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.ILinkVoIPExtension", "onRecieveMsg: msgInfo is null");
            return;
        }
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (g17 == null) {
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
        if (str == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRecieveMsg: content ");
        sb6.append(g17);
        sb6.append(',');
        sb6.append(j4Var.f377565o);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.ILinkVoIPExtension", sb6.toString());
        if (!iq.b.H() || ((jp5.o) i95.n0.c(jp5.o.class)).ib()) {
            jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
            long j17 = j4Var.f377565o;
            java.lang.String str2 = j4Var.f377558e.f372756d;
            kotlin.jvm.internal.o.f(str2, "toString(...)");
            oVar.e9(str, g17, j17, str2, er4.b.CONF_NOTIFY_FROM_NEW_SYNC);
            return;
        }
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.voipmt.invite");
        if (str3 == null) {
            str3 = "";
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        byte[] bytes = str3.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        byte[] decode = android.util.Base64.decode(bytes, 0);
        ((fa0.t) ((fa0.q) i95.n0.c(fa0.q.class))).getClass();
        if (com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n == null) {
            com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n = new com.tencent.mm.plugin.multitalk.model.t1();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n.getClass();
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.L(decode, decode.length);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}

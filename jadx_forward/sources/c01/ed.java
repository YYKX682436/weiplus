package c01;

/* loaded from: classes4.dex */
public class ed implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        int intValue;
        int intValue2;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17;
        r45.j4 j4Var = p0Var.f152259a;
        if (j4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysNoticeMsgExtension", "onPreAddMessage cmdAM is null");
            return null;
        }
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d("<root>" + j4Var.f459094h + "</root>", "root", null);
            intValue = java.lang.Integer.valueOf((java.lang.String) d17.get(".root.newcount")).intValue();
            intValue2 = java.lang.Integer.valueOf((java.lang.String) d17.get(".root.version")).intValue();
            p17 = c01.d9.b().p();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysNoticeMsgExtension", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        if (intValue2 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) p17.l(12305, null))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysNoticeMsgExtension", "ignore new sys notice count, same version");
            return null;
        }
        p17.w(12304, java.lang.Integer.valueOf(intValue));
        p17.w(12305, java.lang.Integer.valueOf(intValue2));
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}

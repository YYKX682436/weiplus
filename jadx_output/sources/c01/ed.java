package c01;

/* loaded from: classes4.dex */
public class ed implements com.tencent.mm.modelbase.i1 {
    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        int intValue;
        int intValue2;
        com.tencent.mm.storage.n3 p17;
        r45.j4 j4Var = p0Var.f70726a;
        if (j4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysNoticeMsgExtension", "onPreAddMessage cmdAM is null");
            return null;
        }
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d("<root>" + j4Var.f377561h + "</root>", "root", null);
            intValue = java.lang.Integer.valueOf((java.lang.String) d17.get(".root.newcount")).intValue();
            intValue2 = java.lang.Integer.valueOf((java.lang.String) d17.get(".root.version")).intValue();
            p17 = c01.d9.b().p();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SysNoticeMsgExtension", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        if (intValue2 == com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) p17.l(12305, null))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SysNoticeMsgExtension", "ignore new sys notice count, same version");
            return null;
        }
        p17.w(12304, java.lang.Integer.valueOf(intValue));
        p17.w(12305, java.lang.Integer.valueOf(intValue2));
        return null;
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}

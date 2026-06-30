package be1;

/* loaded from: classes7.dex */
public final class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    private static final int f4218x366c91de = 918;

    /* renamed from: NAME */
    private static final java.lang.String f4219x24728b = "getSystemInfoSync";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f17 = lVar != null ? lVar.f("getSystemInfo") : null;
        be1.c0 c0Var = f17 instanceof be1.c0 ? (be1.c0) f17 : null;
        if (c0Var == null) {
            java.lang.String o17 = o("fail:not supported");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "makeReturnJson(...)");
            return o17;
        }
        java.lang.String p17 = p("ok", c0Var.B(lVar));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}

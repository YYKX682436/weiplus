package be1;

/* loaded from: classes7.dex */
public final class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f4214x366c91de = 919;

    /* renamed from: NAME */
    private static final java.lang.String f4215x24728b = "getSystemInfoAsync";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f17 = lVar != null ? lVar.f("getSystemInfo") : null;
        be1.c0 c0Var = f17 instanceof be1.c0 ? (be1.c0) f17 : null;
        if (c0Var == null) {
            if (lVar != null) {
                lVar.a(i17, o("fail:not supported"));
            }
        } else if (lVar != null) {
            lVar.a(i17, p("ok", c0Var.B(lVar)));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return false;
    }
}

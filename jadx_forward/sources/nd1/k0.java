package nd1;

/* loaded from: classes7.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72949x366c91de = 170;

    /* renamed from: NAME */
    private static final java.lang.String f72950x24728b = "reLaunch";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        final java.lang.String optString = jSONObject.optString("url");
        final java.lang.String optString2 = jSONObject.optString("routeId", null);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: nd1.k0$$a
            @Override // java.lang.Runnable
            public final void run() {
                nd1.k0 k0Var = nd1.k0.this;
                k0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = yVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = yVar2.mo32091x9a3f0ba2().x0();
                boolean v17 = x07.v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.RE_LAUNCH);
                int i18 = i17;
                if (!v17) {
                    yVar2.a(i18, k0Var.o("fail:can not reLaunch in current page environment"));
                } else {
                    x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l4(x07, optString, false, optString2));
                    yVar2.a(i18, k0Var.o("ok"));
                }
            }
        };
        if ((yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) || !yVar.mo32091x9a3f0ba2().Q1()) {
            runnable.run();
        } else {
            yVar.mo32091x9a3f0ba2().I1(runnable);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}

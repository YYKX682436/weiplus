package nd1;

/* loaded from: classes7.dex */
public class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72937x366c91de = 150;

    /* renamed from: NAME */
    public static final java.lang.String f72938x24728b = "switchTab";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        final java.lang.String optString = jSONObject.optString("url");
        if (!yVar.mo32091x9a3f0ba2().m0().e().a(optString)) {
            yVar.a(i17, o("fail:can not switch to non-TabBar page"));
            return;
        }
        final java.lang.String optString2 = jSONObject.optString("routeId");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: nd1.h2$$a
            @Override // java.lang.Runnable
            public final void run() {
                nd1.h2 h2Var = nd1.h2.this;
                h2Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = yVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = yVar2.mo32091x9a3f0ba2().x0();
                boolean v17 = x07.v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB);
                int i18 = i17;
                if (!v17) {
                    yVar2.a(i18, h2Var.o("fail:can not switch in current page environment"));
                } else {
                    x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o4(x07, optString, null, optString2));
                    yVar2.a(i18, h2Var.o("ok"));
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

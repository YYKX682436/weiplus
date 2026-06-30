package v60;

/* loaded from: classes5.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775 c5257x89865775 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775) abstractC20979x809547d1;
        int i17 = c5257x89865775.f135588g.f89499a;
        if (i17 != 200) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        am.t2 t2Var = c5257x89865775.f135588g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayGetA8KeyResUpdateOperationListener", "get notify res type:%d subType:%d operation:%d", valueOf, java.lang.Integer.valueOf(t2Var.f89500b), java.lang.Integer.valueOf(t2Var.f89501c));
        if (t2Var.f89501c == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            v60.w.f514949d = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 0);
        }
        return true;
    }
}

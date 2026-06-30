package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class r implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263141f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 a0Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f263139d = i17;
        this.f263140e = str;
        this.f263141f = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 2608) {
            return 0;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FTSWebSearchLogic", "getPoiInfo onSceneEnd errType:" + i17 + " errCode:" + i18 + " will retry");
            return 0;
        }
        if (oVar != null) {
            r45.ix5 ix5Var = (r45.ix5) oVar.f152244b.f152233a;
            zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
            java.lang.String str2 = ix5Var.f458929d;
            ((jw4.e) l3Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f263139d);
            a17.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("searchId", this.f263140e);
            bundle.putString("poiId", this.f263141f);
            bundle.putString("json", str2);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = a17.f266531y;
                if (z0Var != null) {
                    z0Var.mo70207xf5bc2045(145, bundle);
                }
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "onGetPoiReady exception" + e17.getMessage());
            }
        }
        return 0;
    }
}

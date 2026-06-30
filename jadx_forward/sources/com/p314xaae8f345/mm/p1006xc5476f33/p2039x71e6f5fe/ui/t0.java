package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class t0 implements c01.zc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241180d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3) {
        this.f241180d = activityC17301x38c077a3;
    }

    @Override // c01.zc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.ProductUI", "lo-scanner-onRecieveMsg");
        e04.n3 n3Var = this.f241180d.f240852q;
        if (n3Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.scanproductinfo.product.id");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var.f69639x5bec8545) || !n3Var.f69639x5bec8545.equals(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lo-scanner-doUpdateActionLogicByNewXml: product id not match, productId=");
                if (str == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append(", target=");
                sb6.append(n3Var.f69639x5bec8545);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProductUpdateLogic", sb6.toString());
            } else {
                java.util.LinkedList b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b.b(d17, ".sysmsg.scanproductinfo.product");
                java.util.HashMap hashMap = new java.util.HashMap();
                for (int i17 = 0; i17 < b17.size(); i17++) {
                    java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b) b17.get(i17)).f240349f;
                    if (linkedList != null) {
                        for (int i18 = 0; i18 < linkedList.size(); i18++) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a) linkedList.get(i18);
                            if (aVar != null) {
                                hashMap.put(aVar.f240333t, aVar);
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: toUpdateSize=" + hashMap.size());
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n0.b(n3Var.f327565a, hashMap);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.s0(this));
    }

    @Override // c01.zc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public enum h0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f261829d = new java.util.HashMap();

    h0() {
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0 a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        java.lang.String str;
        vr4.j0 j0Var;
        if (c19099x8d444f05 == null || c19099x8d444f05.M == null) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < c19099x8d444f05.M.size(); i17++) {
                sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) c19099x8d444f05.M.get(i17)).f261247r);
            }
            sb6.append("@");
            sb6.append(c19099x8d444f05.f261207d);
            str = sb6.toString();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavorLogicHelperPool", "get key null");
            return null;
        }
        java.util.Map map = this.f261829d;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavorLogicHelperPool", "hit cache, key:" + str);
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) map).get(str);
            if (weakReference != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0) weakReference.get();
                if (g0Var != null) {
                    return g0Var;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavorLogicHelperPool", "helper null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavorLogicHelperPool", "weakHelper null");
            }
        }
        if (c19099x8d444f05 == null || (j0Var = c19099x8d444f05.N) == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0 g0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0(j0Var);
        ((java.util.HashMap) map).put(str, new java.lang.ref.WeakReference(g0Var2));
        return g0Var2;
    }
}

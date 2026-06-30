package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class m4 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f226984b = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f226983a = new java.util.HashSet();

    public m4() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        for (java.lang.String str2 : str.split(",")) {
            this.f226983a.add(str2);
        }
    }

    public boolean a(java.lang.String str) {
        synchronized (this.f226984b) {
            if (((java.util.HashSet) this.f226983a).contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyMsg", "has contains msg, %s", str);
                return false;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder((java.lang.String) c17.m(u3Var, ""));
            if (((java.util.HashSet) this.f226983a).size() <= 0) {
                sb6.append(str);
            } else {
                sb6.append(",");
                sb6.append(str);
            }
            gm0.j1.u().c().x(u3Var, sb6.toString());
            return ((java.util.HashSet) this.f226983a).add(str);
        }
    }

    public void b(java.lang.String str) {
        synchronized (this.f226984b) {
            ((java.util.HashSet) this.f226983a).remove(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = ((java.util.HashSet) this.f226983a).iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(",");
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC, sb6.length() == 0 ? sb6.toString() : sb6.substring(0, sb6.length() - 1));
        }
    }
}

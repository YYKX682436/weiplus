package y00;

/* loaded from: classes3.dex */
public final class p implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.lang.String Q0;
        if (z65.c.f551991d) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var != null ? l0Var.f535944b : null, "delete")) {
            java.util.ArrayList arrayList = l0Var.f535945c;
            int i17 = 0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var.mo78013xfb85f7b0() == 1191182385 && (Q0 = f9Var.Q0()) != null) {
                    if (!(Q0.length() > 0)) {
                        Q0 = null;
                    }
                    if (Q0 != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(Q0)) {
                        long I0 = f9Var.I0();
                        if (I0 > 0) {
                            java.lang.Object obj = hashMap.get(Q0);
                            if (obj == null) {
                                obj = new java.util.ArrayList();
                                hashMap.put(Q0, obj);
                            }
                            ((java.util.List) obj).add(java.lang.Long.valueOf(I0));
                        }
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return;
            }
            java.util.Collection values = hashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it6 = values.iterator();
            while (it6.hasNext()) {
                i17 += ((java.util.List) it6.next()).size();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardOnMsgChanged", "onNotifyChange: cleanup talkers=%d svrIds=%d", java.lang.Integer.valueOf(hashMap.size()), java.lang.Integer.valueOf(i17));
            ((ku5.t0) ku5.t0.f394148d).B(new y00.n(hashMap));
            ((ku5.t0) ku5.t0.f394148d).g(new y00.o(hashMap, this));
        }
    }
}

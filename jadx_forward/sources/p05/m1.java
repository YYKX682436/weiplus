package p05;

/* loaded from: classes5.dex */
public final class m1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.r2 r2Var = event.f135586g;
        int i17 = r2Var.f89292a;
        boolean z17 = r2Var.f89296e;
        p05.p3 p3Var = p05.p3.f432172a;
        if (!p05.p3.f432176e.contains(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        am.r2 r2Var2 = event.f135586g;
        int i18 = r2Var2.f89293b;
        java.lang.String str = r2Var2.f89294c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "getRes: " + i17 + ", " + i18 + ", " + str + ", " + z17);
        if (!z17 || str == null) {
            return false;
        }
        p3Var.a(i17, i18, str);
        p3Var.f();
        java.util.LinkedHashSet linkedHashSet = p05.p3.f432177f;
        synchronized (linkedHashSet) {
            if (!linkedHashSet.isEmpty()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17);
                sb6.append('.');
                sb6.append(i18);
                linkedHashSet.remove(sb6.toString());
                if (linkedHashSet.isEmpty()) {
                    p05.m4.f432155a.c();
                }
            }
        }
        return false;
    }
}

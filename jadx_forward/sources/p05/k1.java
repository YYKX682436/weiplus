package p05;

/* loaded from: classes5.dex */
public final class k1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.t2 t2Var = event.f135588g;
        int i17 = t2Var.f89499a;
        int i18 = t2Var.f89500b;
        if (!p05.p3.f432176e.contains(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        int i19 = event.f135588g.f89501c;
        if (i19 != 2) {
            if (i19 != 0) {
                return false;
            }
            java.util.LinkedHashSet linkedHashSet = p05.p3.f432177f;
            synchronized (linkedHashSet) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17);
                sb6.append('.');
                sb6.append(i18);
                linkedHashSet.add(sb6.toString());
            }
            return false;
        }
        java.lang.String str = p05.a3.f431976e + '/' + i17 + '.' + i18;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeVisModelMgr", "operation: delete res " + i17 + '.' + i18);
        com.p314xaae8f345.mm.vfs.w6.f(str);
        java.util.LinkedList NewConfigList = p05.p3.f432174c.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
        pm0.v.d0(NewConfigList, new p05.i1(i17, i18));
        pm0.v.d0(p05.p3.f432173b, new p05.j1(i17, i18));
        p05.m4.f432155a.b(2, i17, i18);
        return false;
    }
}

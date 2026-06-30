package pg0;

/* loaded from: classes8.dex */
public final class r1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6202xc28d6d7d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6202xc28d6d7d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.b00 b00Var = event.f136455g;
        if (b00Var.f87735a == 11) {
            java.util.List list = b00Var.f87736b;
            if (list != null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                if (linkedList.size() > 0) {
                    byte[] d17 = x51.j1.d(((r45.n35) linkedList.get(0)).f462591h);
                    if (d17 != null && d17.length != 0) {
                        java.lang.String str = new java.lang.String(d17, r26.c.f450398a);
                        pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, a3Var.f435500u)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateMassSendPlaceTopListener", "the same result : %s".concat(str));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateMassSendPlaceTopListener", "UpdatePackageEvent: %s", str);
                            dt4.b.e(str);
                            a3Var.f435500u = str;
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdateMassSendPlaceTopListener", "empty UpdatePackageEvent");
        }
        return false;
    }
}

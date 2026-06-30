package g22;

/* loaded from: classes15.dex */
public final class g implements ec0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g22.i f349347d;

    public g(g22.i iVar) {
        this.f349347d = iVar;
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q qVar = this.f349347d.f349356e;
        if (c01.z1.y() && arrayList != null && arrayList.size() > 0 && qVar != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3 q3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3) it.next();
                if (q3Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3GoogleMarketTool", "endSeachV3GoogleMarket: %s", q3Var);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f5 b17 = qVar.b(q3Var.f270945b);
                    int i17 = q3Var.f270949f;
                    if (i17 == 10232) {
                        b17.f275455e = q3Var.f270946c;
                        new java.math.BigDecimal(q3Var.f270948e).divide(new java.math.BigDecimal(1000000)).toString();
                        b17.f275453c = 12;
                        int i18 = b17.f275452b;
                        if (!(i18 == 7)) {
                            if (!(i18 == 6)) {
                                b17.a(4);
                            }
                        }
                    } else {
                        b17.f275453c = 10;
                        b17.f275454d = i17;
                        int i19 = b17.f275452b;
                        if (!(i19 == 7)) {
                            if (!(i19 == 6)) {
                                if (!(i19 == 3)) {
                                    b17.a(10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

package j12;

/* loaded from: classes15.dex */
public abstract class c {
    public static void a(java.util.ArrayList arrayList, j12.f fVar) {
        if (c01.z1.y() && fVar != null && arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3 q3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3) it.next();
                if (q3Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiGoogleMarketTool", "endSeachGoogleMarket: %s", q3Var);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f5 e17 = fVar.e(q3Var.f270945b);
                    int i17 = q3Var.f270949f;
                    if (i17 == 10232) {
                        e17.f275455e = q3Var.f270946c;
                        new java.math.BigDecimal(q3Var.f270948e).divide(new java.math.BigDecimal(1000000)).toString();
                        e17.f275453c = 12;
                        int i18 = e17.f275452b;
                        if (!(i18 == 7)) {
                            if (!(i18 == 6)) {
                                e17.a(4);
                            }
                        }
                    } else {
                        e17.f275453c = 10;
                        e17.f275454d = i17;
                        int i19 = e17.f275452b;
                        if (!(i19 == 7)) {
                            if (!(i19 == 6)) {
                                if (!(i19 == 3)) {
                                    e17.a(10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void b(j12.f fVar, ec0.e eVar) {
        if (c01.z1.y() && fVar != null) {
            java.util.ArrayList arrayList = fVar.f378691d;
            if ((arrayList == null ? 0 : arrayList.size()) <= 0 || eVar == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = fVar.iterator();
            while (true) {
                j12.e eVar2 = (j12.e) it;
                if (!eVar2.hasNext()) {
                    break;
                }
                j12.i iVar = (j12.i) eVar2.next();
                if (iVar != null) {
                    if (iVar.f378699a != j12.h.cellset) {
                        r45.zj0 zj0Var = iVar.f378700b;
                        boolean c17 = j12.g.c(zj0Var);
                        boolean a17 = j12.g.a(zj0Var);
                        if (!c17 && !a17) {
                            arrayList2.add(zj0Var.f473661d);
                            fVar.e(zj0Var.f473661d).f275453c = 11;
                        }
                    }
                }
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (arrayList2.size() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                return;
            }
            ec0.f fVar2 = (ec0.f) i95.n0.c(ec0.f.class);
            java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]);
            ((dc0.e) fVar2).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i2.a(context, strArr, eVar);
        }
    }
}

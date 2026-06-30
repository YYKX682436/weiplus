package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes14.dex */
public final class z2 {
    public z2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.ArrayList a() {
        java.lang.String[] strArr;
        java.util.Collection collection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().u(null);
            if (u17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppUDRCheckService", "configCheckParameters baselibInfo: %s", u17);
                java.lang.String m65306xf20fbaf6 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65306xf20fbaf6(u17.f14330x346425);
                if (m65306xf20fbaf6 != null) {
                    java.util.List g17 = new r26.t("\\.").g(m65306xf20fbaf6, 0);
                    if (!g17.isEmpty()) {
                        java.util.ListIterator listIterator = g17.listIterator(g17.size());
                        while (listIterator.hasPrevious()) {
                            if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                                collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    collection = kz5.p0.f395529d;
                    strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
                } else {
                    strArr = null;
                }
                e06.k kVar = strArr != null ? new e06.k(0, strArr.length - 1) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
                int i17 = kVar.f327742d;
                int i18 = kVar.f327743e;
                long j17 = 0;
                if (i17 <= i18) {
                    while (true) {
                        j17 += java.lang.Long.parseLong(strArr[i17]) << (((strArr.length - i17) - 1) * 10);
                        if (i17 == i18) {
                            break;
                        }
                        i17++;
                    }
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
                vVar.d("baselib_version");
                vVar.f299114g = j17;
                vVar.f299117m[4] = true;
                vVar.e(2);
                arrayList.add(vVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppUDRCheckService", "getParameter: %s", arrayList);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppUDRCheckService", "baselib info is null.");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppUDRCheckService", e17.toString());
        }
        return arrayList;
    }
}

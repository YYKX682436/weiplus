package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class ha implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f182677d;

    public ha(yz5.l lVar) {
        this.f182677d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String r17;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List u17 = o72.x1.u();
        int size = u17.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "total data size = " + size);
        int size2 = u17.size();
        if (20 <= size2) {
            size2 = 20;
        }
        int i17 = 0;
        while (i17 <= size) {
            java.util.List subList = u17.subList(i17, size2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "subIdList start = " + i17 + ", end = " + size2 + ", size = " + subList.size());
            java.util.Iterator it = o72.x1.S(subList, -1).iterator();
            while (it.hasNext()) {
                dm.n3 n3Var = (dm.n3) it.next();
                arrayList.add(new jz5.l(java.lang.Integer.valueOf(n3Var.f67657x2262335f), java.lang.Integer.valueOf(n3Var.f67643xc8a07680)));
            }
            i17 = size2 + 1;
            size2 = i17 + 20;
            int size3 = u17.size();
            if (size2 > size3) {
                size2 = size3;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "[getFavTypeOrderList] favTypeList list size = " + arrayList.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        int size4 = arrayList.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                break;
            }
            int intValue = ((java.lang.Number) ((jz5.l) arrayList.get(i18)).f384366d).intValue();
            int intValue2 = ((java.lang.Number) ((jz5.l) arrayList.get(i18)).f384367e).intValue();
            if (intValue == 2 || intValue == 4 || intValue == 16) {
                intValue = 100;
            }
            int i19 = intValue != 34 ? intValue : 5;
            if (i19 == 32) {
                o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(intValue2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFavTypeOrderList] fav id = ");
                sb6.append(re6.f67643xc8a07680);
                sb6.append(", datalist size = ");
                r45.bq0 bq0Var = re6.f67640x5ab01132;
                sb6.append((bq0Var == null || (linkedList3 = bq0Var.f452497f) == null) ? null : java.lang.Integer.valueOf(linkedList3.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", sb6.toString());
                r45.bq0 bq0Var2 = re6.f67640x5ab01132;
                java.util.LinkedList linkedList4 = bq0Var2 != null ? bq0Var2.f452497f : null;
                if (linkedList4 != null && linkedList4.size() != 0) {
                    r45.gp0 gp0Var = (r45.gp0) linkedList4.get(0);
                    r45.hp0 hp0Var = gp0Var != null ? gp0Var.J1 : null;
                    r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
                    if (xs4Var != null) {
                        i19 = il4.l.g(xs4Var.m75939xb282bd08(18)) ? 101 : 102;
                    }
                }
                i18++;
            }
            if (i19 == 33) {
                o72.r2 re7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(intValue2);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[getFavTypeOrderList] fav id = ");
                sb7.append(re7.f67643xc8a07680);
                sb7.append(", datalist size = ");
                r45.bq0 bq0Var3 = re7.f67640x5ab01132;
                sb7.append((bq0Var3 == null || (linkedList2 = bq0Var3.f452497f) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", sb7.toString());
                r45.bq0 bq0Var4 = re7.f67640x5ab01132;
                r45.gp0 gp0Var2 = (bq0Var4 == null || (linkedList = bq0Var4.f452497f) == null) ? null : (r45.gp0) kz5.n0.a0(linkedList, 0);
                r45.hp0 hp0Var2 = gp0Var2 != null ? gp0Var2.J1 : null;
                r45.km6 km6Var = hp0Var2 != null ? hp0Var2.G : null;
                if (km6Var == null) {
                    i18++;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "[getFavTypeOrderList] fav id = " + re7.f67643xc8a07680 + ", type = " + km6Var.f460371d);
                    i19 = il4.d.r(km6Var.f460371d) ? 101 : 102;
                }
            }
            if (hashMap.containsKey(java.lang.Integer.valueOf(i19))) {
                java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i19));
                hashMap.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } else {
                hashMap.put(java.lang.Integer.valueOf(i19), 1);
            }
            i18++;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Integer num2 : hashMap.keySet()) {
            java.lang.Integer num3 = (java.lang.Integer) hashMap.get(num2);
            if (num3 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                arrayList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ea(num2.intValue(), num3.intValue()));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "[getOrderType] sortList = " + arrayList3);
        if (arrayList3.size() > 1) {
            kz5.g0.t(arrayList3, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ga());
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ea) it6.next()).f182370a;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia iaVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182713a;
            if (i27 == 3) {
                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cdh);
            } else if (i27 == 14) {
                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cde);
            } else if (i27 == 5) {
                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cdf);
            } else if (i27 == 6) {
                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cd_);
            } else if (i27 == 7) {
                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cda);
            } else if (i27 != 8) {
                switch (i27) {
                    case 18:
                        r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cdc);
                        break;
                    case 19:
                        r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.ccy);
                        break;
                    case 20:
                        r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f572745cd2);
                        break;
                    case 21:
                        r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cda);
                        break;
                    default:
                        switch (i27) {
                            case 100:
                                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cd9);
                                break;
                            case 101:
                                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.ccz);
                                break;
                            case 102:
                                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cda);
                                break;
                            default:
                                r17 = null;
                                break;
                        }
                }
            } else {
                r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f572744cd1);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17) || kz5.n0.O(arrayList2, r17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "[getOrderType] not type name, type = " + i27);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r17, "null cannot be cast to non-null type kotlin.String");
                arrayList2.add(r17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTypeOrderManager", "[getOrderType] resultList = " + arrayList2);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182714b.putString("fav_list_tag", arrayList2.toString());
        ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.fa(this.f182677d, arrayList2));
    }
}

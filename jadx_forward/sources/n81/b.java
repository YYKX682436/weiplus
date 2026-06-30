package n81;

/* loaded from: classes7.dex */
public final class b implements zv1.d {
    @Override // zv1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 a() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35404x746aee06;
    }

    @Override // zv1.d
    public java.util.Map b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = ((java.util.ArrayList) n81.p.i(n81.p.f417161a, 3, 0L, null, 6, null)).iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((n81.d) it.next()).f417143e.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List list = (java.util.List) entry.getValue();
                java.lang.Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new java.util.ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((java.util.List) obj).addAll(list);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCacheCleaner", "getTaggedCachePaths, tags=" + linkedHashMap.keySet() + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return linkedHashMap;
    }

    @Override // zv1.d
    public long c(long j17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17) {
        boolean z18;
        long j18;
        long j19;
        java.lang.Boolean bool = n81.c.f417137a;
        if (bool != null) {
            z18 = bool.booleanValue();
        } else {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            if (e0Var != null) {
                if (((h62.d) e0Var).Ni(e42.c0.clicfg_android_appbrand_auto_clean_enable, 0) == 1) {
                    z18 = true;
                }
            }
            z18 = false;
        }
        long j27 = 0;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCacheCleaner", "doCleanForSize, auto clean disabled");
            return 0L;
        }
        java.lang.Long l17 = n81.c.f417138b;
        if (l17 != null) {
            j19 = l17.longValue();
        } else {
            e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
            if (e0Var2 != null) {
                int Ni = ((h62.d) e0Var2).Ni(e42.c0.clicfg_android_appbrand_auto_clean_expired_days, 60);
                if (Ni < 14) {
                    Ni = 14;
                }
                j18 = Ni;
            } else {
                j18 = 180;
            }
            j19 = j18 * 86400;
        }
        e42.e0 e0Var3 = (e42.e0) i95.n0.c(e42.e0.class);
        java.lang.String Zi = e0Var3 != null ? ((h62.d) e0Var3).Zi(e42.c0.clicfg_android_appbrand_auto_clean_whitelist, "", true) : null;
        java.util.List f07 = r26.n0.f0(Zi == null ? "" : Zi, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            arrayList.add(r26.n0.u0((java.lang.String) it.next()).toString());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (((java.lang.String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCacheCleaner", "doCleanForSize, expectCleanSize=" + j17 + ", expiredSeconds=" + j19 + ", whitelist=" + X0 + ", dryRun=" + z17);
        for (n81.d dVar : kz5.n0.F0(n81.p.f417161a.h(2, j19, X0), new n81.a())) {
            if ((c26987xeef691ab != null && c26987xeef691ab.m108008xc9602be3()) || j27 >= j17) {
                break;
            }
            j27 += z17 ? ((java.lang.Number) dVar.f417144f.mo152xb9724478()).longValue() : ((java.lang.Number) dVar.f417146h.mo152xb9724478()).longValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCacheCleaner", "doCleanForSize done, totalCleaned=" + j27 + " bytes, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return j27;
    }

    @Override // zv1.d
    public java.util.List e() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List i17 = n81.p.i(n81.p.f417161a, 3, 0L, null, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((n81.d) it.next()).f417142d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCacheCleaner", "getCachePaths, size=" + arrayList.size() + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return arrayList;
    }
}

package n81;

/* loaded from: classes7.dex */
public final class q implements zv1.d {
    @Override // zv1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 a() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35411xd7defeda;
    }

    @Override // zv1.d
    public java.util.Map b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = ((java.util.ArrayList) n81.p.i(n81.p.f417161a, 4, 0L, null, 6, null)).iterator();
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCacheCleaner", "getTaggedCachePaths, tags=" + linkedHashMap.keySet() + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return linkedHashMap;
    }

    @Override // zv1.d
    public java.util.List e() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List i17 = n81.p.i(n81.p.f417161a, 4, 0L, null, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((n81.d) it.next()).f417142d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCacheCleaner", "getCachePaths, size=" + arrayList.size() + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return arrayList;
    }
}

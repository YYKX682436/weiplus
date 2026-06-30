package zv1;

/* loaded from: classes10.dex */
public final class a {
    public final java.util.Map a(java.util.Map cacheTypeSizes, zv1.e0 threshold) {
        long j17;
        boolean z17;
        boolean z18;
        long j18;
        long j19;
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheTypeSizes, "cacheTypeSizes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threshold, "threshold");
        long J0 = kz5.n0.J0(cacheTypeSizes.values());
        long max = java.lang.Math.max(0L, J0 - threshold.f557824b);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = cacheTypeSizes.entrySet().iterator();
        long j27 = max;
        while (true) {
            boolean hasNext = it.hasNext();
            j17 = threshold.f557823a;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 enumC13101x40600c60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60) entry.getKey();
            long longValue = ((java.lang.Number) entry.getValue()).longValue();
            if (longValue > j17) {
                long j28 = longValue - j17;
                linkedHashMap.put(enumC13101x40600c60, java.lang.Long.valueOf(j28));
                j27 -= j28;
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (j27 > 0) {
            double d17 = j27 / (j27 + r4);
            for (java.util.Iterator it6 = cacheTypeSizes.entrySet().iterator(); it6.hasNext(); it6 = it6) {
                linkedHashMap2.put((com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60) ((java.util.Map.Entry) it6.next()).getKey(), java.lang.Long.valueOf((long) (java.lang.Math.min(((java.lang.Number) r5.getValue()).longValue(), j17) * d17)));
            }
        }
        java.util.Collection values = linkedHashMap.values();
        if (!(values instanceof java.util.Collection) || !values.isEmpty()) {
            java.util.Iterator it7 = values.iterator();
            while (it7.hasNext()) {
                if (((java.lang.Number) it7.next()).longValue() < 0) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            java.util.Collection values2 = linkedHashMap2.values();
            if (!(values2 instanceof java.util.Collection) || !values2.isEmpty()) {
                java.util.Iterator it8 = values2.iterator();
                while (it8.hasNext()) {
                    if (((java.lang.Number) it8.next()).longValue() < 0) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (!z18) {
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 enumC13101x40600c602 : cacheTypeSizes.keySet()) {
                    java.lang.Long l17 = (java.lang.Long) cacheTypeSizes.get(enumC13101x40600c602);
                    long longValue2 = l17 != null ? l17.longValue() : 0L;
                    java.lang.Long l18 = (java.lang.Long) linkedHashMap.get(enumC13101x40600c602);
                    long longValue3 = l18 != null ? l18.longValue() : 0L;
                    java.lang.Long l19 = (java.lang.Long) linkedHashMap2.get(enumC13101x40600c602);
                    if (l19 != null) {
                        j19 = l19.longValue();
                        j18 = 0;
                    } else {
                        j18 = 0;
                        j19 = 0;
                    }
                    if (longValue3 > j18 && j19 > j18) {
                        i18 = 3;
                    } else if (longValue3 > j18) {
                        i18 = 2;
                    } else {
                        i17 = j19 > j18 ? 1 : 0;
                        zv1.b bVar = new zv1.b(i17, longValue3, j19, longValue2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Algo", "calculateAllocationResults: " + enumC13101x40600c602 + ", alloc=" + bVar);
                        linkedHashMap3.put(enumC13101x40600c602, bVar);
                    }
                    i17 = i18;
                    zv1.b bVar2 = new zv1.b(i17, longValue3, j19, longValue2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Algo", "calculateAllocationResults: " + enumC13101x40600c602 + ", alloc=" + bVar2);
                    linkedHashMap3.put(enumC13101x40600c602, bVar2);
                }
                return linkedHashMap3;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CleanCache.Algo", "Invalid allocation: threshold=" + threshold + ", cacheTypeSizes=" + cacheTypeSizes + ", totalSize=" + J0 + ", totalExceed=" + max + ", stage1Allocation=" + linkedHashMap + ", stage2Allocation=" + linkedHashMap2);
        throw new java.lang.IllegalArgumentException("AllocationAlgorithm: Invalid allocation");
    }
}

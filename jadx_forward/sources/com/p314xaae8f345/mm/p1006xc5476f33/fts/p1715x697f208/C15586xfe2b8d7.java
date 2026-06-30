package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* renamed from: com.tencent.mm.plugin.fts.train.WCSearchGroupClickHistory */
/* loaded from: classes12.dex */
public final class C15586xfe2b8d7 {

    /* renamed from: MAX_RETAIN_DAYS */
    static final int f36397x680ed8d6 = 30;

    /* renamed from: MAX_TIMESTAMPS_PER_KEY */
    static final int f36398x5f1c4eb6 = 64;

    /* renamed from: MMKV_NAME */
    static final java.lang.String f36399xeee32f3f = "group_search_click";

    /* renamed from: ONE_DAY_SECONDS */
    private static final long f36400xfc7ea023 = 86400;
    private static final java.lang.String TAG = "MicroMsg.FTS.GroupClickHistory";

    private C15586xfe2b8d7() {
    }

    /* renamed from: clearAllForTest */
    public static void m63557xfc93c647() {
        m63561x33330b().clear();
    }

    /* renamed from: computeStats */
    public static com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.a m63558x8d6fd6a8(java.util.List<java.lang.Long> list, long j17) {
        long j18 = j17 - 604800;
        long j19 = j17 - 1209600;
        long j27 = j17 - 2592000;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        int i17 = 0;
        long j28 = 0;
        int i18 = 0;
        int i19 = 0;
        long j29 = 0;
        for (java.lang.Long l17 : list) {
            if (l17 != null && l17.longValue() > j28) {
                if (l17.longValue() > j29) {
                    j29 = l17.longValue();
                }
                if (l17.longValue() >= j27) {
                    i19++;
                    hashMap3.put(java.lang.Long.valueOf(l17.longValue() / 86400), java.lang.Boolean.TRUE);
                }
                if (l17.longValue() >= j19) {
                    i18++;
                    hashMap2.put(java.lang.Long.valueOf(l17.longValue() / 86400), java.lang.Boolean.TRUE);
                }
                if (l17.longValue() >= j18) {
                    i17++;
                    hashMap.put(java.lang.Long.valueOf(l17.longValue() / 86400), java.lang.Boolean.TRUE);
                }
            }
            j28 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.a();
        aVar.f219320a = i17;
        aVar.f219321b = i18;
        aVar.f219322c = i19;
        aVar.f219323d = hashMap.size();
        aVar.f219324e = hashMap2.size();
        aVar.f219325f = hashMap3.size();
        aVar.f219326g = (int) (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & j29);
        return aVar;
    }

    /* renamed from: encodeTimestamps */
    public static java.lang.String m63559xfab5f0d3(java.util.List<java.lang.Long> list) {
        if (list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(list.size() * 11);
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 > 0) {
                sb6.append(',');
            }
            sb6.append(list.get(i17));
        }
        return sb6.toString();
    }

    /* renamed from: getStats */
    public static com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.a m63560x75286ae9(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.a.f219319h;
        if (K0) {
            return aVar;
        }
        try {
            java.lang.String u17 = m63561x33330b().u(str, "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                return aVar;
            }
            java.util.List<java.lang.Long> m63562x2b166d30 = m63562x2b166d30(u17);
            return m63562x2b166d30.isEmpty() ? aVar : m63558x8d6fd6a8(m63562x2b166d30, java.lang.System.currentTimeMillis() / 1000);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "getStats failed for %s: %s", str, th6.getMessage());
            return aVar;
        }
    }

    /* renamed from: mmkv */
    private static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 m63561x33330b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N(f36399xeee32f3f, 1, null);
    }

    /* renamed from: parseTimestamps */
    public static java.util.List<java.lang.Long> m63562x2b166d30(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return arrayList;
        }
        for (java.lang.String str2 : str.split(",")) {
            if (str2 != null && !str2.isEmpty()) {
                try {
                    long parseLong = java.lang.Long.parseLong(str2.trim());
                    if (parseLong > 0) {
                        arrayList.add(java.lang.Long.valueOf(parseLong));
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: recordClick */
    public static void m63563x4cf873b7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            java.util.List<java.lang.Long> m63562x2b166d30 = m63562x2b166d30(m63561x33330b().u(str, ""));
            m63562x2b166d30.add(java.lang.Long.valueOf(currentTimeMillis));
            m63561x33330b().D(str, m63559xfab5f0d3(m63564x42b97d4(m63562x2b166d30, currentTimeMillis)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "recordClick failed for %s: %s", str, th6.getMessage());
        }
    }

    /* renamed from: trimAndExpire */
    public static java.util.List<java.lang.Long> m63564x42b97d4(java.util.List<java.lang.Long> list, long j17) {
        long j18 = j17 - 2592000;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.Long l17 : list) {
            if (l17 != null && l17.longValue() >= j18) {
                arrayList.add(l17);
            }
        }
        return arrayList.size() > 64 ? new java.util.ArrayList(arrayList.subList(arrayList.size() - 64, arrayList.size())) : arrayList;
    }
}

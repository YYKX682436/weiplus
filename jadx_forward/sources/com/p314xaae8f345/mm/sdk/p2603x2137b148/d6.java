package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes11.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 f274057a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.d6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f274058b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static long f274059c = 200;

    /* renamed from: d, reason: collision with root package name */
    public static long f274060d = 1000;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f274061e = true;

    public static final boolean a(com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 d6Var, int i17) {
        boolean z17;
        synchronized (d6Var) {
            if (f274061e) {
                java.util.HashMap hashMap = f274058b;
                if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                    java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17));
                    if (l17 == null) {
                        l17 = -1L;
                    }
                    long longValue = l17.longValue();
                    if (longValue > 0) {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        z17 = android.os.SystemClock.elapsedRealtime() - longValue <= f274059c;
                    }
                }
            }
        }
        return z17;
    }

    public static final void b(com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 d6Var, int i17) {
        synchronized (d6Var) {
            if (f274061e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySoundNew", "updateAssetPlayTime:" + i17);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.util.HashMap hashMap = f274058b;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                hashMap.put(valueOf, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                d6Var.c();
            }
        }
    }

    public static final void d(android.content.Context context, int i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x5 speakeron, boolean z17, com.p314xaae8f345.mm.sdk.p2603x2137b148.w5 w5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(speakeron, "speakeron");
        e(context, i17, speakeron, -1, z17, w5Var);
    }

    public static final void e(android.content.Context context, int i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x5 speakeron, int i18, boolean z17, com.p314xaae8f345.mm.sdk.p2603x2137b148.w5 w5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(speakeron, "speakeron");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PlaySoundNew", "play Err context:%s pathId:%d speekeron:%s looping:%b listener:%s", context, java.lang.Integer.valueOf(i17), speakeron, java.lang.Boolean.valueOf(z17), w5Var);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.sdk.p2603x2137b148.c6(context, i17, speakeron, i18, z17, w5Var));
    }

    public final void c() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashMap hashMap = f274058b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (elapsedRealtime - ((java.lang.Number) entry.getValue()).longValue() >= f274060d) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        if (!keySet.isEmpty()) {
            java.util.Iterator it6 = keySet.iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySoundNew", "evictOutDateRateControlInfo:" + intValue);
                hashMap.remove(java.lang.Integer.valueOf(intValue));
            }
        }
    }
}

package no3;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ no3.h f420292e;

    public g(no3.h hVar, java.lang.String str) {
        this.f420292e = hVar;
        this.f420291d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.Pair pair;
        int i17;
        java.util.Map map;
        int i18;
        java.util.Map map2;
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotificationObserver", "account not init.");
            return;
        }
        mm.w.e("badge");
        java.lang.String str = this.f420291d;
        boolean h17 = c01.h2.h(str);
        int i19 = -1;
        no3.h hVar = this.f420292e;
        if (!h17 || (map2 = hVar.f420293a.f420295e) == null || map2.containsKey(str)) {
            if (gm0.j1.a()) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.util.HashMap f17 = c01.h2.f(1);
                java.util.HashMap hashMap = new java.util.HashMap();
                int i27 = 0;
                for (com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var : f17.values()) {
                    i27 += l4Var.d1();
                    hashMap.put(l4Var.h1(), java.lang.Integer.valueOf(l4Var.d1()));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLogic", "get total unread %d and details with black list use %d ms", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                pair = new android.util.Pair(java.lang.Integer.valueOf(i27), hashMap);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationLogic", "get total unread and details with black list, but has not set uin");
                pair = null;
            }
            if (pair != null) {
                i17 = ((java.lang.Integer) pair.first).intValue();
                map = (java.util.Map) pair.second;
                hVar.f420293a.f420295e = map;
                if (map.containsKey(str)) {
                    i19 = ((java.lang.Integer) hVar.f420293a.f420295e.get(str)).intValue();
                }
            } else {
                i17 = -1;
                map = null;
            }
            if (!h17 && i19 < 0) {
                i19 = c01.h2.d(str, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationObserver", "Update talker %s, %s", str, java.lang.Integer.valueOf(i19));
            }
            i18 = i17;
        } else {
            i18 = -1;
            map = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new no3.f(this, i18, h17, h17 ? 0 : i19, map));
    }
}

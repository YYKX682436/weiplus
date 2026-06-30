package fm3;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final fm3.y f345694a = new fm3.y();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f345695b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f345696c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f345697d = new java.util.HashMap();

    public final void a(long j17) {
        synchronized (this) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("evictTimeoutCache, timestamp:");
            sb6.append(j17);
            sb6.append(", finderFeedDetailCache.size:");
            java.util.HashMap hashMap = f345695b;
            sb6.append(hashMap.size());
            sb6.append(", mvRecommendListCache.size:");
            sb6.append(f345696c.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", sb6.toString());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (hashMap) {
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    if (j17 - ((fm3.e) entry.getValue()).f345577b > 180000) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f345695b.remove((fm3.f) it.next());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap2 = f345696c;
            synchronized (hashMap2) {
                for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
                    if (j17 - ((fm3.a0) entry2.getValue()).f345558b > 180000) {
                        arrayList2.add(entry2.getKey());
                    }
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                f345696c.remove((fm3.b0) it6.next());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", "finished evictTimeoutCache, finderFeedDetailCache.size:" + f345695b.size() + ", mvRecommendListCache.size:" + f345696c.size());
        }
    }
}

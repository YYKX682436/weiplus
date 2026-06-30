package ey2;

/* loaded from: classes2.dex */
public final class p2 extends pf5.o0 {

    /* renamed from: g, reason: collision with root package name */
    public static final ey2.o2 f339000g = new ey2.o2(null);

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f339001e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f339002f = new java.util.concurrent.ConcurrentHashMap();

    public final ey2.n2 N6(java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f339002f;
        ey2.n2 n2Var = (ey2.n2) concurrentHashMap.get(key);
        if (n2Var == null) {
            n2Var = new ey2.n2(key);
            concurrentHashMap.put(key, new ey2.n2(key));
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFeedCacheVM", "[get] key:" + key + " size:" + n2Var.f338971b.size());
        }
        return n2Var;
    }

    public final void O6(java.lang.String key, java.util.List lastDataList, r45.r03 r03Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastDataList, "lastDataList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFeedCacheVM", "[store] key:" + key + " size:" + lastDataList.size());
        ey2.n2 N6 = N6(key, true);
        N6.f338971b = lastDataList;
        N6.f338972c = r03Var;
        this.f339002f.put(key, N6);
    }
}

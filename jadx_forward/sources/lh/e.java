package lh;

/* loaded from: classes12.dex */
public final class e implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb f400126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f400127b;

    public e(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb, int i17) {
        this.f400126a = c4627xadd9bddb;
        this.f400127b = i17;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        java.util.Map m40827x8f8c4694;
        java.util.Map m40827x8f8c46942;
        java.util.Map stringListMap = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stringListMap, "stringListMap");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : stringListMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            for (m3.d dVar : (java.util.List) entry.getValue()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.Class cls = (java.lang.Class) dVar.f404625a;
                sb6.append(cls == gi.y1.class ? "ThreadPool" : cls == gi.g1.class ? "MMHanlder" : cls == gi.v0.class ? "Ipc" : cls == kh.k1.class ? "Looper" : cls.getSimpleName());
                sb6.append('-');
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                java.lang.Long l17 = (java.lang.Long) hashMap.get(sb7);
                long longValue = l17 != null ? l17.longValue() : 0L;
                java.lang.Object obj2 = dVar.f404626b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                java.lang.Number number = ((rh.f) ((rh.o2) obj2).f477019c).f476910g.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
                hashMap.put(sb7, java.lang.Long.valueOf(longValue + number.longValue()));
            }
        }
        java.lang.String g17 = ri.i.g(bm5.f1.a());
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb = this.f400126a;
        m40827x8f8c4694 = c4627xadd9bddb.m40827x8f8c4694(c4627xadd9bddb.m40793xd9ab850f());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        java.lang.Object obj3 = m40827x8f8c4694.get(g17);
        if (obj3 == null) {
            obj3 = new java.util.LinkedHashMap();
            m40827x8f8c4694.put(g17, obj3);
        }
        java.util.Map map = (java.util.Map) obj3;
        for (java.util.Map.Entry entry2 : kz5.n0.K0(((java.util.LinkedHashMap) wh.m.B(hashMap, lh.d.f400125d)).entrySet(), this.f400127b)) {
            m40827x8f8c46942 = c4627xadd9bddb.m40827x8f8c4694(map);
            java.lang.Object key = entry2.getKey();
            java.lang.Object obj4 = map.get(entry2.getKey());
            if (obj4 == null) {
                obj4 = 0L;
            }
            m40827x8f8c46942.put(key, java.lang.Long.valueOf(((java.lang.Number) obj4).longValue() + ((java.lang.Number) entry2.getValue()).longValue()));
        }
    }
}

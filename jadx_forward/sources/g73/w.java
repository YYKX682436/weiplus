package g73;

/* loaded from: classes15.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.w f350870d = new g73.w();

    public w() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f350847g;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) entry.getValue()).getHandOffType() == 2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it6 = linkedHashMap.keySet().iterator();
        while (it6.hasNext()) {
            g73.o0.f350847g.remove((java.lang.String) it6.next());
        }
        if (!linkedHashMap.isEmpty()) {
            g73.m2 m2Var = g73.o0.f350853p;
            java.util.Collection handOffList = linkedHashMap.values();
            m2Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOffList, "handOffList");
            java.util.Iterator it7 = handOffList.iterator();
            while (it7.hasNext()) {
                m2Var.d((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) it7.next());
            }
        }
        return jz5.f0.f384359a;
    }
}

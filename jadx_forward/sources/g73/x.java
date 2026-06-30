package g73;

/* loaded from: classes15.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f350872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260) {
        super(0);
        this.f350872d = abstractC16085x8c838260;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        g73.o0.f350849i.mo50303x856b99f0(1);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f350847g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = this.f350872d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c8382602 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) concurrentHashMap.get(abstractC16085x8c838260.getKey());
        if (abstractC16085x8c8382602 != null && abstractC16085x8c8382602.mo65043xce0038c9(abstractC16085x8c838260)) {
            g73.o0 o0Var = g73.o0.f350844d;
            if (g73.o0.wi(o0Var) || g73.o0.Ai(o0Var, abstractC16085x8c838260)) {
                g73.m2 m2Var = g73.o0.f350853p;
                m2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "mod " + abstractC16085x8c8382602.getId());
                java.util.Map map = m2Var.f350833q;
                if (!map.containsKey(abstractC16085x8c8382602.getKey())) {
                    map.put(abstractC16085x8c8382602.getKey(), java.lang.Boolean.TRUE);
                    m2Var.f350834r.put(abstractC16085x8c8382602.getKey(), abstractC16085x8c8382602.getId());
                }
                m2Var.f350832p.remove(abstractC16085x8c8382602.getKey());
                java.util.Map map2 = m2Var.f350830n;
                if (map2.containsKey(abstractC16085x8c8382602.getKey())) {
                    java.lang.Object obj = ((java.util.LinkedHashMap) map2).get(abstractC16085x8c8382602.getKey());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) obj).mo65043xce0038c9(abstractC16085x8c8382602);
                } else {
                    m2Var.f350831o.put(abstractC16085x8c8382602.getKey(), abstractC16085x8c8382602);
                }
                m2Var.a();
            }
        }
        return jz5.f0.f384359a;
    }
}

package sc2;

/* loaded from: classes2.dex */
public final class p2 {

    /* renamed from: b, reason: collision with root package name */
    public static final sc2.o2 f487676b = new sc2.o2(null);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f487677c = jz5.h.b(sc2.n2.f487627d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f487678a = new java.util.concurrent.ConcurrentLinkedQueue();

    public p2() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(java.util.List list) {
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()).getFeedObject().m76802x2dd01666();
            if (m76802x2dd01666 != null) {
                m76802x2dd01666.m76944x730bcac6();
            }
        }
        java.util.Iterator it6 = this.f487678a.iterator();
        if (it6.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
            throw null;
        }
    }
}

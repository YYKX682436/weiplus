package wg2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final wg2.a f527253a = new wg2.a();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f527254b;

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6 b6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class);
        if (b6Var == null) {
            return false;
        }
        com.p314xaae8f345.mm.p957x53236a1b.t tVar = (com.p314xaae8f345.mm.p957x53236a1b.t) b6Var;
        if (!c01.d9.b().F()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "not wxOnline");
            return false;
        }
        if (tVar.Bi()) {
            return true;
        }
        java.util.Iterator it = ((java.util.ArrayList) tVar.Ai()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6 v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.v6) it.next();
            int i17 = v6Var.f170341c;
            if (i17 == 15 || i17 == 14) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "online type:" + v6Var.f170339a + " version:" + v6Var.f170340b);
                if (ug3.i.f509076q >= (v6Var.f170341c == 15 ? 1661142272 : 318898176)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260) {
        java.lang.String key = abstractC16085x8c838260 != null ? abstractC16085x8c838260.getKey() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c8382602 = f527254b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, abstractC16085x8c8382602 != null ? abstractC16085x8c8382602.getKey() : null)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c8382603 = f527254b;
        if (abstractC16085x8c8382603 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "delete previous handoff: " + abstractC16085x8c8382603);
            ((d73.i) i95.n0.c(d73.i.class)).A8(abstractC16085x8c8382603.getKey());
        }
        f527254b = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey " + ((java.lang.String) null));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("FinderLiveHandOffUtil_current");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 c(gk2.e eVar) {
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveHandOffUtil", "liveContext is null");
            return null;
        }
        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveHandOffUtil", "contact is null username: " + ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
            return null;
        }
        mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
        i95.m c17 = i95.n0.c(b70.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String w07 = b17.w0();
        java.lang.String m176700xe5e0d2a0 = b17.m176700xe5e0d2a0();
        java.lang.String objectId = java.lang.String.valueOf(e1Var.f410516m);
        java.lang.String nonceId = e1Var.f410525v;
        java.lang.String key = java.lang.String.valueOf(e1Var.f410521r.m75942xfb822ef2(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectId, "objectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "liveId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16088x98e700b2(w07, m176700xe5e0d2a0, objectId, nonceId, key, 1, "", "", key);
    }
}

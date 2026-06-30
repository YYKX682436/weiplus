package fk5;

/* loaded from: classes11.dex */
public final class z extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public z() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5563x74e6cdd7 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5563x74e6cdd7) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.ce ceVar = event.f135882g;
        if (ceVar == null) {
            return true;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        linkedHashMap.put("comment_scene", a52.a.f83117l);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        linkedHashMap.put("behaviour_session_id", Ri);
        int i17 = ceVar.f87881a;
        if (i17 == 51 || i17 == 129 || i17 == 63) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String c17 = b52.b.c();
            if (c17 == null) {
                c17 = "";
            }
            linkedHashMap.put("finder_tab_context_id", c17);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            linkedHashMap.put("finder_context_id", b17 != null ? b17 : "");
        }
        am.de deVar = event.f135883h;
        java.util.Map map = deVar.f87978a;
        if (map != 0) {
            map.putAll(linkedHashMap);
            linkedHashMap = map;
        }
        deVar.f87978a = linkedHashMap;
        return true;
    }
}

package g73;

/* loaded from: classes8.dex */
public final class m extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g73.n f350821a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.os.Looper looper, g73.n nVar) {
        super(looper);
        this.f350821a = nVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what == 1) {
            g73.n nVar = this.f350821a;
            java.util.Map map2 = nVar.f350840b;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) map2;
            java.util.Iterator it = linkedHashMap2.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                map = nVar.f350841c;
                if (!hasNext) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.LinkedHashMap) map).get((java.lang.String) entry.getKey()), java.lang.Boolean.TRUE)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            try {
                java.util.Iterator it6 = linkedHashMap.values().iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 rb6 = ((d73.i) i95.n0.c(d73.i.class)).rb(((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) it6.next()).getId());
                    if (rb6 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).bj(rb6.getKey(), nVar.a(rb6));
                        if (bj6 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.RequestProcessor", "processDelRequest multiTask");
                            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.We((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) c17, bj6.f66791xc8a07680, bj6.f66793x2262335f, false, 4, null);
                            ((d73.i) i95.n0.c(d73.i.class)).k8();
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                e17.getLocalizedMessage();
            }
            java.util.Map map3 = nVar.f350839a;
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap4 = (java.util.LinkedHashMap) map3;
            for (java.util.Map.Entry entry2 : linkedHashMap4.entrySet()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.LinkedHashMap) map).get((java.lang.String) entry2.getKey()), java.lang.Boolean.FALSE)) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            try {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 : linkedHashMap3.values()) {
                    jz5.l m65023xafe1bc90 = abstractC16085x8c838260.m65023xafe1bc90();
                    if (m65023xafe1bc90 != null) {
                        int a17 = nVar.a(abstractC16085x8c838260);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.RequestProcessor", "processAddRequest multiTask");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).wi(abstractC16085x8c838260.getKey(), a17, (r45.lr4) m65023xafe1bc90.f384366d, (byte[]) m65023xafe1bc90.f384367e, new mk3.a(null, false, false, 7, null));
                        ((d73.i) i95.n0.c(d73.i.class)).k8();
                    }
                }
            } catch (java.lang.Exception e18) {
                e18.getLocalizedMessage();
            }
            linkedHashMap4.clear();
            linkedHashMap2.clear();
            ((java.util.LinkedHashMap) map).clear();
        }
    }
}

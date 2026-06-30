package cz0;

/* loaded from: classes5.dex */
public final class c0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f306471d = new java.util.LinkedHashMap();

    public c0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.t2 t2Var = event.f135588g;
        if (t2Var.f89499a != 103 || t2Var.f89501c != 0) {
            return false;
        }
        int i17 = t2Var.f89500b;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = f306471d;
        java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (currentTimeMillis - (l17 != null ? l17.longValue() : 0L) < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSdkResPreEventListener", "skip duplicate download start report: subtype=" + i17);
            return false;
        }
        map.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181 c6712x32f26181 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6712x32f26181();
        c6712x32f26181.f140536d = cz0.y.f306503b;
        c6712x32f26181.f140539g = 6;
        c6712x32f26181.f140540h = i17;
        c6712x32f26181.f140544l = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSdkResPreEventListener", "download start: subtype=" + i17);
        c6712x32f26181.k();
        return false;
    }
}

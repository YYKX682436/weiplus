package l14;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(java.lang.String viewID, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewID, "viewID");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("before_value", java.lang.Integer.valueOf(z17 ? 2 : 1));
        hashMap.put("after_value", java.lang.Integer.valueOf(z17 ? 1 : 2));
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242411a;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242412b;
        if (str == null) {
            str = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242411a).mo141623x754a37bb();
        }
        hashMap.put("care_mode_sessionid", str);
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewID, "view_clk", hashMap, 35684);
    }

    public static final void b(boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6360x601cdabd c6360x601cdabd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6360x601cdabd();
        c6360x601cdabd.f137113d = z17 ? 1L : 0L;
        c6360x601cdabd.k();
    }
}

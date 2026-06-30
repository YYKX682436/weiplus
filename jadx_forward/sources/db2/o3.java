package db2;

/* loaded from: classes2.dex */
public abstract class o3 {
    public static final void a(db2.c3 c3Var, int i17, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "saveConfigWhenEnterFinderStreamEnter: tabType=" + i17 + ", headWording=" + c3Var.m75945x2fec8307(3) + ", endWording=" + c3Var.m75945x2fec8307(4) + ", prefetch_last_feed_count=" + c3Var.m75939xb282bd08(8) + ", flow_card_prefetch_last_feed_count=" + c3Var.m75939xb282bd08(25));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, c3Var.m75945x2fec8307(3));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, c3Var.m75945x2fec8307(4));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, java.lang.Integer.valueOf(c3Var.m75939xb282bd08(8)));
        if (c3Var.m75939xb282bd08(25) > 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TWO_FLOW_PRELOAD_NUM_INT_SYNC, java.lang.Integer.valueOf(c3Var.m75939xb282bd08(25)));
        }
    }
}

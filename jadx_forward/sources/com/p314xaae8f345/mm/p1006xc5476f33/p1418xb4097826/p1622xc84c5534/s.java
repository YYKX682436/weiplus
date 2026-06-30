package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s f206870a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.i f206871b = new com.p176xb6135e39.p280x308fcb.i();

    public final java.util.Map a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, int i17, int i18, r45.ey0 ey0Var, r45.en2 en2Var) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (en2Var == null || (str = en2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        linkedHashMap.put("feed_column_name", str);
        linkedHashMap.put("feed_columnid", java.lang.Integer.valueOf(ey0Var != null ? ey0Var.m75939xb282bd08(0) : 0));
        linkedHashMap.put("column_exp_index", java.lang.Integer.valueOf(i18 + 1));
        linkedHashMap.put("column_card_index", java.lang.Integer.valueOf(i17 + 1));
        linkedHashMap.put("session_buffer", feed.g0());
        linkedHashMap.put("feed_id", pm0.v.u(feed.mo2128x1ed62e84()));
        return linkedHashMap;
    }

    public final void b(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, int i17, int i18, r45.ey0 ey0Var, r45.en2 en2Var, ey2.u uVar, android.content.Context context, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.Map a17 = a(feed, i17, i18, ey0Var, en2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r(uVar, feed, context, i19);
        if (i27 == 8) {
            hc2.v0.d(view, "column_card", "view_clk", true, a17, null, 16, null);
        } else {
            hc2.v0.e(view, "column_card", i27, 0, false, false, a17, rVar, 28, null);
        }
    }
}

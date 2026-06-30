package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class k2 {
    public k2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String feedIdString, java.lang.String viewId, java.lang.String eventId) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedIdString, "feedIdString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str2 = "";
        if (V6 == null || (str = V6.m75945x2fec8307(2)) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.m75939xb282bd08(5) : 0));
        lVarArr[3] = new jz5.l("feed_id", feedIdString);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, kz5.c1.l(lVarArr), 25496);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class xf {
    public xf(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String source, java.lang.String viewId, java.lang.String titleStr, java.lang.String subTitleStr, r45.qt2 qt2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, so2.j5 j5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ag reason) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject4;
        r45.xs2 xs2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleStr, "titleStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subTitleStr, "subTitleStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        long m75942xfb822ef2 = (jbVar == null || (xs2Var = jbVar.N) == null) ? 0L : xs2Var.m75942xfb822ef2(3);
        java.lang.String str2 = null;
        java.lang.String str3 = jbVar != null ? jbVar.f65880x11c19d58 : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = jbVar != null ? jbVar.f65882x5364c75d : null;
        if (str4 == null) {
            str4 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        java.lang.String m76829x97edf6c0 = (abstractC14490x69736cb5 == null || (feedObject3 = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject4 = feedObject3.getFeedObject()) == null) ? null : feedObject4.m76829x97edf6c0();
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (m76760x76845fea = feedObject2.m76760x76845fea()) != null) {
            str2 = m76760x76845fea.m76197x6c03c64c();
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[12];
        lVarArr[0] = new jz5.l("finder_tab_context_id", (qt2Var == null || (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) == null) ? "" : m75945x2fec8307);
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : "");
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        lVarArr[4] = new jz5.l("session_buffer", m76829x97edf6c0 == null ? "" : m76829x97edf6c0);
        lVarArr[5] = new jz5.l("finder_username", str2 == null ? "" : str2);
        lVarArr[6] = new jz5.l("notice_feedid", pm0.v.u(m75942xfb822ef2));
        lVarArr[7] = new jz5.l("notice_title", titleStr);
        lVarArr[8] = new jz5.l("notice_subtitle", subTitleStr);
        lVarArr[9] = new jz5.l("notice_unexp_reason", java.lang.Integer.valueOf(reason.f213180d));
        lVarArr[10] = new jz5.l("notice_tipsid", str3);
        lVarArr[11] = new jz5.l("notice_tipsuuid", str4);
        java.lang.String str5 = m76829x97edf6c0;
        ((cy1.a) rVar).Bj(viewId, "view_unexp", kz5.c1.k(lVarArr), 1, false);
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPopupBubbleView", source + " reportUnexpose viewId=" + viewId + ", titleStr=" + titleStr + ", subTitleStr=" + subTitleStr + ", reason=" + reason + ",username=" + str2 + ",sessionBuffer=" + str5);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class h0 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.y0 f213734a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f213735b;

    public h0(so2.y0 commentItem, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213734a = commentItem;
        this.f213735b = context;
    }

    @Override // db5.r4
    public void a(android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        java.lang.Object obj;
        java.util.Map l17;
        char c17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        java.util.Map k17 = kz5.c1.k(new jz5.l(1, "comment_delete"), new jz5.l(3, "comment_blacklisted"), new jz5.l(9, "comment_blacklisted_movein"), new jz5.l(10, "comment_blacklisted_and_delete"));
        so2.y0 commentItem = this.f213734a;
        boolean z17 = commentItem instanceof so2.z0;
        java.util.Map k18 = kz5.c1.k(new jz5.l(0, "comment_copy"), new jz5.l(6, "comment_topup"), new jz5.l(2, "comment_complaint"), new jz5.l(13, "comment_all_translate"), new jz5.l(14, "comment_all_cancel_translate"), new jz5.l(17, "share_comment"));
        boolean containsKey = k17.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()));
        android.content.Context context = this.f213735b;
        if (containsKey) {
            java.lang.String viewId = (java.lang.String) k17.get(java.lang.Integer.valueOf(menuItem.getItemId()));
            if (viewId == null || r26.n0.N(viewId)) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(menuView, viewId);
            dy1.r ik6 = aVar.ik(menuView, 40, 25496);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", viewId);
            lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
            lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
            lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
            lVarArr[4] = new jz5.l("comment_id", pm0.v.u(commentItem.f492236d.t0()));
            lVarArr[5] = new jz5.l("feed_id", pm0.v.u(commentItem.f492236d.f68959xf9a02e3e));
            ((cy1.a) ik6).gk(menuView, kz5.c1.l(lVarArr));
            return;
        }
        if (k18.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
            java.lang.String viewId2 = (java.lang.String) k18.get(java.lang.Integer.valueOf(menuItem.getItemId()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
            int itemId = menuItem.getItemId();
            if (itemId == 13 || itemId == 14) {
                obj = "finder_context_id";
                l17 = kz5.c1.l(new jz5.l("translate_to_language", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), new jz5.l("session_buffer", b(z17, V6)));
            } else {
                obj = "finder_context_id";
                l17 = itemId == 17 ? kz5.c1.l(new jz5.l("session_buffer", b(z17, V6))) : null;
            }
            if (viewId2 == null || r26.n0.N(viewId2)) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId2, "viewId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V62 = nyVar3 != null ? nyVar3.V6() : null;
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(menuView, viewId2);
            aVar2.Tj(menuView, 40, 1, false);
            jz5.l[] lVarArr2 = new jz5.l[5];
            lVarArr2[0] = new jz5.l("comment_id", pm0.v.u(commentItem.mo2128x1ed62e84()));
            boolean z18 = true;
            lVarArr2[1] = new jz5.l("feed_id", pm0.v.u(commentItem instanceof so2.z0 ? ((so2.z0) commentItem).E.m59251x5db1b11() : commentItem.f492236d.f68959xf9a02e3e));
            if (V62 != null) {
                c17 = 2;
                str = V62.m75945x2fec8307(2);
            } else {
                c17 = 2;
                str = null;
            }
            lVarArr2[c17] = new jz5.l("finder_tab_context_id", str);
            lVarArr2[3] = new jz5.l(obj, V62 != null ? V62.m75945x2fec8307(1) : null);
            lVarArr2[4] = new jz5.l("comment_scene", V62 != null ? java.lang.Integer.valueOf(V62.m75939xb282bd08(5)) : null);
            java.util.Map l18 = kz5.c1.l(lVarArr2);
            if (l17 != null && !l17.isEmpty()) {
                z18 = false;
            }
            if (!z18) {
                l18.putAll(l17);
            }
            aVar2.gk(menuView, l18);
        }
    }

    public final java.lang.String b(boolean z17, r45.qt2 qt2Var) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        so2.y0 y0Var = this.f213734a;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(y0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedCommentHeaderContent");
            j17 = ((so2.z0) y0Var).E.m59251x5db1b11();
        } else {
            j17 = y0Var.f492236d.f68959xf9a02e3e;
        }
        return o3Var.ek(j17, y0Var.f492236d.f68957xec748fc6, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0);
    }
}

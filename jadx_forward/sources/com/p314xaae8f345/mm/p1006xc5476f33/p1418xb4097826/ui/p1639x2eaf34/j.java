package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34;

/* loaded from: classes9.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f210552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l f210553e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l lVar) {
        this.f210552d = abstractC14490x69736cb5;
        this.f210553e = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f210552d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(abstractC14490x69736cb5.getFeedObject().getMsgTalker(), abstractC14490x69736cb5.getFeedObject().getMsgId());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f210552d;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l lVar = this.f210553e;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConvSearchFeedViewCallback", "[handleSelectedItem] index:%s", java.lang.Integer.valueOf(itemId));
        android.app.Activity context = lVar.f210555a;
        java.lang.String str = lVar.f210559e;
        if (itemId == 1) {
            ot0.q v17 = ot0.q.v(n17.j());
            if (v17 == null || (!(51 == (i18 = v17.f430199i) || 129 == i18) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(context, null))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 19L, 1L, true);
                java.util.Locale locale = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                java.lang.String lowerCase = str.toLowerCase(locale);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                boolean n18 = r26.i0.n(lowerCase, "@chatroom", false);
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(n17);
                rd0.v0 v0Var = (rd0.v0) i95.n0.c(rd0.v0.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.f();
                qg5.p0 p0Var = (qg5.p0) v0Var;
                p0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.d(context, arrayList, n18, str, new qg5.o0(fVar, p0Var));
                return;
            }
            return;
        }
        if (itemId == 2) {
            so2.v0.b(so2.v0.f492177a, abstractC14490x69736cb52, context, null, null, 12, null);
            return;
        }
        if (itemId != 3) {
            return;
        }
        long m124847x74d37ac6 = n17.m124847x74d37ac6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(m124847x74d37ac6));
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n19 == null || !n19.r2()) {
                if (n19 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                }
                db5.e1.t(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2o), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2p), null);
                return;
            }
        } else if (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] member is null! username:%s", str);
            db5.e1.t(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2o), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2p), null);
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", m124847x74d37ac6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        j45.l.u(context, ".ui.chatting.ChattingUI", putExtra, null);
    }
}

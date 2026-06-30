package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class h0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.z f210706o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.app.Activity context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00 fragment, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a presenter, android.view.View view) {
        super(context, fragment, presenter, view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f210706o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.z(this.f210761l);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 b() {
        return this.f210706o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15108xb0956cb5 c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15110x959b1b74(context, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x
    public boolean h(r45.qt2 qt2Var, android.view.View view, int i17, so2.j5 feed) {
        int i18;
        so2.a0 a0Var;
        int i19;
        boolean z17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (!(feed instanceof so2.a0)) {
            return false;
        }
        so2.a0 a0Var2 = (so2.a0) feed;
        r45.cc1 cc1Var = a0Var2.f491777d;
        r45.vx0 vx0Var = (r45.vx0) cc1Var.m75936x14adae67(2);
        long m75942xfb822ef2 = vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalMixFavViewCallback", "click item pos:" + i17 + " topicId " + pm0.v.u(m75942xfb822ef2) + '}');
        r45.vx0 vx0Var2 = (r45.vx0) cc1Var.m75936x14adae67(2);
        if (vx0Var2 == null) {
            return true;
        }
        if (qt2Var != null) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            i18 = 349;
            a0Var = a0Var2;
            i19 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, qt2Var, a0Var2.mo2128x1ed62e84(), null, d(), 0, null, 0L, null, 240, null);
            z17 = true;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("collection_list_card", "view_clk", kz5.c1.k(new jz5.l("comment_scene", 349), new jz5.l("finder_tab_context_id", qt2Var.m75945x2fec8307(2)), new jz5.l("finder_context_id", qt2Var.m75945x2fec8307(1)), new jz5.l("collection_id", pm0.v.u(m75942xfb822ef2)), new jz5.l("sub_tab_type", 2)), 1, false);
        } else {
            i18 = 349;
            a0Var = a0Var2;
            i19 = 0;
            z17 = true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("collection_info", vx0Var2.mo14344x5f01b1f6());
        java.lang.Integer num = null;
        ya2.b2 b2Var = a0Var.f491778e;
        intent.putExtra("collection_author_username", b2Var != null ? b2Var.D0() : null);
        intent.putExtra("collection_nickname", b2Var != null ? b2Var.w0() : null);
        intent.putExtra("collection_avatar_url", b2Var != null ? b2Var.m176700xe5e0d2a0() : null);
        intent.putExtra("collection_authicon_url", (b2Var == null || (c19780xceb4c4dc2 = b2Var.f69300x731cac1b) == null) ? null : c19780xceb4c4dc2.m76028x11716638());
        if (b2Var != null && (c19780xceb4c4dc = b2Var.f69300x731cac1b) != null) {
            num = java.lang.Integer.valueOf(c19780xceb4c4dc.m76027x1cbb0791());
        }
        intent.putExtra("collection_authicon_type", num);
        intent.putExtra("collection_ref_comment_scene", i18);
        intent.setClass(this.f210750a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13940x9a1c0918.class);
        wa2.x.e(intent, view, 0L, false, false, null, 30, null);
        android.app.Activity activity = this.f210750a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavViewCallback", "collectionInfoProcess", "(Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Landroid/view/View;ILcom/tencent/mm/plugin/finder/model/FinderCollectInfoFeed;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(i19));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavViewCallback", "collectionInfoProcess", "(Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Landroid/view/View;ILcom/tencent/mm/plugin/finder/model/FinderCollectInfoFeed;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return z17;
    }
}

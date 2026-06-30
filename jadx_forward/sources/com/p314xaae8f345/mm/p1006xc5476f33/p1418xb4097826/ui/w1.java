package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class w1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15016x7c995a79 f211504d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15016x7c995a79 activityC15016x7c995a79) {
        this.f211504d = activityC15016x7c995a79;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        android.view.View actionView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15016x7c995a79 activityC15016x7c995a79 = this.f211504d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15016x7c995a79.f210062t, "doCallSelectContactUIForMultiRetransmit");
        if (activityC15016x7c995a79.f210065w == 1 && (actionView = it.getActionView()) != null) {
            hc2.v0.d(actionView, "add_dont_show_his_likes", "view_clk", false, kz5.c1.k(new jz5.l("dont_show_his_likes_page_source_page", java.lang.Integer.valueOf(activityC15016x7c995a79.f210067y)), new jz5.l("feed_id", pm0.v.u(activityC15016x7c995a79.f210066x))), null, 20, null);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activityC15016x7c995a79, "com.tencent.mm.ui.contact.SelectContactUI");
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", activityC15016x7c995a79.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eol));
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = activityC15016x7c995a79.f210063u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(blockListPresenter);
        java.util.ArrayList arrayList = blockListPresenter.f204100f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((so2.i0) it6.next()).f491948d.m76197x6c03c64c());
        }
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
        intent.putExtra("block_contact", c01.z1.r());
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15016x7c995a79.f210061z;
        intent.putExtra("max_limit_num", 20);
        intent.putExtra("Forbid_SelectChatRoom", true);
        intent.putExtra("show_too_many_member", false);
        activityC15016x7c995a79.mo55332x76847179().startActivityForResult(intent, 1);
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes2.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai) a17;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("promotion_feed_id", feed.m76784x5db1b11());
        intent.putExtra("promotion_update_switch", z17);
        intent.putExtra("promotion_update_switch_value", z18);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = feed.m76760x76845fea();
        intent.putExtra("promotion_author_finder_username", m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null);
        gx2.q R6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai.R6(aiVar, lk5.q0.b("com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUI", intent, false, 4, null), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.c(aiVar), 2, null);
        if (R6 != null) {
            R6.m132458x8dffbaba();
        }
        if (R6 != null) {
            R6.m132474x77f391b9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.a(R6));
        }
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        aiVar.O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.P6((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha) a18, 11, null, null, 4, null));
    }
}

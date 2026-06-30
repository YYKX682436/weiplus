package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ip extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f216295b;

    public ip(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.util.List list) {
        this.f216294a = abstractC14490x69736cb5;
        this.f216295b = list;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMultiImageDescCommentUIC", "image_comment_carousel exposed report");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f216294a;
            hc2.v0.d(view, "image_comment_carousel", "view_exp", false, kz5.c1.k(new jz5.l("feedid", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("comment_list", kz5.n0.g0(this.f216295b, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hp.f216177d, 30, null)), new jz5.l("comment_cnt", java.lang.Integer.valueOf(abstractC14490x69736cb5.getFeedObject().m59216x8ed22866()))), null, 20, null);
        }
    }
}

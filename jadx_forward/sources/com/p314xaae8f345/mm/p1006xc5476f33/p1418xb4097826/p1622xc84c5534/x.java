package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class x extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public long f206956d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f206957e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f206958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f206957e = "promotion_comment";
        this.f206958f = "";
    }

    public final void O6(android.view.View view, java.lang.String feedid, java.lang.String reportBuffer, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedid, "feedid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportBuffer, "reportBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f206958f = reportBuffer;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, this.f206957e);
        aVar.ik(view, 160, 25496);
        aVar.Vj(view, 32, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v(holder, this, aVar, feedid));
        aVar.Vj(view, 128, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w(holder, aVar, this, feedid));
    }

    public final void P6(java.lang.String feedid, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedid, "feedid");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Bj(this.f206957e, "view_clk", kz5.c1.k(new jz5.l("feed_id", feedid), new jz5.l("promotion_comment_click_zone", java.lang.Integer.valueOf(i17)), new jz5.l("promotion_buffer", this.f206958f)), 1, false);
    }
}

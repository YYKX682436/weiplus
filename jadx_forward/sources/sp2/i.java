package sp2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.i f492580a = new sp2.i();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, long j17, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareReportUtils", "report21053OnExpose pos: " + j17 + " actionType: " + actionType.f409753d + " commentscene: " + commentscene + " chnlExtra: " + chnlExtra);
        ae2.in inVar = ae2.in.f85221a;
        java.lang.String m76829x97edf6c0 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V0).mo141623x754a37bb()).r()).intValue() == 1 ? feed.getFeedObject().getFeedObject().m76829x97edf6c0() : "";
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.E9((zy2.zb) c17, feed, actionType, commentscene, chnlExtra, m76829x97edf6c0, 0, 32, null);
    }
}

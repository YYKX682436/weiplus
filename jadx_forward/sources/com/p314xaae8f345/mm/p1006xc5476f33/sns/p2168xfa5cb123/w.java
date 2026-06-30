package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s f246521a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s(null);

    public w(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
    }

    public final void a(java.lang.String eventId, java.lang.String viewId, java.util.Map params) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        f246521a.a();
        java.util.Objects.toString(ri.l0.a(params));
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v(viewId, eventId, params));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
    }
}

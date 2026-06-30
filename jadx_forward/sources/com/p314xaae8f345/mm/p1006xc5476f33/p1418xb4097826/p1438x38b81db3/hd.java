package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class hd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f185108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185110g;

    public hd(android.view.View view, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f185107d = view;
        this.f185108e = map;
        this.f185109f = abstractC14490x69736cb5;
        this.f185110g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRead$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", this.f185107d, this.f185108e, 25496);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) g92.b.f351302e.k2().d().m75936x14adae67(27);
        java.lang.String m77166xb5887639 = (c19786x6a1e2862 == null || (m76494x46f709d9 = c19786x6a1e2862.m76494x46f709d9()) == null) ? null : m76494x46f709d9.m77166xb5887639();
        r45.dm2 m76806xdef68064 = this.f185109f.getFeedObject().getFeedObject().m76806xdef68064();
        java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(25) : null;
        if (m77166xb5887639 != null && m75945x2fec8307 != null) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String substring = m77166xb5887639.substring(0, r26.n0.L(m77166xb5887639, "=", 0, false, 6, null) + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.lang.String e17 = hc2.x0.e(substring.concat(m75945x2fec8307), 2, false, null, 6, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "rawUrl=".concat(e17));
            intent.putExtra("rawUrl", e17);
            j45.l.j(this.f185110g.f374654e, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRead$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

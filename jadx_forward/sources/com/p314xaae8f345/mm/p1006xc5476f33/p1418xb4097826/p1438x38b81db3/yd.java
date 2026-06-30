package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f186542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186545g;

    public yd(boolean[] zArr, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f186542d = zArr;
        this.f186543e = qeVar;
        this.f186544f = s0Var;
        this.f186545g = abstractC14490x69736cb5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f186542d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_fav", "<FeedFav>");
            sVar.H2("ce_feed_fav", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_fav");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186543e;
        boolean d07 = qeVar.f185891f.d0();
        in5.s0 s0Var = this.f186544f;
        if (!d07) {
            qeVar.N(s0Var, null, 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "[onClickStar]: " + s0Var.m8183xf806b362() + " feedId:" + pm0.v.u(this.f186545g.mo2128x1ed62e84()) + " isSelfScene:" + qeVar.f185891f.d0());
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.q0().r()).intValue() != 1) {
            qeVar.E(s0Var, false);
        }
        d92.s sVar2 = d92.k0.f309019e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        view.announceForAccessibility(sVar2.d(view, true));
        view.setContentDescription(sVar2.d(view, false));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

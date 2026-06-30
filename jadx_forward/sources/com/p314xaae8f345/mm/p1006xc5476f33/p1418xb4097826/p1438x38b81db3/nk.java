package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class nk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b f185637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pk f185638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f185640h;

    public nk(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pk pkVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17) {
        this.f185636d = s0Var;
        this.f185637e = bVar;
        this.f185638f = pkVar;
        this.f185639g = abstractC14490x69736cb5;
        this.f185640h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdDetail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedSnsAdUIC", "refreshAdDetail onClick");
        in5.s0 s0Var = this.f185636d;
        if (s0Var.m8183xf806b362() == 0) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(zu2.a0.class)).f557227f;
            if (qVar != null) {
                qVar.a();
                qVar.d("big_btn_click");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b bVar = this.f185637e;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pk pkVar = this.f185638f;
            int i17 = this.f185640h;
            in5.s0 s0Var2 = this.f185636d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f185639g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pk.R6(pkVar, 2, abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.w(), i17, s0Var2, 0, 0, 96, null);
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            java.lang.String B = ca4.m0.B(bVar.f189244h);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openAdCanvasById, canvasId=");
            long j17 = bVar.f189243g;
            sb6.append(j17);
            sb6.append(", source=30, adInfoXml=");
            sb6.append(B);
            sb6.append(", extra=");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdService", sb6.toString());
            ca4.m0.m0(j17, B, "", 30);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdDetail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

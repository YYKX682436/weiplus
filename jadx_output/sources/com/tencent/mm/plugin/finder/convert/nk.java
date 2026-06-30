package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.b f104104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.pk f104105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f104107h;

    public nk(in5.s0 s0Var, com.tencent.mm.plugin.finder.feed.model.b bVar, com.tencent.mm.plugin.finder.convert.pk pkVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        this.f104103d = s0Var;
        this.f104104e = bVar;
        this.f104105f = pkVar;
        this.f104106g = baseFinderFeed;
        this.f104107h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdDetail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("FinderFeedSnsAdUIC", "refreshAdDetail onClick");
        in5.s0 s0Var = this.f104103d;
        if (s0Var.getAdapterPosition() == 0) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
            if (qVar != null) {
                qVar.a();
                qVar.d("big_btn_click");
            }
        }
        com.tencent.mm.plugin.finder.feed.model.b bVar = this.f104104e;
        if (bVar != null) {
            com.tencent.mm.plugin.finder.convert.pk pkVar = this.f104105f;
            int i17 = this.f104107h;
            in5.s0 s0Var2 = this.f104103d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104106g;
            com.tencent.mm.plugin.finder.convert.pk.R6(pkVar, 2, baseFinderFeed.getFeedObject().getId(), baseFinderFeed.w(), i17, s0Var2, 0, 0, 96, null);
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            java.lang.String B = ca4.m0.B(bVar.f107711h);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openAdCanvasById, canvasId=");
            long j17 = bVar.f107710g;
            sb6.append(j17);
            sb6.append(", source=30, adInfoXml=");
            sb6.append(B);
            sb6.append(", extra=");
            com.tencent.mars.xlog.Log.i("SnsAdService", sb6.toString());
            ca4.m0.m0(j17, B, "", 30);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdDetail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

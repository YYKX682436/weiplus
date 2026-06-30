package ue2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.q f508379d;

    public p(ue2.q qVar) {
        this.f508379d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorUIC$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ue2.q qVar = this.f508379d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f508380d, "点击了遮罩层");
        if (qVar.m158358x197d1fc6() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = qVar.m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment");
            rg2.a aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a) m158358x197d1fc6).f193185n;
            if (aVar != null) {
                ((sp2.u2) aVar).f492762a.b(null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorUIC$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

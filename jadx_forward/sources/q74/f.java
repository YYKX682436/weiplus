package q74;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.t f441988d;

    public f(q74.t tVar) {
        this.f441988d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e2;
        s34.a1 a1Var2;
        s34.z0 z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        q74.t tVar = this.f441988d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 j17 = q74.t.j(tVar);
        java.util.List<s34.x0> list = null;
        java.util.List c17 = (j17 == null || (m70354x74235b3e2 = j17.m70354x74235b3e()) == null || (a1Var2 = m70354x74235b3e2.f38210x95847c91) == null || (z0Var = a1Var2.f484102f) == null) ? null : z0Var.c();
        boolean z17 = c17 == null || c17.isEmpty();
        z84.h hVar = tVar.f442055d;
        if (!z17 && q74.t.e(tVar) < c17.size() && ((s34.o1) c17.get(q74.t.e(tVar))).a() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = ((s34.o1) c17.get(q74.t.e(tVar))).a();
            if (a17 != null) {
                a17.f244102a = 24;
            }
            w64.n u17 = tVar.u();
            if (u17 != null) {
                u17.o(a17, q74.t.j(tVar), q74.t.e(tVar));
            }
            w64.n u18 = tVar.u();
            if (u18 != null) {
                u18.k(view);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            if (hVar != null) {
                hVar.f(view, q74.t.e(tVar));
            }
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 j18 = q74.t.j(tVar);
        if (j18 != null && (m70354x74235b3e = j18.m70354x74235b3e()) != null && (a1Var = m70354x74235b3e.f38210x95847c91) != null) {
            list = a1Var.f76695x5800ff2c;
        }
        if (list == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSlideProductItemViewLogic", "doClick adSliderFullCardInfoList is empty");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        s34.x0 x0Var = list.get(q74.t.e(tVar));
        if (x0Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = x0Var.f76730xf7a0a3ac;
        if (c17702x544f64e9 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        c17702x544f64e9.f244102a = 24;
        w64.n u19 = tVar.u();
        if (u19 != null) {
            u19.o(c17702x544f64e9, q74.t.j(tVar), q74.t.e(tVar));
        }
        w64.n u27 = tVar.u();
        if (u27 != null) {
            u27.k(view);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (hVar != null) {
            hVar.f(view, q74.t.e(tVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
    }
}
